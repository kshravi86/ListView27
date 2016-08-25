package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Seventeenth1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("It is the year 1401. Europe is still shackled by the dark ages. The glories of Greece and Rome are long forgotten. The pursuit of science and art have been relegated to some dark corner. There is poverty, squalor, and dirt. \n" +
                "\n" +
                "In a tiny Italian city of Florence, the central Cathedral had announced a contract to build new bronze gates for Baptistery. Two great genius artists competed for the contract: Lorenzo Ghiberti and Filippo Brunelleschi. They would spark a creativity war that would soon enlighten up the whole city. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "In the next few decades, artists would come in droves and build & paint stuff. Creativity and geninusness would soon rub on each other.  Soon, the glories of ancient Rome and Greece would be unearthed. By the end of the century, Europe would discover the new world and new trade routes to Asia. In the next 2 centuries, amazing works in science would come up. That would sparkle the industrial revolution and complete Europe's dominance over the intellectual world. \n" +
                "\n" +
                "I had a great marketing professor from Spain who once said: \"When the wind is behind you, run. Run, very fast. If you can't run, bike. Do something. Never waste the wind.\"\n" +
                "\n" +
                "India is at a critical juncture similar to what Europe was in the 15th century. In the past 5 years, we have eradicated Polio. We found water on Moon. We have launched rockets to Mars. It is time to run. Time to run, really fast. We have no time to stop. We have a 1000 more challenges to solve. India Dreams Collection");
    }






}

