package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Fourth11 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("The Naxalites operate in a wide area that is filled with deep forests, mountains and rivers. The area affected is bigger than Vietnam, the terrain is difficult and task is hard (identifying who is the friend and who is the enemy). If US Army found it that hard in Vietnam, it is not going to be a cakewalk for the Indian Army to fight such a guerilla war in a massive terrain. Armies have a lot of fire power, but none of the world armies are trained to tackle sustained guerilla warfare. It will be a really expensive war. \n" +
                "\n" +
                "Using an army inside a country, anywhere in the world, should be the last resort. Armies are not trained for the tasks that police can do. The police have deeper ground relationships and understand the terrain & people much better than the army. In past success stories, such as containing terrorism in Punjab, it was the police who led the charge in anti-terrorism. Armies will further alienate the locals as they are not designed to be people-friendly.\n" +
                "The army is already overextended in two frontiers. Giving them an additional headache for a marginal gain is not in India's best interests.\n" +
                "Using an army in the middle of the country will signal to the world that India's administration is unable to get the house fixed the normal way.\n" +
                "Most importantly, India's naxal problem is a socioeconomic issue that is aggravated by bad politics. The affected regions are highly corrupted and have pathetic infrastructure. While there is no justification for an armed struggle, it will be equally stupid to use the extreme option without paying attention to fixing the ground realities.");
    }
}
