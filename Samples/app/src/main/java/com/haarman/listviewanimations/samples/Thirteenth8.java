package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Thirteenth8 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Investing is not an exact science. It is an art that combines guessing and judging,  backed by reasoning & gut feel. No one really knows what should really be the price of any stock. We all do guesswork based on the past and the comparables. When someone asks you what tomorrow will be like, you will answer something that is related to today and yesterday. But, there could be huge surprises tomorrow that you wouldn't know now. \n" +
                "\n" +
                "Anyway, here are things that investors do to value a stock:\n" +
                "Discounted cash flow: When you invest in a company, you are investing to get a share of its future profits. In this method, you guess what its future profits would be and then decide what price is good for the stock, based on the risk of prediction & the interest rates. Thus, if Apple is expected to make $40 billion of profits next year and keeps growing at a steady rate, you might choose a valuation of $400 billion. There are 3 key guesses here a) what will be the growth in the company's profits in the future. b) what are the risks that the company faces. c) what will be the future interest rates.\n" +
                "Valuation using multiples: Here you compare a company with other companies of similar size, similar industry or similar products. For instance, if Google has a valuation of X, then Microsoft should have valuation of Y, based on their relative profits and growth rates. Here, the key is choosing the right set of comparables. Most often investors compare the given company with a wrong company and conclude that the price is overvalue or undervalued. \n" +
                "Value of assets: If a company is primarily holding tangible assets (for instance an apartment complex) we can value the company using the book value of the assets it owns. \n");
    }
}