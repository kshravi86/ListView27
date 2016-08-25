package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class Fifth7 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Bhagvad Gita 6: Karma Yoga (Part 1)\n" +
                "BALAJI VISWANATHAN\n" +
                "\"If knowledge is superior to action, O Krishna, why then, do you ask me to engage in this terrible action?\" asked Arjuna. \n" +
                "\n" +
                "This begins one of the greatest chapters in the Gita - Karma Yoga. Karma refers to action and the effects of those actions we do. It is a central part of many Asian religions. \n" +
                "\n" +
                "Karma Yoga refers to the state of doing actions without getting too emotional about it. What happens if a good surgeon starts feeling too emotional for the patient - fearing for his/her life? Can he exercise good judgment in that case? How about a musician who starts thinking about his career in the middle of a performance? \n" +
                "\n" +
                "\"He who, restraining the organs of action, sits thinking of the sense-objects in mind, he, of deluded understanding, is called a hypocrite. But whosoever, controlling the senses by the mind engages himself in Karma Yoga with the organs of action, without attachment, he excels!\" said Krishna.\n" +
                "\n" +
                "\"As the ignorant men act from attachment to action so should the wise act without attachment, wishing the welfare of the world!\"\n" +
                "\n" +
                "Krishna also talks about the Gunas (abilities and mental attitudes) that guide our actions. He talks about how one should be true to their abilities & interests, instead of worrying too much about what others are achieving.\n" +
                "\n" +
                "\"Better is one’s own duty, though devoid of merit, than the duty of another well discharged. Better is death in one’s own duty; the duty of another is fraught with fear.\"\n" +
                "\n" +
                "This thought has inspired and has been echoed by so many great thinkers of our time.\n" +
                "\n" +
                "“If it falls to your lot to be a street sweeper, sweep streets like Michelangelo painted pictures, sweep streets like Beethoven composed music ... Sweep streets like Shakespeare wrote poetry. Sweep streets so well that all the host of heaven and earth will have to pause and say: Here lived a great street sweeper who swept his job well.” -- Martin Luther King, Jr.\n" +
                "\n" +
                "To be continued...");
    }

}
