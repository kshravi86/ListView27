package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Thirteenth11 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Ancient History\n" +
                "Iraq was the birthplace of a number of great civilizations of the past. The region of Mesopotamia (modern Iraq) produced Sumerian, Akkadian, Babylonyn, Assyrian and Sassanin empires. \n" +
                "\n" +
                "\n" +
                "Then they all fell under Khālid ibn al-Walīd - a commander for Prophet Muhammed. For about 500 years since the birth of Islam, Iraq along with the rest of Middle east was ruled by the Abbhasid Caliphate.\n" +
                "\n" +
                "\n" +
                "Medieval History\n" +
                "Then the Mongols came and ravaged Baghdad. Hulagu Khan, the black plague and Timerlane all invaded Iraq and decimated the region until the Turks came. \n" +
                "From about 1530 to 1920, the present region of Iraq along with a sizable chunk of West Asia was ruled by the Ottomons of Turkey, except for a century under the Mamluks (freed slaves of the Ottomons). \n" +
                "\n" +
                "\n" +
                "Modern History\n" +
                "The Ottomons were under attack from all sides (Russia, Britain, France) and were slowly leaking territories. In World War I they sided Germany and lost the war. After the war, Britain took over most of their Asian territories. \n" +
                "\n" +
                "Britain then drew borders of Mesopotamia and in the process grouped a number of dissimiliar tribes - Assyrians, Kurds, Shiites along with the Sunnis in a single state under Faisal I - a member of an ancient Hashemite tribe. \n" +
                "\n" +
                "The new nation of Iraq that was just a patchwork over the existing tribes was quite unstable. In 1958 the king was overthrown in a coup by Abd al-Karim Qasim. 3 years later, Kuwait split from Iraq to form a separate country. \n" +
                "\n" +
                "Qasim was assisinated in 1968 in another coup and taken over by Ahmed Hassan al-Bakr - the leader of the Baath party. 11 years later, Bakr's protege Saddam Hussain took over Iraq.\n" +
                "\n" +
                "In the meanwhile, the Shiites and Kurds who wanted nothing to do with the Sunni leaders of Iraq constantly revolted. The Kurds were especially brutally treated by almost all the Iraqi leaders. Shiites had the support of the neighboring Iran & with whom Iraq was involved in a decade long war. \n" +
                "\n" +
                "Summary: Iraq is an old civilization that was ruled by the Ottomons of Turkey in the medieval ages. After the World War - I, Ottomon territories were taken over by Britain and were randomly organized into indepndent nations. 3 different tribes were merged to form the modern Iraq & the repurcussions are still seen. \n" +
                " Churchill's Folly: How Winston Churchill Created Modern Iraq: Christopher Catherwood.");

    }
}
