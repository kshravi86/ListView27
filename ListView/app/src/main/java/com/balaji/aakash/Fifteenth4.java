
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 9/7/16.
 */
public class Fifteenth4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Nothing is \"required\". But, fiction opens up much more doors in our brain. It makes concepts easier to understand and makes them very sticky.\n" +
                "\n" +
                "Improves our social skills.\n" +
                "Imagine you are communicating with a toddler. What is the best way to make a bond? Telling interesting stories. Reading good fiction helps us understand others better and make better bonds. It enriches our network and helps us have interesting short conversations in social events. \n" +
                "\n" +
                "Here are some findings on how novels help the social side of our brain.\n" +
                "For Better Social Skills, Scientists Recommend a Little Chekhov\n" +
                "\n" +
                "Helps improve the knowledge of surroundings\n" +
                "In 1957, when US created the world's first nuclear submarine it named it the Nautilus. That detail might not mean nothing to you, but if you have read Jules Verne's Twenty thousand leagues under the sea you can understand why they named it that way. Hamlet and other Shakespeare works will be very casually used even in very mature non-fiction works in the English speaking world. In India, Ramayana and Mahabharata will be used extensively. \n" +
                "\n" +
                "The popular culture around us is rich with characters and events from fiction. By understanding the underlying fiction it becomes a little easy to understand the world.\n" +
                "\n" +
                "It helps improve our imagination\n" +
                "Good fiction makes us imagine things. We tend to think of new worlds and this fires different parts of the brain.\n" +
                "Reading Literature Makes Us Smarter and Nicer\n" +
                "\n" +
                "The information is quite sticky\n" +
                "We don't know very many of non-fiction works from a few centuries ago. However, think of Ramayana. Even today, Indians are able to very well related to it. Stories are about the most awesome ways to communicate. It is very easy to remember. For instance, it is far more easy to remember Mahabharata than the 100+ non-fiction works needed to explain the same level of concepts. \n" +
                "\n" +
                "In business world, it is a rage these days to communicate through story telling. I work in a very \"boring\" field of security and legal compliance, dealing with the world's largest corporations. However, I make my product concepts into stories and send it out as cartoon strips. Customers are much more receptive to these stories & are more inclined to comment and respond to ideas. Reading fiction, helps us create better story lines.\n" +
                "\n" +
                "Creating Sticky Ideas Through Storytelling\n" +
                "The value of good fiction is highly understated. Read fiction as well as non-fiction. Don't assume novels as something for kids or non-serious people. Reading good, meaningful fiction is greatly helpful for life.");
    }






}

