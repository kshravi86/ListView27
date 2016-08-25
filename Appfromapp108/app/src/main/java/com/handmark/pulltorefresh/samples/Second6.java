package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 7/7/16.
 */
public class Second6 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("I did a whole series of posts on this last year at NalandaU: ReImagining Education.\n" +
                "\n" +
                "Here are the main motivations to get a degree. The books cover only the 4th point and even that only partially.\n" +
                "\n" +
                "    Status Symbol: \"I study at Harvard\" or \"My son goes to Stanford\".\n" +
                "    Credentials & Signaling: \"I'm smart enough to get into MIT. I'm fit for really complex tasks in a corporate environment.\" Someone really certifies you that you are smart and can withstand the hardship.\n" +
                "    Networks: \"I know X, Y and Z because I went to Yale.\"\n" +
                "    Foundation Knowledge: \"I'm getting a well rounded education because of my time at Princeton.\"\n" +
                "    Career options: \"I got to refine my Physics skills because I went to Caltech.\" Besides, universities also have strong placement offices that will market your career skills.\n" +
                "    Facilities: \"I get to do this experiment at this lab which I wouldn't have access to\"\n" +
                "    Pursuit of knowledge: \"I'm truly interested in pushing the boundaries of human understanding.\" \n" +
                "\n" +
                "If you are just using books or Coursera there are following issues:\n" +
                "\n" +
                "    Most of what is taught in a good college are not easily available online. I had 30+ full courses for my MBA and I have not found anywhere online that matches that level of depth. Most of that content is locked away in the professors heads or available through very expensive Harvard cases. Yeah, I could read \"Personal MBA\" book in a day. But, the comparison is between a lake and the water glass you have in your hand.\n" +
                "    How do you stay motivated? 90%+ of people who take up self education never finish. Colleges on the other hand are like machines that will push you in and out.\n" +
                "    Evaluation. How do you know that you have acquired sufficient knowledge? Where do you stand among your peers? This can be very hard to get in books and online education.\n" +
                "    A lot of your knowledge is from your peers. Those 30 or 40 people in your class form bonds with you that will help you professionally and personally. While Coursera has some study groups for some courses, it is not fully prevalent yet. And in books, there is nothing. \n" +
                "\n" +
                "\n" +
                "All of these are fixable issues and that is one of the things myself and many entrepreneurs in this field are trying to accomplish. But, it is not easy.\n" +
                "\n" +
                "How did we land up here?\n" +
                "The education system we have is primarily a result of industrial revolution and its need for educating the society in bulk in some specialization. But, the biggest boom came after the Second World War, when the US government wanted to reward and retool its returning soldiers. College enrollment exploded in the past 5 decades.\n" +
                "\n" +
                "Instead being one of the many options, colleges became the norm. And not going to college became a huge risk. World copies what America does. Thus, it became the world standard.\n" +
                "Thus, it is time to reimagine education. But, it is not going to be easy.\n");
    }

}
