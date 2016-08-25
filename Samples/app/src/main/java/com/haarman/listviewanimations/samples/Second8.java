package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class Second8 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("There is no one thing that \"really matters to the real world\". Sports, Arts, Science all matters to the real world. All of these have specific contests. You need to pick a parameter that is dear to your value system.\n" +
                "\n" +
                "However, one thing that gets little attention is student entrepreneurship. Find students who are running their own businesses in any capacity and then reward them by promoting their company.\n" +
                "\n" +
                "    Find sectors where students could run their own business even during school time. Even 10 year olds could be trained to develop websites or logos for local businesses, for instance. They might be able to sell books and education kits. Students with strong music talents might find interest in Soundcloud or Youtube [could even sell their song online]. They might be able to assemble simple Robots with robotics kits and sell them [it will become as common as PC assembling in a adecade]. They might create simple dolls and toys.\n" +
                "    Help enterprising students find their core skills in specific businesses. Get them started with some seed capital.\n" +
                "    Reward the successful students by investing in their business. That would be a great thing as you are not giving handout. You become a partner. That is one of the fundamental lesson a self-respecting should learn - world is not there to provide charity, and the best way to engage the world is by partnering.\n" +
                "\n" +
                "\n" +
                "This will teach:\n" +
                "\n" +
                "    Value of money. The fact that earning money is hard is an amazing lesson to learn for anyone planning to be a responsible adult.\n" +
                "    Art of sales. Everyone needs to be able to sell stuff. If you are in office, you need to sell ideas to your boss and the rest of the organization. If you are a politician you need to sell to voters. If you are businessperson you need to sell to consumers. \n" +
                "    Business concepts");
    }

}
