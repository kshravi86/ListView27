package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Twelth9 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("In 1947, when India was partitioned there was a lot of pain and confusion. Millions were uprooted and hundreds of thousands died. It was the biggest human tragedy in Indian history. Confused and angry, many mistakenly blamed all this on the Mahatma as he was the biggest target they could find. They thought he had the power to stop the partition [he didn't] and he had the power to stop the violence [he did stop a vast chunk of it in the east].\n" +
                "\n" +
                "For many on the Hindu right, Mahatma was seen as soft towards Muslims. They could not see his vision and his message of peace was seen as compromising. \n" +
                "\n" +
                "The biggest issue was the India's west [Punjab to Gujarat] was exploding and no one really anticipated. Indian leadership prepared for the worst in Bengal and sent Gandhi to put out the fires. And there was nothing really done to put out the fires in Punjab. They had no real plans and were stunned by the sheer scale of violence. Hindu right was extremely angry on the western side that Gandhi didn't come to save him. Ironically, if he were not assassinated, he would have proceeded to Punjab to control the violence there. And Mahatma did plan to go to Punjab even earlier [Sept 1947] but was retained in Delhi by Sardar Patel as the situation in the capital was even more dire.\n" +
                "\n" +
                "Many of Gandhi's peace objectives were also twisted. The sad thing was the rumor mill was the key factor. \n" +
                "\n" +
                "55 crores to Pakistan: This was the much talked about thing of that day. Indian government over Pakistan Rs. 75 crores from splitting the treasury and gave an initial Rs. 20 crores. By the time it could give the remaining, the war in Kashmir begun. Some in the government want to block the money. Others wanted to pay. Although Mahatma Gandhi wanted the Indian government to pay what it owed, some twisted this as portraying the Mahatma having his major fast to arm twist the government to pay this money. That is absurd - why would he fast just for paying some amount of money? But, many don't question that. \n" +
                "\n" +
                "At the end of the day, the extremists some of whom didn't really oppose the partition wanted the Mahatma [the most vociferous opponent of the partition] to act as just a partisan Hindu instead of an Indian. They saw his overtures to bring all communities together as a threat. They mistakenly believed that the Mahatma was the source of this violence & believed he caused the partition and he fasted to pay the 55 crores to Pakistan.\n");
    }
}