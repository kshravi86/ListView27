package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Tenth12 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("The \"gods\" of entrepreneurship\n" +
                "\n" +
                "\n" +
                "The Cows\n" +
                "\n" +
                "\n" +
                "The temples (Tanjore -- UNESCO World heritage site)\n" +
                "\n" +
                "\n" +
                "The festivals(Diwali)\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "The masala\n" +
                "\n" +
                "\n" +
                "The rivers (Ganga)\n" +
                "\n" +
                "\n" +
                "The \"lightly loaded\" trucks of our highways\n" +
                "\n" +
                "\n" +
                "The food\n" +
                "\n" +
                "\n" +
                "The languages - Some of the 22 official ones (correction from Nitin Motiani)\n" +
                "\n" +
                "\n" +
                "The culture (Bharatanatyam)\n" +
                "\n" +
                "\n" +
                "\n" +
                "The sport and the madness\n" +
                "\n" +
                "\n" +
                "\n" +
                "The Weddings\n" +
                "\n" +
                "\n" +
                "The schools -- many of the kids with no access to good infrastructure compete well in the global market\n");
    }
}
