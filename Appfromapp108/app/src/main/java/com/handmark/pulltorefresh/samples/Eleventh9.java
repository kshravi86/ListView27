package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Eleventh9 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Different parts of India spend money in different ways in a wedding. Some of the biggest spending items in a wedding are:\n" +
                "Rental for the hall\n" +
                "Food for the events\n" +
                "Wedding dresses\n" +
                "\n" +
                "One of the biggest ways to reduce spending is focus on novelty rather than on grandeur. Think of innovative ideas to do simple stuff and people remember those more. In our wedding we did a few stuff that people liked. \n" +
                "\n" +
                "Look for renting the wedding dresses and accessories, including Sherwani, Lehenga, Sarees. You will never really use them again.\n" +
                "\n" +
                "Cut down on low priority events saving you on both food and rental. Also, when deciding menu know the price for each item. Try to cut a couple of the expensive parts. You should also see if some of your guest list can be prioritized.\n");
    }
}