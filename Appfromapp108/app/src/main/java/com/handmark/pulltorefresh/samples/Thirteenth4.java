package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Thirteenth4 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("This is the 5th post in the New Series on Pricing. I will cover on the topic of IPO pricing in anticipation of a possible Twitter IPO. If you have not already done so, kindly read this previous post: Introduction to Finance & Stock Markets to help you follow this post better. \n" +
                "\n" +
                "IPO is the first time a stock is entering the public markets. Thus, companies do their best to make this event generate as much PR buzz as possible. To this, companies do the following:\n" +
                "Engage top-notch investment banks. A big source of income for banks like Goldman is the fees the company pay during the IPO. Google hired Goldman and Morgan Stanley. Facebook hired JP Morgan, Morgan Stanley and Goldman. These investment banks use their long arms to generate buzz in the investment community.\n" +
                "Time it right. Just like Hollywood blockbusters, companies & their banks spend a lot of time in identifying the right window of opportunity to introduce the stock. Thus, no major American company IPO'ed in the period between July and December 2008 (couple of hapless Chinese & Canadian companies did in US markets with disastrous results).  \n" +
                "Underprice the IPO. Most companies leave some money on the table. If they think that a share's value is $40, they will try to price the IPO at $30. This way, the share has a good run on the first day and initial investors are happy & journalists report in an excited way. Facebook probably got a little too greedy and paid the price with all the bad press. \n" +
                "Long roadshows. Companies spend months on roadshows meeting investors all over the world. Here is a presentation as a part of FAcebook's roadshow:\n" +
                "\n" +
                "\n" +
                "\n" +
                "IPO Pricing\n" +
                "Investment banks price the IPO in the following ways:\n" +
                "Book building - The investment bank keeps a confidential \"book\" where it records the preferred price offered by many of its clients. For instance, a major investor could tell Goldman that he is willing to pay $30 for a Facebook share and Goldman would just make a note of it. With a few thousand of such talks, it would have a really big book that will help it set the right price range.\n" +
                "Fixed prices - In business schools, we have a number of courses on pricing a stock. These include \"Discounted Cash Flows\" and \"Ratio valuation\". I have covered these topics in Zingfin blog already. These methods are used by the hotshot MBAs in the investment banks to put a decent price range for the stock (since they know the company inside-out).\n" +
                "Dutch auction - This is a new method used most popularly by Google. Here, the company sets up a really high price and investors keep downbidding from there. For instance, I could say the price is $260. You might offer $250 for 1000 shares. Another would offer $200 for 5000 shares and so on. Then there comes a point when all shares are sold (say at $150). That lowest point at which all shares are sold becomes the IPO price. Any investor who has bid above it then gets the share at the IPO price. This incentivizes people to bid as high as possible.\n" +
                "\n" +
                "As a side note, IPOs are fascinating times. When I was in primary school, Indian markets were going high and my father used to subscribe to all IPOs. Given that most IPOs are deliberately priced low, everyone would subscribe for the IPO. Those times, it used to get decided by lottery. We had happy parties when my father got shares allocated for a few banks that IPO'ed during the 1990s. Most often we just flipped (my only job was to keep tracking the numbers in Economic Times paper -- as there was no online trading back then) as soon as it IPO'ed.   \n" +
                "\n" +
                "This is the kind of excitement that companies and their investment banks want to build around an IPO. This helps the company get a lot of free press and keeps the market accessible to the investors.");
    }
}