package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Eighteenth2  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Picking a good newspaper is one of the most important starting points. Since you are in India, I would suggest you to start with The Hindu. Although it has its well known political biases, the content is of the highest quality. Wherever you are, find a newspaper that is worth reading. No point wasting time with trash.\n" +
                "\n" +
                "Pick a physical newspaper. Plenty of studies indicate a possible advantage of the physical format. Pick your main newspaper in the physical form and you can always read the rest on a tablet or PC. The Reading Brain in the Digital Age: The Science of Paper versus Screens \n" +
                "\n" +
                "\n" +
                "Setup a routine/ritual. Any habit requires a rhythm. For me, waiting for my newspaperman right after brushing is my daily routine. Then I spend the next 45 min before between the time after brushing & before showering with the paper. Many erudite families sip their morning tea or coffee with their newspapers. \n" +
                "\n" +
                "Make it a group activity. Anything that is done alone can get boring. In my childhood, I used to read with my dad. After marriage, my wife and I devour every page of the Wall Street Journal or whatever other newspaper we subscribe. Find a partner - sibling, parent, spouse, friend - who also enjoys the broadsheet in their hands. \n" +
                "\n" +
                "Start from your most favorite sections. I used to start from the sports columns, during most of my school time. Do whatever to keep your interest. Every day try to read at least one news story that is not from your favorite section. Eventually you will build the tolerance to read stuff that is not your core strength.\n" +
                "\n" +
                "\n" +
                "Pay attention to the stories. Most major newspapers have special features that mostly focus on stories. The stories might not be newsworthy otherwise, but still entertaining. If you are reading Hindu, you can find these in the Open Page. These are more light weight topics presented in a much more engaging form. The longer you spend on these pages, the stronger your reading habit will become. \n" +
                "\n" +
                "Write a summary. Writing is one of the best ways to keep the habit of reading. Pick your most favorite news story of the day and summarize that on your blog here on Quora. As you start writing, you will develop a deeper craving for reading. You will develop a greater appreciation for someone who creates those stories. You will retain it longer");
    }






}
