

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

public class SixthActivity18 extends Activity {



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
						case 1:  Intent newActivity = new Intent(SixthActivity18.this, Sixth1.class);
							startActivity(newActivity);
							break;
						case 2:  Intent newActivity2 = new Intent(SixthActivity18.this, Sixth2.class);
							startActivity(newActivity2);
							break;
						case 3:  Intent newActivity3 = new Intent(SixthActivity18.this, Sixth3.class);
							startActivity(newActivity3);
							break;
						case 4:Intent newActivity4 = new Intent(SixthActivity18.this, Sixth4.class);
							startActivity(newActivity4);
							break;
						case 5:Intent newActivity5 = new Intent(SixthActivity18.this, Sixth5.class);
							startActivity(newActivity5);
							break;
						case 6:Intent newActivity6 = new Intent(SixthActivity18.this, Sixth6.class);
							startActivity(newActivity6);
							break;
						case 7:Intent newActivity7 = new Intent(SixthActivity18.this, Sixth7.class);
							startActivity(newActivity7);
							break;
						case 8:Intent newActivity8 = new Intent(SixthActivity18.this, Sixth8.class);
							startActivity(newActivity8);
							break;
						case 9:Intent newActivity9 = new Intent(SixthActivity18.this, Sixth9.class);
							startActivity(newActivity9);
							break;


					}
				}
			});


        mHeader = findViewById(R.id.header);
        mHeaderPicture = (KenBurnsView) findViewById(R.id.header_picture);
        mHeaderPicture.setResourceIds(R.drawable.economy, R.drawable.economy3);
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
