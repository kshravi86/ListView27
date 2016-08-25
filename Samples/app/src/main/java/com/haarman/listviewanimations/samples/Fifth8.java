package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class Fifth8 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Hinduism has four main pillars - kama (sensual pleasures), artha (wealth and power), dharma (principles and morals) and mokhsha (complete liberation). \n" +
                "\n" +
                "In Hinduism, Dharma means set of practices that enables humans to sustain in the world. Dhar and darna means hold/support/harmony. Dharma includes the moral code and lays out the rules & guidelines on how humans can stay in harmony with the world around us. In Hindu tradition, we don't have any name for our religion. We just call it dharmic - one who follows a code. \n" +
                "\n" +
                "\n" +
                "Dharma is usually represented as a circle, to Indicate the cyclic nature of things\n" +
                "\n" +
                "There can be many types of dharma (each dharma is basically set of moral codes that don't conflict with each other). For instance, Buddhists have their own dharma - the rules laid by Buddha. Casteist Hindus have their own dharma called the Varnasrama dharma - laid by Manu. Zorastrian Persians have their own dharma - called Daena. Sikhs have their dharma - one laid by Guru Gobind Singh and other gurus of the religion. \n" +
                "\n" +
                "\n" +
                "The epic of Mahabharata is completely about understanding Dharma in Hinduism\n" +
                "\n" +
                "In Hinduism, Dharma is more than the morals and can deal with a very complex reality. Indian epic of Mahabharata is a perfect example of how Dharma can be one with often counterintuitive and paradoxical things. Hindus don't believe that one can manage this world with a simple set of skeleton rules. Thus, Hindu dharma (in contrast to Buddhist, Jainist and Sikh dharmas) is a very complex one. \n" +
                "\n" +
                "In Hinduism, it is dharmic for a king to kill somebody (in war or prison) if that can lead to the betterment of the society. While \"killing\" is immoral in most other religions, Hinduism takes a very pragmatic approach. It is also dharmic for a king to have a spying agency that can often use lying and deception to protect its territory. On the other hand, it is adharmic to not support your parents in their old age, although it is morally ok in other religions. Also it is adharmic to eat without parting your food with animals around you (usually crow, cow and dog - the most common creatures in India).\n");
    }

}
