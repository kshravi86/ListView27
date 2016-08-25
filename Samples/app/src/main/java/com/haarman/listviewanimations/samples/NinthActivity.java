package com.haarman.listviewanimations.samples;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by listviewanimations on 6/7/16.
 */
public class NinthActivity extends ListActivity {


    String[] CHEESES = {
            "Why did Hitler perform genocide of only the Jews and no other religious community?",
            "What is the story behind the swastika (Hindu symbol)? Is its resemblance to the Nazi symbol just a coincidence?",
            "Why do some Indians admire Hitler?"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptr_list);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CHEESES));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;

                switch( position )
                {
                    case 1:  Intent newActivity = new Intent(NinthActivity.this, Ninth1.class);
                        startActivity(newActivity);
                        break;
                    case 2:  Intent newActivity2 = new Intent(NinthActivity.this, Ninth2.class);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(NinthActivity.this, Ninth3.class);
                        startActivity(newActivity3);
                        break;


                }


    }
}
