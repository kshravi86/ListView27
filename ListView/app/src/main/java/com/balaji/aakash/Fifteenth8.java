
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 9/7/16.
 */
public class Fifteenth8 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("I might have answered this before. Here are some of the classics I used as a reference for my book. Any student who is interested in contemporary Indian history and politics, should read all the 12 below in the order of the list.\n" +
                "\n" +
                "India After Gandhi - Guha's coverage of Indian history\n" +
                "Indian Since Independence - Bipin Chandra's book on independent history\n" +
                "Freedom at Midnight - events around the partition a lot from Mountbatten's view\n" +
                "Discovery of India - Nehru's view of things\n" +
                "Story of my Experiments with Truth - Mahatma's view of things\n" +
                "India Unbound - Gurcharan Das covers both politics and economics\n" +
                "In Spite of the Gods - Edward Luce provides an outsider's perspective of the politics and culture.\n" +
                "India Today: Economy, Politics and Society (Politics Today) - Another outsider view of Indian politics.\n" +
                "Integration of Indian States - VP Menon gives insights on some of the insider stories on how various princes were convinced to join India.\n" +
                "The Indian Constitution: Cornerstone of a Nation - Most authoritative work on the Constitution.\n" +
                "Makers of Modern India - Guha's work on the key personalities.\n" +
                "The Warrior State: Pakistan in the Contemporary World - understanding the neighbor\n" +
                "\n" +
                "Be careful when trusting one perspective or one view. Always look to triangulate with multiple view points and that is how you can understand the ideal depth.\n");
    }






}

