package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Seventeenth4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Almost half my life was lived in villages or close to urban slums. I was alwasy surprised at how the poor were able to find their moment of fun, even when I was depressed over their lifestyle. \n" +
                "\n" +
                "\n" +
                "Even the poorest takes time to be happy and even the richest finds ways to be unhappy. Surely, there is no linear relationship between success and happiness or money & happines. But, there should be relationship. \n" +
                "\n" +
                "Here is my hypothesis:\n" +
                "\n" +
                "H\n" +
                "a\n" +
                "p\n" +
                "p\n" +
                "i\n" +
                "n\n" +
                "e\n" +
                "s\n" +
                "s\n" +
                "=\n" +
                "log\n" +
                "A\n" +
                "c\n" +
                "h\n" +
                "i\n" +
                "e\n" +
                "v\n" +
                "e\n" +
                "×\n" +
                "log\n" +
                "E\n" +
                "n\n" +
                "v\n" +
                "P\n" +
                "e\n" +
                "r\n" +
                "s\n" +
                "o\n" +
                "n\n" +
                "a\n" +
                "l\n" +
                "W\n" +
                "o\n" +
                "r\n" +
                "r\n" +
                "y\n" +
                "i\n" +
                "n\n" +
                "g\n" +
                "C\n" +
                "o\n" +
                "n\n" +
                "s\n" +
                "t\n" +
                "a\n" +
                "n\n" +
                "t\n" +
                "Happiness=log\u2061Achieve×log\u2061EnvPersonalWorryingConstant\n" +
                "\n" +
                "If everything else is the same, one's achievements or environment should improve the happiness. However, given that this is a logarithmic function, there is beyond a point where improvements in money or the environment would have little impact. This is the background for the ancient saying - \"Money can't buy happiness\". Money can buy happiness, but beyond a point, its effect is unnoticeable due to the log function. \n" +
                "\n" +
                "\n" +
                "But, the more important factor is our \"personal constant\". This is our innate ability to be happy, regardless of our surroundings. This is why even the poor can smile and laugh, even when their bank balance & surroundings are abysmal. \n" +
                "\n" +
                "If a person's worrying constant is low, he/she can be happier compared to a person with a better surrounding & success factors but higher worrying constant.\n" +
                "\n" +
                "This personal constant defines who we are and how we can manage the downturns of life. While our successes can push up our happiness, we are always weighed down by what is inside us.");
    }






}

