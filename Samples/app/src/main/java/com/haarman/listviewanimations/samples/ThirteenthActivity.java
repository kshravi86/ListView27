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
public class ThirteenthActivity extends
        ListActivity {


    String[] CHEESES = {




            "How does a business set the prices it charges for each of its goods & services?",
            "Odd Pricing: Why do Most Prices Involve a 9?",
            "Price Discrimination: How companies charge different prices for the same product?",
            "Pricing in an Initial Public Offer (IPO)",
            "Pricing: How do the Buy Back schemes work?",
            "How do I know if something I want to buy is overpriced?",
            "Why are some companies not showing their prices on their websites and ask for a webinar or call?",
            "How do investors know the price of a stock is good?",
            "Why are people willing to pay $4 for a bag of chips but not $1 for an app?",



           "Who are the Kurds and what role do they play in the Middle East?",
            "What is the political history of Iraq?",
            "With Islamic State (IS) gaining traction in the Middle East, is there a real danger of a worldwide Muslim extremist uprising?",
          /*  "I, an Arab, would just like to know why on earth everyone hates us and is scared of us?",
            "What is a good simple explanation for what is happening now (August 2014) in the Middle East?",
            "How will the Syria situation affect the US stock market?",
            "How could rumors about missile strike on Syria affect Indian market and Sensex?",
            "Why do Americans and Europeans disagree so much about the Israel-Palestine conflict?",
            "What would be an outcome of Iran's nuclear strike on Riyadh?",
            "What would the world be like if all the Muslim states banded together into a Muslim United States",
            "Why don't Muslims talk about secularism?",
            "Why and how was the Muslim conquest so successful?",
            "Why is the Middle East such a quagmire of chaotic crazy people hell-bent on blowing each other up?",
            "Why have the Islamic countries failed to develop even with resources like oil, whilst countries with no resources like Switzerland have flourished?"
*/

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
                    case 1:  Intent newActivity = new Intent(ThirteenthActivity.this, Thirteenth1.class);
                        startActivity(newActivity);
                        break;
                    case 2:  Intent newActivity2 = new Intent(ThirteenthActivity.this, Thirteenth2.class);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(ThirteenthActivity.this, Thirteenth3.class);
                        startActivity(newActivity3);
                        break;
                    case 4:Intent newActivity4 = new Intent(ThirteenthActivity.this, Thirteenth4.class);
                        startActivity(newActivity4);
                        break;
                    case 5:Intent newActivity5 = new Intent(ThirteenthActivity.this, Thirteenth5.class);
                        startActivity(newActivity5);
                        break;
                    case 6:Intent newActivity6 = new Intent(ThirteenthActivity.this, Thirteenth6.class);
                        startActivity(newActivity6);
                        break;
                    case 7:Intent newActivity7 = new Intent(ThirteenthActivity.this, Thirteenth7.class);
                        startActivity(newActivity7);
                        break;
                    case 8:Intent newActivity8 = new Intent(ThirteenthActivity.this, Thirteenth8.class);
                        startActivity(newActivity8);
                        break;
                    case 9:Intent newActivity9 = new Intent(ThirteenthActivity.this, Thirteenth9.class);
                        startActivity(newActivity9);
                        break;
                    case 10:Intent newActivity10 = new Intent(ThirteenthActivity.this, Thirteenth10.class);
                        startActivity(newActivity10);
                        break;
                    case 11:Intent newActivity11 = new Intent(ThirteenthActivity.this, Thirteenth11.class);
                        startActivity(newActivity11);
                        break;
                    case 12:Intent newActivity12 = new Intent(ThirteenthActivity.this, Thirteenth12.class);
                        startActivity(newActivity12);
                        break;


                }



    }
}
