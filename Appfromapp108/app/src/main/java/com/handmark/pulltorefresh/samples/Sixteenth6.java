package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Sixteenth6 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("I think it served pretty well.\n" +
                "\n" +
                "Strengthened the union: Until the 1950s many regions of India - including Tamil region wanted to secede from India. The extremists contended that we were never part of Indian kingdoms for most of the history and the separatists in our region wanted to get out of India. However, after geting a separate state for Tamil people, the secession demands have gone away as we have a good level of autonomy. Thus, we are able to get the benefits of being in India, while still maintaining the Tamil culture.\n" +
                "Maintained the diversity: Without the linguistic organization, many of the regional languages could have died. Cultural diversity is a key strength of India and the linguistic organization has protected it. \n" +
                "Healthy competition: Although a lot of times the competition turns unhealthy (eg the water wars between Karanatka and TN) for the most part the competition is healthy. There is a shadow growth war between southern cities such as Bangalore, Chennai and Hyderabad. This competition pushes our politicians to care a tiny bit more than the politicians in states that don't have linguistic rivalry (BIMARU states). \n" +
                "Better growth: There is a high correlation between states with high linguistic attachment and states with high economic/human developent. Thus, Kerala, Maharashtra, Tamil Nadu, West Bengal, Gujarat are populated by sort of linguistic \"fanatics\" and also rank high in HDI. (Not all of this growth is due to the linguistic organization though)\n" +
                "\n" +
                "On the surface, the linguistic organization seems to go against the \"one nation\" rule. But, if you look deeper, the strength of our civilization lies in the  concept of \"one destination, many paths\". Bringing any sort of forced homogeneity would be completely against what we have been doing as a civilization for over 5000 years. The essence of India and Hinduism lies in this magnificient diversity and the nurturing of all faiths, cultures and languages.");
    }






}
