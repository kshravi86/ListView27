package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Eighteenth12 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Write more detailed answers: I looked at some of the OP's answers and they were too short. A lot of one-liners in there. While some one-liners can get really popular, it is often a crapshoot. Even when they get upvotes, short answers don't result in follower boost. A typical Quora user is not just looking for a tongue-in-cheek short post.\n" +
                "Give the reasoning behind: Most Quorans don't want just an idea. They want the reasoning behind an idea. During the first couple of months here, I wrote a lot of short answers (mostly getting 1-10 votes). Then I realized the difference and since then started spending more time with the answers. While you don't want to blabber on and on, you need to provide enough perspectives & details to get upvotes.\n" +
                "Spend more time networking: In any network, people will treat newcomers with caution. They will be more reluctant to upvote or follow a newcomer. You need to spend time building relationships. Write good answers. Provide thoughtful comment on other's answers. Engage in conversations. I'm bad at networking, but many others have had successes in this and that helps in upvotes.\n" +
                "Make the content more readable: I still see a lot of answers that are dozens of long paragraphs written in a monotonous tone with nothing but plain text. Although I'm a voracious reader, I often skip those answers. Write short paragraphs. Highlight the key ideas in bold. Punctuate important ideas with bullet points. Insert relevant pictures every few paragraphs. Do everything possible to break the monotony of plain text. Imagine you are writing for a magazine. You will need pictures, bolded text & better formatting put together in a cohesive way. The magazine article below helps a reader quickly glance the important elements even from a distance.\n" +
                "\n" +
                "Recognize other answers: Graeme Shimmin posted an excellent answer ahead of me for this question. Since it is well-upvoted, I spent some time reading it to reduce the duplication.  \n" +
                "Add relevant tags to the question: A lot of times I would realize that the question I'm answering is not tagged correctly. Some of tags are too niche. Where possible, I would add more relevant tags to increase the distribution of the question. If the question gets better distribution to the right audience, so will your answer. \n" +
                "Avoid survey questions for the most part*: \"Who here likes a donkey?\" - \"I do.\" There are plenty of such questions here and they attract a lot of newbies. The problem is that there are way too many undifferentiated answers for those questions. Also other posters would often downvote your answer to keep theirs at the top. However, if you can draw your own experience & provide an insight from your life, do answer the survey question. Such answers tend to be really good. \n" +
                "Make it personal and then connect with statistics: An ideal Quora answer has a strong personal story that keeps the audience connected while providing detailed information to connect your experience with the world around you. If you can even do one of the above, you can get 1000+ upvotes pretty easily. \n" +
                "\n" +
                "All said, there is also an element of luck & timing. Some of my better written answers have gotten lower upvotes than some of my not-so-well-written answers. In those cases, you shrug and move on. Life is not always fair.");

    }
}
