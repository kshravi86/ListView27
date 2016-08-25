package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 8/7/16.
 */
public class Seventh9 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Valuing a company is an art rather than a hard science. It involves a lot of guesswork and speculation of future events. \n" +
                "\n" +
                "First, let us assume the steady state - the company will keep making profits at the current rate. This is the easy part. We then add all the future profits, apply time discounting and find out what the company is currently worth. It is very straight forward. The main method used is called the Discounted Cash Flow (DCF) - http://en.wikipedia.org/wiki/Dis... (explained below).\n" +
                "\n" +
                "DCF is quite good for very stable companies such as electric power utilities that have little change or competition. For instance, if a company makes $10 million in profits each year consistently and your time value of money (returns you can get from a market portfolio) is 10%, the company would be valued at $61 million. Try this with this calculator. http://www.moneychimp.handmark/articl...\n" +
                "\n" +
                "However, for most companies the future would be different from the present. The company could grow big (more revenues), become more profitable (in margins) or could lose out to the competition. We are dealing with a highly unpredictable system and thus simple math won't work:\n" +
                "\n" +
                "Some of the methods we could use to predict the future are:\n" +
                "Financial ratios. Since valuing a single company is hard, we attempt to compare a company against its competitors and related industries. Some of the popular ratios P/E (Price by earnings), P/S (Price by sales) and P/B (Price by book value). They show the relative strength of the company against its past and against its competitors.\n" +
                "State of the economy and industry. If you are in a growing economy and growing industry, you can try to bake some of the growth projections into the company assuming that the market is big enough for the competitors to expand without impacting the analyzed company.\n" +
                "Strength of the management & business model. If the management is good & trustable and the business model is strong, you can expect them to move with the market and constantly grow the company.\n" +
                "\n" +
                "Here is the summary of how valuations work. You either predict the future earnings and bring it to present, or use past multiples to project into the future. ");
    }
}
