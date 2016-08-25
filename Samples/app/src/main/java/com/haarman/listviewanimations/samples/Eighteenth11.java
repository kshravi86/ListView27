package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Eighteenth11 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Start reading more - especially long form writing\n" +
                "A lot of us are good at skimming content, but are slowly losing skills to read in the long form (10 pages or more). Our shrinking attention spans force us to read a lot of one-page content, instead of reading a few 100 page content.\n" +
                "\n" +
                "Imagine digging the ground to find underground water. What will you get after 1cm of digging? Nothing. How about 1 feet? Still nothing. Once you dig 10 feet or more at the right spot, you might get lucky. \n" +
                "\n" +
                "Books are the same way. Reading 1-2 pages of newspaper content is usually insufficient for finding that hidden underground spring. However, spending a good amount of time to dig into a good book can be rewarding." +
                "Start writing more - especially long form writing\n" +
                "When I started on Quora, most of my answers were 2-3 lines long. Expectedly, the results were poor. The first time I wrote a page of good content, I got 100+ votes (a great thing at that time). Writing long is quite hard, especially if you want to retain user's interest and keep your fluff to a minimum. I'm still an average writer, but I'm better than where I was 3 years ago. \n" +
                "\n" +
                "Take any topic and write 1-2 page of stuff. There is a reason why we were forced to write essays in school. Those are great exercises. Do that every day. Try to rewrite a newspaper article from your perspective. Try to summarize a book you have read. Try to explain your city to an outsider. Try to describe a phenomenon you found curious." +
                "Make it a habit\n" +
                "Write something every day. Can you expect you grow muscles after your first day at the gym? No. But, after 6 months of regular effort, likely.  Write something every single day. Forget the  grammar; forget the structure; forget the vocabulary; forget the quality. Write. Let things flow freely. Even if it is total gibberish and incoherent, it is fine." +
                "Go back and rewrite\n" +
                "Did you find 10 grammatical errors in this answer? You bet. However, the count was nearly 100, the first time I wrote this. I know I'm not that good and thus constantly revisit my answers to edit. On an average, I edit my answers 15 times after I publish. Good authors constantly refine and rewrite. Go back to the 2 page essay you wrote yesterday and start rewriting. This time attempt to add structure. Strengthen a few points with references and your personal experiences. Cut out the sentences that don't contribute to the flow. Split long paragraphs and merge short paragraphs."
        );

    }
}
