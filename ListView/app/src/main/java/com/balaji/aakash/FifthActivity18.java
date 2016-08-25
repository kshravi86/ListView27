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

public class FifthActivity18 extends Activity {

	String[] CHEESES = {

		"Bhagvad Gita 1: Arjuna's Despondency (Part 1)",
		"Bhagvad Gita 2: Arjuna's Despondency (Part 2)",
		"Bhagvad Gita3: Sankhya Yoga (Part 1)",
		"Bhagvad Gita 4: Sankhya Yoga (Part 2)",
		"Bhagvad Gita 5: Sankhya Yoga (Part 3)",
		"Bhagvad Gita 6: Karma Yoga (Part 1)",
		"What is Dharma?",
		"How correct am I in believing that (Hindu) mythology is actually just philosophical fiction? If so, is it logical to worship it?",
		"Why is the color Saffron so important in Hinduism, as well as otherwise?",

		/*"Why is it believed that the Ganges is self-cleaning?",
		 "Why is the cow a revered animal in Hinduism?",
		 "What is the significance of Nandi (the bull) in Indian Temples?",
		 "What is the Indian caste system? How does it work?",
		 "Why are most Hindu Brahmins vegetarian?",
		 "Why is traditional food served on a banana leaf in the states of South India?",
		 "How do I introduce Hinduism to a person who knows nothing about it?",
		 "What is the significance of the artwork of Kolam or Rangoli ? What are some interesting facts about them?",
		 "What is the significance of Sandhyavandanam in Hindu worship?",
		 "What should everyone know about Yoga?",
		 "What are the main scriptures for Hindus? How are they organized?",
		 "What are the top ten verses in the Hindu Scriptures that would enlighten a non-Hindu?",
		 "What is the historical background of Hinduism?",
		 "Why are Buddhist texts considered more historically reliable than Hindu scriptures?",
		 "How is the creation of the universe defined by Hinduism?",
		 "Mahabharata or Ramayana- which epic is greater and why?",
		 "What was the extent of the Bharata dynasty according to the Mahabharat? What kingdoms does the epic mention to have participated in the war?",
		 "Are there instances in the Ramayana and the Mahabharatha where people of lower castes were respected and treated well by those of higher castes?",
		 "Why is Raavan considered evil by many people?",
		 "Why did Hanuman not take away Sita with him while he was in Lanka?",
		 "Was Ekalavya the greatest warrior in Mahabharata?",
		 "Are Ravana, Duryodhana more of anti-heroes than outright villains?",
		 "Why is Lord Ganesh so popular in Hindu tradition?",
		 "Why do we have only few temples to Lord Brahma?",
		 "Why do most Indian Temples have the 'Navagrahas' ( Nine Planets)?",
		 "Why didn't Hinduism spread to any other part of the world, outside of the Indian subcontinent?",
		 "When was Vedic Hinduism and Brahminism introduced to the Tamil society?",
		 "Tracing the Sanskrit Influence in Southeast Asia",
		 "Misconceptions about Hinduism",
		 "Is caste system and sati system a flaw in Hinduism?",
		 "What are some mind-blowing facts about Hinduism?"
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
						case 1:  Intent newActivity = new Intent(FifthActivity18.this, Fifth1.class);
							startActivity(newActivity);
							break;
						case 2:  Intent newActivity2 = new Intent(FifthActivity18.this, Fifth2.class);
							startActivity(newActivity2);
							break;
						case 3:  Intent newActivity3 = new Intent(FifthActivity18.this, Fifth3.class);
							startActivity(newActivity3);
							break;
						case 4:Intent newActivity4 = new Intent(FifthActivity18.this, Fifth4.class);
							startActivity(newActivity4);
							break;
						case 5:Intent newActivity5 = new Intent(FifthActivity18.this, Fifth5.class);
							startActivity(newActivity5);
							break;
						case 6:Intent newActivity6 = new Intent(FifthActivity18.this, Fifth6.class);
							startActivity(newActivity6);
							break;
						case 7:Intent newActivity7 = new Intent(FifthActivity18.this, Fifth7.class);
							startActivity(newActivity7);
							break;
						case 8:Intent newActivity8 = new Intent(FifthActivity18.this, Fifth8.class);
							startActivity(newActivity8);
							break;
						case 9:Intent newActivity9 = new Intent(FifthActivity18.this, Fifth9.class);
							startActivity(newActivity9);
							break;


					}
				}
			});


        mHeader = findViewById(R.id.header);
        mHeaderPicture = (KenBurnsView) findViewById(R.id.header_picture);
        mHeaderPicture.setResourceIds(R.drawable.dharma18, R.drawable.dharma3);
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
