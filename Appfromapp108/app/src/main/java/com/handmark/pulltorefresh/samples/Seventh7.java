package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 8/7/16.
 */
public class Seventh7 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Continuing with my Walking the Bull series, this post is about Stock Market Indices.\n" +
                "\n" +
                "If you have been through the business section of a newspaper, you could notice things like \"Dow Jones Industrial Average, S&P 500, S&P BSE SENSEX, BOVESPA, Hang Seng, etc\". What do these mean?\n" +
                "\n" +
                "What is a Stock Index?\n" +
                "A stock index is a weighted average of a bunch of stocks. For instance, Standard & Poor's 500 (the most followed Stock Index in the world) is a group of top 500 stocks in the US (includes all your favorite names such as Apple, Walmart (company), Google, Microsoft, ExxonMobil (company), Coca-Cola, Nike (apparel)). What the stock index does is take the prices of all the individual stocks and averages* them to produce a single number. As of writing this, that number is around 1518. \n" +
                "\n" +
                "This dramatically simplifies the stock market and reduces it to a single number. If this number goes from 1518 to 1533 (1% rise) that means on an average, the top 500 stocks in the US have move up 1%. If the top 500 stocks move up, there is a good chance that the rest of the market has also move up. \n" +
                "\n" +
                "In short, a stock index is a great short-hand for observers to quickly understand what is going on in the markets. Instead of looking at individual trees, you can look at the forest. \n" +
                "\n" +
                "History of the Stock Index\n" +
                "Let us travel back in time to 1884. Charles Dow, a 32 year old journalist, wanted to level the playing field between Wall Street elite and the common man. At that time, the common had little access to Wall Street information. He started \"Customers Afternoon Newsletter\" (later became the iconic Wall Street Journal) to cover Wall Street at the level of a common investor. \n" +
                "\n" +
                "In 1884, he created a stock table with 11 stocks (9 railroad stocks and 2 industrial stocks) that provided a consolidate view of the market. Since 1896 it became to be called the Dow Jones Industrial Average (DJIA). It has continued to have massive influence even after 120 years. \n" +
                "\n" +
                "What are the uses of Stock Index?\n" +
                "One of the biggest advantage of stock index is in financial news reporting. Instead of going into the details, a news agency could just say that DJIA (top 30 stocks in the US markets) has gone up 1.5% and Sensex (top 30 in Indian markets) have gone down. \n" +
                "\n" +
                "For instance, one of our tools automatically collect a number of indices across the world and show it on a map. You can quickly see that Indian index have gone down, while China and Vietnam have gone up.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Compare your investments against a benchmark. Let us say your investment in gold has grown 4 times in 5 years. Is it better or worse compared to the rest of the market? An index can quickly help you make the comparison. \n" +
                "\n" +
                "You can see that comparison in this chart. You can right away see that gold has significantly outperformed the market.\n" +
                "\n" +
                "\n" +
                "What are the top indices in the world?\n" +
                "S&P 500: Top 500 US stocks.\n" +
                "Dow Jones Industrial Average: Top 30 US stocks.\n" +
                "TSX: Top Canadian Stocks.\n" +
                "Nikkei 225: Top Japanese Stocks.\n" +
                "FTSE 100 . (UK 100)\n" +
                "Deutscher Aktien IndeX (DAX) (German 30).\n" +
                "CAC 40 (French 40).\n" +
                "Hang Seng Index (Hong Kong 30)\n" +
                "Bombay S&P BSE SENSEX: (Indian 30)\n" +
                "BOVESPA (Brazilian 50).\n" +
                "Russell 2000 (Bottom 2000 stocks in US markets. Usually smaller companies).");
    }
}
