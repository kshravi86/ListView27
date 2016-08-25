package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Sixteenth4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("The main difference between India and China is that their savior - Deng Xiaoping came to power in the 1970s and started the liberalization from 1976. Our savior, Narasimha Rao came late and we could start moving only from 1991. \n" +
                "\n" +
                "Look at the GDP of both nations for the first 27 years in the chart below. Both competed at the bottom of the pit. Nehru and Mao fought on who could ruin their nation the most. Fortunately for China, Mao's siblings and most of children died young or were lost. Unfortunately for India, Nehru's progeny survived and the madness continued. \n" +
                "\n" +
                "India vs. China in GDP 1950-2005\n" +
                "(notice China since1976 when Mao died. India had a similiar bump in 1964 when Nehru died. But, the euphoria was short lived, as Nehru's successor could not live long enough to keep Nehru's daughter out)\n" +
                "\n" +
                "This 15 year lag is the main difference between the nations. In most economic indicators India is just a decade behind China (at current rate, India's GDP in 2025 will be the same as China's GDP in 2010). In the past few years, investors and world leaders have already recognized India's growing power. \n" +
                "\n" +
                "GDP Growth rates\n" +
                "\n" +
                "\n" +
                "\n" +
                "Look at the growth rates of both nations for the past 60 years. Both had comparable rates until 1976 (with China swinging far more), but since then it was consistently ahead of India (except 1989 at the time of Tianenmen). Then we caught up with them in mid-1990s and since then the gap in growth has narrowed down.\n" +
                "\n" +
                "There are a few more advantages for China:\n" +
                "They are more than 3X the size of India and with far richer natural resources. Thus, they always had better abilities to feed their population and run manufacturing better than India.\n" +
                "China didn't have a very long foreign rule - their imperialism period lasted only  a few decades and not a complete colony either. We on the other hand were colonized for centuries. That meant that India's base was far weaker than China at the time of independence.\n" +
                "Due to Nehru's ignorance and poor leadership, India gave away the UN Security Council permanent seat to China and also didn't start the nuclear program soon enough. Thus, China got to nuclear status 12 years earlier than India. UNSC veto power + sizable population + economic growth + nuclear status = superpower.\n" +
                "India is a democracy. That means we traded away the short-term military gains for long term social gains. In fact, we have already started reaping the benefits of democracy by going fast in the services/creative market. The lag behind India and China in economic indicators is reducing. \n" +
                "\n" +
                "See modern India going up with better consistency since 1991. \n" +
                "\n" +
                "EDIT: Niranjan Sankaran asked about poverty. In the first 7 years of economic freedom, India pulled 60 million people out of poverty - most of this in rural India. If you take into account of the population growth at the bottom, the actual numbers could be close to 100 million. That is no mean achievement. \n" +
                "\n" +
                "http://www.ekh.lu.se/ekhcgu/teac...\n" +
                "\n" +
                "Btw.. should India be a superpower in the conventional sense? Why? Here is my answer on a related topic How could India become a superpower?");
    }






}
