package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 8/7/16.
 */
public class Eighth2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Personalities: WW-II involved a lot more interesting personalities - Hitler, Stalin, Churchill, Franklin D. Roosevelt, Hirohito, Eisenhower, Marshall, MacArthur, Rommel, Patton, Montgomery and Mussolini. WW-I personalities were all comparatively insipid. Even the Americans don't want to remember Woodrow Wilson any more. Personalities always make a story stick stronger. WW-I is often an impersonal story - a bunch of colonial empires fighting among each other. There is no clear way to pick good from the bad. WW-II far more drenching and personal as it was a story of human struggle throughout. \n" +
                "\n" +
                "Incredibility: WWII involved a lot of incredible events - Holocaust, gulags, usage of nuclear bombs, brutality of Japenese soldiers, incessant bombing on the civilian population. Even less incredible events - the Pearl Harbor attack, Normandy invasion, famine of Bengal, invasion of Poland, siege of Stalingrad are all major events in the respective countries histories. WW-I had comparatively less memorable (good and bad ways) events.\n" +
                "Post-war dramatism: While during war things were incredible, post-war was even more. UN was created. End of colonialism began. Cold war began. Reconstruction of Europe. Founding of World Bank & IMF, and computers. Whenever we talk about the history of any of these, WWII would be mentioned.\n" +
                "Extent: More nations involved, more dead people (as many as 85 million people) than WW-I. In fact, almost all nations were involved (other than Tibet, Afghanistan, Sweden, Switzerland, Portugal and Spain). \n" +
                "\n" +
                "Media: In WW-I, motion picture, airplane, radio and other major inventions were in their infancy. WW-II was in a much more bigger information age, where we have much more content in the form of photographs, videos, etc. \n" +
                "Recency: Some of the people who involved in WWII are still alive, while almost everyone who participated in WWI are gone by now. If everything else is equal, recent events are remembered more.");
    }
}
