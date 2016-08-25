package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Tenth5 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("I lived in Mumbai for 13 months and here is why it is cool:\n" +
                "Widest options for food, ranging from Rs. 2000 a meal hotels to Rs. 8/plate at the roadside eateries. Whether it is dining at the Taj or your neighborhood Shiv vadapav, things are always good. You can get good food almost all day, for all budgets and everywhere. \n" +
                "\n" +
                "A lively city that never sleeps and never ceases to amaze.\n" +
                "A working public transportation system. Once I moved from Chennai, I sold my car and almost entirely relied on autorickshaws and trains. \n" +
                "\n" +
                "Very accepting culture that welcomes people from everywhere in the world.\n" +
                "Partying and options for hanging out.\n" +
                "Nice work ethic where people are always running and busy. Also compared to Indian standards, people are quite punctual.\n" +
                "Plenty of entertainment options around the city with nice beaches, waterfalls and hill resorts within 2-3 hour drive. \n" +
                "\n" +
                "The mouthwatering chats. Pani poori. Bhel poori. Yummy!");
    }
}