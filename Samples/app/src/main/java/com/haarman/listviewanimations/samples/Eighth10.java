package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Eighth10 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("European theater and Pacific theater were very different wars. Among the Allies, the USSR didn't even declare a war on Japan until the US dropped the nuclear bomb. France was not there. Britain offered only a feeble resistance (only major success was in defending India). Thus, it was all a US vs. Japan show in the Pacific. It primarily involved the Navy, primarily involved islands and very little POWs involved.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Europe was a different war. Germany was surrounded by Russian and Anglo-American troops. It was far more complex and primarily involved armies. \n" +
                "\n" +
                "Japan's campaigns were independent of Europe's and it had no ideology bond with any of the European powers. It warred Russia in 1904. Then 10 years later, it fought along with Russians & took over German territories in East Asia after WW-I. Then 20 years later, it aligned with the same Germans to fight the world. \n" +
                "\n" +
                "Japan invaded Mongolia and China before Hitler invaded Poland (starting the WW-II). Thus, Japan would have been in war in the Pacific regardless of European events. In fact, had Hitler coordinated with Japan in attacking the Soviet Union and utilized the elite Japanese troops, the results of the Soviet campaign and the entire war could have been different.\n" +
                "\n" +
                "However, Japan was greatly benefited by European distraction. It quickly absorbed French Indo China and took over parts of British empire (such as Malaysia and Burma).");
    }

}
