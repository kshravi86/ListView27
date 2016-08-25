package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Fifth12 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Nandi is the vehicle for the Hindu god of Shiva. In Hindu mythology, Nandi is the bearer of truth and righteousness. \n" +
                "\n" +
                "Background:\n" +
                "Each Hindu god has their own vahana (the Sanskrit root word for the English term of Wagon) that they use in war or in peacetime. These vehicles typically tend to be endangered species (such as eagle, peacock, swan, tiger, owl, lion) which Hindus want to protect from getting slaughtered. The animals also stand for specific qualities that are consistent with the deity's image & functions. \n" +
                "\n" +
                "  \n" +
                "For instance, the vahana of Vishnu is Garuda (eagle) as he is the protector god and agility is very important for Him. The goddess of Durga uses Simha (Lion) as the vahana since she is a female general who fights fierce wars. The goddess for knowledge - Saraswati uses Hansa (swan) as she is eternally calm & the white swan indicates purity & beauty - the fundamental properties of knowledge. \n" +
                "\n" +
                "Nandi history:\n" +
                "Now, coming back to the Nandi (bull), it is the vahana of Shiva - the god of skies & destruction. Shiva with Nandi is one of the oldest forms of Hindu representation - dating before 3000 BC. It is believed that this form originated when people were mostly cattle rearing and wanted a god to protect their cattle - their most important property. Bull was also used as god forms in other ancient civilizations (notably the Apis of Egypt and Marduk of Mesopotamia).\n" +
                "\n" +
                "http://en.wikipedia.org/wiki/Pas...  \n" +
                "\n" +
                "Significance of Nandi:\n" +
                "Nandi signifies strength, load bearing capacity and virility. Given that Shiva didn't have to fight fierce battles or travel quickly between the worlds (he spent most time meditating) he didn't have to choose for a more agile vahana similar to Vishnu's. Given that bulls were the main form of transportation in rural India, it made perfect sense for Shiva - who is the most down to earth & connected with rural India - to take a form that was close to the people. \n" +
                "\n" +
                "  \n" +
                "Nandi has been given many anthropomorphic properties:\n" +
                "He is the protector of dharma (morality/religious way).\n" +
                "He is the head of 18 siddhas (scholars) of Hinduism.\n" +
                "As he is the assistant of the main god of Shiva - he can also grant many boons. In South India - there is a tradition of talking one's wish to Nandi's ears that is then believed to be granted.\n");
    }
}
