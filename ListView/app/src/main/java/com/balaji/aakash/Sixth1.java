package com.balaji.aakash;


import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Sixth1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("INVENTO: REIMAGINING EDUCATION.\n" +
                "What does GDP mean? How is the Gross Domestic Product of a country measured?\n" +
                "BALAJI VISWANATHAN\n" +
                "If you follow the business news, it is hard to miss this acronym: GDP. It is thrown in almost all economic news. But, what does that mean? How is it measured?\n" +
                "\n" +
                "GDP (Gross Domestic Product) is a measure of country's production or income. You can simply understand this as the sum of incomes all people living in a particular country. For instance, the GDP of US is $15 trillion. This is the sum total of incomes of 313 million Americans (at an average of $50,000 per person).\n" +
                "\n" +
                "This is one of the most simplest & intuitive measures to track the economy. If incomes go up, wellness go up. Thus, most government prioritize maximizing this measure. The annual growth in GDP is the most used metric to figure out if an economy is going up or going down.\n" +
                "How is the GDP measured?\n" +
                "The village of utopia has 6 cows (generating 100 liters of milk everyday), 100 acres of wheat field (generating 100 tons of Wheat everyyear), 100 acres of cotton fields, 1000 sets of clothing (at an average price of $10 each). Assuming that nothing else is produced in the village, the GDP of the village is:\n" +
                "100 liters *365 = 36500 at $1/liter. Annual product: $36500\n" +
                "100 tons of Wheat at $500/ton. Annual product: $50000\n" +
                "1000 sets of clothing at $10 each. Annual product: $10000\n" +
                "The total GDP of this village is: $365000+$50000+$10000 = $96500.\n" +
                "(Note: We don't take the value of cotton produced here, as it will be accounted in the Textile production).\n" +
                "\n" +
                "When you have millions of people living a country, it can be hard to measure the GDP. Most often it takes a couple of years to fully know what happened on a particular year. Thus, there is a lot of guesswork involved in the process to make it more timely.\n" +
                "\n" +
                "There are 3 ways to measure GDP:\n" +
                "Measuring through Consumption: This is the total amount spent & invested by people. Since all money generated in the economy has to be either spent or invested, it indirectly measure economy. Given that governments have tax collectors all over the nation, it becomes relatively easy to measure how much people spend. Thus, this is one of the best ways to measure GDP. GDP = Spending by common people + Spending by government + Investments + Exports - Imports. In the short term, GDP can be increased by increasing government spending, leading to some leftist economist such as arguing for more government spending during recessions. \n" +
                "Measuring through Incomes: Add the wages, corporate profits, taxes, interests and rents of all labor+facilities. This measure can be delayed given the fact that businesses & people file taxes only the following year. If you subtract the tax component from this, you get the GDP measure: Total Factor Income. \n" +
                "Measuring through Production: Calculate the market value of all products & services produced in the economy. You need to make sure that you subtract the value of intermediate goods (such as the cotton from the fields). This is what we did in our basic utopia example. One of the hardest way to measure GDP as you need to track all products & services. If you add all the taxes & reduce subsidies, you get GDP at Producer Price.\n" +
                "Due to the various guesswork involved, the 3 measurements could lead to different results:  \n" +
                "\n" +
                "\n" +
                "\n" +
                "Recessions\n" +
                "The annual increase in GDP is called the growth rate. To make sure you account for inflation, you subtract the inflation from the growth rate to get the real rate. When an economy goes through a period of negative growth (wages going down) then the economy is said to be in a recession (this is an unofficial use of the term though). \n" +
                "\n" +
                "Here is the 80 year GDP growth rate of US. You can see the massive drop in GDP in 1930s (Great Depression) and in the period immediate post World War -II ( 1940s). Since then governments and economists have learned a lot in managing the economy and have taken immediate measures to manage GDP through active intervention (such as government spending). \n" +
                "\n" +
                "\n");
    }

    }
