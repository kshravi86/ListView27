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
public class FifteenthActivity extends ListActivity {


    String[] CHEESES = {

            "How should I develop a habit of reading the newspaper?",
            "Quit Reading Fast. Read Slow.",
            "How to read 200+ books every year?",
            "Is reading fiction required, if you are primarily in love with newspaper and informative articles on science, politics, culture and history?",
            "I love reading, but that is limited to newspapers, Quora or some random articles on the Internet. I wish to start reading books--novels of different genres. Where and how should I start?",
            "We have movies and the Internet where we can see or read whatever we like. Why should we read books in the digital age?",
            "What are Balaji Viswanathan's favorite business books?",
            "Which books does Balaji Viswanathan recommend about Indian political history for a reader who just started to follow politics?",
            "What are some must-read books for a 22 year old Indian?",

            "What books does Balaji Viswanathan tell 16-20 year olds to read?"


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
                    case 1:  Intent newActivity = new Intent(FifteenthActivity.this, Fifteenth1.class);
                        startActivity(newActivity);
                        break;
                    case 2:  Intent newActivity2 = new Intent(FifteenthActivity.this, Fifteenth2.class);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(FifteenthActivity.this, Fifteenth3.class);
                        startActivity(newActivity3);
                        break;
                    case 4:Intent newActivity4 = new Intent(FifteenthActivity.this, Fifteenth4.class);
                        startActivity(newActivity4);
                        break;
                    case 5:Intent newActivity5 = new Intent(FifteenthActivity.this, Fifteenth5.class);
                        startActivity(newActivity5);
                        break;
                    case 6:Intent newActivity6 = new Intent(FifteenthActivity.this, Fifteenth6.class);
                        startActivity(newActivity6);
                        break;
                    case 7:Intent newActivity7 = new Intent(FifteenthActivity.this, Fifteenth7.class);
                        startActivity(newActivity7);
                        break;
                    case 8:Intent newActivity8 = new Intent(FifteenthActivity.this, Fifteenth8.class);
                        startActivity(newActivity8);
                        break;
                    case 9:Intent newActivity9 = new Intent(FifteenthActivity.this, Fifteenth9.class);
                        startActivity(newActivity9);
                        break;
                    case 10:Intent newActivity10 = new Intent(FifteenthActivity.this, Fifteenth10.class);
                        startActivity(newActivity10);
                        break;


                }



    }
}
