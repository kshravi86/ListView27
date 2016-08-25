
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 8/7/16.
 */
public class Eighth3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("It is 1913. The world has its first major wave of globalization. The world had just been connected by telegraph, telephone, airplanes and railroads. Goods and services from different parts of the world had started to mix like never before. \n" +
                "\n" +
                "A new wave of \"startups\" would emerge from the last decade of the previous century. By 1913 there would be over 2000 manufacturers of cars. However, consolidation would start happening in Detroit with the emergence of the Big 3 (Ford, GM, Chrysler) just the like the Big 3 tech companies ruling the social media now.\n" +
                "\n" +
                "There is a calm, but there is also uneasiness.  An empire is at its heights (British), but will soon start falling from its perch.  Everything would change in a year. \n" +
                "\n" +
                "An ambitious power is knocking on the doors from the Pacific. It is Asian, it is poor and it is known for its shoddy products. But, it is ambitious (Japan). \n" +
                "\n" +
                "Middle East had started its revolutions & uprising. The Ottomans who ruled the region are weakening. 1913 Ottoman coup d'état\n" +
                "\n" +
                "America was led by a charismatic Democrat - Woodrow Wilson. Soon he will be mired in a war and will be toothless in front of a powerful Congress. \n" +
                "\n" +
                "As the war lobby is drumming up for an another war in the Middle East (this time in Syria) I wonder if we are learning from history.");
    }
}
