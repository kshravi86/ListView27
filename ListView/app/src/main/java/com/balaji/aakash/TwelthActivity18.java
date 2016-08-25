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

public class TwelthActivity18 extends Activity {

	String[] CHEESES = {

		"How did Mahatma Gandhi unite millions of people to fight for independence in a non-violent fashion?",
		"Mahatma's Modus Operandi",
		"Gandhi's 4 Cardinals",
		"Mahatma Gandhi's vs Sachin Tendulkar: Comparing freedom movement with Cricket",
		"Why did Gandhi start the Dandi march in 12 March 1930, even though taxation on salt was started in 1759, and Purna Swaraj was given on 26 January 1930?",
		"If Mahatma Gandhi was not assassinated, and had he lived for another 20 years, then what change he would have brought in India ?",
		"Is Mahatma Gandhi unduly credited for India's long freedom struggle and Indian Independence?",
		"Is Mahatma Gandhi's concept of non-violent struggle (Satyagraha) still relevant in the present world?",
		"Why did Nathuram Godse assassinate Gandhi?",

		/*"Misconceptions about Mahatma Gandhi",
		 "Is the Gandhian ideology sound or is it all just hype?",
		 "Was Mahatma Gandhi a good leader to people beyond Hindus?",
		 "How Gandhiji managed to come out of jail in very little time everytime compared to other revolutionaries?",
		 "Is Mahatma Gandhi responsible for the death of Bhagat Singh, Sukhdev and Rajguru?",
		 "If Mahatma Gandhi was not assassinated, and had he lived for another 20 years, then what change he would have brought in India ?",
		 "Why did Gandhi never call for military disobedience but only for a civil disobedience movement?",
		 "Why did MK Gandhi not lead India after Independence? Could his behaviour post Independence be termed somewhat irresponsible?",
		 "How would Mahatma Gandhi have reacted if a thief sneaked into his house and tried to kill his wife or son?",
		 "What was the reaction(s) of Mahatma Gandhi after the twin Atom Bomb blast on Japan in August 1945?",
		 "What the Maker culture and Mahatma Gandhi have in common?",
		 "Who are the greatest strategists in world history?",
		 "Why wasn't Gandhi's idea of non-violence, civil disobedience adopted by the Jews in Adolf Hitler's Germany?",
		 "Why were so many Indian men (including Gandhi, Nehru, Patel and even Jinnah) all learning law in British India in such an economy?",
		 "If Gandhiji wanted, could he have abolished caste system?",
		 "If Gandhi suddenly appeared, what would be the hardest thing to explain to him about Indian politics today?",
		 "If not for Mahatma Gandhi, would India still be under British rule?",
		 "Why did Mahatma Gandhi not get Bharat Ratna or the Nobel Peace Prize?"

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
						case 1:  Intent newActivity = new Intent(TwelthActivity18.this, Twelth1.class);
							startActivity(newActivity);
							break;
						case 2:  Intent newActivity2 = new Intent(TwelthActivity18.this, Twelth2.class);
							startActivity(newActivity2);
							break;
						case 3:  Intent newActivity3 = new Intent(TwelthActivity18.this, Twelth3.class);
							startActivity(newActivity3);
							break;
						case 4:Intent newActivity4 = new Intent(TwelthActivity18.this, Twelth4.class);
							startActivity(newActivity4);
							break;
						case 5:Intent newActivity5 = new Intent(TwelthActivity18.this, Twelth5.class);
							startActivity(newActivity5);
							break;
						case 6:Intent newActivity6 = new Intent(TwelthActivity18.this, Twelth6.class);
							startActivity(newActivity6);
							break;
						case 7:Intent newActivity7 = new Intent(TwelthActivity18.this, Twelth7.class);
							startActivity(newActivity7);
							break;
						case 8:Intent newActivity8 = new Intent(TwelthActivity18.this, Twelth8.class);
							startActivity(newActivity8);
							break;
						case 9:Intent newActivity9 = new Intent(TwelthActivity18.this, Twelth9.class);
							startActivity(newActivity9);
							break;


					}
				}
			});


        mHeader = findViewById(R.id.header);
        mHeaderPicture = (KenBurnsView) findViewById(R.id.header_picture);
        mHeaderPicture.setResourceIds(R.drawable.mahatma, R.drawable.mahatma3);
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
