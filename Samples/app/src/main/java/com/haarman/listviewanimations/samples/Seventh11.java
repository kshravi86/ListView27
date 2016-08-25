package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Seventh11 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("There are many possible scenarios:\n" +
                "Market is not trusting the book. There are many Chinese and other emerging market companies that are trading less than the book. But, depending on the rigor of the auditing process, the book value might not be great indicator. World has too many cooked, inflated books.\n" +
                "The value of assets are dropping substantially. The value of your assets are depreciated based on a fixed depreciating schedule and might not reflect the market reality. What if you had a toxic leak on your prime real estate two days ago? The value of the real estate would have plummeted, while the book value might still show a sterling value.\n" +
                "Changes in business is pushing you out of the reckoning. Let us say we are in 1900 and you have a massive plant for producing horse carriages. Your plant could be state of the art and would be valuable a lot in the book. But, smart traders in the market would have guessed that your days in business are numbered.\n" +
                "Terrible management. What if you had a psychopathic CEO who is trying to go on stupid path and has a control over the board? Even with great assets, the stockholders would want to quit.\n" +
                "At present, 980 stocks in the US had book value higher than the market value of the company. \n");
    }
}
