package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Tenth8 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("My vote is for Meenakshi amman temple, India.\n" +
                "http://en.wikipedia.org/wiki/Mee...\n" +
                "\n" +
                "The temple site is believed to be more than 1000 years old, although the present structure was built in the 16th century. It is a massive 45 acre complex with some of the most exquisite granite carvings in the world. The key feature is the gopurams or decorated towers such as this. There are 14 such towers, some of them as high as 170 feet, tell about various gods & stories in Hindu pantheon. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Let me give you some perspective of the size. Look at the humans near the elaborately carved pillars. There are dozens of these corridors with different sculptures. \n" +
                "\n" +
                "\n" +
                "Let us zoom even out. This is a 45 acre complex of such majestic carvings. \n" +
                "\n" +
                "\n" +
                "It is not just the size, but the intricate details that are so special. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Some of these massive sculptures are made out of a single stone. \n" +
                "\n" +
                "\n" +
                "The pond in the temple has a lot of special stories. It is a central part of the Tamil language (one of the classic languages of the world) and the mythology says that ancient scholars used this pond as a barometer for their literary works. It was believed that the pond would sink the poorly written books & and float the well written books.\n" +
                "\n" +
                "The temple is a core part of the Tamil culture and is incredibly special.");
    }
}