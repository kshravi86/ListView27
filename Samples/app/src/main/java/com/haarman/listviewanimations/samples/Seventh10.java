package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Seventh10 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("This is a very tough question. Stock picking should not seen in isolation. Understand that you won't have a simple answer to this. Because, this is the profession of millions of people where people spend their entire lives trying to build the right process :). So, any summary will not do full justice. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Basics:\n" +
                "Identify your risk profile: Know what is the max you can lose. Know when you need the cash. You need to have 5+ years of time horizon when you are looking to invest in the markets. Also, you should be prepared to lose a third of the portfolio in the worst case (even the most \"secure\" of the markets have gone down 33% or more in a 5 year period). If you have a much higher risk tolerance, you can enter into more risky stocks (high risk usually means high reward).\n" +
                "Identify the industry you are most comfortable with: If you are a tech junkie, start with technology. If you are a strong chemical engineer you could start with basic materials. This helps you filter a whole bunch of stocks.\n" +
                "Realize what is alpha. Any investor dabbling in the markets is looking for alpha - the extra return he/she can get above the market. To get the alpha, you need to identify the future profits of a company far sooner than anyone else. \n" +
                "\n" +
                "Ultimately, it comes down to predicting the future of a company as precisely as possible. There are multiple styles to pick up stocks. The two broad approaches are fundamental investing and technical investing. \n" +
                "\n" +
                "1. Fundamental Analysis:\n" +
                "This is how star investors such as Warren Buffett operate. This is best suited for investors who look to wait 1-2 years in an investment. If you are not the patient type, this might not work the best for you.  \n" +
                "\n" +
                "You really understand the financials of the company, broader business trends and try to really understand if the long term prospects of the company is good & whether the company is valued right. There are two variants of fundamental analysis.  \n" +
                "\n" +
                "1.1 Top-down analysis:\n" +
                "In this style, you first look at the global economic trends. You watch the macroeconomic indicators (currency movements, fiscal deficits, trade flows) and then drill into the specific market. If you had picked technology as your strong point, you want to understand how these macroeconomic indicators affect the various companies in this. See which company is positioned the best for the particular indicator (such as the weakening rupee or US Federal Reserve's quantitative easing). \n" +
                "\n" +
                "The best return is often found in companies that is not covered in mainstream media. If you can spend a lot of understanding that player who are not talked about in the mainstream media, you have the best position to make returns.\n" +
                "\n" +
                "Summary: You look at the broad market trends that will push up the profits of a particular company. You figure out the company that is best positioned to capitalize a broad trend. \n" +
                "\n" +
                "1.2 Bottom-up analysis\n" +
                "This is a lot tougher and hence can be quite rewarding if you do it right. Here you pick up a specific company (based on a screening software) and then analyze the heck out of it. You want to know the leaders, the businesses, the margins, the competitors and challenges. If you have a business background, this approach is best suited. \n" +
                "\n" +
                "The factors you look into include:\n" +
                "Price to earnings ratio: This is an indicator of how much returns you are getting for the investment you are putting. You can just invert the P/E ratio to get your annual \"interest\" rate. If you are investing in a company with a P/E of 20, your annual returns are just 1/20 or 5% (assuming the company doesn't grow).\n" +
                "Earnings growth: Good companies grow. You want to understand how fast is this company is growth into the future. This is where all magic lies as no one in the whole world has the right answer to this. You first look into its past earnings growth. \n" +
                "Leadership: Are the leaders good? Are they trustworthy? How long have they been with the company? Whether it is a small company or big, you always want to invest in the leaders. \n" +
                "Clues to identify the future: Other clues you can look into for identifying future earnings are \"Free Cashflow\", product lineup and margin growth.\n" +
                "\n" +
                "2. Technical Analysis\n" +
                "Here you don't care about the company at all. The traders just reduce a company into charts and identify which stock is having the momentum. Their reasoning is that there are plenty who do fundamental investing and you don't want to waste any more time with further analysis.\n" +
                "\n" +
                "The key to these people's analyses is looking for \"smart money\" - the people in the know. Smart money always leads. Thus, technical analysts follow the smart money and use a wide range of funny looking charts to get identify the smart money. They also look for \"dumb money\" to take contrarian approaches. \n" +
                "\n" +
                "Technical analysts are usually trend followers. They just care about the current stock trend.\n" +
                "\n" +
                "3 Social Analysis\n" +
                "This is an evolving field and uses the \"wisdom of the crowds to identify the future market trends\". It doesn't have an adoption anywhere closer to the other two schools. \n" +
                "\n" +
                "Here you look at the stocks that are most talked about in social channels and identify the ones that have the strongest \"Sentiment\" going for it. You can also use social channels to identify if people \"love\" or \"hate\" the brand, the product & the company.");
    }
}
