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
public class TenthActivity extends Activity {


    String[] CHEESES = {


            "What preparations are needed for an individual to tour the whole of India (similar to what Gandhi did before joining politics full time) with least possible resources?",
            "What state in India does what best?",
            "What are some great natural wonders in India?",
            "What are the best places to visit in India?",
            "What is the coolest thing about living in Mumbai?",
            "What are some cool things to do in Chennai?",
            "What are the must-do/must-see things for a four day trip to Goa?",
            "What are some of the most beautiful buildings or monuments in the world?",
            "What are some of the most interesting festivals in India?",


       /*     "What should I absolutely not do when visiting your country?",
            "What are some hacks while traveling in India?",
            "What are some of the best pictures that showcase India?"
*/

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
                    case 0:  Intent newActivity = new Intent(TenthActivity.this, Tenth1.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity2 = new Intent(TenthActivity.this, Tenth2.class);
                        startActivity(newActivity2);
                        break;
                    case 2:  Intent newActivity3 = new Intent(TenthActivity.this, Tenth3.class);
                        startActivity(newActivity3);
                        break;
                    case 3:Intent newActivity4 = new Intent(TenthActivity.this, Tenth4.class);
                        startActivity(newActivity4);
                        break;
                    case 4:Intent newActivity5 = new Intent(TenthActivity.this, Tenth5.class);
                        startActivity(newActivity5);
                        break;
                    case 5:Intent newActivity6 = new Intent(TenthActivity.this, Tenth6.class);
                        startActivity(newActivity6);
                        break;
                    case 6:Intent newActivity7 = new Intent(TenthActivity.this, Tenth7.class);
                        startActivity(newActivity7);
                        break;
                    case 7:Intent newActivity8 = new Intent(TenthActivity.this, Tenth8.class);
                        startActivity(newActivity8);
                        break;
                    case 8:Intent newActivity9 = new Intent(TenthActivity.this, Tenth9.class);
                        startActivity(newActivity9);
                        break;


                }
            }
        });






















    }
}
