
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 9/7/16.
 */
public class Seventeenth8 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Here is one of the most beautiful poems, written during the Sangam era of Tamil (1000 BC - 300 AD) by Kaniyan Poonguranar. Purananuru  \n" +
                "\n" +
                "My attempt at translation (in my school board we were required to memorize the original poem).\n" +
                "\n" +
                "Every town is my town,\n" +
                "Everyone is my kin.\n" +
                "Good and Bad don't come from others;\n" +
                "Same for all our pains and reliefs,\n" +
                "They come from within us.\n" +
                "\n" +
                "Neither death nor birth are new;\n" +
                "We forget the reality when in too much joy,\n" +
                "And when in too much pain and grief.\n" +
                "\n" +
                "Thunder and Lightning are striking bad,\n" +
                "The waters from the skies are pouring hard,\n" +
                "Through the rocks and steep mountain slopes,\n" +
                "Carrying the fragile raft of life with the stream,\n" +
                "We are nothing but followers of the stream.\n" +
                "\n" +
                "In this fragile life of ours, It is futile \n" +
                "To magnify the accomplishments of the great,\n" +
                "As is futile to disregard the work of the ordinary.\n");
    }






}

