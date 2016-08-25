package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Thirteenth10 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Who are they?\n" +
                "Kurds are one of the 4 main ethnic groups of the Middle East. In the map below - Green is Turks, Red is Kurds, Yellow is Arabs and Orange is Persians. If you move further east, you can also see a brown - Pashtuns. All the top 5 are predominantly Muslim, but they all have their cultural quirks and identity of their own. All of these shape up the history and politics of the region in various ways. Zoom this map to get a better picture.\n" +
                "\n" +
                "40 Maps That Explain The Middle East\n" +
                "\n" +
                "Now, why is this a problem:\n" +
                "Imagine you are being tasked with creating nations from the first map that primarily represent one color (ethnicity). You are given a random spray where no region is completely of one color. How do you draw the boundaries? That was the challenge for the British and French who had this huge territory after the First World War and didn't know how to draw.\n" +
                "Other major ethnicities - Arabs, Persians, Pashtuns and Turks all got a nation of their own. In fact, the Arabs got many nations for their ethnicity. However, only the Kurds were left out of the game. Among the major ethnicities, they were cheated. No one bothered to give them their own nation after the end of the WW-I when all other nations were created around them.\n" +
                "When a culture doesn't have a nation to go to, it is historically victimized. [Offtopic: This is the reason why Israel wants a Jewish majority nation for themselves] Kurds bear the brunt of not having their own nation.\n" +
                "In the region they inhabit, they are among the most tolerant and democratic people. That doesn't sit well with other tribes which want to impose a more orthodox version of Islam.\n" +
                "History of the Kurdish people\n" +
                "\n" +
                "What is their History?\n" +
                "The Kurds were initially sheepherders in Iran and due to the Muslim conquests from the 6th century, they were taken further and further by West and got into Turkey, Syria, etc. Some of them, like the Yazidi subgroup in the Kurds, remained animists, while a few others stayed Christian. Most of the rest were converted to Islam.\n" +
                "\n" +
                "They were eventually wedged between 2 very powerful groups - Safavids of Persia and Ottomans of Turkey. These two dynasties squeezed a hell out of native Kurdish lords and made them lose all their powers. Both these dynasties thought their own ethnicities to be highly superior and played Kurds as football thrown between east and west. \n" +
                "\n" +
                "\n" +
                "After the first World War, Britain helped them to get their one nation - Kurdish Republic of Ararat, but Kemal Ataturk of Turkey was too powerful for the Kurdish general Ihsan Nuri. Eventually the Ararat republic was reabsorbed by Turkey. In Mesopotamia, Arabs were allowed to take the Kurdish region to form the new nation of Iraq. England needed the friendship of the powerful Hashemite clan of Arabs as they found new reserves of oil and knew how powerful it is going to become.\n" +
                "\n" +
                "While Turkey's democracy provided a better home for the Kurds, the various Arab rulers of Iraq always saw the Kurds as alien and brought some of the worst brutality on these people. Kurdish genocide. ISIS is following that Arab tradition of Kurdish genocide now. \n" +
                "\n" +
                "Summary:\n" +
                "In summary, Kurds are among the 4 major ethnic groups of the Middle East and the only one who doesn't have their own nation. They are predominantly in Turkey, Syria and Iraq, although originally they were Iranians. Many of them are Sufi Muslims, although some of them are Christians or animists. For the other Islamic tribes, Kurds appear alien and worshipper of non-Islamic gods. Thus, they get constantly massacred.");

    }
}
