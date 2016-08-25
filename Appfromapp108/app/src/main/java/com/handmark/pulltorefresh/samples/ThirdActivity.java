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
public class ThirdActivity extends Activity {


    String[] CHEESES = {

            "What should everyone know about economics?",
            "What should everyone know about accounting?",
            "What should everyone know about marketing?",
            "What are the most basic financial concepts that everyone should learn?",
            "What should everyone know about venture capital?",
            "What should everyone know about computer programming?",
            "How does the stock market work?",
            "What are some things every Indian should know about Indian history?",
            "What should everyone know about Chinese history?",
         /*
            "How would you explain the essence of Bhagavad Gita?",
            "What should everyone know about Yoga?"
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
                    case 0:  Intent newActivity = new Intent(ThirdActivity.this, Third1.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity2 = new Intent(ThirdActivity.this, Third2.class);
                        startActivity(newActivity2);
                        break;
                    case 2:  Intent newActivity3 = new Intent(ThirdActivity.this, Third3.class);
                        startActivity(newActivity3);
                        break;
                    case 3:Intent newActivity4 = new Intent(ThirdActivity.this, Third4.class);
                        startActivity(newActivity4);
                        break;
                    case 4:Intent newActivity5 = new Intent(ThirdActivity.this, Third5.class);
                        startActivity(newActivity5);
                        break;
                    case 5:Intent newActivity6 = new Intent(ThirdActivity.this, Third6.class);
                        startActivity(newActivity6);
                        break;
                    case 6:Intent newActivity7 = new Intent(ThirdActivity.this, Third7.class);
                        startActivity(newActivity7);
                        break;
                    case 7:Intent newActivity8 = new Intent(ThirdActivity.this, Third8.class);
                        startActivity(newActivity8);
                        break;
                    case 8:Intent newActivity9 = new Intent(ThirdActivity.this, Third9.class);
                        startActivity(newActivity9);
                        break;


                }
            }
        });


    }
}
