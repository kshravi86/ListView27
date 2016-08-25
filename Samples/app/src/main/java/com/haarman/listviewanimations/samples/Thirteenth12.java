package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Thirteenth12 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Islamic State (IS) formerly the ISIL/ISIS is like the Ebola.\n" +
                "\n" +
                "This is the biggest Ebola outbreak ever. This is the biggest Islamic terrorist threat ever.\n" +
                "Like Ebola, IS epidemic is primarily contained to one region for now.\n" +
                "In theory, both of them are too brutal and kill immediately the host organisms for them to spread fast.\n" +
                "However, both of them might  be fast getting a critical mass. If Ebola spreads to a major city like it did in Lagos, effects can be catastrophic and the resulting quarantine will shut off the global economy. It is no solace that US & Europe have mechanisms to contain the spread, if the developing world goes down and the quarantine cuts off the rest. Let me throw an 1 in million scenario. Let us say the disease gets to a major city in Eastern China [China has plenty of workers in West Africa]. What will be the impact to global economy if you have to say ground all flights from China?\n" +
                "\n" +
                "In the same way, people seem to be taking IS too lightly:\n" +
                "What if IS can take all Iraq's major oil fields and rest of arms? That will give them huge ammunition and revenues.\n" +
                "What if IS can topple Saudi Arabia? I know it is a very small chance, but that is what they said in spring when asked about a terrorist organism that can spread over Iraq and Syria this fast. If Saudi is compromised, IS would get the best of the weapons and money.\n" +
                "What if IS can compromise Pakistan? The nation is a perpetual threat and already running a huge risk. If Pakistan is compromised, they can get nuclear weapons and missiles.\n" +
                "I disagree with Scott on the threat. Majority of Iraqis and Syrians are not terrorists either. But, that didn't stop IS from running over them. As they keep running over new territories, their armies are growing. Even if 2% of the global Muslims get attracted to IS, the epidemic can run over the world through a chain reaction. Their access to nuclear weapons - Pakistan is not that far.\n" +
                "\n" +
                "Even if there is a 0.1% chance of ISIS spreading into Pakistan or Saudi Arabia, the resulting catastrophe will be so big that we cannot take a risk. Finish off the IS before it attains critical mass.");

    }
}
