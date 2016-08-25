
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 9/7/16.
 */
public class Seventeenth9 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("There was a poor sculpter Zuan in a county called Zhouzhi. He resented his hard life, sitting in the sun and doing grunt work for the royals. He prayed everyday. After a long hard prayer, one day a fairy came.\n" +
                "\n" +
                "Zuan asked to become the ultimate master who couldn't have anyone dictating terms to him. The fairy gave him a magic wand that will make him whomever he imagines to be.\n" +
                "\n" +
                "Zuan got the magic wand and imagined to be the emperor of Xi'an. He has now become the emperor of Xian and starts having a happy life. \n" +
                "\n" +
                "One day, he went on a hunting trip to a distant forest. There he was captured by a group of cannibals who captured him and took him to the tribal chieftain. Before the chieftain could order to kill him, he used the magic wand to become the chieftain as he felt the chieftain was more powerful than even a king. \n" +
                "\n" +
                "He had a good life as a chieftain, until a regional warlord started harassing him. The warlord kept demanding more and more taxes. Zuan used his magic wand again and became the warlord.\n" +
                "\n" +
                "His life as a warlord looked good until a day he was struck in massive storm. The rain ransacked his troops and he was left stuck in the devastating storm with nowhere to hide. Zuan imagined to become the cloud that caused the storm (as that was more powerful than the warlord).\n" +
                "\n" +
                "Zuan now transformed into a cloud and started wandering around free. Then hit up on a big mountain and couldn't move further. He then desired to be the rock that could stop even the clouds. Zuan now felt really strong as he was the rock that made the big mountain. \n" +
                "\n" +
                "On a hot sunny day, there were a big group of sculptors who came searching for nice rocks to carve. They started using the tools against the big rock of Zuan. As the rock started crumbling, Zuan imagined himself to be a sculptor. He became the sculptor once again. \n" +
                "\n" +
                "Everyone has a master.\n" +
                "\n" +
                "This is based on a Chinese parable that I read in class 6. One of the most powerful stories I have heard.\n");
    }






}

