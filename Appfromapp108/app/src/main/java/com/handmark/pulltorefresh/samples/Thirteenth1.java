package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Thirteenth1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Pricing is a complex topic. At business school, we have whole classes dedicated for this. Here is a synopsis.\n" +
                "\n" +
                "Cost based pricing: This is the traditional method. You determine all the costs and create a profit markup on top of it. If the pizza raw materials and labor cost $8 and you want to set a profit markup of 25%, you will set the price at $10.\n" +
                "Competitive pricing: It is quite likely that you are not the first in the market. So, you look at the prices set by other Pizza shops. If there are no pizza shops, then look at the price set by other shops selling food. If people expect to pay $10 for their lunch, maybe $10 could be an intelligent guess. If you are first to the market, you generally have much more freedom. \n" +
                "Value based pricing: You look at the value added to your customer. If you setup your shop in a cinema and target the moviegoers you are expecting people to pay for the additional convenience. You can look at the total amount of time and money you are saving for your customer. This is especially important in a Business to Business setting. IF I'm selling something to another business, I will compile all the time and money they would save by buying my product and will price maybe 70% of it. If I save each employee of your organization $2000/year, I might charge you $1500 for my solution.\n" +
                "Market research: You ask your customers what price they might be willing to pay. A bunch of interviews and surveys, might help you arrive at a range. You need a good questioner to pull the price preferences from a customer.\n" +
                "Experimentation: I will change the prices multiple times (in the name of offers, promotions, etc) and I will take a note of the demand at each price level. If I could make more profits by selling at $9 instead of $10, I would sell at $9. Amazon is a big follower of this method. \n" +
                "\n" +
                "In the curve above, the y-axis is price and x-axis the total amount you could sell. as you reduce price, your volume increases. Revenue = Price * Volume and the curve resemble a parabola. Once you plot this curve with enough points, you can find the theoretical maximum revenue.\n");
    }
}