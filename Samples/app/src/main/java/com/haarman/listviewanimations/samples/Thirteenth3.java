package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Thirteenth3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("You are in an airport and walk to the magazine store. You want to pick up a copy of TIME for your in-flight reading. The store clerk waves you hi and then bills $4.99 for a copy. This makes you scream, \"the annual subscription costs just $9.99\"! \n" +
                "\n" +
                "Why are you charged so much at the airport for the same product that costs less than 1/20 when sent to your home? Price Discrimination.\n" +
                "\n" +
                "Price discrimination is fundamentally about how companies charge differently based on the urgency & income levels of the buyer. In this post, I will cover the different ways companies engage in price discrimination and at the end cover the major issues that are happening right now.\n" +
                "\n" +
                "\n" +
                "Every consumer is different when it comes to valuing things. An executive at a Fortune 500 company might be able to afford more and extract value better from a business magazine than a student at a community college. \n" +
                "\n" +
                "There are a few factors that might affect the way we value things:\n" +
                "Urgency. If I'm running for an interview, I might be able to afford a lot more for the coffee than when I'm at leisure at home.\n" +
                "Income levels. This one is obvious. The rich can afford more than the poor.\n" +
                "Priorities. A really avid Coffee drinker can place more value on a cup of artisan coffee than me. A music aficionado would prefer the front row seats at a concert while I might not care as much.\n" +
                "Demographics. A kid might afford to pay a lot less for his haircut than an office worker. \n" +
                "If I price the magazine at $5 for everyone, the executives would still buy, but very few others could. Thus, I would have a very low volume. If I price at $0.50 for everyone, now more people could afford. But, I'm leaving money on the table (the executive who could afford $5 is now paying just $0.50). \n" +
                "\n" +
                "How about me charging $5 to the executive and $0.50 to the student? That would give me the volume of the student purchases while at the same time high margins from the executives. Smart, right?\n" +
                "\n" +
                "Ideally, a company would know the affordability of each person and charge each person a unique value. However, there is a real problem. At the time of sales, I would know who can afford more and who couldn't. Moreover, pricing each individual different can be both controversial and mind blowing. \n" +
                "\n" +
                "Thus, companies arrive at various approximations in doing price discrimination. \n" +
                "Weekly discounts at Supermarkets\n" +
                "I used to frequent a supermarket that offered discounts every Wednesday. That is smart. A person shopping on a Wednesday is less likely to be a premium shopper who has a busy job. Thus, the store could make volume from the discount seekers who wouldn't mind coming in the middle of the week (pushing around the crowds) and the profit margins from the higher income earning households who come to shop on the weekends.\n" +
                "\n" +
                " The same dynamics works for coupons. The shopper who cuts coupons might neither have urgency nor place a high value on that particular item. \n" +
                "\n" +
                "Supermarkets also do smaller tactics. They tend to keep the higher priced items on the eye level and value packs less accessible. Again, an urgent or a rich shopper might pick the first one at hand and run to counter, while a cheap shopper might spend all the time in taking the item from the bottom shelf. \n" +
                "\n" +
                "Books & Magazine Pricing\n" +
                "Magazines are priced a lot higher at airports because a person buying such a magazine is more likely to be a busy executive. On the other hand, a homemaker who has no urgency & less income level could have the magazine sent to his/her home on a highly discounted monthly subscription.\n" +
                "\n" +
                "Also, books and magazines tend to be priced way higher in richer countries than in poor countries. For the same reason. \n" +
                "Price discrimination is all around us. At the cinemas, there are discounts to seniors & students. Again, the price of weekday afternoon shows could be less than the Saturday night shows. The first class ticket on an airline priced significantly more than the extra space costs to the airline (the buyer is most likely to be rich or someone whose ticket is bought by his company). Hotels & car rental companies have different pricing for weekdays and weekends. \n" +
                "\n" +
                "\n" +
                "Concerts price their seats at the front a lot more than those at the back (the really interested & really wealthy will pay for front row seats, while the normal consumers will not mind sitting at the back). Laundries charge high for those customers who want their clothes back really quick. \n" +
                "Internet based Price Discrimination\n" +
                "Until the arrival of the Internet, companies had to do price discrimination in very indirect ways like above. It was hard to know the exact value you could afford and it was hard to charge a lot of different prices. \n" +
                "\n" +
                "However, with cookies, retailers have started price discrimination based on your past purchases. If your airline knows you are really desperate for your ticket (maybe you posted on Facebook that you have a family emergency or your browsing behavior that highly correlate with a desperate shopper), they can charge you double. Taking Some Mystery Out of Blind Booking\n" +
                "\n" +
                "Amazon is often accused of charging different prices to consumers based on their past purchases. Look at the following side by side comparison of the same product charged to different customers. \n" +
                "\n" +
                "\n" +
                "Issues\n" +
                "Price discrimination has always been around. Most buyers are already used to it (even if they don't realize it fully). In enterprise markets, discrimination is rampant but all parties know & expect that.  However, its practice has always been more controversial in the consumer world than in the business world. If you are not subtle, there can be bad consequences. The Medium - Amazon's Prime Suspect - NYTimes.haarman\n" +
                "With the amount of data we are providing on the social media, there is a real risk that all companies would know exactly how much we can pay for a particular product and sneakily charge based on that. In a negotiation, when party X knows everything about the party Y, the party Y is at a significant disadvantage.\n" +
                "\n" +
                "Now, you know why social media companies are valued so much. Once the companies know about your urgency levels, income and personal preferences, they can sell the data to those companies that can then do discrimination based on that. Consumers will be paying a lot more for their products this way. \n" +
                "\n" +
                "As the old saying goes, \"if you are not paying, you are not the customer. You are the product\".\n");
    }
}