package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Thirteenth9 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Besides the reasons Uri Granta mentioned, there is an important psychological factor called anchoring. We have implicit expectations of what various things should cost [often influenced by the environment] and we match the prices we see against those anchors.\n" +
                "\n" +
                "Contrary to what some others mentioned, the differentiator is not tangibility. People pay insane amount of money to buy software and that is why software companies are so big and profitable. If people didn't spend money to buy intangible goods, Microsoft, Intuit, Oracle, & Adobe would be out of business. The key differentiator is the anchoring.\n" +
                "\n" +
                "This is the reason why we don't hesitate to pay $200 for desktop software [such as Microsoft Office or Adobe Photoshop], but would definitely scream if an iPhone/Android app asked us to pay $200 - no matter how good the app is. We are anchored to think that $200-$500 is the norm for quality PC software, because people 25 years ago paid that much [at that time good hardware would cost thousands of dollars]. Bill Gates especially helped us think that way through a strongly monopolistic hold on the market. Cloud apps and mobile apps came at a time when people thought information goods should be free and thus, we have anchors at $0.\n" +
                "\n" +
                "Why weren't the app developers able to change the anchors? Because no one had monopolistic control like Bill Gates had in the PC software industry. A monopoly has the ability to set price anchors. \n" +
                "\n" +
                "The lack of such pricing power in app markets is due to the highly competitive nature of mobile apps. Your supermarket might stock only 10 brands of chips and you might have only 3-4 spreadsheet packages to choose from for your desktop. However, mobile apps have such low barriers to entry that almost any category has a few hundred competitors all taking the price to the bottom. This is primarily due to the presence of app marketplaces that makes it very easy to discover new players and make easy comparisons between them.\n" +
                "\n" +
                "App marketplaces make it harder for anyone to form a monopoly and have pricing power. They just have to bend to the anchors set by the market owners - Apple and Google. Apple iTunes started with $0.99 pricing and thus most apps are around that level. Google started with $0 and thus most Android apps are $0.");
    }
}