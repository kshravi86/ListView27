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
public class EleventhActivity extends Activity {


    String[] CHEESES = {


            "Why is it difficult to date an Indian girl in general?",
            "Eight Types of Marriages",
            "Why is the difference between dowry and a girl asking for equal share in her father's property?",
            "Is dowry system limited to Indian wedding culture only?",
            "Why do people in India consider it important that older siblings marry first?",
            "I'm wary of Indian women, and while I know that there are wonderful ladies out there, I just can't bring myself to take a chance. How do I change?",
            "Why is the divorce rate so high, especially in Western countries, if love marriages work?",
            "Why is all the expenditure that goes into organizing an Indian wedding incurred entirely by the girl's family?",
            "What are various ways to avoid unnecessary expenses in Indian weddings?"


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
                    case 0:  Intent newActivity = new Intent(EleventhActivity.this, Eleventh1.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity2 = new Intent(EleventhActivity.this, Eleventh2.class);
                        startActivity(newActivity2);
                        break;
                    case 2:  Intent newActivity3 = new Intent(EleventhActivity.this, Eleventh3.class);
                        startActivity(newActivity3);
                        break;
                    case 3:Intent newActivity4 = new Intent(EleventhActivity.this, Eleventh4.class);
                        startActivity(newActivity4);
                        break;
                    case 4:Intent newActivity5 = new Intent(EleventhActivity.this, Eleventh5.class);
                        startActivity(newActivity5);
                        break;
                    case 5:Intent newActivity6 = new Intent(EleventhActivity.this, Eleventh6.class);
                        startActivity(newActivity6);
                        break;
                    case 6:Intent newActivity7 = new Intent(EleventhActivity.this, Eleventh7.class);
                        startActivity(newActivity7);
                        break;
                    case 7:Intent newActivity8 = new Intent(EleventhActivity.this, Eleventh8.class);
                        startActivity(newActivity8);
                        break;
                    case 8:Intent newActivity9 = new Intent(EleventhActivity.this, Eleventh9.class);
                        startActivity(newActivity9);
                        break;


                }
            }
        });


    }
}
