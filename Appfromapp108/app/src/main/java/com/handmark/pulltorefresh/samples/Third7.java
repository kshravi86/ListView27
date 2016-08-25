package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 7/7/16.
 */
public class Third7 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("TL;DR: \"In the short term, the market is a voting machine. But, in the long term, the market is a weighing machine\".  -- Ben Graham[1]\n" +
                "Part 1: How the stock market works\n" +
                "Part 2: How does one evaluate Stocks\n" +
                "\n" +
                "\n" +
                "Part 1: Basics of a Stock Market\n" +
                "History: A long  time ago, humans ran businesses with just their money. The businesses  they ran were small and they grew the businesses only with their own  profits. However, not all businesses can be built with your own money.  What if you wanted to build a new factory that costs more than a million dollars? Banks won't lend money for young companies and your friends won't have that much.\n" +
                "\n" +
                "In the 15th-16th century as the Europeans started exploring Asia and Americas, the big explorers felt they needed a lot of money and their kings were not providing them anymore. The wealthy guys demanded a lot of interest. Thus, they felt they need to raise money from a bunch of common people. Thus, in 1602, the Dutch East Indian company became the first company to issue shares of its company in the Amsterdam Stock Exchange and get traded on a continuous basis.\n" +
                "\n" +
                "What is a Stock? Stocks  in a company provide you a share of the company's future profits in  return for the capital invested. For instance, if you buy 1 stock of  Apple now, you will be assured one-billionth of  Apple's profits in the  future (as there are almost a billion such stocks that Apple has issued  now).\n" +
                "\n" +
                "Listing: In  a stock market, 1000s of companies are listed and these companies  (called public companies - as they have given out their shares to common  public) pay a fee to the exchanges, along with a promise to provide all  important info to the markets. In return they get an opportunity to put  their company in the stock market's board & have the ability to get  money from people visiting the market. The first time a company's stock  appears on the stock market's board is called an IPO (Initial Public Offer).\n" +
                "\n" +
                "Brokers: Conceptually,  a stock exchange is similar to eBay. These guys allow companies to  be listed and connect the buyers & sellers. Since millions of people  trade in the market and it is practically impossible for these  exchanges to deal with all the individuals, they have assigned brokers who act between the exchanges and the individuals.\n" +
                "\n" +
                "\n" +
                "Part 2: How does one value a stock\n" +
                "Basic Terminology:\n" +
                "We will use a term EPS (Earnings per share) that is exactly as it sounds. It is the profits of the company divided by number of shares. For instance, Apple has $41 billion in profits and about 950 million shares, giving an EPS of about 41000/950 = $44/share. Thus, if you own a share of Apple, you are entitled to 44 bucks of Apple's profits this year.\n" +
                "\n" +
                "Calculating Share price:\n" +
                "To evaluate how much you need to pay for that 1 Apple stock you need to do a simple addition of all the earnings you will get\n" +
                "\n" +
                "         Stock Price = EPS in Year 1 + EPS in Year 2 +...\n" +
                "\n" +
                "Now, you know that a dollar earned 10 years from now is not the same as a dollar earned now. Because, there is an interest rate i involved and money you get in 10 years is less worthy than the money you have now. Thus, you need to adjust that formulae.\n" +
                "\n" +
                "        Stock Price = ((EPS in Year 1)/(1+i))+ (EPS in Year 2/(1+i)^2) +...\n" +
                "\n" +
                "Now, there is a whole bunch of math involved (starting from the compound interest formula) and for the sake of simplicity, I will get you to the final results and reduce the stock price to two cases:\n" +
                "\n" +
                "1. In case of a mature company that doesn't grow:\n" +
                "          Stock price = EPS/Interest rate\n" +
                "\n" +
                "The expected Interest rate is relatively easy to calculate and depends on how risky the company is, how risky the market is and the current long term interest rate of government bonds. For many mature utility companies this interest rate comes to about 10%. Thus, utility companies that doesn't grow much is generally traded at about 10-15 times the EPS. (insert in the formula above).\n" +
                "\n" +
                "The stock prices of these companies are very smooth and change only when there is a change in long term interest rates, the risk profile of the company (can change when hurricanes such as Sandy hits) or when market risk changes (for instance 2008 financial crisis). But on a regular day, not much action here. Let us move to the second category of shares:\n" +
                "\n" +
                "2. For a growing company:\n" +
                "           Stock price = EPS of next year / (interest rate - expected growth rate of the company)\n" +
                "\n" +
                "Let us use a simple example. If you assume Apple's next year EPS will be $48, the expected interest rate for such a risky company at 15% and an expected annual growth rate at 5%, you will get:\n" +
                "\n" +
                "$48/(15%-5%) or $48/10% or $480 as the ideal stock price for the company. Where did I get this magical 5% number?\n" +
                "\n" +
                "Getting the growth inputs:\n" +
                "Now, we need to find the growth rate of the company and figure out what the company will earn in the next year, the following year and so on. This is not an exact science and no one has a perfect answer to this question. This is why we need stock markets. Collectively, we all pool our intelligence to figure out the future growth of the company and thereby its current price.\n" +
                "\n" +
                "To do this collective prediction, we constantly get new inputs and project that to future. For instance, if the company management gets hotshot new engineers, then we predict the future will be bright. What are the other news that investors typically use:\n" +
                "\n" +
                "    Periodic financial results of the company that gives us a view into the company;s workings and its financial position\n" +
                "    Periodic results of similar companies that helps us guess this company;s results. Thus, when Apple sneezes everyone else catches a cold.\n" +
                "    Changes in the sector. If a new report comes that people are more inclined to using mobile phones, we predict growth of these companies will be high.\n" +
                "    Changes in the broader market.\n" +
                "    Changes in the international economy\n" +
                "\n" +
                "\n" +
                "Market Estimation:\n" +
                "In short, we try to use every possible information to guess the future growth of the company, plug that into our formula and find out the stock price. For instance, if Apple comes out a report saying people are buying less of iPads, we might ding Samsung too as we believe their Galaxy Tabs will sell less too.\n" +
                "\n" +
                "Estimating growth rate is an art rather than a science, and is collectively done by millions of humans in a place called the stock market. Since, we need to constantly adjust the growth rate based on new information, stock prices constantly fluctuate.\n" +
                "\n" +
                "Main advantages of a stock market:\n" +
                "1.  Starting/building a business: The market lets companies get money from a large number of people. That means there are more options to get money to build a business.\n" +
                "\n" +
                "2.  Spreading risk: It lets you spread the risk of a business into a large  number of people. Since, each person is investing only a small portion  of their income in the stock of a particular company, the risk of a single company collapsing doesn't significantly affect investors.\n" +
                "\n" +
                "3. Collective estimation of value.\n" +
                " \n" +
                "Summary: Modern corporations require a lot of capital, which is beyond the reaches of a few individuals. Markets help companies raise money from a large number of  people and together these investors value their company. The theory is  that when a large number of people do their independent valuation, the  company's price comes more closer to its ideal worth.\n" +
                "\n" +
                " \"In the short term, the market is a voting machine. But, in the long term, the market is a weighing machine\".  -- Buffett");
    }

}
