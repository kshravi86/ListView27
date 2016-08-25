
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 8/7/16.
 */
public class Seventh1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("1. Magic of Compounding: In  1626, Peter Minuit of Netherlands bought the island of Manhattan from  the Lenape people for a basket of clothes, beads and other stuff that  would have been worth just $24 then. Now, you might think that the  native Americans were robbed. Actually, if they were able to invest that  $24 in a 8% bond, that account would be worth $26 trillion in 2012 -  enough to buy entire America. That is the magic of compounding. Your  money keeps multiplying the longer you save. If compound interest is the  only thing you remember from your highschool math, you will survive. \n" +
                "\n" +
                "\n" +
                "\n" +
                "2. There is no Return without Risk: Your  return in any investment is always proportional to the risk you take.  There is no such thing as a low-risk, high-return investment. If  somebody says that, run as fast as you can from them.\n" +
                "\n" +
                "3. There are 3 main classes of investment - Stocks  (owning a part of a company), Bonds (loaning a company money) and  Commodities (holding the rights to a physical good). Unless you are a  smart trader, stick to only the first 2 classes of investment. Also,  when someone tries to sell you a Forex account  don't walk, run. (Unlike  stocks, which are quite strongly regulated in favor of investors thanks  to the SEC, forex has very weak protection for common traders as CFTC  is usually very non-aggressive in going after scammy brokers).\n" +
                "\n" +
                "4. Own stocks when you are young and own bonds when you are old: Stocks  are high-risk, high-return investment and is suitable for an investor  who doesn't need the money in the short term. As you age, you must  slowly move your money from stocks to bonds. Stocks are ALWAYS riskier  than bonds given the fundamental reality - bondholders ALWAYS get their  money before stockholders in any liquidation. Here is the quantitative  data to back that up. \n" +
                "\n" +
                "\n" +
                "\n" +
                "5. You can never be too young to save. Save  & invest as early in life as possible. If you have kids, make them  learn investing skills. It should be like learning to walk, swim or  drive. \n" +
                "\n" +
                "6. Inflation kills. Assuming an annual inflation  of 6% (over long term), in 40 years you need $11 for every $1 you have  now, to have a comparable lifestyle.\n" +
                "\n" +
                "7. Diversify enough. Always spread your money in 5-7 different types of investments (bank deposits, tech stocks, broad market index, bonds, etc.)\n" +
                "\n" +
                "8. The Rule of 72. If  you have put your money in an investment earning 9%, how do you  calculate when your investment doubles without a calculator? There is a  simple rule of thumb. Just divide 72 by your interest rate and that  gives you the number of years it takes to double your investment. Thus,  if your investment gives 9%, you will double in 8 years (72/9), if your investment gives 7%, you will double in 10 years and so on.");
    }
    }
