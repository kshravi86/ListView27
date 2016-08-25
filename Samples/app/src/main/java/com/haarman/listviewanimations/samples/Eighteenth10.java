package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Eighteenth10 extends Activity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Observe\n" +
                "The world around you has a million secrets to tell. It is bursting to tell you, only if you would listen. Put yourself in places where you can observe a diverse set of people, things and events." +
                "Record\n" +
                "Constantly keep track of your observations. Luminaries in every field - art, literature, science and politics kept a note of their observation. Your notebook could be the foundation of your future masterpieces." +
                "Simulate\n" +
                "Give at least 1 hour a day for yourself to organize your thoughts and observations. Try hard to simulate others perspectives and putting yourself in their shoes. You can do this when you are waiting for the dentist or your bus. Consciously look to assimilate the things you have read and observed. For every minute of reading, spend 5 minutes of thinking." +
                "Connect\n" +
                "Start putting together the observations. Neither individual words nor individual neurons are interesting. Lego pieces are not interesting until you put them into complex blocks. In the same way, treat your observations as lego blocks that can be constantly pieced with others. Always be open to changing the configurations of these observations." +
                "Discover\n" +
                "Find your inner voice. Each person has a unique perspective. Tell the world what it looks like from where you are sitting. When you give your personal voice even trite, old things will appear fresh. \n" +
                "Imitate\n" +
                "Even the greatest writers imitated the writers of the yonder. Feel free to imitate other's styles while still striving to give your unique flavor." +
                "Ignore\n" +
                "Consciously try to put down your inner critic as well as outside criticism. Feel free to write your mind, regardless of how poorly formatted the text is. Perfection comes only when you force yourself to constantly act." +
                "Have fun.\n" +
                "Think of writing as a process similar to swimming in the river. While there are different theories on how you should swim and clean, the most important thing is to have fun. Truly enjoy your writing and be as natural as a fish in that water."
                );
    }


}
