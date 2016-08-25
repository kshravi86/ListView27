package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class Second9 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Supply-Demand argument: There are 10s of millions of \"weak\" students while there are only a handful of top universities. You can only put so many people alongside top professors and top labs. Somehow there will be a \"chosen\" few thousand whichever way you try to pick.\n" +
                "\n" +
                "Resources argument: The ones who worked hard to get into a top program are more likely to utilize the resources of the labs, libraries and professors than the \"weak\" student. By admitting only the weak students, you potentially cause resource wastage.\n" +
                "\n" +
                "Sustainability argument: The top universities are those that have top students. As soon as you admit only the weakest students, you are no longer  a top university. A vicious cycle destroys the sustainability of the top schools.\n" +
                "\n" +
                "Fairness argument: You want to provide goodies to those who have worked the hardest and deserve the most. If you are recruiting someone for your national football team, you are going to look at only two things - skillsets and efforts put. It would be unfair to recruit a guy just because his dad was poor.\n" +
                "\n" +
                "Responsibility argument: It is the role of the government to get people out of dormant minds during their school time. This is why governments strive for universal and equal education at the school level. By the time someone comes to the University level he/she already should have the momentum to go and seek the higher truth. Good professors primarily have the skill of guiding you on your path, when you have already started seeking the path. Universities have not been traditionally designed to create something out of nothing.\n" +
                "\n" +
                "Fwiw, I'm the 99% that didn't go into the rank 1 University ;-).");
    }

}
