package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 7/7/16.
 */
public class Sixth5 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("World needs some currency system to handle trade. It can be anything (stones, metals, water, food, etc.). So, why gold? Gold was used by almost all the major civilizations in the world.  Can the whole world be crazy for 1000s of years? Here is why gold is golden: \n" +
                "\n" +
                "Portable. It is extremely dense. Meaning it is easier to carry & handle than a sack of rice or a barrel of oil. In fact, anybody could put their entire family's wealth in a small bag and carry away (in times of crisis, disaster or migration). \n" +
                "\n" +
                "\n" +
                "Lasting. It is quite inert and doesn't corrode. Meaning it doesn't lose value. Thus, generations could hand over their gold to their next ones. Can you do that with paper or iron? Can your grandma give her savings in some crumbled notes to you (that her great grandmother gave)? Unless you are a philatelist or history students, those notes will have no worth to you.\n" +
                "Trustworthy. It is very easy to test purity anywhere in the world at almost zero cost. How easy is it to test a foreign counterfeit note? How easy is it to value land or diamonds?\n" +
                "Stable. The supply of gold is stable across centuries. Very unlikely to produce new mines any time soon. How easy is to print currency & debase value? How likely is to find a newer mine for another metal? No government can cheekily steal your saving's value by increasing production.\n" +
                "Liquid. Gold has only one grade and thus single pricing. Meaning it is very liquid. If you were to trade in diamonds or oil, you have to deal with myriad range of grades & quality. Can you get the same value for your diamond ring if you were to sell it now at the price you bought it?\n" +
                "Universal. Gold is recognized all over the world. This means flexibility and trust. No other material is this recognized across the world. Will your Yuans or Rupees or Reals work this way?\n" +
                "Diversion. Unlike silver or platinum, gold has very little industrial use (only about 100t annually is used in industries such as semiconductors). Thus, you are not taking away a valuable industrial commodity for trading.");

    }

}
