package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Fourteenth11 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("There are plenty of research papers on the exact topic of sachet pricing vs. bottle pricing. Someone at IIMA even did a Phd on this.\n" +
                "\n" +
                "Some reasons why sachets are cheaper:\n" +
                "Sachet is actually a lot more cost effective both in distribution and packaging. Packaging a sachet just requires cheap plastic and you don't need to worry about attractive bottles or tamper-proof lids. \n" +
                "\n" +
                "Sachets generate enormous amount of volume. In fact, 95% of Indian shampoo sales are through single use sachets. What it means is that it is much easier to sell 50 sachets than 1 bottle. Quick turnover means lower costs.\n" +
                "Sachets are primarily sold through smaller retailers who again run with lower margins and overheads. Bottles are often sold through supermarkets with higher overheads.\n" +
                "Finally, sachets are often sold to poor & lower middle class or the cost conscious among the upper class who are all quite price sensitive. Bottles are sold to \"rich suckers\" who are not as price sensitive and who get hoodwinked by attractive packaging. Price Discrimination FTW. [That said, there are even some upper middle class people who buy sachets]\n" +
                "\n" +
                "References\n" +
                "Buying less, more often: an evaluation of sachet marketing strategy in an emerging market\n" +
                "Products in bulk packages cost more than in sachets?\n" +
                "Small is Beautiful, Small is Cheap, But Do the Poor Care?\n" +
                "Page on duplication.net.au\n" +
                "\n" +
                "\n" +
                "If you are more interested on pricing and some curious ways businesses take money from you, read my book: Puzzled with Pricing: Quora book on how businesses price things.");

    }
}
