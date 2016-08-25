
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 8/7/16.
 */
public class Eighth7 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("As others mentioned Switzerland was involved in wars until the 19th century. During both the World Wars, many European nations remained neutral - Switzerland, Sweden and Portugal among the most important. During WW-II, Turkey and Ireland, Greece, Netherlands were also neutral. \n" +
                "\n" +
                "Why was it allowed to be neutral?\n" +
                "Buffer state: Throughout history, Empires have kept buffer states between themselves and other empires. The buffer states provided the comfort for empires and put them a bit at ease & provided opportunities for diplomacy and negotation. Mongolia acted between Soviets and China, Tibet between India and China, Afghanistan, between Soviets and India, Uruguay & Paraguay between Brazil empire & Argentina, Thailand between British and French holdings in Southeast Asia. Switzerland did this role in central Europe. \n" +
                "\n" +
                "Not strategically or culturally important: Hitler attacked France out of vengeance (after WW-I) and given its long & tumultous history. Russia was attacked for its large resources & for uniting the Germans in the Eastern Europe. Attacking Switzerland had no such benefits. They were resource poor, not culturally significant for any country and not in the middle of any major route. That said, the German speaking parts of Switzerland were a temptation for the Nazis and the alpine railway/tunnels had some advantage (the Swiss made sure that the warring parties could access part of these resources as long as they don't take the war to their country). \n" +
                "Very smart military: Swiss were strongly armed - every able bodied man could fight, rigged their bridges with explosives, hidden artillery placed on every side. Switzerland National Defense. Along with its natural defense, it had a very strong human defense. It is like the Afghanistan of Europe, minus the strategic importance. Very hard for any outsider to control and they made sure everyone around them realize this advantage. It was practically out of question to take over them without impacting their economic strengths. During the war, Switzerland dared to shoot down German airplanes whenever they crossed Swiss airspace and resisted any attempt by Hitler to take over their airfields. \n" +
                "Made concessions to both sides: Switzerland and Sweden made a lot of economic and political concessions to both sides. For both the sides, these were too valuable to be destroyed. Page on lse.ac.uk \n" +
                "\n" +
                "Switzerland's exports of arms and ammunition to Germany. \n" +
                "Luck: Despite all the points above, Hitler still wanted to take over Swiss and planned the Operation Tannenbaum. However, for some unexplained reasons he never gave the final go and was probably too distracted with the war elsewhere (in Britain, USSR and North Africa). Switzerland just barely escaped by being the least attractive country to be invaded.\n");
    }
}
