package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Fifteenth2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("When I was in the primary school, I thought fat was the best nutrient for the body. I saw that it provided 2.5 times more energy than carbohydrates. I was too lean and then came a lot of fat that my family and I thought were good. \n" +
                "\n" +
                "In high school, I was bought into an another fad - speed reading. I bought a whole bunch of books on reading faster and faster. It sort of made sense. I assumed that the faster I read, the more information I consumed, the more intelligent I became. In the early days of Wikipedia, I planned to read the entire content. After about 25,000 pages I gave up as I realize it is almost endless. \n" +
                "\n" +
                "Just like the fat, I realize that the speed reading is a terrible thing. It fills our minds with way too much crap and clogs our thought process. The modern society makes us think that more is better. We want fast vehicles, fast food, fast access to information and fast reading skills. While we have realized the fast transportation and food comes at a huge cost to the body, we are only now realizing that the fast access to information comes at a huge cost to the mind. \n" +
                "\n" +
                "Consuming more information is not making us any smarter, just like consuming a lot of fat doesn't make us more energetic. \n" +
                "\n" +
                "Consume slow and allow the brain to form insights. Experience and feel the ideas. Imagine things that appear on paper. Walk the stream of consciousness with the author. You are not kidding anyone by bragging that you can finish a book in 2 hours. Read slow. \n" +
                "\n" +
                "The art of slow reading\n");
    }






}

