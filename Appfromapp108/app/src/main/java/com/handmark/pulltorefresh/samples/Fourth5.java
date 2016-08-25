package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 7/7/16.
 */
public class Fourth5 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("India was divided along religious lines in 1947 to create the new nation of Pakistan that was again split in 1971 to create Bangladesh. \n" +
                "\n" +
                "The Muslim population of India at the time of partition was around 20%. Thus, in a fair cut 20% of India should have gone to the Muslims. That's what happened: Pakistan + Bangladesh = 20% of land area of India before the partition. \n" +
                "\n" +
                "Now, which parts should go to the Muslims? That can be answered by this 1909 map. The dark red regions are the ones with an absolute Hindu majority. Does this map's outline remind you of anything?\n" +
                "\n" +
                "\n" +
                "Yes. This is the current map of India that retained all the dark red regions from above. \n" +
                "\n" +
                "\n" +
                "If you think the concept of partition as fair, then Pakistan could not have expected better than what they got. Almost half the Muslims of British India chose to stay back in India, while the majority of Hindus in Pakistan was forced to move to India. Thus, Pakistan got a 20 % land area while taking only 10% of the population. \n" +
                "\n" +
                "In my humble view, the whole exercise ended up equally unfair to both the Hindus and Muslims. About 14 million minorities were caught on the wrong side of the border and were forced to migrate - 7 million of them were Muslims and 7 million of them were Hindus.  Millions of lives were lost for no reason.\n");
    }

}
