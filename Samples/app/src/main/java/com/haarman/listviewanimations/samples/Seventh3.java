package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 8/7/16.
 */
public class Seventh3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Any time is a good time for investing. The only question should be - \"what to invest\" and not \"whether to invest\". \n" +
                "\n" +
                "Create  a safety buffer for you. This is equivalent to 6 months of expenditure  secured safely in a bank CD. You might want to do this before you put  your money in the market. This is your rainy day money.\n" +
                "\n" +
                "Max  out your 401k to get the full employer's contribution. Until you learn  investing, you can invest this in Target date funds based on your  retirement.\n" +
                "Figure out your  planned expenses for the next 5 years - health related (say a Lasik  surgery for the eye), grad school, wedding, vacation... and set up a  separate fund for that. Again these should be in Bank CDs, US Treasuries  or Money Market accounts with top institutions such as Pimco. Don't put  this money in the stock market.\n" +
                "Start  playing with dummy accounts offered by many brokerage. Think of it as  your money and simulate various strategies. Read up on books such as  \"Intelligent Investor\" and \"A Random Walk down the Wall Street\". This  could go in parallel with the buffer creation part. \n" +
                "\n" +
                "Once you do this, you should start planning your stock investing for the remaining money.\n" +
                "To  start with, split your money into 3-4 buckets and invest them in index  funds. You could choose one index fund tracking S&P 500, another  tracking global equities, one tracking commodities and last one tracking  investment-grade bond. This is the least risky portfolio.\n" +
                "\n" +
                "As  you get more proficient, start risking a small portion of your  portfolio (10-20%) in sectors you understand. There are ETFs for every  sector. If you understand steel sector well and are confident with the  prospects based on your research, find a good steel fund such as SLX and  put your money there. Here is a good source for ETFs by sector: http://etfdb.haarman/etfdb-categories/\n" +
                "The  third level is to start investing in individual stocks in the sectors  you mastered in the second stage. This is when things start to get more  risky and time consuming. Start with 1-2 stocks and invest your time to  understand their business. Learn a little about reading balancesheets  (there are plenty of Youtube videos and investopedia article to help  you). Eventually grow your portfolio to about 5-7 stocks (if you spread  yourself too thinly, you will lose in brokerage commissions, invest  without lot of research and in general make your diversification into  di-worsification).\n" +
                "Avoid  temptation to trade too much. Attempt to get long-term capital gains  benefits where possible. It will help you gain more discipline and lose  less in taxes and commissions. Every week, spend 1-2 hours to understand  how your portfolio is performing. Every quarter you could consider  getting out of one of your duds and entering a stronger stock based on  your research.\n" +
                "\n" +
                "Since the first step was creating a buffer, don't panic when market appears wobbly. Plan to stay for the long term.");
    }
}
