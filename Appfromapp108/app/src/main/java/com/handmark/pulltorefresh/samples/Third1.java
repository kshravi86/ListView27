package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 7/7/16.
 */
public class Third1 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("I have studied economics in B-school and have built a few economic tools in my startup. Here are the top 10 things you need to know in economics:\n" +
                "\n" +
                "    Economics has two main streams - Microeconomics and Macroeconomics. Micro deals with customer behavior, incentives, pricing, margins, etc. Macro deals with broad economies and larger things such as interest rates, Gross Domestic Product (GDP) and other  stuff you see in the business column of a newspaper. Micro is more useful for the managers and macro is more used by investors. Except for points 2 & 3, I will cover macroeconomics in other points.\n" +
                "    Law of Supply & Demand: This is the founding block of economics. Whenever supply of something increases its price decreases and whenever supply decreases price increases. Thus, when you have excess production of corn, food prices decrease and vice versa. Think of this intuitively. You will find its applications in 1000s of places. \n" +
                "    Marginal Utility: Whenever you have more of something its use for you diminishes. Thus, a $100 would be more valuable when you earn $1000/month than when you earn $1 million/month. This is widely used in setting up prices.\n" +
                "\n" +
                "\u200B\n" +
                "\u200B\n" +
                " \n" +
                "Gross Domestic Product (GDP): This is the fundamental measure of the size of an economy. This is conceptually equal to the sum of incomes of all people in the country or sum of the market value of all goods & services produced in that country. Right now US is the biggest economy in terms of GDP at around $14 trillion. That means, $14 trillion of value is produced in the US every year.\n" +
                "Growth rate: The growth of an economy is commonly measured in terms of GDP growth rate. Since GDP is a measure of national income, this growth rate is a rough proxy for how an average person's income grows every year.\n" +
                "Inflation: You already know that the price of most products now are higher than in your grandfather's time. Inflation (measured in percent) is measure of how much a bunch of products have increased in price from last year. In mature economies, annual inflation is around 2% - that means on an average the prices of stuff goes up by 2% every year. The fundamental role of central banks is to manage this rate and keep it to a low positive number. Here are  the 100 year inflation numbers in the US.\n" +
                "\u200B\n" +
                "\u200B\n" +
                "\n" +
                "Interest Rates: When you loan money to somebody, you expect something extra in return. This excess is called the interest. Interest rate is a positive number that measures how much excess you will get. There are bunch of rates here. In the short term, this rate is usually set by the Central Banks. Right now it is close to zero. In the long term, this is set by the market and is dependent on inflation and the long term prospects of the economy. The mechanisms in which the central banks control the short term rates is called monetary policy.\n" +
                "Interest Rates vs. Inflation vs. growth: There exists almost an inverse relationship between interest rates & growth and interest rates also can affect inflation directly. Thus, when you increase interest rates inflation tend to come down, along with growth. One is good and other is bad. Thus, the constant tension on setting the interest rates. In the US, Federal Reserve sets the short term rates making it one of the most watched economic news.\n" +
                "Fiscal Policy: Government can control the economy in a big way by adjusting its expenditure. The group of mechanisms using expenditure form the fiscal policy. When government spends more it can lead to more demand and that means more price increase. This means both high growth and high inflation. And it works in the reverse too. Thus, governments try to spend more during periods of low growth & low inflation and cut spending during periods of high growth & high inflation.\n" +
                "Business cycle: Economies have their periods of booms and bust in cycles of approximately 7 years long. At the start of the cycle it is a boom, then it gets to the top, then there is a contraction leading to a recession (period of negative growth and/or increasing unemployment) and finally followed up with an expansion.\n" +
                "\n" +
                "    \u200B\n" +
                "    \u200B\n" +
                "\n" +
                "\n" +
                "Bonus:\n" +
                "1. Opportunity Cost: When you do an activity, you tend to equate how good the activity is when compared to the alternatives. For instance, when you are working hard a Friday night on a project, you might be thinking \"man, I should be doing something else.\" The alternative (in this case, partying with friends) has a high value, and thus your present project better be attractive. This value of the alternative is termed as an \"opportunity cost\" - value of what you give up. Thus, if you quit a $120K/year paying job to do a startup, your opportunity cost of doing startup is $120K/year. Your payoff should be higher than what you give up. Hat tip: Charles Phan\n" +
                "\n" +
                "2. Comparative Advantage:  You are running your tech startup and one day a client asks you whether you can build a website for them. Should you offer to build the website for them, or should you pass up the opportunity to a friend? How do you decide? A rational person might calculate how much time they will take to build the website, and whether they can use that time to earn more building their current startup product. Then, he/she might calculate whether the friend might be able to build the site more efficiently.\n" +
                "\n" +
                "If the friend can build it more efficiently and you have a lot in your plate, you will pass up the opportunity. This is called the theory of comparative advantage. Your friend has an advantage here and it makes no sense for you to take up that business. Nations, businesses and people should do only those things they are better at and leave the rest to others. ");
    }

    }
