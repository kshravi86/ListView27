package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class Sixth2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Because, most things that we use today are too complex to be produced by a single person. I will try to condense the work of Coase and other economic thinkers who spent a lifetime researching this. If you want to get the economic theories on this, start from: Theory of the firm\n" +
                "\n" +
                "Think of a guy, Steve, having an idea for a phone. You like the idea and want the phone.  He needs a set of things before you can get your hands to it.\n" +
                "Steve needs a large amount of money (termed capital) that a single human cannot afford. A typical R&D project the size of iPhone ranges in billions of dollars in R&D expenditure. Big corporations can access an enormous amount of capital by proving the continuity and stability that an individual will be unable to show.\n" +
                "He needs a large group of people to research the idea, develop the stuff, and take it to the customer. This called labor. Most industries are organized in a way there requires a lot of specialization and a number of specialists needed to perform a job. How will you coordinated among them? If you have organized an event, you will realize that organizing labor is hard. People have their own minds, and you need to effectively utilize them while still giving them a direction. you need to setup an institution to coordinate them.\n" +
                "He needs something that people will trust before opening their wallet. You might know nothing of Coca-Cola's leadership, but when you see a bottle of Coke and you are thirsty, you know you can part your money away. This called the brand. The trust also relies on the fact that I have ways to get back at the seller if they sell something defective or shabby, even if the original owner has escaped to a cave. \n" +
                "Steve is no more. But, you still can buy an iPhone that is almost as good as the one at the time of Steve's period. This is termed continuity. Look around you. Many of the stuff you see (Coke, IBM, J&J, P&G, Unilever, GM, GE, AT&T, Goldman Sachs, JP Morgan...) have been there for nearly 5 generations.\n" +
                "An effective organization needs to formulate a sequence of steps that it will master in order to get you the best product at the cheapest price. This is like dancing. There is a sequence and the more you practice it, the more you master it. These are called the processes. Processes define the effectiveness of an organization. \n" +
                "\n" +
                "Thus, a Company = Capital + Labor + Brand + Continuity + Processes\n" +
                "\n" +
                "Companies are complex beasts that encapsulates an enormous amount complexity.\n" +
                "\n" +
                "Let's get slightly more technical.\n" +
                "\n" +
                "Internal Transaction costs\n" +
                "Let's think about the workings even more. Suppose, you break a corporation into 1000 individual pieces and each person becomes his/her own corporation. What happens? The transactions costs will explode as each of those interactions need a contract. I can't just send the financials to Joe the accountant as easily. I need to \"hire\" the accountant and agree on a fee before sending the file to him.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Diseconomies of scale\n" +
                "Now, you could be tempted to ask, if big companies are always better than smaller companies, given the fact above. The answer is no.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "As the organization size increases, you will reduce the transaction costs. But, you will also add the overhead costs. There comes a point, where the overheads become far more than the market transaction costs. At that point the company is too big that it has to shed weight. \n" +
                "\n" +
                "The curve's size varies from industry to industry. In creative sectors the size is small and you quickly hit the dis-economies of scale. That's why you see artists, web developers, architects and other creators are more likely to work as contractors or sole-proprietors rather than as massive corporations. In other sectors, such as steel or automobile production, the size is so much that an individual can never fight with a bigger corporation.");
    }

}
