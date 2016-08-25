

package com.balaji.aakash;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class First9 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("In Eurasia and north Africa, there were established connections among various regions and thus the rise of civilizations around the same time was not a pure coincidence. Given a few centuries time, ideas about wheel, agriculture, metallurgy and writing systems spread around the great river valleys of Asia. Especially after the establishment of trade networks to create bronze, it is not surprising that ideas moved around. \n" +
                "\n" +
                "Thus, it is not a big coincidence that the bronze age civilizations happened around the same time in Eurasia. What is interesting is that many of the same ideas happened in the Americas too. However, in case of Americas, there was a few thousand year gap in the domestication of plants and they didn't use the three 3 key technologies - wheel, metals and writing - in a practical way leading them to a huge disadvantage whenever these two cultures met.\n" +
                "Why were all these ideas happening in the last 12,000 years ago and not earlier? It is possibly due to the climate. A major geological epoch Holocene started only about 11,700 years ago that resulted in the significant warming of the earth allowing the use of agriculture and all the resulting goodies from it. In the \"ice age\" that preceded it, there was little you could do with farming.\n" +
                "\n" +
                "Extending this idea in a 1997 research paper, Page on ncsu.edu, the authors give a further proof that major climatic trends had big impact on humans and thus could be an answer for the coincidence.   This could bring back the older ideas of the impact of geography on history.\n" +
                "\n" +
                "The idea is that every 1500 years a major climatic change event occurs that drastically changes rainfall patterns & impacts human cultures.\n" +
                "Bond event 0: ~1500 CE. Little Ice Age. This caused a chain of events that probably enabled colonialism. There were huge famines and droughts weakening established empires and pushing around other peoples in search of new pastures. \n" +
                "\n" +
                "Bond event 1: ~400 CE. Migration Period. This again caused major changes in rainfall patterns especially in central asia. The movement of these nomads in all directions possibly ended the Han Empire, Roman empire, Sassanid empire and Gupta empire - the 4 largest empires of their time. Islam was possibly aided by the power vacuum left in the aftermath.\n" +
                "\n" +
                "Bond Event 2: ~1200 BCE. Late Bronze Age collapse. Again major changes in rainfall dried up rivers and led to a collapse of bronze age cultures across the world. Indus Valley civilization collapsed and so did the Minoan and Mycenaean cultures of Greece. Egyptian and Assyrian empires collapsed. It was a period of anarchy. \n" +
                "\n" +
                "Bond event 3: ~2200 BCE. 4.2 kiloyear event. This climatic shift collapsed the Old empire in Egypt and the Akkadian empire in Mesopotamia along with many neolithic cultures in China [Shijiahe culture] and Persia. \n" +
                "\n" +
                "Bond event 4: ~3900 BCE. 5.9 kiloyear event. The intense aridification of Sahara and the Middle East moved people close to the river valleys and this heralded the start of the major civilizations.\n" +
                "\n" +
                "In short, these might not be coincidences at all, but might be broader reflections of climatic change. Humans are strongly impacted by climatic change and this changed human history that we give credit for.\n");
    }






}
