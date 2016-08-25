
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 8/7/16.
 */
public class Eighth1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Taking the same format as in the World War I  answer:\n" +
                "\n" +
                "1. The players: The war's key players were the Axis powers (Germany, Italy, Japan, Romania..) -- yellow region and Allies (UK, US, USSR, France, China, India, Australia, Canada...) -- green region below (as a side note: just as in WW-I, BRIC were on the same side).\n" +
                "\n" +
                "\n" +
                "\n" +
                "2. The dates: World War - II was officially fought between September 1, 1939  (Invasion of Poland) and ended on August 15, 1945 (with Japan's surrender).\n" +
                "\n" +
                "3. The humiliation (cause 1): The Treaty of Versailles at the end of WW-I humiliated Germany (ruined its finances) and also \"humiliated\" Japan (that fought on the side of allies but its territory conquests were not recognized) -- leading to the rise of ultra polarizing national figures (Sadao Araki - Japan and Adolf Hitler - Germany). \n" +
                "\n" +
                "4. The Great Depression (cause 2): The worst ever financial crisis of the early 1930s ravaged much of the world, leading to a desperate Germany (that voted in the Nazis), a belligerent Japan (that had to look for new sources to keep its economic growth going) and a very feeble US/Britain/France (rebuilding from the damage and avoiding the war until too late).\n" +
                "\n" +
                "\n" +
                "\n" +
                "5. The term: The terms World War -I (called the Great War until then) and World War - II were first used to describe these wars by the TIME Magazine issue on June 12, 1939 - EUROPE: War Machines\n" +
                "\n" +
                "6. The action theatres: The war was primarily fought in the Eastern Front (Germany-USSR), Western Front (France, Belgium, Netherlands) and the Pacific (Japan-British Empire/China/US).\n" +
                "\n" +
                "7. The Turning Points: The key turning points were: September 1, 1939 Invasion of Poland (provoking France & Britain to enter the war), the June 1941 German invasion of the USSR: Operation Barbarossa (breaking Germany's pact with the USSR & bringing the Soviets in), the December 7 attack on Pearl Harbor (bringing Americans to the war), Battle of Stalingrad (one of the bloodiest battles in history) and the Invasion of Normandy on 6th June 1944 (beginning the end game). BBC ON THIS DAY | 3 | 1939: Britain and France declare war on Germany\n" +
                "\n" +
                "\n" +
                "\n" +
                "8. The horror. WW-II saw the humanity sink to unprecedented depravity (Holocaust, Japanese war crimes, German war crimes, Allied war crimes, Atomic bombings) with the use of Chemical, Biological and Nuclear weapons on civilian population leading to the deaths of 75 million people.\n" +
                "\n" +
                "\n" +
                "\n" +
                "9. The legacy: United Nations would be formed to prevent such wars in the future, nuclear weapons would become the biggest headache to the world and the cold war (between the US and USSR) would be fought for 4 decades. \n" +
                "\n" +
                "10. The lesson. Never underestimate your opponents (Japan underestimated the US, Germany underestimated the USSR and earlier Britain/France underestimated Germany).");
    }
}
