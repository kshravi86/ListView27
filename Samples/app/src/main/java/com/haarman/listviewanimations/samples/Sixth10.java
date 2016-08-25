package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Sixth10 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("In economics, there are 3 main types of unemployment:\n" +
                "Structural unemployment - this is caused due to changes in technology, markets, customer interests etc. We don't need a lot of typists and stenos any longer, for instance. Every year millions of jobs get obsolete and we replace them with newer ones. The people who are trained only for the old ones will face unemployment until they learn another skill.\n" +
                "Frictional unemployment - These are people in the midst of switching jobs. Maybe moving to new city, changing career direction, getting back after child-bearing and most importantly finding a job after graduating.\n" +
                "Cyclical unemployment - This occurs due to changes in economy. During times of poor economy, many lose their jobs. This is the only type of unemployment that economists look to eliminate.\n" +
                "\n" +
                "You can never eliminate structural unemployment as they are a natural result of innovation. You mitigate that through better education and training. But, any move to eliminate that would result in destruction of innovation. \n" +
                "\n" +
                "You can never eliminate frictional unemployment as it is due to people's preferences. Some will need to quit jobs to be with their children and then search jobs after a while. Some get fired due to bad bosses or bad productivity. Some want to go back to school. Government doesn't control these individual preferences. \n" +
                "\n" +
                "The combination of frictional and structural employment is called the Natural rate of unemployment. Friedman and Phelps won the Nobel prize for showing that in the long run, the unemployment rate is primarily just natural rate of unemployment. \n" +
                "\n" +
                "There is another issue here. Inflation and unemployment are strongly related in the short term (Phillips curve). Because, if you have to employ even the bottom most part of the barrel, businesses need to pay a lot on an average. This can lead to a higher inflation.\n" +
                "\n" +
                "In short, not all types of unemployment are bad for the economy and not all types of unemployment can be avoided. Unemployment is a natural thing for a robust economy.");

    }
}
