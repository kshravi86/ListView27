package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Thirteenth5 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("The trade-in phones are usually sold at a loss to 3rd party vendors. The cost usually counts as a cost of customer-acquisition. \n" +
                "\n" +
                "High end Smartphones have fairly high margins. iPhone enjoys over a 50% gross margin (the total cost of making & distributing iPhone is less than half its sticker price). But, their key issue is in market penetration. Once you become an active Android user it is hard to switch to iOS and vice versa. The key for these platform makers is to get you hooked to their platform early in the game.\n" +
                "\n" +
                "This is no different than a promo/introductory offer that consumer brands offer to get hooked. Let's say, Apple gives you a Rs.10000 ($160) for the trade-in. The hope is that you will buy another iPhone for Rs. 40000 in 2 years (netting them Rs.20K in profits).  In the meanwhile, as you get used to Apple products you might also be open to buy a Mac, iPad, Keynote,  apps & music on the iTunes store, monitors, accessories... netting them more $$.  You might also suggest the phone to more of your friends providing indirect network effects. Apple can make up the Rs.10K loss in no time. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Thus, companies spend huge on acquiring customers, especially in a fast growing market. India is a key frontier market with the world's second highest mobile phone subscribers. However, smartphone penetration is exceedingly poor. This provides Apple and Samsung a huge opportunity to bring new users who are not already married to a platform. This is especially important when the developed markets have started saturating in the absence of a big Smartphone innovation in 5 years.\n" +
                "\n" +
                "\n" +
                "Apple makes more than $2.3 billion (Rs.15K crores) in profits every month. Don't go about worrying that they will make a loss on your trade-in ;-).\n" +
                "Here are the details of a similar program in the UK: Apple set to launch trade-in program for old iPhones in Apple stores around the country to entice adoption of new iPhone 5\n");
    }
}