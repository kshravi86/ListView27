package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Eighteenth7  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Freedom at Midnight -- incredible stories behind India's partition. Must read for anyone trying to understand India. \n" +
                "\n" +
                "Gandhi's autobiography -- necessary for understanding the Mahatma and a great story on leadership.\n" +
                "The Alchemist -- This is a fabulous story of a guy following his heart. If you can read only one book in your life, this must be it.\n" +
                "Fountainhead -- The story of a creator & a rebel\n" +
                "Think and Grow Rich -- One of the all time best selling book by Napoelan Hill. It is about entrepreneurship.\n" +
                "\n" +
                "When you read a book, don't just rush through it just for claiming the vanity badge. A great book should be an immersion experience. If a book doesn't change your life even by a little bit, you have not really read the book. If you are thoroughly immersed in a great book & use your mind to think through the various ideas, you don't need a great library, but just a handful of books to change your life.");
    }






}
