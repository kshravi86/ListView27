package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Thirteenth6 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("t is always about:\n" +
                "Alternatives\n" +
                "Incremental benefit you receive from a product\n" +
                "\n" +
                "If you are buying a sunglass for Rs.5000, while you could get the same stuff unbranded for Rs.500, you are either trying to impress or plain stupid. If you are trying to impress, then you have to decide if impressing your target is worth Rs.4500 (5000 - 500). \n" +
                "\n" +
                "Or you could be buying for the \"quality\". Quality could be on many attributes:\n" +
                "Reliability: What if the cheap sun-glasses hurts your eyes? What if the cheap shoe hurts your ankle? What is the price you assign to your health, if indeed there is a difference in this angle? I like to pick Nike shoes, as I don't want to get my ankles get hurt while saving $10.\n" +
                "Durability: What if your cheap sunglass doesn't hurt your eyes, but breaks 6 times more often? That means your \"branded\" product is 6x more worthy at the least. This is especially important if you are a business user and cannot afford having your apparel or gadget appear broken infront of your clients. \n" +
                "Comfort: My Macbook Air is lighter on my laps and hands. That is probably worth $100-$200 for me.\n" +
                "Speed: You are late in posting a mail that has to reach your target in a day. If the mail is very important to you, then you have to suck it up and pay Fedex $30 more. \n" +
                "\n" +
                "I guess I am stating the obvious, but look for the incremental benefit you receive over an alternative. If you are buying a brand only to impress, make sure the economics work right for you.\n");
    }
}