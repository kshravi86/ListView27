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

public class FourthActivity18 extends Activity {


    String[] CHEESES = {

		"What is India's relationship with Afghanistan?",
		"Why did China invade India in 1962?",
		"What exactly is the Arunachal Pradesh Conflict between India and China?",
		"What is the complete history behind the disputes between India, Pakistan and China, over their conflicting national borders?",
		"Why does India have a larger area than Pakistan?",
		"Why did the partitioning of India cause violence?",
		"How important is Bhutan to India?",
		"What is Operation Blue Star?",
		"What is the best political solution to Kashmir?",
		/*
		 "What are the benefits and drawbacks to India in letting Kashmir be an independent state/country?",
		 "Why doesnt India utilise its powerful Army to neutralise the Naxalite threat and instead continue to use the police and paramilitary forces?",
		 "Should the North Eastern states of India try to secede from India, and try to join China?",
		 "Is spending tons of money on defense justified, when on the other side India is poor country?",
		 "Who among Gandhi and Bhagat Singh was right in his approach towards the British rule in India?",
		 "What's the history of the Islamic insurgency in Iraq? How did the unrest progress? Is momentum building?",
		 "Why and how was the Muslim conquest so successful?",
		 "What would be an outcome of Iran's nuclear strike on Riyadh?",
		 "Why have the Islamic countries failed to develop even with resources like oil, whilst countries with no resources like Switzerland have flourished?",
		 "Why are there so many problems in Africa?",
		 "Why has every superpower tried to conquer Afghanistan, even though the country has nothing special like oil, coal, natural gas or valuable minerals?",
		 "How was a smaller country like Japan able to dominate and/or oppress much of China for the last century?",
		 "What did the Dalai Lama do to provoke the Chinese government?",
		 "How many countries has China invaded in its history?",
		 "Why do people continuously say that World War III will be triggered because of the lack of water?",
		 "Why does the United States give so much foreign aid to Pakistan?",
		 "How did Switzerland never participate in any world wars?",
		 "Why does terrorism get so much more publicity and focus than other far more deadly problems?",
		 "Why do the three deaths at the Boston Marathon Attack weigh so much more heavily than the thousands who died in America that same day?",
		 "We seem to live in a very peaceful time in modern history, where the percentage of people killed in armed conflicts worldwide is at a historic low. What are the underlying causes for this phenomenon?"

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
						case 1:  Intent newActivity = new Intent(FourthActivity18.this, Fourth1.class);
							startActivity(newActivity);
							break;
						case 2:  Intent newActivity2 = new Intent(FourthActivity18.this, Fourth2.class);
							startActivity(newActivity2);
							break;
						case 3:  Intent newActivity3 = new Intent(FourthActivity18.this, Fourth3.class);
							startActivity(newActivity3);
							break;
						case 4:Intent newActivity4 = new Intent(FourthActivity18.this, Fourth4.class);
							startActivity(newActivity4);
							break;
						case 5:Intent newActivity5 = new Intent(FourthActivity18.this, Fourth5.class);
							startActivity(newActivity5);
							break;
						case 6:Intent newActivity6 = new Intent(FourthActivity18.this, Fourth6.class);
							startActivity(newActivity6);
							break;
						case 7:Intent newActivity7 = new Intent(FourthActivity18.this, Fourth7.class);
							startActivity(newActivity7);
							break;
						case 8:Intent newActivity8 = new Intent(FourthActivity18.this, Fourth8.class);
							startActivity(newActivity8);
							break;
						case 9:Intent newActivity9 = new Intent(FourthActivity18.this, Fourth9.class);
							startActivity(newActivity9);
							break;


					}
				}
			});


        mHeader = findViewById(R.id.header);
        mHeaderPicture = (KenBurnsView) findViewById(R.id.header_picture);
        mHeaderPicture.setResourceIds(R.drawable.conflict, R.drawable.conflict3);
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
