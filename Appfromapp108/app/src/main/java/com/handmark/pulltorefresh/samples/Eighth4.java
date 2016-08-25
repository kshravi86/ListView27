package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 8/7/16.
 */
public class Eighth4 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Mongols captured Russia. So, it is not like everyone who dreamt of conquering Russia failed. But, there is a catch. Also, cold weather is not the only defense for Russia. I will cover both. \n" +
                "\n" +
                "Unlike the time of the Mongols, both Napoleon and Hitler faced a much bigger and a much stronger Russia. Here is the map of Russia at the time of the Mongol invasion. It was not just small, it was highly divided and internally weakened. \n" +
                "\n" +
                "\n" +
                "Napoleon and Hitler faced a Russia that looked like this. A dozen times bigger than the one Mongols invaded (the light purple region is the original Russia before 1500).\n" +
                "\n" +
                "\n" +
                "\n" +
                "More importantly, Mongols took 17 years (1223-1240) to make the invasion. This gave them enough time to consolidate and build. Both Napoleon and Hitler were far more impatient. Napoleon tried his Russian invasion over a single year (1812) - French invasion of Russia and Hitler tried it over 2 years in 2 campaigns (1941 and 1942). Operation Barbarossa\n" +
                "\n" +
                "No human has ever succeeded in invading that big a territory anywhere in the world in so short a period. \n" +
                "\n" +
                "Why is conquering Russia hard:\n" +
                "Russia is maaasive. Russia in 1812 and 1942 was more than 30 times the size of either France or Germany. Napoleon and Hitler were like tiny little ants trying to swallow an elephant.\n" +
                "Fighting multiple fronts while invading Russia is suicidal. Mongols were single-minded in invading Russia. Both Napoleon and Hitler were facing multiple fronts while invading Russia. Napoleon was still fighting rebels in Spain. Hitler was fighting in North Africa and the English Channel. You don't mess with Russia when you are fighting war elsewhere.\n" +
                "Russia was infamous for their scorched earth defense. They would destroy all the food sources on the way of invading armies. This kind of brutal self-destruction was not familiar for the invading Western European armies. Napoleon's horses were starved and eaten by his starving troops. As the horses were lost, the troops left behind the cannons and other weaponry.\n" +
                "Undeveloped for the most part. Unlike Western Europe, Russia at that time had fewer roads and the towns were spaced pretty far apart. This put a lot of strain on the invading armies who found it hard both to travel and to get the resources.\n" +
                "Nothingness. Assuming you reach Moscow, what next? You would assume that your problems are over. But, they are not. Moscow was surrounded by hundreds of kilometers of nothingness. When Napoleon captured Moscow he found that his troops exhausted all of its resources in weeks. The nearest major city was 700 kilometers away. \n" +
                "Russian weather is brutal. Russia is not just frigid in winter, it can also be terribly hot in summer (especially the central Asian portion). The temperature range of Russia is -71°C in December to 45°C in July. A big chunk of Napoleon's army died of thirst. The marshes of Ukraine (Pinsk Marshes) can be deadly with Malaria - that affected both Hitler's and Napoleon's troops. The Mongols were used to harsh climates. Western Europeans were not");
    }
}
