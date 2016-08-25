package com.balaji.aakash;


import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Fourth4 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Indo-Pakistan border issue\n" +
                "When Britishers left India, they allowed individual kingdoms to decide whether to join India or Pakistan. Most of them chose to be with India. In case of Kashmir, the Maharajah was greedy and wanted to stay independent of India and Pakistan. Within 2 months, Pakistan began attacking Kashmir to forcefully take over the independent territory. Pakistanis were quite close to taking over Srinagar. \n" +
                "\n" +
                "\n" +
                "The Maharajah of Kashmir was very scared and called for India's help. India then got the agreement from Maharajah that Kashmir would join India. Within hours India sent its army to Srinagar airport and started pushing back the Pakistanis. In the next 14 months, India fought Pakistanis to take back a chunk of Kashmir. \n" +
                "\n" +
                "However, as the winter of 1948 started, we had only a little more energy to fight and Nehru made a controversial move of going to the United Nations and asking for their help to push out Pakistan. \n" +
                "\n" +
                "UN asked for a ceasefire until the dispute is settled. India showed its legal rights given that Maharaja of Kashmir had agreed to join India. Pakistan contended that more than 50% of Kashmiris are Muslim and thus Kashmir should go to Pakistan. \n" +
                "\n" +
                "Since both countries had equal rights and intentions, the situation reached an impasse and the ceasefire line of 1948 has become the unofficial border between India and Pakistan - the Line of Control. \n" +
                "\n" +
                "\n" +
                "See more on this issue here: Indo-Pakistani War of 1947\n" +
                "\n" +
                "\n" +
                "Indo-China border issue\n" +
                "India and China are very old civilizations and for most of human history had undemarcated borders. The Himalayas ensured that there is enough separation between the Indian kingdoms and China. \n" +
                "\n" +
                "In the 19th century, things started to change as Britishers both had the technology and the desire to pierce the natural border. Britain fought Opium wars with China and managed a puppet state in Tibet. Since then both India and China are trying to decide where their borders are. Since the extent of both these kingdoms varied over 5000 years, it is not really clear on who should own these disputed territory.\n" +
                "\n" +
                "Currently, geography is used to draw the lines. Aksai Chia - the Eastern part of Kashmir is with China although we Indians include it in our map. Arunachal Pradesh is included by China in its map, but we control it. \n" +
                "\n" +
                "Why did China invade India in 1962?\n" +
                "\n");
    }

}
