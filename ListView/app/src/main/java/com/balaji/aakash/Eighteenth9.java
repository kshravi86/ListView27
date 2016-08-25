package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 9/7/16.
 */
public class Eighteenth9  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Although you can just drive down the mountain, some people would take pleasure in skiing down a mountain. Heck, I would pay to get to the top of a mountain to just get back down. \n" +
                "\n" +
                "\n" +
                "The experience of book reading is the same thing. You are not trying to get down a mountain. You are experiencing skiing. \n" +
                "\n" +
                "Even assuming that all the book contents are out there on the Internet (they are not!) it is simply a pleasure to hold a physical book and read it. \n" +
                "\n" +
                "Books allow you to create setting inside your brain that is more impressive than any movie director could build. While the outside world might be crying all sorts of everyday crap, you could be mesmerized in Victorian England or Roman Empire simply by holding this inexpensive tool. \n" +
                "\n" +
                "After years of using digital devices, including the iPad, I would prefer physical books any day.\n");
    }






}
