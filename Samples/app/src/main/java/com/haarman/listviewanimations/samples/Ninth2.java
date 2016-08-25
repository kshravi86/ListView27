package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 8/7/16.
 */
public class Ninth2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("The Nazi swastika's resemblance to Hindu symbol is no accident. The Nazis had substantially twisted Hindu ideals to suit their needs. The word \"Aryan\"  that Nazis were so fond of is from the Sanskrit word \"Arya\" meaning supreme, pure -- to denote a class of people. While in Hindu sense it is used in more positive contexts (suave, refined, scholarly), for the Nazis the word meant the supreme race.\n" +
                "\n" +
                "Heinrich Himmler, the dreaded head of the SS, called himself a Kshatriya (the second highest caste), performed yoga exercises and carried the Bhagvat Gita. He was delusional in assuming himself as the Arjuna (the hero of Mahabharata). He assumed that he was leading a just war. See: Nazi leader Heinrich Himmler a fan of yoga  - Telegraph\n" +
                "\n" +
                "One of the key thought leaders in the Nazi group -- Savitri Devi (actually a French woman with the original name Maximiani Portas) -- claimed Hitler to be an avatar of Hindu god Vishnu. According to Hindu mythology the last avatar of Vishnu -- Kalki -- would destroy the world and take the good people to start a new cycle. For the Nazis, Hitler was the Kalki. As Savitri Devi thought herself as a thinker, she called herself a Brahmin (top caste in Hindu system) and married one. It was she who connected the India's rebel leader Netaji Bose to the Axis powers (especially Japan). (For his part, Bose married an Austrian - Emilie Schenkl and the couple was treated very well by the Germans.)\n" +
                "\n" +
                "\n" +
                "Key connector between Indian National Army and the Axis powers\n" +
                "\n" +
                "Hindus were/are not interested in any of these crazy comparisons of Nazi leaders with Hindu gods and for the most part unaware of what Hitler did after he wrote his autobiography. There are no holocaust deniers, however some fringe Hindu groups are still fond of Hitler & his boys (Hitler's \"Mein Kampf\" was always among the best sellers in the bookshops), while also believing Israel is the ultimate model for India & Jews as the model for Hindus. Oh, the irony!\n" +
                "\n" +
                "Also read:\n" +
                "Why do some Indians admire Hitler?\n" +
                "Esoteric Nazism\n" +
                "Heinrich Himmler: The Nazi Hindu");
    }
}
