package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Eleventh5 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("India is a nation of married people who are ruled by bachelors. We never stand in line for anything, however, when it comes to marriage we form a strict queue. \n" +
                "\n" +
                "On the other hand, US elects only married couples to the White House (only James Buchanan remained a bachelor) while the society itself doesn't place as much importance on marriage. \n" +
                "\n" +
                "First, let me cover why marriage is important to Indians.\n" +
                "Social security: Unlike the West, marriage & kids act as the only social security given the absence of government funded social security pensions.\n" +
                "Network effects: In every society, married couples tend to hangout more with other couples, and singles hangout more with other singles. Since very few Indians remain single past the mariageable age, the remaining singles get off from the network.\n" +
                "Religious importance: Most religious sects in India extoll the values of marriage. Since India is a religious country, marriages are the norm.\n" +
                "\n" +
                "Marriage queue\n" +
                "In most communities in India, marriages work like clockwork. Elder siblings get married ahead of younger siblings of the same gender. Boys most often get married after their sisters. In my extended family, this rule got broken only 2-3 times. As others mentioned, there won't be much ruckus when things happen that way. Just that there will be gossips and grapevine. \n" +
                "\n" +
                "Marriages follow market dynamics\n" +
                "The market has a lot of dynamics. Most of my classmates got married at 26 and 90% of them got married to girls who were 23. In fact, there was a 2 week period, when a dozen of my friends got married without any deliberate synchronization. A bunch of social experiments led our families to believe that 2-3 year gap between the boy and the girl is ideal & things worked out well for us.   \n" +
                "\n" +
                "Since the weddings work like a clock, many problems arise when people jump the line:\n" +
                "Increased pressure on older siblings: In almost every society, there will be a higher pressure on older siblings when their younger ones get married. In India, that pressure is 10X due to the points outlined at the top. Not getting married will cut off their social security and networks. You don't want to put your brother or sister, whom you love so much, through that misery.\n" +
                "Marriage markets expect a certain range: In the circles I observe, people generally marry in the 25-28 ages for guys and ages 22-25 for girls. When a younger sibling jumps the line, one or more of the siblings get pushed outside this typical range and leading to reduced choices. \n" +
                "Signaling issue: As Shefaly Yogendra touched upon, when something happens out of the norm, people start thinking foulplay. Unless the person had strong reasons to back up (like studying Medicine) the market starts to get suspicious. \n" +
                "Importance of family: In many traditional cultures, family bonds are quite important. The family provides everything from social security to joyous bonding during festivals. Thus, most people don't do anything to upset their families. Even when they go for non-arranged marriage, they follow their turn in the line. \n" +
                "\n" +
                "The key thing in India marriages are bound to strong market dynamics and arranged marriages place a lot of emphasis on cold rationality.  Most people who have gone through the marriage process see value in this system and thus I don't see any reason why this practice will go away.\n");
    }
}
