package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class Fifth6 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Arjuna has gotten very curious about the nature of wisdom and yoga. He is much more calmer now. \n" +
                "\n" +
                "\"What is the description of him who has steady wisdom and is\n" +
                "merged in the Superconscious State? How does one of steady wisdom speak? How does he sit? How does he walk?\"\n" +
                "\n" +
                "In this part, Krishna goes into detail about the nature of an ideal yogi.\n" +
                "\"He whose mind is not shaken by adversity, who does not hanker after pleasures, and who is free from attachment, fear and anger, is called a sage of steady wisdom.\"\n" +
                "\n" +
                "\"He who is everywhere without attachment, on meeting with anything good or bad, who neither rejoices nor hates, his wisdom is fixed.\"\n" +
                "\n" +
                "One of the examples Hindu scriptures often use for this is the Lotus leaf. Lotus is always in water, but its leaf does not get soggy. Hindu sages ask us to emulate the Lotus leaf - being in the midst of all the action, while still not getting too carried away by the attachment. \n" +
                "\n" +
                "\"When a man thinks of the objects, attachment to them arises; from attachment desire is born; from desire anger arises. From anger comes delusion; from delusion the loss of memory; from loss of memory the destruction of discrimination; from the destruction of discrimination he perishes.\"\n" +
                "\n" +
                "\"But the self-controlled man, moving amongst objects with the senses under restraint, and free from attraction and repulsion, attains to peace.\"\n" +
                "\n" +
                "Krishna ends the Yoga with his emphasis on self-control. In fact, whole of Gita could be condensed to this one concept - of controlling oneself and staying above the everyday banality. In the next few chapters, he goes in detail into achieving this in everyday life.\n" +
                "\n" +
                "To be continued..\n");
    }

}
