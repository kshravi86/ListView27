package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Fourteenth12 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("I used to be an oil trader a while ago (trading mainly in oil ETFs/funds). It is one of the most stressful experience as oil prices change throughout the day. I used to wake up in the middle of the night to see how Singapore & Tokyo are closing and how London is opening. There are way too many factors.\n" +
                "\n" +
                "There are different types of Crude oil - Brent, Dubai crude, West Texas Intermediate, etc. Each of these oils differ on their sulfur content and how hard is it to refine them. To simplify things, Brent is usually used as the standard and other oil prices are decided relative to it. Majority of world's trading happen on Brent Crude (mostly produced in the North Sea).\n" +
                "The different types of crude oils are traded in a special type of market called the - Futures Exchange. In the US, this primarily happens in New York (NYMEX). Here, the producers and purchasers would come with their orders for delivery at a future date. For instance, Exxon could be selling a big chunk of their recent oil finding that could be bought by a major refiner (such as Indian Oil).\n" +
                "The end buyers and sellers both have a price in mind and depending on their urgency and needs will be willing to take a particular price. Depending on the supply & demand situations of that time, the price would vary. Think about sports tickets for a game. If a popular star is sick, the price will drop or if the team had won a previous game, the price will rise at the spot market.\n" +
                "\n" +
                "The traders in the futures market do a collective guessing on the total supply and demand for oil in the future. Just like the blackmarket stadium ticket sellers, they have to be quick on the feet in their estimations. \n" +
                "\n" +
                "What could change the guess?\n" +
                "News on new supply. US started tapping huge reserves of oil recently and this is sending waves through the market. The news like the one below could come and immediately the traders would start running around to reduce their oil inventories. Price would then fall substantially, until some buyers on the fence (eg. airlines) come out and find their bargains.\n" +
                "\n" +
                "Changes in consumer habits. For instance, if the news comes that Americans are driving a lot this year, then the ripple would be felt across the market. US consumes 20% of world's oil and almost half of the oil consumption goes to gasoline. A small change in driving habits could cause either a scarcity or a surplus. \n" +
                "\n" +
                "Terrorist attacks and disturbance. If there is any war, terrorism or any act involving an oil producers, buyers would panic. That would mean more demand and prices would rocket. Some of these include Nigeria attacks, Iran war threats, Venezuela crazy guy threat (RIP), etc.  \n" +
                "\n" +
                "Alternative energy sources. If solar, fuel cell or other disruptive energy source could come, then oil traders would panic, dumping all their oil. That would trigger a downward spiral. For now, this is not a major trend impacting the market but in the future it potentially could.\n" +
                "Economic growth. If India, China and elsewhere suddenly show a change in economic growth (upward or downward), oil market would react as traders would have to revise their consumption projections. \n" +
                "\n" +
                "There is a story in Hindu mythology about the god of knowledge - Saraswati. She keeps playing her Veena (a stringed instrument) endlessly as new sources of knowledge is created. In the same way, news is created across the world, every second and traders constantly guess how much each news will affect the overall supply or demand.");

    }
}
