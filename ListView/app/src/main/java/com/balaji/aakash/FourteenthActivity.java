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
public class FourteenthActivity extends Activity {


    String[] CHEESES = {


		"How appropriate is the geographic term Middle East",
		"Is another 2014 US intervention in Iraq good or bad?",
		"What is the Israel-Gaza conflict?",
		"What is the story of Jews?",
		"How did Israel become so powerful?",
		"Why does the US provide so much foreign aid (roughly $2.5 billion pl0er year) to Israel?",
		"Why do a majority of Indians support Israel?",
		"How could Iraq, widely considered as the cradle of civilization, come to this present state of crisis?",
		"What's the history of the Islamic insurgency in Iraq? How did the unrest progress? Is momentum building?",

		/* "Why do cars cost more than computers?",
		 "What can be the pricing strategy of Head and Shoulder Shampoo for pricing INR 3 for 7.5 ml sachet (implies 80mL for INR 32) while pricing the 80mL bottle of same for INR 79?",
		 "How is the world price of oil determined?",
		 "Why do soft drink makers sell them at such exorbitant prices in the market?",
		 "Why are grapes so expensive when raisins are so cheap?",
		 "Why are disposable razor blades so expensive?"
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
						case 0:  Intent newActivity = new Intent(FourteenthActivity.this, Fourteenth1.class);
							startActivity(newActivity);
							break;
						case 1:  Intent newActivity2 = new Intent(FourteenthActivity.this, Fourteenth2.class);
							startActivity(newActivity2);
							break;
						case 2:  Intent newActivity3 = new Intent(FourteenthActivity.this, Fourteenth3.class);
							startActivity(newActivity3);
							break;
						case 3:Intent newActivity4 = new Intent(FourteenthActivity.this, Fourteenth4.class);
							startActivity(newActivity4);
							break;
						case 4:Intent newActivity5 = new Intent(FourteenthActivity.this, Fourteenth5.class);
							startActivity(newActivity5);
							break;
						case 5:Intent newActivity6 = new Intent(FourteenthActivity.this, Fourteenth6.class);
							startActivity(newActivity6);
							break;
						case 6:Intent newActivity7 = new Intent(FourteenthActivity.this, Fourteenth7.class);
							startActivity(newActivity7);
							break;
						case 7:Intent newActivity8 = new Intent(FourteenthActivity.this, Fourteenth8.class);
							startActivity(newActivity8);
							break;
						case 8:Intent newActivity9 = new Intent(FourteenthActivity.this, Fourteenth9.class);
							startActivity(newActivity9);
							break;


					}
				}
			});


    }
}

