
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Second1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("I'm starting a new series on the origins of Universites and education systems. Can we learn from the past and reimagine how University education could be done? This is the first post.\n" +
                "In the modern world, we use trivial and trivia in a very casual sense to denote worthless things. I have always wondered what the \"tri\" in those words signified. Finally, I did research on this trivial concept and the pursuit turned to be non-trivial & interesting.\n" +
                "\n" +
                "When universities were organized in the medieval era (circa 1100 AD) they were built on 3 stages of scholarship:\n" +
                "Trivium: This includes the 3 subjects of grammar, logic and rhetoric (art of speaking/writing). This is considered the foundation for any student.\n" +
                "Quadrivium: Once you graduate after acquiring the trivium, you start studying 4 complex subjects: Arithmetic, Geometry, Astronomy and Music.\n" +
                "Philosophy: This is where you acquire the higher intellect unhindered by arbitrary classifications of grouping knowledge.\n" +
                "\n" +
                "\n" +
                "In short, trivial/trivia mean things that are elementary & commonplace (like grammar and logic). These are assumed to be possessed by everyone and more focused upon by lower intellect.\n" +
                "\n" +
                "Now, is the present University education nontrivial?");
    }

    }
