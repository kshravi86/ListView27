package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Tenth3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Fauna:\n" +
                " When it comes to big predators India has immense diversity, far ahead of any other country.\n" +
                "\n" +
                "White tigers of Bengal\n" +
                "\n" +
                "\n" +
                "Snow leopards of Himachal\n" +
                "\n" +
                "\n" +
                "Red Pandas of Sikkim\n" +
                "\n" +
                "\n" +
                "One horned rhinos of Assam\n" +
                "\n" +
                "\n" +
                "\n" +
                "Royal Bengal Tigers of Ranthampore, Rajasthan\n" +
                "\n" +
                "\n" +
                "\n" +
                "Only members of Asiatic Lions in Gir, Gujarat.\n" +
                "\n" +
                "\n" +
                "The national bird Peacock, Maharashtra\n" +
                "\n" +
                "Its white cousin.\n" +
                "\n" +
                "\n" +
                "The River Dolphins of Ganges in Uttar Pradesh\n" +
                "\n" +
                "\n" +
                "\n" +
                "Cobras of Tamil nadu.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Black panther\n" +
                "\n" +
                "All the OSX releases are in natural form.\n" +
                "Lions. Check. Tigers. Check. Snow leopards. Check. One horned Rhinos. Check. White Tigers. Check. Cobra. Check. Panther. Check. Just a sample of immense natural beauty with 1000s of great animals.\n" +
                "\n" +
                "Flora:\n" +
                "World's largest mangrove forests and delta in Sunderbans of Bengal. \n" +
                "\n" +
                "\n" +
                "Besides that we have world heritage mangroves of Pichavaram in TN and amazing Nations parks of Kaziranga & Manas in Assam.\n" +
                "\n" +
                "Valley of flowers of Uttaranchal:\n" +
                "\n" +
                "\n" +
                "Kanjenjunga - world's third highest peak\n" +
                "\n" +
                "\n" +
                "South Asia's only active volcano - Barren hills of Andamans\n" +
                "\n" +
                "\n" +
                "Coral reefs of Andamans\n" +
                "\n" +
                "\n" +
                "Jog falls in Karnataka\n" +
                "\n" +
                "\n" +
                "From the Western Ghats of Karnataka to Andamans to Himalayas, India is steeped with natural beauty.\n");
    }
}