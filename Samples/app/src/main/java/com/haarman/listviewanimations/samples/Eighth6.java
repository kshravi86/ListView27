package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 8/7/16.
 */
public class Eighth6 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("It is unlikely that SS and Hitler's intelligence agencies would not have run background checks on a key ally. They would even know at what time he eats and sleeps. \n" +
                "\n" +
                "Hitler's racist propaganda was not white vs. non-white. Many of whom he went after, were whites too (Poles, Slavs). He was fixated on the idea of Aryans vs. rest of the world. Hitler considered Indians as Aryans, although not superior as the \"German Aryans\". In fact, those bastards took a lot of Hindu symbols (the Sanskrit term \"Arya\", the Swastika of Hinduism) and brought bad name to it. Nazi leaders often carried Bhagvad Gita (did the German translation of that time completely subvert the holy book?). \n" +
                "\n" +
                "In short, I don't think a Hindu marrying a white would be in top of Hitler's cruel mind. Also, Bose openly attacked Hitler's racial policies and his war with Russia. That kind of bluntness & strength impressed Hitler. No one else could do that and still meet face with the Fuhrer. Subhas Chandra Bose In Nazi Germany: Politics, Intelligence, and Propaganda");
    }
}
