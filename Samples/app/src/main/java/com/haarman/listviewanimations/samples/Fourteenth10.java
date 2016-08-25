package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Fourteenth10 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("This is a great question, as it underlines our society's fundamental lack of respect for established technology. While we collectively fawn over the next great smart phone, or the fanciest new tablet, we overlook the engineering marvel parked in our driveway.\n" +
                "\n" +
                "Cars work flawlessly despite a harsh and unforgiving duty schedule. Consider:\n" +
                "\n" +
                "1. Cars must function reliably in weather conditions found throughout North America, from 120 degree heat in the desert to -40 degree cold found in the northern (or mountainous) portions of the country. Most computer owners manuals specifically tell you to keep your device near room temp.\n" +
                "\n" +
                "2. Cars must deal with physical challenges that would destroy or severely cripple the average computer. Ever taken your laptop down a washboard road? Ever left your phone or tablet outside in a snow storm? Ever mashed your computer into another computer at 20mph, then continued to use it just like you were before?\n" +
                "\n" +
                "3. Cars must protect us, carry us, and entertain us day in and day out. My computer is awesome, but it's not capable of doing anything more than computing. My car, on the other hand, can sustain my family indefinitely. I can live in my car if needed...but my computer can't do that. Not even close.\n" +
                "\n" +
                "Finally, cars have thousands of parts made by hundreds of different companies, all of which must work together flawlessly. They require tens of thousands of man hours of engineering to design, they must be carefully manufactured and assembled, and then they must work flawlessly for more than a decade, as fickle consumers get pissed if/when a car has a failure.\n" +
                "\n" +
                "To answer the question, cars cost more because they are more. They have far more parts, require considerably more design and engineering work, are more complicated to assemble, must adhere to thousands of regulations (all of which drive up the final cost), and obviously cars have substantially more materials.\n" +
                "\n" +
                "If you're reading this and thinking \"man, I never really thought about it that way,\" then I want you to promise to clean your car this weekend.\n" +
                "\n" +
                "If you're reading this and thinking \"whatever, computers are better,\" then I want you to sell your car...you don't deserve it.");

    }
}
