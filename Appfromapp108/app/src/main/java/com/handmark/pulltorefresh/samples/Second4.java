package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 7/7/16.
 */
public class Second4 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Education is not the learning of many facts but the training of the mind to think -- Albert Einstein\n" +
                "\n" +
                "Education is not just a way to accumulate knowledge, but a path to acquire wisdom from your observations.\n" +
                "\n" +
                "\n" +
                "\n" +
                "A true education should:\n" +
                "Teach students the skills of observation - seeing, listening & experiencing.  Sadly most of us are very poor observers & thus our learning stops relatively early in our life. However, with a constant practice anyone could develop observation skills.\n" +
                "Provide opportunities to observe - bringing objects to class, field trips, art events etc. Manage this in a very effective manner rather than creating a laundry list.\n" +
                "Teach tools on the art of recording observations - journal entries, creating notes & mind maps\n" +
                "Provide basic knowledge to start interpreting observations - this includes elementary knowledge of language, math, geography and science.\n" +
                "Teach basic logic and the art of experimentation. This includes understanding what hypothesis means and how those hypotheses are validated. Experimentation should not be just restricted to Chemistry, but for every stream of human endeavor.\n" +
                "Create ways to share experiences in a supportive way. It is very important to constantly share your experiences to grow your learning.\n" +
                "Provide an environment to help students to build on their observations and experiences in their own way.\n" +
                "\n" +
                "Education is all about managing observations. Whether you are a scientist, writer, artist, manager or investor, all these skills become the deciding tools of your trade. However, it is sad that our education system is providing a low importance to the art of observation.\n");
    }

}
