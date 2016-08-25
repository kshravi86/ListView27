package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Sixteenth11 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("There were a few major events that changed the currency rates. \n" +
                "\n" +
                "June 4, 1966. First major devaluation. For the first two decades, India had almost a constant peg against the dollar at Rs.4.75/$. Then things changed in 1966. India had just fought 2 major wars (with China and Pakistan) and have had 3 prime ministers in 3 years (Nehru, Shastri, Indira) after 17 years of one man rule. Then a major drought shook the country. Perfect storm. 1966 Budget With nowhere to go and no more dollars, the Indian government announced a 57% depreciation of the rupee overnight from Rs.4.75/$ to Rs.7.5/$. http://www.nber.org/chapters/c45.... and How do countries devalue currency?\n" +
                "1980s inflation. From 1966 to 1980, rupee stayed constant.  However, the 1979 energy crisis and gold's skyrocketing prices in early 1980s left India with no place to go (oil and gold were historically our primary imports). Indian rupee started to slowly decline. From about 7.85/$ in 1980 we reached about 17/$ by 1991. \n" +
                "\n" +
                "\n" +
                "1991 crisis. In July 1991, we hit another major crisis. Biggest event in modern Indian economic history.  What exactly happened to the Indian Economy in 1991 in layman's terms? Overnight rupee was devalued by another 50% from about 17/$ to about 25/$. \n" +
                "1993 liberalization. In 1993, Indian finance minister Manmohan Singh let rupee to float a little freely. Translation: the rupee was allowed to be traded by traders without a forced peg such as the one kept by China. Rupee value started to slide as the government was no longer controlling the prices, fully and started to reflect the reality. From about 27/$ it slid to Rs.35/$ by 1997.\n" +
                "1997 Asian financial crisis. One of the biggest events in East Asia as economies such as Thailand and Indonesia collapsed. Panic was all over the place. From about Rs. 35/$, rupee went down to Rs.39/$ as investors were quitting Asia enmasse. \n" +
                "Pokhran-II 1998. Indian Prime Minster announced the nuclear testing. US, Japan and other countries immediately imposed sanctions on India, limiting investments. In just a couple of months, rupee sunk to Rs.43/$. Then rupee started moving sideways and the lowest point was reached in 2002 at Rs.48/$(when BSE was its lowest and real estate was listless). \n" +
                "Good times (2000-07). Rupee started recovering its losses and started moving up and reached about 39/$ by 2007. Then the shit hit the fan.\n" +
                "Financial crisis of 2007–08. The financial crisis caused investors to quit all emerging markets, including India and pushed the rupee from 39/$ to Rs.51/$ by March 2009. In the next 2 years, rupee recovered most of the loss due to economic optimism and rebound in US markets. \n" +
                "European sovereign-debt crisis. By the fall of 2011, world noticed another financial crisis. This time in Greece, Spain and other places. Just like other times, investors started pulling out. Another reason was that Indian government's budget positions was getting worse (due to profligate overspending). Indian rupee sunk from Rs. 44/$ in August 2011 to about 56/$ by June 2012. \n" +
                "\n" +
                "That's pretty much it. In short there were crisis in India, West Asia, East Asia, USA and Europe and each time rupee lost part of its flesh. \n" +
                "\n" +
                "Also see:\n" +
                "Devaluation of the Rupee: Tale of Two Years, 1966 and 1991\n" +
                "History of the rupee");

    }
}
