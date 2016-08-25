package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 7/7/16.
 */
public class Third3 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("1. Marketing is not mere selling. Marketing is a series of activities that connects a product with its customers. The activities include:\n" +
                "\n" +
                "    Identifying who the customer is and the various segments of the customers\n" +
                "    Identifying the needs of the customer to help build the right product\n" +
                "    Deciding on the pricing strategy\n" +
                "    Setting up the distribution channels to act as the bridge with the customer\n" +
                "    Creating the communication strategy that conveys the values of the product to the customer\n" +
                "\n" +
                "\n" +
                "2. Companies don't sell products or services. They sell benefits. It is very critical that marketers understand the difference and communicate them appropriately. For instance, a restaurant that thinks it is in the business of selling food, is likely to commoditize itself. Restaurants sell experience. Banks sell safety. Car companies sell convenient transportation.\n" +
                "\n" +
                "\n" +
                "3. The fundamental goal of the marketing department is to prevent a product from getting commoditized. Commodity businesses don't need any marketing and they don't have any major advantage than other companies selling the same product. For instance, most customers are unlikely to see much difference in different brands of milk, vegetable oil or sugar. To get out of commodity trap, a company can do the following:\n" +
                "\n" +
                "    Make it convenient to purchase. For instance, a gas station near a freeway exit could get more customers than then one in the interior.\n" +
                "    Add an element of trust and customer relationship. For instance, a bank that creates an aura of trust can get far more customers than the one in a shady location.\n" +
                "    Make it available at the right time. A bottle of water sold in a hot beach is likely to earn more margin than then one sold in a convenience store.\n" +
                "    Create a constant differentiation. Until Apple entered the market, smartphone market resembled a commodity where everyone was producing the same functionality. Then iPhone came.\n" +
                "\n" +
                "Thus, the four rules to avoid commodity trap are: convenience, trust, availability and differentiation. With this, any product can achieve an \"unfair\" advantage.\n" +
                "\n" +
                "\n" +
                "4. Traditionally marketing was seen as a product oriented approach. Thus, marketers used the Classic 7 Ps: Product, Placement, Price, Promotion, Physical Space, People, Process -- these define how a product is connected with the customer. Think of a traditional marketing strategy and you will likely find emphasis on these 7 elements.\n" +
                "\n" +
                "\n" +
                "5. Since 1990s, the 7Ps are giving way to 4Cs where the shift is made from product to the customer. Modern 4 Cs: Customer, Cost, Communication and Convenience. The emphasis is on communicating the right stuff to the right customer, in a convenient and cost efficient way.\n" +
                "\n" +
                "6. Branding - One of the critical parts of marketing is creating the branding elements that directly communicate the product to the customer. Think of \"Just Do It\" and you will immediately associate with a quality athletic shoe. Branding implicitly conveys trust and quality assurance, and can help a product achieve sustainable profits. For instance, two major companies are able to sell sugar water with soda at a sustained advantaged through an elaborate brand management.");
    }

}
