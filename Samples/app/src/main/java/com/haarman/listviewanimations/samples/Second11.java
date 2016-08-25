package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Second11 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Since your conclusion is false, you need to check the assumption. The result is that we are not born as blank slates nor as equals.\n" +
                "\n" +
                "Genetics already produces a huge inequality at conception. Nature codes a compressed set of \"learnings\" from thousands of years of evolution and passes it on. Embryos without genetic diseases and conceived from healthy, successful parents already have a \"leg\" up [before they even have a leg].\n" +
                "Mother's education, health and wealth then play a big role as fetus develops. If she takes the prenatal vitamins, takes care of her health, goes to regular doctor checkups and afford to skip to work in dangerous conditions, there is a huge advantage gained.\n" +
                "Environment then plays a role. All the noise around the pregnant mother is also heard by the baby starting from the second trimester. If the mother lives in a calm, energetic environment and can afford to \"train\" the fetus while it is still in, another round of advantage is gained.\n" +
                "Now, coming to birth. If the birth happens in a safe environment at the right time and without much complication, it again affects the baby's future. There are still regions where delivery happens outside a hospital and plenty of complications are developed in that messy procedure.\n" +
                "Then comes the nurture. If the baby has both its parents work for it then another round of advantage. This way the mother can be a little less stressed and be able to nurse the baby well. Nursing with mother's milk provides a great bit of mental & physical health advantage that is usually possible only if the mother is not overburdened and has a supportive spouse.\n" +
                "\n" +
                "In short, by the time the baby is barely a few weeks old there is a huge level of advantage or disadvantage it can gain/lose over the average. Then the society can do a whole lot of good/bad things:\n" +
                "Disease: Societies with better hygiene, immunization & healthcare might protect their kids from getting polio and other debilitating diseases that can wreck a child's life.\n" +
                "Economy: Societies with better economic institutions would provide more job opportunities and motivations for the kid to seek.\n" +
                "\n" +
                " These often imperceptible advantage/disadvantages compound over time. By the time they are adults, the differences could be substantial due to a variety of good/bad actions taken place in all that time. The baby that is disadvantaged at birth is then playing a catchup game. \n");
    }




}
