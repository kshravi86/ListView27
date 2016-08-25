package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Sixth12 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Why do computer cost more than pins? After all both of them use standard components and are sold in large numbers.\n" +
                "\n" +
                "The price of any product is a factor of two things:\n" +
                "How much it costs to make a product?\n" +
                "What is the value of the product to the customer?\n" +
                "\n" +
                "For commodity stuff (most unbranded things you use) it is primarily factor 1 that sets the price. For monopolies, it is primarily factor 2. For instance, the price of your iPhone or Windows OS depend very little on the cost it took to make the product. If Microsoft thinks that they can get away with $200 for a copy of OS, they will charge that. For all the other products, the pricing is somewhere inbetween.\n" +
                "\n" +
                "It takes a lot more cost to build a car and it is far more valuable to a customer. \n" +
                "\n" +
                "Cost:\n" +
                "Each car requires almost a ton of steel, plastic and other metals. My laptop requires some plastic, some copper and some silicon.\n" +
                "A Foxconn factory can make 50+ million iPhones in a year. Same for most computer peripheral makers and laptop manufacturers. However, a similar sized Toyota plant can make only about 200K cars a year. That adds a lot of fixed cost per year. This means the cost of the multi-billion dollar factory has to be spread over 200K products instead of 50 million products.\n" +
                "Cars are far more complex than most computers and require elaborate quality control.\n" +
                "Cars are extremely bulky and a lot of cost is involved in storage and transportation.\n" +
                "\n" +
                "\n" +
                "Value:\n" +
                "You can use your car for years and after that period, sell it for a fair resale value. When it comes to computers, you are pretty much sending the product to $0 value in about 2 years of usage. Computer are also more likely to breakdown and have more frequent replacement cycle.\n" +
                "A lot of people get a lot of value out of the car, especially when compared to the alternatives (taking public transportation or riding a bike). Value is often seen when compared to the alternatives.");

    }
}
