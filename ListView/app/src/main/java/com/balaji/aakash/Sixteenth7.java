
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 9/7/16.
 */
public class Sixteenth7 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Background: At the time of India's independence in 1947, India had 565 quasi-independent monarchies. The rulers of many of these kingdoms wanted to run their own country, independent of India. However, many of the monarchs were also patriotic guys and joined India on their own will. \n" +
                "\n" +
                "The iron man of India used every kind of persuasion to get the princeley states to come to India's fold. It is a fascinating story of how Patel managed such an integration. Here is a must-read book, from which I summarized the following things: India's Bismarck, Sardar Vallabhbhai Patel\n" +
                "\n" +
                "Operation Polo: The largest monarchy of Hyderbad (about the size of UK) refused to join India and even applied for UN membership. In September 1948, Indian army had a military engagement with Hyderabad to bring the state to India. One of the most one-sided battles in history.\n" +
                "Indian integration of Junagadh: When the Nawab refused to integrate with India and joined Pakistan, India cut off all fuel supplies, transportation links and sent the troops to the border. Also, Patel instigated the vassals to revolt against their Maharajah. Totally cornered, Pakistan and the Maharajah soon agreed to a plebiscite (public voting) and without firing a shot, Patel won.\n" +
                "Bhopal: The state was ruled by the most troublesome prick. He was instigating other princes against India and was fomenting trouble in India's heart. Bhopal nawab had built a great anti-India alliance and Patel was extremely smart in breaking each of the links and isolating the Nawab. He then sent the Nawab to Karachi if he could succeed Jinnah. Seeing his nose snub in Pakistan, the Nawab politely joined India. Patel gave him a long enough noose to hang himself ;-).\n" +
                "Travancore: The king wanted to create a Hindu kingdom as he was not a fan of Nehru's secularism. An assassination attempt was then made on Prime Minister CP Ramaswamy Aiyar. That scared him so much and immediately left the state. Soon, the king with no one to guide, surrendered to India. \n" +
                "Lakshadweep: By the time Pakistan navy reached the islands from Karachi, Indian navy had already reached and hoisted the flag.  \n" +
                "Jaisalmer: Had an offer from Jinnah to join Pakistan, but finally refused. Given that it borders both India and Pakistan, there was no way it could have stayed independent. The king was persuaded to stay with the hindus of India.\n" +
                "Jodhpur: A young prince had just taken over the state and he was a thoroughly spoilt one and wanted to take Pakistan's offer for the sake of wine and women. However, it took just one personal meeting with Patel to scare the daylights out of this prince. India's Bismarck, Sardar Vallabhbhai Patel\n" +
                "Kashmir: There is an entire chapter in \"Freedom at Midnight\" and it would be hard to replicate that. In short, Pakistan sent an army of barbarians at our gate, but these hooligans took to raping and looting before they took the key airport of Srinagar (the only main connection to India). Thus, India had a lot of time to land its troops in Srinagar and drive them far enough and take over the state.");
    }






}
