package com.balaji.aakash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by aakash on 6/7/16.
 */
public class SeventhActivity extends Activity {


    String[] CHEESES = {

		"What Everyone Should Know About Investing",
		"Introduction to Finance & Stock Markets.",
		"Get Started Managing your Finances",
		"Stock Market: How exactly does the stock market work?",
		"Walking the Bull: First Ever Corporation and Stock Certificate",
		"Walking The Bull: Let's get into Stock Markets - Part 2",
		"Walking the Bull: Know About Stock Indices",
		"When did equity investing begin?",
		"How do you value a public company?",

		/*
		 "What factors do you look into before buying a company's stock?",
		 "How is it possible for companies to have a market value below book value?",
		 "Pricing in an Initial Public Offer (IPO)",
		 "Is it possible to have a public listed company with a P/E ratio above 800x? If so - how? If not, isn't that outright fraud?",
		 "Consumer Sentiment Matters. A lot.",
		 "Define the P/E valuation method?",
		 "What are the similarities and differences between Mutual Funds, Hedge Funds, ETF’s and Closed End Funds?",
		 "Where do the profits of a Company go to?",
		 "What are the factors that contribute to the stock prices that go up and down every second?",
		 "What exactly are ETF (Exchange-Traded Funds)?",
		 "Some Simple Investing Tips.",
		 "How do I read SENSEX numbers, and how does SENSEX impact the economy?",
		 "How would you explain the DOW and how it works to a 15 year old?",
		 "Wh",
		 "at should one do with a check for $1 million (US)?",
		 "How should a graduate student invest their mon",
		 "ey?",
		 "Why is gold considered so precious and has such high prices?",
		 "How did gold become the historical standard store of value?",
		 "How Is the World Price of Oil Determined?",
		 "Who decides the gold prices we see in the news everyday?",
		 "What are the ways one can use to value gold?",
		 "Gold Investment options",
		 "Is it better to invest in gold or in gold mine stocks?",
		 "What should investors be aware of before investing their money in bonds?",
		 "What does Goldman Sachs do?",
		 "How do Credit Rating Agencies Work?",
		 "Does Social Media Affect Capital Markets?",
		 "How come stocks rarely ever split anymore?",
		 "Why do Many Companies Buy Back Shares?",
		 "How do stock exchanges (such as NYSE) make money?",
		 "How will the Syria situation affect the US",
		 "stock market?",
		 "Why didn",
		 "'t Twitter stay private longer?",
		 "Is Twitter Ready to Go Public?",
		 "Why Is Apple Stock Falling",
		 "Down? - Forbes",
		 "When a trader makes money from his trades, does he create any value? Does the act of trading create any value for anyone?",
		 "What does it mean to be 'short' or 'long' on a stock?",
		 "How does Short Selling Work?",
		 "What are very long term investments (over 60 years) that one can make?",
		 "How do Hedge Funds Work?",
		 "Advanced: Black Scholes calculation",
		 "What are derivatives? And how do I invest in them?",
		 "What is No Arbitrage Argument and the difference between strong and weak in layman's term?",
		 "How do you explain the difference between investment banks and venture capitalists to a layman?",
		 "What Should Everyone Know About Venture Capital",
		 "All About Bitcoins: The Digital Gold",
		 "How do Nations Devalue Currencies? How does Currency Control Work?",
		 "Why don't companies just ignore activist investors?",
		 "What is front running in financial markets?",
		 "Great Stocks Come In Waves",
		 "What are the best stocks of all time?",
		 "Why do so many investors sell stock after market declines",
		 "Why do we have regular boom and bust cycles if Fed's dual mandate is price stability and maximum employment?",
		 "What are the most prominent financial crashes the world has witnessed?",
		 "How can one summarize the 2007-8 global financial crisis in 10 sentences (or fewer)?",
		 "Causes for the 2007-08 Financial Crisi",
		 "s",
		 "Why did Lehman Brothers fail while other financial firms did not?",
		 "Was",
		 "the USA housing crash REALLY the cause of a terrible WORLD economy five years later?",
		 "What are the main reasons India survived the global economic recession of 2008?",
		 "What was the trigger for the tech bubble to burst in 2000?",
		 "What is an economic bubble in Layman's terms?",
		 "All You Need to Know About the Cyprus Problem",
		 "What is the definition of a sovereign default?"
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
						case 0:  Intent newActivity = new Intent(SeventhActivity.this, Seventh1.class);
							startActivity(newActivity);
							break;
						case 1:  Intent newActivity2 = new Intent(SeventhActivity.this, Seventh2.class);
							startActivity(newActivity2);
							break;
						case 2:  Intent newActivity3 = new Intent(SeventhActivity.this, Seventh3.class);
							startActivity(newActivity3);
							break;
						case 3:Intent newActivity4 = new Intent(SeventhActivity.this, Seventh4.class);
							startActivity(newActivity4);
							break;
						case 4:Intent newActivity5 = new Intent(SeventhActivity.this, Seventh5.class);
							startActivity(newActivity5);
							break;
						case 5:Intent newActivity6 = new Intent(SeventhActivity.this, Seventh6.class);
							startActivity(newActivity6);
							break;
						case 6:Intent newActivity7 = new Intent(SeventhActivity.this, Seventh7.class);
							startActivity(newActivity7);
							break;
						case 7:Intent newActivity8 = new Intent(SeventhActivity.this, Seventh8.class);
							startActivity(newActivity8);
							break;
						case 8:Intent newActivity9 = new Intent(SeventhActivity.this, Seventh9.class);
							startActivity(newActivity9);
							break;


					}
				}
			});


    }
}
