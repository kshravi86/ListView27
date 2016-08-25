package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 7/7/16.
 */
public class Fourth6 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Partitions are often brutal. West Germany & East Germany had tense relationships surrounding the Berlin Wall. North Korea & South Korea are constantly in a state of a shadow war. North Vietnam & South Vietnam were engaged in a brutal war. In the biggest partition in human history, involving a nation of 500+ million people things were always going to be crazy. The fight among brothers & neighbors are nastier than fights among strangers.\n" +
                "The religious frenzy. The genesis behind partition is the idea that \"Hindus and Muslims were two different nations\" although the reality was that both these communities were diffused throughout the nation. To enable a religious partition, millions had to be moved. That resulted in anger and violence, that kept escalating. Due to the exit business, Britain neither had the energy nor the inclination to police the country. The final result was that the Hindu population in Pakistan was completely decimated and a portion of India's Muslims had to make a hasty retreat out of India.\n" +
                "The nature of the withdrawal. The British government under Clement Attlee made a hasty retreat from India. The destruction of the British economy during World War left it too weak to maintain control over India. The Indian nationalist leaders were too impatient, given the 1945 change of power from the conservatives (die hard supporters of colonialism) to the labor party (more liberal & freedom-friendly). The Hidden Story of Partition and its Legacies. The hasty withdrawal left the administration with little plans to manage the partition.\n" +
                "Whipping up the frenzy. By the start of Second World War, Muslim League of India had made it clear that they wanted to divide India into two nations. However, Congress Party never took them seriously enough. By 1946, MA Jinnah realized that Congress was never going to let partition happen. He decided to enforce partition. This led to the Direct Action Day on 16th Agust 1946- one of the most brutal days for India's Hindus. Continuous whipping of frenzy left both sides on edge in the days leading to the partition.\n" +
                "Ambiguous boundary. To draw the boundary, Lord Mountbatten brought a lad who knew nothing of India. Although he did a good job given the situation, the partition left a lot of howlers. Lahore was surrounded by Hindu villages & should have gone to India, but gone to Pakistan due to its importance in Islamic culture. Amritsar was surrounded by Muslim villages, but went to India due to the Golden temple. Such controversial moves, left millions to be left on the wrong side of the border.\n" +
                "Partition: Unfinished business. Jinnah and his followers had a big dream for Pakistan. This is what he imagined his Pakistan. \n" +
                "\n" +
                "Given that Muslims were just 25% of India, his ask for 50% India's land was considered ludicrous. Not only that, his plan would have left India as a completely unsustainable nation. Unsurprisingly, Congress fought back for a more reasonable bargain. When the borders were finally drawn, Jinnah complained that he got a \"moth eaten Pakistan\" and was pissed. Indians were pissed that he got away with bisecting the country. The Hindus saw India like on the map below. There was a huge difference in how both sides saw their respective nations. Thus, there was high tension on both sides on the eve of partition. Here are the \"dreamed maps, vs. the actual (final map). \n" +
                "\n" +
                "Weather. The 1947 monsoon (India is virtually a desert without the monsoons) was under par in Western India, while it was fairly ok in eastern India. Independence day and Monsoon - 65 years back! This left a lot of western farmers (most of India depended on agriculture) in pain and anger. The partition gave them a chance to vent their anger and blame the pains on the opposition. This pent up anger kept escalating the violence");
    }

}
