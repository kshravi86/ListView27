package com.balaji.aakash;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import android.widget.*;
import android.content.*;

public class SeventhActivity18 extends Activity {



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
	


	private static final String TAG = "NoBoringActionBarActivity";
    private int mActionBarTitleColor;
    private int mActionBarHeight;
    private int mHeaderHeight;
    private int mMinHeaderTranslation;
    private ListView mListView;
    private KenBurnsView mHeaderPicture;
    private ImageView mHeaderLogo;
    private View mHeader;
    private View mPlaceHolderView;
    private AccelerateDecelerateInterpolator mSmoothInterpolator;

    private RectF mRect1 = new RectF();
    private RectF mRect2 = new RectF();

    private AlphaForegroundColorSpan mAlphaForegroundColorSpan;
    private SpannableString mSpannableString;

    private TypedValue mTypedValue = new TypedValue();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSmoothInterpolator = new AccelerateDecelerateInterpolator();
        mHeaderHeight = getResources().getDimensionPixelSize(R.dimen.header_height);
        mMinHeaderTranslation = -mHeaderHeight + getActionBarHeight();

        setContentView(R.layout.activity_noboringactionbar);

        mListView = (ListView) findViewById(R.id.listview);


		mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,
										int position, long id) {

					switch( position )
					{
						case 1:  Intent newActivity = new Intent(SeventhActivity18.this, Seventh1.class);
							startActivity(newActivity);
							break;
						case 2:  Intent newActivity2 = new Intent(SeventhActivity18.this, Seventh2.class);
							startActivity(newActivity2);
							break;
						case 3:  Intent newActivity3 = new Intent(SeventhActivity18.this, Seventh3.class);
							startActivity(newActivity3);
							break;
						case 4:Intent newActivity4 = new Intent(SeventhActivity18.this, Seventh4.class);
							startActivity(newActivity4);
							break;
						case 5:Intent newActivity5 = new Intent(SeventhActivity18.this, Seventh5.class);
							startActivity(newActivity5);
							break;
						case 6:Intent newActivity6 = new Intent(SeventhActivity18.this, Seventh6.class);
							startActivity(newActivity6);
							break;
						case 7:Intent newActivity7 = new Intent(SeventhActivity18.this, Seventh7.class);
							startActivity(newActivity7);
							break;
						case 8:Intent newActivity8 = new Intent(SeventhActivity18.this, Seventh8.class);
							startActivity(newActivity8);
							break;
						case 9:Intent newActivity9 = new Intent(SeventhActivity18.this, Seventh9.class);
							startActivity(newActivity9);
							break;


					}
				}
			});


        mHeader = findViewById(R.id.header);
        mHeaderPicture = (KenBurnsView) findViewById(R.id.header_picture);
        mHeaderPicture.setResourceIds(R.drawable.money, R.drawable.economy3);
        mHeaderLogo = (ImageView) findViewById(R.id.header_logo);

        mActionBarTitleColor = getResources().getColor(R.color.actionbar_title_color);

        mSpannableString = new SpannableString(getString(R.string.noboringactionbar_title));
        mAlphaForegroundColorSpan = new AlphaForegroundColorSpan(mActionBarTitleColor);

        setupActionBar();
        setupListView();
    }

    private void setupListView() {
        ArrayList<String> FAKES = new ArrayList<String>();
		for (int i = 0; i < 9; i++) {
            FAKES.add(CHEESES[i]);
        }
        mPlaceHolderView = getLayoutInflater().inflate(R.layout.view_header_placeholder, mListView, false);
        mListView.addHeaderView(mPlaceHolderView);
        mListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, FAKES));
        mListView.setOnScrollListener(new AbsListView.OnScrollListener() {
				@Override
				public void onScrollStateChanged(AbsListView view, int scrollState) {
				}

				@Override
				public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
					int scrollY = getScrollY();
					//sticky actionbar
					mHeader.setTranslationY(Math.max(-scrollY, mMinHeaderTranslation));
					//header_logo --> actionbar icon
					float ratio = clamp(mHeader.getTranslationY() / mMinHeaderTranslation, 0.0f, 1.0f);
					interpolate(mHeaderLogo, getActionBarIconView(), mSmoothInterpolator.getInterpolation(ratio));
					//actionbar title alpha
					//getActionBarTitleView().setAlpha(clamp(5.0F * ratio - 4.0F, 0.0F, 1.0F));
					//---------------------------------
					//better way thanks to @cyrilmottier
					setTitleAlpha(clamp(5.0F * ratio - 4.0F, 0.0F, 1.0F));
				}
			});
    }

    private void setTitleAlpha(float alpha) {
        mAlphaForegroundColorSpan.setAlpha(alpha);
        mSpannableString.setSpan(mAlphaForegroundColorSpan, 0, mSpannableString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        getActionBar().setTitle(mSpannableString);
    }

    public static float clamp(float value, float min, float max) {
        return Math.max(min,Math.min(value, max));
    }

    private void interpolate(View view1, View view2, float interpolation) {
        getOnScreenRect(mRect1, view1);
        getOnScreenRect(mRect2, view2);

        float scaleX = 1.0F + interpolation * (mRect2.width() / mRect1.width() - 1.0F);
        float scaleY = 1.0F + interpolation * (mRect2.height() / mRect1.height() - 1.0F);
        float translationX = 0.5F * (interpolation * (mRect2.left + mRect2.right - mRect1.left - mRect1.right));
        float translationY = 0.5F * (interpolation * (mRect2.top + mRect2.bottom - mRect1.top - mRect1.bottom));

        view1.setTranslationX(translationX);
        view1.setTranslationY(translationY - mHeader.getTranslationY());
        view1.setScaleX(scaleX);
        view1.setScaleY(scaleY);
    }

    private RectF getOnScreenRect(RectF rect, View view) {
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        return rect;
    }

    public int getScrollY() {
        View c = mListView.getChildAt(0);
        if (c == null) {
            return 0;
        }

        int firstVisiblePosition = mListView.getFirstVisiblePosition();
        int top = c.getTop();

        int headerHeight = 0;
        if (firstVisiblePosition >= 1) {
            headerHeight = mPlaceHolderView.getHeight();
        }

        return -top + firstVisiblePosition * c.getHeight() + headerHeight;
    }

    private void setupActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setIcon(R.drawable.ic_transparent);

        //getActionBarTitleView().setAlpha(0f);
    }

    private ImageView getActionBarIconView() {
        return (ImageView) findViewById(android.R.id.home);
    }

    /*private TextView getActionBarTitleView() {
	 int id = Resources.getSystem().getIdentifier("action_bar_title", "id", "android");
	 return (TextView) findViewById(id);
	 }*/

    public int getActionBarHeight() {
        if (mActionBarHeight != 0) {
            return mActionBarHeight;
        }
        getTheme().resolveAttribute(android.R.attr.actionBarSize, mTypedValue, true);
        mActionBarHeight = TypedValue.complexToDimensionPixelSize(mTypedValue.data, getResources().getDisplayMetrics());
        return mActionBarHeight;
    }
}
