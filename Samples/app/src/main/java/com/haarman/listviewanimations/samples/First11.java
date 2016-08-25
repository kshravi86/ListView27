package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class First11 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("ODE ON A GRECIAN URN\n" +
                "3 Global Climate Change Events that Changed Indian History\n" +
                "BALAJI VISWANATHAN\n" +
                "There were 3 climate change events in the past 5000 years that drastically changed Indian history. Each time it hit our clock got reset by a few centuries.\n" +
                "\n" +
                "1. 200-year drought around 2000 BC\n" +
                "The Indus Valley Civilization had everything going for it. It was spread over a massive territory and the largest of the Bronze Age Civilizations. It built an organizational system that had no necessary for monarchs and autocrats. It had no major armies, but was at peace. \n" +
                "\n" +
                "It had very advanced sewage disposal systems and city planning. It was trading far out with other civilizations. It had built huge granaries to save it from monsoon's moods. However, it could not save it from a 200-year drought.\n" +
                "Two-hundred-year drought doomed Indus Valley Civilization\n" +
                "How Climate Change Ended the Indus Valley Civilization. \n" +
                "Late Bronze Age collapse\n" +
                "\n" +
                "That drought demolished the civilization and in fact no modern civilization can withstand a 200-year drought. That collapse set Indian history back by centuries and it took over 2000 years for India to get back to its heights. \n" +
                "\n" +
                "2. Massive Famines in Central Asia (from 400-500 AD)\n" +
                "2400 years after the Indus Valley was destroyed, another civilization would take India to its heights. The Gupta empire, the contemporaries of Roman Empire, was a golden age for India. Indian mathematics and sciences reached their heights. The society was peaceful, focused on economy and science. \n" +
                "\n" +
                "This time there was no massive drought in India. However, massive changes in climate in central Asia caused major famines and started pushing the nomads in all directions. Some sacked Rome. Some attacked China. Some weakened the Sassanids of Iran and the rest destroyed the Gupta empire. It would take centuries for Indian science to get anywhere closer to what was achieved then.\n" +
                "\n" +
                "Goes to show how you can be strong impacted even if the climate change affects a far-away region.\n" +
                "Winter is Coming: Effect of Climatic Changes on Human History \n" +
                "Migration Period\n" +
                "Nasa-funded study: industrial civilisation headed for 'irreversible collapse'?\n" +
                "\n" +
                "3.Little Ice Age (~1700 AD)\n" +
                "1200 years after the fall of the Gupta empire, India found its form again. Invasions stopped and India became the world's biggest economy. Things seemed to look quite well, until a climate change event happened.\n" +
                "\n" +
                "From about 17th century, the little ice age in the northern hemisphere started changing the rainfall patterns. Substantial droughts started coming and in the early 18th century, the Mughal empire was substantially weakened. This was a huge opening for the British East India Company to take over India [also helped by a wide variety of other reasons]. For another 150 years, India suffered debilitating famines arising both out of maladministration and the effects of the climate change. \n" +
                "MUGHAL DECLINE, CLIMATE CHANGE, AND BRITAIN’S INDUSTRIAL ASCENT\n" +
                "LITTLE ICE AGE SEVERITY IN SOUTH-ASIA 1600-1700 AD, BEAK UP OF MUGHAL EMPIRE\n" +
                "Climatic Change and Colonialism\n" +
                "Again we are pushed back a few centuries and again we have started rebuilding.\n" +
                "\n" +
                "Conclusion\n" +
                "Pay a close attention to climate change. India's history offers sobering lessons on what climate change could do to wreck a civilization and push back human advancements by centuries. Sometimes your own country is not directly affected by the climate change, but the ripple effects of events elsewhere can substantially impact you. \n" +
                "\n" +
                "One of the important reasons for studying history is to avoid doing the same mistakes. Can we act now? ");
    }

}
