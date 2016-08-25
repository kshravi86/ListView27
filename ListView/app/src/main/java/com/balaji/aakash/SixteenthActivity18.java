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

public class SixteenthActivity18 extends Activity {

	String[] CHEESES = {

		"Indus Water Treaty",
		"Why is the National Emergency of 1975 seen as one of the most controversial times in the History of India?",
		"How would India have evolved had it been Pandit Nehru receiving the bullets of Nathuram's gun instead of Mahatama Gandhi?",
		"Why isn't India a superpower or global leader?",
		"Is the creation of Telangana good for India?",
		"Has the division of the India into linguistic states served it well?",
		"Are there any insights as to how Vallabhai Patel convinced the princely states to unite as one common nation?",
		"What are the short-term and long-term effects of the anti-Hindi protests in Tamil Nadu?",
		"What exactly happened to the Indian Economy in 1991 in layman's terms?",

        /*    "What was it like to witness the 1991 economic reforms in India?",
		 "Why has Indian rupee devalued from around Re. 5 per $1 at independence to around Rs 60 per $1 today?",
		 "What is Article 370 of the Constitution of India? What would be the consequences of repealing it?",
		 "Section 377: India is Caught in a Victorian Trap.",
		 "Why India doesn't have a Jury system to punish criminals?",
		 "Why should India implement a uniform civil code?",
		 "What is the difference between Republic Day and Independence Day?",
		 "What are some things everyone should know about India's Republic Day?",
		 "What were some reasons why 'Sarey jahan sey accha' wasn't chosen as the Indian National Anthem?",
		 "Should India change its name to Bharat/Hindustan?",
		 "How can you explain all Indian Political parties in layman's terms?",
		 "Should India move to a Presidential system rather than Westminster model?",
		 "Why is Abdul Kalam widely loved and respected by everyone?",
		 "Why is Pratibha Patil widely hated & disrespected, despite holding prestigious post of President of India?",
		 "Why has the Indian Army never tried to stage a coup and take control of India's governance?",
		 "Why was Jawaharlal Nehru selected as the first Prime Minister of India instead of Sardar Vallabhbhai Patel?",
		 "Was Non-Aligned Movement a bad idea for India? If yes, Why?",
		 "Lessons from Indian elections 2014",
		 "Can someone explain the reasons for the Babri Masjid demolition?",
		 "Why didn't NATO attack India when India annexed Goa?",
		 "What are the benefits and drawbacks to India in letting Kashmir be an independent state/country?",
		 "Why did Indira Gandhi agree to returning captured land and 93000 PoWs after the 1971 war?",
		 "Why did China invade India in 1962?",
		 "What is India's involvement in LTTE movement?",
		 "What is Operation Blue Star?",
		 "What incidents and events have made India proud?",
		 "Are there any modern-day plagues? If not, what was the last one?",
		 "What is the darkest moment in Indian history?",
		 "Who are some of the notable people in modern Indian history that every Indian should know about?",
		 "Remembering the Indian Scientists of the 20th Century: Part 1",
		 "Remembering the Indian Scientists of the 20th Century: Part 2",
		 "From Bullock Carts to Mars.",
		 "Indian Space Mission, Poverty and Closet Racism",
		 "Awesome Reading Materials on Indian History"
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
						case 1:  Intent newActivity = new Intent(SixteenthActivity18.this, Sixteenth1.class);
							startActivity(newActivity);
							break;
						case 2:  Intent newActivity2 = new Intent(SixteenthActivity18.this, Sixteenth2.class);
							startActivity(newActivity2);
							break;
						case 3:  Intent newActivity3 = new Intent(SixteenthActivity18.this, Sixteenth3.class);
							startActivity(newActivity3);
							break;
						case 4:Intent newActivity4 = new Intent(SixteenthActivity18.this, Sixteenth4.class);
							startActivity(newActivity4);
							break;
						case 5:Intent newActivity5 = new Intent(SixteenthActivity18.this, Sixteenth5.class);
							startActivity(newActivity5);
							break;
						case 6:Intent newActivity6 = new Intent(SixteenthActivity18.this, Sixteenth6.class);
							startActivity(newActivity6);
							break;
						case 7:Intent newActivity7 = new Intent(SixteenthActivity18.this, Sixteenth7.class);
							startActivity(newActivity7);
							break;
						case 8:Intent newActivity8 = new Intent(SixteenthActivity18.this, Sixteenth8.class);
							startActivity(newActivity8);
							break;
						case 9:Intent newActivity9 = new Intent(SixteenthActivity18.this, Sixteenth9.class);
							startActivity(newActivity9);
							break;


					}
				}
			});


        mHeader = findViewById(R.id.header);
        mHeaderPicture = (KenBurnsView) findViewById(R.id.header_picture);
        mHeaderPicture.setResourceIds(R.drawable.sachin, R.drawable.sachin3);
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
