package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class Third4 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("    Compound interest. Money (Investments and debts) keeps multiplying. Assuming your parents had 4 kids and each of them have 4 kids, in just 2 generations, your family has multiplied 16 fold. The same for money.\n" +
                "    Inflation. This is how much your money turns less worthy. 30 years ago our parents could buy cars at a fraction of what we pay now. Why is inflation important? In the previous case, if your parents had one kid and you have one kid, how much did your family grow to. Actually your family tree has shrunk. To enable your family to grow bigger, you need to have more than 2 kids. That minimum is inflation when it comes to money. If your investment makes less than inflation, you are actually shrinking.\n" +
                "    Time value of money. Every language has a proverb for the equivalent of \"A bird in hand is worth two in a bush\". Money had today is always more valuable than the same money had tomorrow. This is why you get an interest when you lend someone money.\n" +
                "    Risk. This is the most important 4 letter word you need to know in finance. Every investment is risky, just that there are somethings more risky and some thing less risky.\n" +
                "    Liquidity. Not all investments are made the same. If you want to sell your house instantaneously you will get a far low offer than what your house is worth. Liquid investments are those whose fair value can be had at any time of the day. Stock, cash and gold are liquid.");
    }

}
