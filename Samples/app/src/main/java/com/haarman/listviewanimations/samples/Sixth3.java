package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class Sixth3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Let's take the example of Raju, a poor student who moves to the city. His father is a day laborer and he get Rs.2000 ($30) a month for living. He spends Rs. 1000 on food, and remaining for paying the hostel fees. Life is fairly simple and uncomplicated at that stage.\n" +
                "\n" +
                "What the World Eats - Nobel Peace Center\n" +
                "\n" +
                "At the end of his studies, he gets a job a big software company. Now, he makes Rs. 50,000 a month. He could afford to eat a lot better and spends Rs.5000/month on food. The rest 45,000 he spends on his new car, rent for a bigger home and a new mobile phone.\n" +
                "\n" +
                "Five years into the job, he gets promoted to be the team leader and makes Rs. 200,000 per month. His food expenses stay the same Rs.5000 [only one stomach to fill], but he now spends on a new home loan, an expensive art work for the hall, vacation in Europe and much better gadgets. \n" +
                "\n" +
                "When Raju was very poor, food took 50% of his earnings. However, within a few years, food accounted for just 2% of his earnings, even though he was eating much more. As he moves higher in life, food becomes vanishingly small % of his salary. All his other needs multiply, but stomach's needs stay the same. \n" +
                "\n" +
                "Food consumption increase, but not as much rest of the spending.\n" +
                "\n" +
                "Multiply Raju by one billion and this is what happens with nations. When we are primitive, agriculture/food production is the central occupation. Almost all of our time goes into hunting & gathering food. As we settle into a civilization, food production explodes, leaving us a lot of time to spend on arts, architecture, clothes and fun. Eventually, we build nice homes, great roads & airports, travel more, have better entertainment options. \n" +
                "\n" +
                "Raju spends only 2% of his earnings on food. That means an economy of Rajus will spend only 2% of their total GDP on agriculture. This is the natural outcome of civilization");
    }

}
