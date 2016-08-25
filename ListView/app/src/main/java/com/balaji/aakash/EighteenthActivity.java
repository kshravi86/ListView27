package com.balaji.aakash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by aakash on 6/7/16.
 */
public class EighteenthActivity extends Activity {


    String[] CHEESES = {

		"I have read lots of books but forgotten most of them. What's the purpose of reading?",
		"How should I develop a habit of reading the newspaper?",
		"Quit Reading Fast. Read Slow.",
		"Is reading fiction required, if you are primarily in love with newspaper and informative articles on science, politics, culture and history?",
		"I love reading, but that is limited to newspapers, Quora or some random articles on the Internet. I wish to start reading books--novels of different genres. Where and how should I start?",
		"Which books does Balaji Viswanathan recommend about Indian political history for a reader who just started to follow politics?",
		"What are some must-read books for a 22 year old Indian?",
		"What books does Balaji Viswanathan tell 16-20 year olds to read?",
		"We have movies and the Internet where we can see or read whatever we like. Why should we read books in the digital age?",

		/*  "How does one become a better writer?",
		 "How can an individual with average writing skills become a good writer?",
		 "Getting Started on Quora: Why don't I get upvotes on my answers?",
		 "Answers must not be given. They should emerge from within the asker.",
		 "How can I use my writing skills to make a living?",
		 "How do i write the answers in History?",
		 "Why don't I get upvotes on my answers?"
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
						case 0:  Intent newActivity = new Intent(EighteenthActivity.this, Eighteenth1.class);
							startActivity(newActivity);
							break;
						case 1:  Intent newActivity2 = new Intent(EighteenthActivity.this, Eighteenth2.class);
							startActivity(newActivity2);
							break;
						case 2:  Intent newActivity3 = new Intent(EighteenthActivity.this, Eighteenth3.class);
							startActivity(newActivity3);
							break;
						case 3:Intent newActivity4 = new Intent(EighteenthActivity.this, Eighteenth4.class);
							startActivity(newActivity4);
							break;
						case 4:Intent newActivity5 = new Intent(EighteenthActivity.this, Eighteenth5.class);
							startActivity(newActivity5);
							break;
						case 5:Intent newActivity6 = new Intent(EighteenthActivity.this, Eighteenth6.class);
							startActivity(newActivity6);
							break;
						case 6:Intent newActivity7 = new Intent(EighteenthActivity.this, Eighteenth7.class);
							startActivity(newActivity7);
							break;
						case 7:Intent newActivity8 = new Intent(EighteenthActivity.this, Eighteenth8.class);
							startActivity(newActivity8);
							break;
						case 8:Intent newActivity9 = new Intent(EighteenthActivity.this, Eighteenth9.class);
							startActivity(newActivity9);
							break;


					}
				}
			});



    }
}
