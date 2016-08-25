package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Seventeenth6 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("A lot of times, a genius and a stupid might appear to be the same. We often wonder how come a genius is taking the same position as the ignorant. \n" +
                "\n" +
                "Assume you are climbing a mountain. When you look from a distance, a guy driving near the bottom arrow might appear by the side of a guy driving near the top arrow. Without the advantage of perspective, you might even assume that both are the same. \n" +
                "\n" +
                "\n" +
                "However, the guy at the top arrow is closer to reaching the top of the mountain of truth. While the guy at the bottom has still a way to go. \n" +
                "\n" +
                "Without getting the right perspective and not looking close enough we make errors in judgment (of not recognizing the finer differences of the smart and the stupid) all the time.\n" +
                "\n" +
                "The pursuit of truth is akin to climbing a tough mountain. We cannot do that in a linear path and might keep going round and round. At every turn, we might wonder if we got back to the starting position. Adding an another dimension to our thinking might help us understand how far we have climbed towards the truth.");
    }






}

