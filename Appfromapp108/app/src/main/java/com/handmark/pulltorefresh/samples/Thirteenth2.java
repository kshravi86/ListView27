package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Thirteenth2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("This is the second post in the New Series on Pricing. Why are things often priced with odd numbers - 0.99, 9.99, 39.95? In smart retail shops, we will hardly see an item priced at $26 or $34. In this post let us start researching into psychological pricing. \n" +
                "\n" +
                "Effects\n" +
                "1. Field experiments at MIT has shown that consumers purchased more units of the same product priced at $79 instead of $74, $39 instead of $34, $49 instead of $44. Mind blowing, isn't it?\n" +
                "\n" +
                "\n" +
                "2.  In a New Zealand study researchers found that 89% of all price endings were either \"9\" or \"5\". People very rarely ended with a 4 or 6. \n" +
                "\n" +
                "\n" +
                "Causes\n" +
                "Left digits are the most important: People process information from the left to right. When you see a $499 price below, your mind registers it as closer to $400 than $500. Although you can try to apply more conscious thought, a lot of times the price enters your mind before you can even react. The first impressions are strong.\n" +
                "\n" +
                "\n" +
                "Convey an illusion of discounting. While the left digits provide a sort of anchoring, right digits provide \"clues\" for correct pricing. When prices end in an odd way, say $39, customers tend to believe that the product is priced at a discount (maybe at $1 or $11). On the other hand, rounded numbers convey an impression that the retailer is padding the price with a big fat margin. ");
    }
}