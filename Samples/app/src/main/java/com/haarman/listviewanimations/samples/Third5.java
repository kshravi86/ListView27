package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class Third5 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Venture Capital (VC) firms provide funding to growing startups in return for a stake in the company. For instance, earlier this year a few VCs led by Kleiner Perkins invested in Quora about $50 million in return for 12.5% stake in the company. Quora Raises $50M At $400M From Peter Thiel, D’Angelo Puts In $20M Of His Own Money | TechCrunch\n" +
                "The probability of an early stage firm getting VC is sometimes equated to getting a lottery. For instance, of the 2 million firms created every year in the US less than 1000 new  companies get VC funding of some form. Most of these firms are in technology. Venture capital   \n" +
                "Almost every tech company you instantly recognize (Apple, Amazon, Google, Facebook, Paypal, eBay) were funded by VCs at some point. The biggest names in VC world are Sequoia Capital and Kleiner Perkins.\n" +
                "One of the first companies to get Venture funding was Fairchild Semiconductor. Fairchild Semiconductor's creation heralded the modern industry of Venture Capital and has built the Silicon Valley that we know of.\n" +
                "There are 462 VC firms in the US and they together invested about 179 billion dollars. http://www.nvca.org/index.php?It...\n" +
                "Unlike Angels, VCs usually invest OPM  (Other People's Money). VCs are typically organized as limited  partnerships with two type of partners - limited and general. The limited partners fund the partnership (these guys are usually rich  individuals, pension funds and university endowments) and the general  partners use the money to fund 20-30 startups over a 5-7 year period.\n" +
                "Venture capital is a high-risk, high-reward game. Each fund invests on an average of $150 million in about 20 companies. A fund will be lucky if 3-4 of these investments turn into blockbusters. Almost half the funded companies will not return a profit for the investors. Bigger VC firms run multiple such funds.\n" +
                "There are various stage of VC funding. Seed funding is the earliest stage of funding and is usually made to serial entrepreneurs at the idea stage itself. Then there is Series A (where the company has started getting traction - growing number of customers), Series B ( where a company has started making sizable revenues), Series C (the company is mature and is close to an exit). In the earliest stages, VCs take about 20-25% equity for less than $5 million in investment. (Note that all these numbers are approximates and is just to give an idea).\n" +
                "In VC parlance, an exit is defined a positive outcome that returns the money for the investor.There are two main types of exits - the company going into stock market IPO (like Facebook did recently) or the company getting bought out by another company. Of the 1000 odd companies invested each year, only a few have $100m+ exits. Given that a founder usually holds less 20% of the shares at the time of a big exit, you must consider holding off on your yacht purchase for a little longer.\n" +
                "Statistically, all male startups in silicon valley are the most common types of venture funded startups :(.But, one consolation is that founding teams with both males & females tend to bag two times as much funding per deal than those with either male alone or female alone.\n" +
                "Although MBAs are sometimes reviled in the valley, statistically having MBA founders in your team can improve your overall funding chances. Except in MA (where core engineers seems to be valued more), MBA matters in other places. Report Examines Relationship Between Gender, Education, and VC Funding");
    }

}
