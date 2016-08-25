package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Sixth11 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Roles in the society\n" +
                "A private corporation worries about making money, while the government (should) worry about making sure they make money the right way and the society benefits from their actions. These two objectives are often in conflict and they are on opposite sides of a tug of war. By maintaining the right level of tension at the rope, the society benefits. If one of these actors disappear (either the government or the private corporations) or get too powerful, the string falls apart and the checks & balances get destroyed. By maintaining the string at the right level of tension, the symphony of prosperity can be heard. \n" +
                "\n" +
                "The string of prosperity\n" +
                "\n" +
                "Incentives\n" +
                "When a private company is structured around the single purpose of making money the smartest people in the society such as Larry Page, Bill Gates, Jeff Bezos can use their best to create amazingly valuable products to the customers. The more valuable company they create, better it is for their life. These guys are all billionaires now. Now, imagine asking your government bureaucrat to design the next search engine, operating system or a retail website. The government guy is not going to get filthy rich by creating an awesome product. Without that incentive, you are neither going to attract the smartest minds for the right role nor build something awesome. \n" +
                "\n" +
                "Competition\n" +
                "Decades ago, Indian government controlled most of the national economy. The first time we got phone line in our home from the government owned BSNL, it took 3 years from date of application to getting the dialtone at our home. Service was awful and unpredictable. Any maintenance request took bribery to get satisfied. \n" +
                "\n" +
                "How could they afford to be that pathetic? It was because there was no competition. If I hated the BSNL, I had to put up with it as I had no other alternative. When a government controls the production, competition vanishes. When competition vanishes, consumers are taken for a ride with super-expensive, poor-quality stuff. For my first flight in 1993, my dad paid Rs. 4000 (Chennai - Delhi). If you adjust for inflation that was 10 times more expensive what I pay to private airlines in India now. \n" +
                "\n" +
                "Competition forces organizations to stand out in providing value. \n" +
                "\n" +
                "Corruption\n" +
                "In a government controlled economy, corruption rules. As I mentioned above, even to get basic things done you often have to bribe the local official. In India, people used to pay huge sums to officials to get telephone lines, scooters or foreign currency - as there is no alternative to the government. Getting the bribe is the primary incentive for the official to consider looking at your file. These officials have to worry about enforcement much less than a private company. What are the odds that the government would act strong against one of their own? In practice, when private organizations disappear, corruption becomes rife. On the flip side, when the government disappears the same happens (corruption rules). It takes two to tango. \n" +
                "\n" +
                "Governments should embrace the need for corporations & promote healthy rivalry & tension\n" +
                "\n" +
                "Information\n" +
                "One of the most under-appreciated things is information. How much should you produce, what should you produce and what are the value of things? It is impossible to answer these without involving a distributed information managing mechanism like the market. \n" +
                "\n" +
                "Government managers in the Soviet Union and other socialist nations often fumbled on policies without the right information. On the other hand, a local shopkeeper has a keener eye on the demand & supply as he is reacting to what consumers to do on neighboring shops.\n" +
                "\n" +
                "Conclusion\n" +
                "On a macro scale, I see the enterprises as developers (make awesome products) and governments as testers (making sure the products are not dangerous & satisfy the social needs). When both of them do their job, we get amazing innovations that satisfy someone's needs.");

    }
}
