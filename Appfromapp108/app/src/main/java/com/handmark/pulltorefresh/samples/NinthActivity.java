package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 6/7/16.
 */
public class NinthActivity extends Activity {


    String[] CHEESES = {
            "Why did Hitler perform genocide of only the Jews and no other religious community?",
            "What is the story behind the swastika (Hindu symbol)? Is its resemblance to the Nazi symbol just a coincidence?",
            "Why do some Indians admire Hitler?"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  super.onCreate(savedInstanceState);
        // setContentView(R.layout.sample_main);

        setContentView(R.layout.activity_main2);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, CHEESES);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                switch( position )
                {
                    case 0:  Intent newActivity = new Intent(NinthActivity.this, Ninth1.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity2 = new Intent(NinthActivity.this, Ninth2.class);
                        startActivity(newActivity2);
                        break;
                    case 2:  Intent newActivity3 = new Intent(NinthActivity.this, Ninth3.class);
                        startActivity(newActivity3);
                        break;


                }
            }
        });


    }
}
