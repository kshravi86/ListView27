
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class First3 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("If Twitter were there, I'm also assuming that there was a method for global communication (including the Internet). EDIT: Added a few more events based on the comments below.\n" +
                "\n" +
                "2004: Giant Tsunami engulfs south and southeast asia. #TsunamiAttack.\n" +
                "\n" +
                "2001: Airplanes crash into Twin towers in NYC. Major terrorism attack on US soil #WTCAttack\n" +
                "\n" +
                "1994: Landmark results in elections. Mandela wins. #ApartheidEnds\n" +
                "\n" +
                "1979: Oil prices skyrocket. Long lines in gas stations everywhere. #InflationRuins\n" +
                "\n" +
                "1969: Apollo 11 on moon. Giant leap for mankind. #MoonLanding\n" +
                "\n" +
                "1949: Chairman Mao proclaims victory in Tianenmen Square. #ChinaIsFree\n" +
                "\n" +
                "1948: Gandhi is dead. Chaos in India as a young fanatic assassinates Gandhi. #GandhiIsDead\n" +
                "\n" +
                "1947: Indian attains freedom. Pakistan split from India. #IndianIndependence.\n" +
                "\n" +
                "1945: Truman drops Atom bomb on Japan. Surrender expected soon. #WorldWarTwo\n" +
                "\n" +
                "1945: Germans surrender. War in Europe over. Hitler commits suicide #WorldWarTwo\n" +
                "\n" +
                "1942: Horror in Pearl Harbor. Japs ambush US boats and planes. #PearlHarborAttack\n" +
                "\n" +
                "1917: Russian Tsar arrested. Reds take over Russia. #RevolutionInRussia\n" +
                "\n" +
                "1914: Archduke Ferdinand assassinated in Sarajevo by Bosnian militants. #europeanWar\n" +
                "\n" +
                "1532: Atahualpa surrenders to Pizarro. Sapa Inca has fallen. Battle of Cajamarca is lost. #IncasLost\n" +
                "\n" +
                "1521: Aztecs surrender to Cortes. Tenochtitlan falls. Cuauhtémoc taken as prisoner. #AztecsInRuin\n" +
                "\n" +
                "1493: Columbus returns back from India. New route to Indies discovered. #newTradeRoutes\n" +
                "\n" +
                "1453: Ottomons capture Constantinople. Byzantine empire ends. #FallOfConstantinople\n" +
                "\n" +
                "1258: Hulagu Khan destroys Baghdad. Caliph dies. Baghdad in ruin. #mongolAttack\n" +
                "\n" +
                "452: Attila the Hun sacks Rome. Thousands dead. #hunlnvasion\n" +
                "\n" +
                "30 BC: Cleopatra & Antony commit suicide. Octavius forces win in Actium. Romans win Egypt. #PtolemyDynastyEnds\n" +
                "\n" +
                "326BC: Alexander turns back from India. Hydaspes ruined his army. #EmpireIsOver\n");
    }
}
