package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Thirteenth7 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("There are a few reasons for this:\n" +
                "\n" +
                "Estimating costs: It might be not easy to determine price without knowing your requirements. Unless it is a relatively simple, stand-alone product you need to factor a lot of additional costs like support,installation and customization.\n" +
                "Price Discrimination: Most players in the B2B space do some form of price discrimination or the other. They might not sell the thing at the same price tag to both a startup and GE. \n" +
                "Connect with you and convince you: This is by far the most important. The sales guys in fairly complex products want to guide you through the process. They don't want to lose you after seeing the price tag. They want to convert a visit into a lead and a lead into a sale. By not giving the price and other critical details without having a direct conversation, the sales person is making you reach out to him/her and get started on the funnel");
    }
}