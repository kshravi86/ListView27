package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Seventeenth11 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("The Middle Class manifesto aka 8 point plan to mediocrity:\n" +
                "Avoid risks of all types.\n" +
                "Starting a business is not for you. The upper classes will always win. Strive to be the top executive in someone else's business.\n" +
                "\"Fight\" for the good causes, but don't get on the streets. \n" +
                "Own a home and take an annual vacation. Let Real estate be your primary investment.\n" +
                "Study hard. Education and the degrees are the ticket to riches.\n" +
                "Stick with your peer group. Don't do something wacky.\n" +
                "Stay off politics and any other kind of trouble. If you must enter politics, stay off the core.\n" +
                "Neither commit crime nor be the one to clean it up. Act as though you are no way related to crimes around you. \n" +
                "</End-Cynicism>.\n" +
                "Middle classes are very important to a society. They are stable and keep the society wobble less. They help businesses scale by being workers and managers. They tend to commit very low crimes and are great for governments.");

    }
}
