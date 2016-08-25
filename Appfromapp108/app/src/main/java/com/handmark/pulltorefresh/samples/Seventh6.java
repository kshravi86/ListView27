package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 8/7/16.
 */
public class Seventh6 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("In the first edition of the series - Walking the Bull: First Ever Corporation and Stock Certificate: Part 1 - we saw the making of the world's first modern corporation. We saw that the Dutch East India Company (VOC) allowed common public to buy shares and transfer to other people. However, how do we enable people to easily buy and sell stocks.\n" +
                "\n" +
                "Here again we go to the Netherlands to a city called Bruges. It was in this city that a few traders started getting together for trading government loans. In 1309 began the story of exchange in an Inn called Beurze. Thus, even today stock exchanges are called as Bourses. For the first 300 years such exchanges were informal places to trade government loans and commodities. \n" +
                "\n" +
                "With the founding of Dutch East India Company and the rise of modern Europe, the bourses found a new purpose - to trade in company shares. \n" +
                "                                     \n" +
                "\n" +
                "\n" +
                "Why do we need an Exchange?\n" +
                "Let us assume John has decided to ask money from public to build his Joe Widgets Inc. How does he go about with this?\n" +
                "How would the public know that Joe is selling shares?\n" +
                "How do we know about Joes' company?\n" +
                "How do we know that Joe is not a fly-by-night operator who gets your money and escapes?\n" +
                "How do I decide what is the right price to pay per share of Joe's stock?\n" +
                "How do I pay for Joe's shares and make sure I get the shares?\n" +
                "How do I easily transfer my purchase of Joe's shares to someone else?\n" +
                "\n" +
                "\n" +
                "This is where Exchanges come from. They essentially started as message boards that let people know about a company's offer, offered payment mechanisms to buy and sell shares, had spam-filtering mechanisms to make sure only quality companies got in and set up processes to enable easy transfer of stocks. \n" +
                "\n" +
                "Bigger exchanges make sure that the companies they list in their board are reputable ones. For instance, to get your company listed in the New York Stock Exchange (NYSE) your company needs to be worth a minimum of $100 million, must have made $10 million plus net income for each of the previous 3 years. See the full list of requirements: Listing Standards - U.S. Standards.\n" +
                "\n" +
                "Such tough standards ensure that a company listed in the NYSE is far more reputable than an average Joe Corporation. The exchange also builds a lot of safety checks to make sure that the companies traded and the members trading are following proper regulations. This filters out a huge amount of spam and lets people trade only in relevant companies. \n" +
                "\n" +
                "Apart from this a stock exchange has the following 4 main activities:\n" +
                "Provide attention to the companies listed by providing a constant stream of data. Providing data is one of the main activities of a stock exchange. At any point of time, anybody can inquire the trading price of a particular stock.\n" +
                "Provide liquidity and minimum level of trading. Have you ever owned something you found hard to sell on Craigslist or other selling places? Have your ever found problem selling your furniture at market prices? If yes, you can appreciate this part. The exchange provides a trading floor with specified timings to create enough traffic to its listed companies. Thus, it is relatively easy to sell any stock at the prevailing market price at any time the exchange is open.\n" +
                "Provides a way to transparently to discover the prices. Most people find it hard to evaluate the price of a company stock. It is an art and not an exact science. However, there are a few who work diligently to determine the right prices and through the actions of these individuals  the market settles to an equilibrium in pricing. This is the foundation of capitalism: with enough eyes and wallets, you can discover the real price of anything.\n" +
                "Provides a quick way to transfer stocks from one person to an another. In a stock exchange, you can sell/buy your stock in milliseconds. This is an extremely well-oiled machine that enables trillions of dollars worth of transactions every month.\n" +
                "\n" +
                "A stock exchange is just another company that functions like Craiglist and Ebay, but instead of trading crappy household articles you can trade shares of companies.\n" +
                "\n" +
                "\n" +
                "What happens in an Exchange?\n" +
                "Let's say you want to buy 100 shares of Apple Inc. Here is how the process goes through.\n" +
                "You first login to your broker's application and place an order specifying the price you are willing to pay for Apple's stock. Your account must be already setup with your bank account etc.\n" +
                "The broker first tries to see if any other client of theirs wants to sell Apple stocks at that price. If yes, the broker matches the orders and transfers the shares electronically.\n" +
                "If not, the orders goes through the exchange. The exchange connects with all brokers & financial institutions where others are selling stocks simultaneously.\n" +
                "Bigger stocks like Apple will have assigned specialists to make sure the stock moves up/down in smooth manner. They have an inventory of stocks that they can use to wiggle out short term changes in demand. Thus, you will find 100 shares of Apple if you are willing the pay the market price, even if no one else is selling a stock of Apple.\n" +
                "\n" +
                "(I have simplified this process. In later sessions, we can deal with the details). \n" +
                "  \n" +
                "\n" +
                "\n" +
                "\n" +
                "Major Exchanges in the World\n" +
                "Almost all capitalistic countries have their own stock exchanges. US has 3 main stock exchanges:\n" +
                "New York Stock Exchange (NYSE) - the most prestigious\n" +
                "NASDAQ - trades a lot of technology companies \n" +
                "American Stock Exchange (AMEX) - trades a lot of smaller companies and Exchange Traded Funds\n" +
                "\n" +
                "Besides these the other important stock exchanges are:\n" +
                "London Stock Exchange\n" +
                "Tokyo Stock Exchange\n" +
                "Singapore Stock Exchange\n" +
                "Bombay Stock Exchange\n" +
                "Frankfurt Stock Exchange\n" +
                "Paris Bourse\n" +
                "Australian Securities Exchange\n" +
                "\n" +
                "\n" +
                "In the next part, we will see the major actors in a stock market.");
    }
}
