package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 6/7/16.
 */
public class SixthActivity extends Activity {


    String[] CHEESES = {

            "What does GDP mean? How is the Gross Domestic Product of a country measured?",
            "Why do we need companies?",
            "What is the explanation of this so-called iron law of economics: as countries get richer, the share of agriculture in GDP, employment and land use declines over time?",
            "What Would a World Without Money Be Like?",
            "How did gold become the historical standard store of value?",
            "Why doesn't economics have the aesthetic elegance like mathematics, physics, or computer science?",
            "How do countries devalue currency?",
            "What are the factors that affect a country's currency?",
            "All You Need to Know About Inflation",

           /* "Why doesn't any country in the world have a 100% employment rate?",
            "Why are private companies needed? Why can't the government control everything?",
            "Why do cars cost more than computers?",
            "What's the difference between microeconomics and macroeconomics?",
            "What the hell are we going to do to work, let alone live, in the US in the future?",
            "Why are Scandinavian countries so rich?",
            "How is it possible for a tiny country like Mauritius to have such a high GDP per capita compared to the rest of Africa?",
            "Why does Japan consume so little oil?",
            "Why is China such an ec",
            "onomic powerhouse?",
            "Why is China rich and India so poor?",
            "Why do Eastern Asian countries develop much better than South Asian countries?",
            "Why isn't India really shining?",
            "How does China manage to",
            "maintain a constant 8-9% GDP growth rate?",
            "Why does the US heavily depend on India when it comes to outsourcing?",
            "Why is the United States of America so much wealthier than other countries?",
            "How does North Korea sustain itself?",
            "Why is the average salary in USA much much greater than that of India?",
            "Which country is the most economically self-sufficient?",
            "Why does the income gap increase as the rate of college graduation also increases?",
            "Why don't we make the minimum wage in the US $100 an hour?",
            "Is FDI a bad choice for the country receiving it? In the long term won't the company making the investment move a part of the profits back to the home country & weaken the currency?",
            "If I Buy Only Products Made by Companies from My Country, will it Improve My Country's Economy?",
            "Why does the income gap increase as the rate of college graduation also increases?",
            "Should inheritance be illegal?",
            "Why Don't Governments Print More Money to Pay Their Debts?",
            "What are the $10+ billion big industries of the future?",
            "What would happen if the world's richest men donated $1 million to every inhabitant on earth?",
            "Why does going to war help the US economy?",
            "What would happen if we returned to a more agriculturally focused",
            "economy?",
            "How does infrastructure spending result in economic growth?",
            "If all the countries are in debt, then who did they borrow the money from",
            "If developing countries are growing faster than developed countries, why wouldn't you invest most of your money there?",
            "Why has Indian rupee devalued from around ?5 per $1 at independence to around ?60 per $1 today?",
            "What was it like to witness the 1991 economic reforms in India?",
            "What exactly happened to the Indian Economy in 1991 in layman's terms?",
            "All You Need to Know About the Cyprus Problem",
            "How is the world price of oil determined?",
            "What is an economic bubble in Layman's terms?",
            "How does a weaker currency lead to stronger exports?",
            "What are the economics behind printing of currency?",
            "How",
            "do Nations Devalue Currencies? How does Currency Control Work?",
            "Is there a connection between bank interest rates and inflation rates?",
            "Problems with a Barter System",
            "Why does the US want the citizens to spend more money?"
*/

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  super.onCreate(savedInstanceState);
        // setContentView(R.layout.sample_main);

        setContentView(R.layout.activity_main2);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, CHEESES);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                switch( position )
                {
                    case 0:  Intent newActivity = new Intent(SixthActivity.this, Sixth1.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity2 = new Intent(SixthActivity.this, Sixth2.class);
                        startActivity(newActivity2);
                        break;
                    case 2:  Intent newActivity3 = new Intent(SixthActivity.this, Sixth3.class);
                        startActivity(newActivity3);
                        break;
                    case 3:Intent newActivity4 = new Intent(SixthActivity.this, Sixth4.class);
                        startActivity(newActivity4);
                        break;
                    case 4:Intent newActivity5 = new Intent(SixthActivity.this, Sixth5.class);
                        startActivity(newActivity5);
                        break;
                    case 5:Intent newActivity6 = new Intent(SixthActivity.this, Sixth6.class);
                        startActivity(newActivity6);
                        break;
                    case 6:Intent newActivity7 = new Intent(SixthActivity.this, Sixth7.class);
                        startActivity(newActivity7);
                        break;
                    case 7:Intent newActivity8 = new Intent(SixthActivity.this, Sixth8.class);
                        startActivity(newActivity8);
                        break;
                    case 8:Intent newActivity9 = new Intent(SixthActivity.this, Sixth9.class);
                        startActivity(newActivity9);
                        break;


                }
            }
        });


    }
}
