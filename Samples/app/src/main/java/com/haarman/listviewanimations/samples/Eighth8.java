package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 8/7/16.
 */
public class Eighth8 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Without US help, the fortunes of the war could have changed. The difference between the sides was not that much (as shown by the number of years the war dragged on) and not having a major ally was obviously going to change the slender margin that separated Germany and Britain. \n" +
                "\n" +
                "War in Asia\n" +
                "In the Pacific theater, Britain was helpless against the Japanese onslaught. Most of east Asia had fallen to the Japanese. The war was shifting to South Asia. In its key colony India, some soldiers had started defecting to a rebel league - the Indian National Army that supported the Japanese. \n" +
                "\n" +
                "One seldom unappreciated point is that, the Indian army was among the biggest contingent in the entire war. Indian Army during World War II 2.5 million Indian men served the war. If Japan had gotten to India, the war would be different. Besides men and resources, India would have enabled Japan to directly get to West Asia and open a front on the British-French troops in North Africa from the east, leaving Germany to focus on Russia/England.\n" +
                "\n" +
                "The only thing prevented Japan from doing this was the onslaught by the US from the east. Britain had no major naval capability in the Pacific to face Japan.\n" +
                "\n" +
                "War in Europe\n" +
                "By 1942, things were already bleak for England. They were completely isolated from the rest of Europe. If they didn't receive all the assistance from the US, Churchill's army could have broken down at some point. This would have been more likely especially if they lost their colonies in Asia.\n" +
                "\n" +
                "Technology\n" +
                "The war was ultimately won with superior technology. It was very closely fought and ultimately the computing and nuclear technology provided the distinct advantage. US was a big part of both. It also had access to oil that Britain had to depend from outside sources");
    }
}
