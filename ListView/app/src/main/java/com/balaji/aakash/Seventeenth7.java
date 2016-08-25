
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 9/7/16.
 */
public class Seventeenth7 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("You have all the information about space in front of you. Now, build me a rocket to take me to Mars.\n" +
                "\n" +
                "Data is not information. Information is not knowledge. Knowledge is not expertise. Expertise is not execution. \n" +
                "\n" +
                "The purpose of education is to provide you the toolsets that enable you take the data around you, make sense out of it and find out a way to create something productive out of that. As the amount of data around us explode, the necessity for education grows. \n" +
                "\n" +
                "I don't know about you, but I'm constantly at a loss as the information surges around me. Rather than being useful, information can get deposited like excess fat (another great stuff when in moderation) clogging up your powers of execution. In other words, analysis-paralysis. Right learning also provides you the perspective to get out of the analysis-paralysis. \n" +
                "\n" +
                "When your boss asks you on the strategy your company should take, the answer is not trivial. You need to hunt for the right data and use all your expertise to convert that data into an actionable advice. \n" +
                "\n" +
                "Internet has not only increased the need for specialized education (look at how many people are involved in continuous learning these days) but also made it deadly for someone to ignore the purpose of learning. Focus on connecting all the data points you observe and provide a succinct reasoning for why they are connected. That is the most important skill in a modern knowledge economy.\n");
    }






}

