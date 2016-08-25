package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Eleventh7 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("All marriages involve making decisions with incomplete information. Many of us don't know what we want and it is not surprising that a relationship for life breaks down at some point.  Often time it also involves external factors (parents, children, society) with their own +/-. In short, all marriages are bound to suck without an adequate foundation of compromise and support. Love or arranged - marriage involves compromise and understanding.\n" +
                "\n" +
                "The other answers hit on an important point - divorce rates are also an indicator of gender freedom. However, they might be taking the point too far as the world's top divorced nations are not necessarily the leaders in human development [2].  In fact, the only developed nation in the top 10 divorce rate is the US [3].  Divorce is far more complicated than just gender equality. \n" +
                "\n" +
                "Think about this - Cuba & Belarus rank at the top in divorce rates. Singapore close to the bottom [1]. Is Cuba freer than Singapore? Russia and Eastern Europe have way higher divorce ratios than New Zealand, Australia, Japan and Netherlands. Is Russia somehow more egalitarian than the Netherlands or New Zealand? \n" +
                "\n" +
                "Don't forget the economy\n" +
                "Divorce is a socioeconomic phenomenon that depends a lot on economic growth, labor opportunities, cultural support and career movement. When economies stop growing, a lot of marriages on the edge gets pushed over the cliff. In fact, Western countries are seeing a massive growth in divorce among the rural, uneducated populace, where unemployment is rapidly rising [4].\n" +
                " \n" +
                "Here are the top factors that reduce the divorce in the US. Having higher incomes, intact families (in some sense Divorce can be an epidemic as children of divorced parents tend to divorce with a higher probability) and college degrees is much better to reduce divorce rates. As economies slow down in many parts of the world, divorce rates will increase. \n" +
                "\n" +
                "\n" +
                "Urbanization\n" +
                "If everything else is equal, urban localities will have more divorce. The reasons range from longer commute [5] to information flow (more knowledge of divorce) and poorer support systems. West is highly urbanized compared to the east.\n" +
                "\n" +
                "Social support\n" +
                "Although Israel is highly urbanized & educated, its divorce rates are very low as it has a stronger social support system. In many of the metropolises in the east and the west, families are becoming nuclear due to more labor movement. This reduces the support systems. Many divorces happens when the couple are left to fend for themselves without proper guidance & counseling. West is far more urbanized than the east and has weak social/family support.  \n" +
                "\n" +
                "Religion\n" +
                "Religion affects divorce in various ways. In orthodox countries, divorce is still a taboo. Religious laws might make divorce far more complicated and harder to attain. Beyond that, religion can also work in positive ways [7]. If everything else is equal, people who share a spiritual bond are less likely to divorce. \n" +
                "\n" +
                "\n" +
                "When a married couple belongs to the same religion, the spiritual bond that they share tends to hold them together and they are less likely to go in for a divorce as compared to couples who belong to different religions.\n" +
                "\n" +
                "Legal Systems\n" +
                "In places like Cuba, it is really simple to get a divorce. Thus, more divorces happens for the smallest of reasons. In other places of the world, divorce is a messy procedure. Western nations in general have more smoother legal systems when it comes to divorce. Again, US ranks at the top of the West as it is a much more litigious society than most. \n" +
                "\n" +
                "Babies\n" +
                "If one of the couples is not interested in babies, divorce rates shoots up. Millions of divorces in West are attributed to differences of opinion in having a baby. In the east, almost everyone wants to have a child (due to social pressures and lack of social security). Thus, this factor is neutralized. \n" +
                "\n" +
                "Other cultural factors\n" +
                "One interesting stat I hit upon is that choreographers are 2.5 times more likely to divorce than mathematicians [6].  In general, having a steady job in a stable sector is a good insurance against divorce. In the West, especially in the US, a lot of people are dependent on jobs that look more like choreography than mathematics. \n" +
                "\n" +
                "Living together is another interesting factor that strongly correlates with divorce (as the partners don't take marriage that seriously even after wedding). Drinking and smoking are also highly correlated with divorce rates. \n" +
                "\n" +
                "Here is cool infographic of a guy's WhatsApp chat with his girlfriend. In the West, marriage is a bit more about sex than it is in the east. As people get older, sex becomes less engaging and cracks form as the relationship has a weaker foundation to cover the weakness in sex. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Divorce demography\n" +
                "Belarus: The Land of Broken Marriages\n" +
                "10 Highest Divorce Rates In The WORLD\n" +
                "Once Rare in Rural America, Divorce Is Changing the Face of Its Families\n" +
                "Longer Commutes Linked to Higher Likelihood of Divorce - | - Science of Relationships\n" +
                "21 Factors That May Increase the Risk of Divorce\n" +
                "Factors influencing divorce statistics\n");
    }
}
