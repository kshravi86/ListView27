package com.balaji.aakash;


import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Sixth4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("1. Matrix Problem, leading to high cost of transaction. Here is how a barter system of just four items will look like:\n" +
                "\n" +
                "\n" +
                "The barter system essentially needs a matrix where you have to maintain exchange rate for each pair of products. Now, think what will happen if we extend this to one thousand products (even a small mom-pop shop stock that many). The matrix would have one million items. Think of what would happen if you have to have a matrix for Walmart (100K+ items) - it would have ten billion exchange rates.\n" +
                "Although in theory, the matrix can be partially reduced with computing power, humans doing the exchange will be left quite confused and disoriented.\n" +
                "\n" +
                "\n" +
                "2. Multiple grades. Most commodities have multiple grades (tomatoes can be rotten, ripe, or green, and can be sourced from multiple origins, can be organic etc). Signing each commodity with the particular grade is very expensive.\n" +
                "\n" +
                "\n" +
                "3. Verification of authenticity. Currency issuing authorities have made it relatively easy to detect counterfeit currency. But, imagine you are exchanging milk for tomatoes. How do you know that the tomatoes all belong to quality x and the counterparty knows that the milk is not adulterated? Each person in the system should have tools to verify the quality of each product in the economy. Impossible.\n" +
                "\n" +
                "\n" +
                "4. Things get spoiled, and hence savings become impossible. A lot of times, you don’t want to exchange a product for another product. You just want a promise to exchange for the product at a future time. [For instance, I work today in the hope to get my bread in the next month or year.] The advantage with currency/gold is that they stay intact for years. However, the milk you got in return for wheat might not stay intact for a month, and thus you cannot store value in it.\n" +
                "\n" +
                "\n" +
                "5. Banks will die. Since savings are impossible and it is not practical to store anything other than currency, modern banks would perish.\n" +
                "\n" +
                "6. Transfer of money will get really hard. You go to a cash counter at the cinemas, and the cashier asks you for thirty bushels of corn for two tickets. How do you carry all that corn? This will kill a lot of economic transactions.\n" +
                "\n" +
                "\n" +
                "7. Taxation and Data Collection will be real problem. In a barter system, economic data collection and tax collection become hard.\n" +
                "\n" +
                "8. Indivisibility problem. Suppose you sold all your wheat for a pair of shoes. What if tomorrow, you want to use part of your wealth to buy milk? Can you split the pair of shoes to get milk?\n" +
                "\n" +
                "That is what a barter system would like. It is deadly. It was useful for the nomads with a few items, but unworkable for a modern economy. Barter system in the modern context indicates a total breakdown of economy and/or distrust in government.\n" +
                "\n" +
                "More questions on Money:\n" +
                "\n" +
                "Can money buy happiness?\n" +
                "What is the future of money?\n" +
                "What is the most valuable currency note in the world?\n" +
                "Follow Quora on Twitter: www.twitter.com/Quora\n" +
                "More: Money Currency");
    }

}
