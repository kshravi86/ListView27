package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Eleventh1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("The economics of Indian dating\n" +
                "\n" +
                "Supply & Demand:\n" +
                "For every 100 guys there are only 90 girls. So, by design 1 out of every 10 guys will stay single in a 1:1 marriage structure. Since this process is random, almost every guy is desperate to get their girl. Desperation is never a good thing for dating.\n" +
                "\n" +
                "Information asymmetry\n" +
                "Guys want attractive girls, girls want stable/strong guys. This is the human nature that we evolved over 1000s of years. In modern context, the strong guy is one who can run the family well for decades and able to look after the family, both financially & psychologically. This is the type of guy women historically want.\n" +
                "\n" +
                "At 20, girls could show their attractive ability, but there is no way for the boy to show their financial/mental stability. This means that while guys chase girls in the college, the girls have very few data points to validate whether you will turn out to be the stable, family guy who can take her through the tough times of her life. \n" +
                "\n" +
                "Monopolistic Markets:\n" +
                "In many work environments, attractive, single girls are an endangered species. This occurs due to \n" +
                "Many geeky places are not female friendly, leading to lower women recruiting and there is a strong feedback loop here.\n" +
                "Most girls get married/engaged within 2-3 years after graduation.\n" +
                "Divorce and remarriage is uncommon in India..\n" +
                "\n" +
                "Thus, by the time they get to your workplace, they are no longer single.\n" +
                "In programming, finance or research, where Indian guys frequent, girls are rare. Thus, a single & attractive girl in such a market can display monopolistic tendency. This can substantially affect the pricing structures of interpersonal relationships. Just like how Apple fanboys wait in lines for their newest iPhone, Indian guys are desperate to court this rare breed of girls.\n" +
                "\n" +
                "Incentive Structures & Illiquid Markets:\n" +
                "In Western societies, if you don't date you stay single. There is a pressing need to date. In India, dating is an option. If you don't date, you can still get the girl with the same probability of \"with dating\". Thus, there is not enough incentive for many people to date. Without enough liquidity in the market, the market can get crazy.\n" +
                "\n" +
                "Market Psychology & Regulatory Framework:\n" +
                "Indian mainstream society is very much against dating. The laws are designed to capture those into love affairs in public places. Sometimes these can be draconian. \n" +
                "\n" +
                "Marginal Utility:\n" +
                "When you are given 10 chocolates, the 10th one might not taste as nice as the first one. Because by that time you are already well stuffed and things start tasting bitter. This is the case for Indian girls. Many of them receive so many \"proposals\" that it no longer gives them enough happiness. For them, the joy of courtship is usually gone due to the flooding of proposals.\n" +
                "\n" +
                "Commoditization\n" +
                "Continuing from previous point, your proposal might look sweet for you, but not for them as they are stuffed with sweets already. Thus, as a guy you should stop being a chocolate and maybe provide enough product differentiation, like say Namkeen or Chips? Think different.\n" +
                "\n" +
                "Finally, it is about making products that your customers love. Ok, we are the product here. We spend years making us worthy for IITs and Googles. However, we don't spend even a few weeks in making us attractive to the opposite sex. With little effort we might be able to understand them better, learn to care for them, share some of their work and help them ease into our families (after marriage).\n" +
                "\n" +
                "This is a great article on why Asian women are avoiding marriage & boys. Asia's lonely hearts");
    }
}
