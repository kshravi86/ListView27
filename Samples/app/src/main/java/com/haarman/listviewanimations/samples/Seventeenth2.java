package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Seventeenth2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("There is an ancient Indian story about six blindfolded men who are trying to understand what an elephant is. Blind men and an elephant.  The one who just feels the trunk, thinks an elephant looks like a snake. Other people who feel the different parts think it is a fan, rope, spear, wall, tree, etc. \n" +
                "\n" +
                "\n" +
                "\n" +
                "This simple story hides the deepest of philosophical ideas:\n" +
                "Ignore judgment: Different people will judge you in different ways, because each one looks at just one attribute of you. Thus, never pay too much attention to judgment passed by strangers - as you are much more complex than that.\n" +
                "Be careful in giving/receiving advice: Each of those men made an error in judgment. What if they acted on their assumption? It could lead to dangerous consequences. In the same way, most of the people who are giving you advice get too look at a very small part of you. Thus, most advice is either useless or harmless. We should be very careful before providing advice.\n" +
                "Improve your sampling: When you are judging - a single human, a community, a religion, a nation, try to obtain a broad range of samples and piece them together. If you think all Indians are doctors or spammers, you are like the blindmen in the story. \n" +
                "Collaborate: Try to build systems that takes in the perspectives of multiple people. This the reason why market-centric capitalism and diverse democracy work better. They help everyone understand the overall system by aggregating the perspectives of a broad based population. Dictatorships and state-led Communism fail because a few leaders cannot see the complexities of the whole system.\n" +
                "World is complex; don't take shortcuts to a simplistic understanding.");
    }






}

