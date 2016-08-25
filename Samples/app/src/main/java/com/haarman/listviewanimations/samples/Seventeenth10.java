package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Seventeenth10 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("\n" +
                "A lot of times when we write answers, there is a natural expectation of a final product ready to consume. \n" +
                "\n" +
                "Expecting Straight Answers\n" +
                "Q: What is the population of India?\n" +
                "A: 1.32 billion. \n" +
                "\n" +
                "However, these \"ready made\" answers are also the most useless. A search engine could do a much much better job than a human for these type of questions. We should be especially be aware that in complex questions, there is not just no simple answer, a simple looking answer can also be the most misleading. \n" +
                "\n" +
                "A good answer should lead people on a quest. There is no destination here, but a path that takes to forever more understanding of things. A good answer should lead you to question things more and the role of an answerer is to make you to question the right things.\n" +
                "\n" +
                " And the answers should emerge - not be given. Only when the answer emerges in the mind of the asker, can the knowledge be permanent. \n" +
                "\n" +
                "Expecting Mere Facts\n" +
                "Answers with pure facts and questions that ask for pure facts are also the most boring. Again, things become like database queries. Relying on a human to give you the size of earth is a waste of everyone's resources.\n" +
                "\n" +
                "Answers to most real life problems are built by a series of assumptions, hypothesis and deductions. These are built on top of facts, observations and judgments. In other words, a good answer doesn't provide mere facts; it provides deductions derived out of the facts. And there will always be more than one way to deduce things.\n" +
                "\n" +
                "Question More\n" +
                "When we stop questioning things and assume we have the answers or even that there are answers to everything, we stop being an intelligent species. \n" +
                "\n" +
                "We don't have answers to most questions. We are always on a constant quest to understand the truth. And there can never be a comprehensive answer to any question. Every good answer fills one small gap in knowledge in a never-ending quest.\n" +
                "\n" +
                "Quora should be about that quest and not become a mere database or search engine.");

    }
}
