package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Tenth10 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Some non-obvious things that can get you into trouble in India:\n" +
                "\n" +
                "Kissing in a public place. In some jurisdictions this can get you into jail under \"public obscenity\" (a lot of our laws are stuck in the Victorian era). Although the law enforcement cuts some slack if the couple is married, if the couple is unmarried things can get really messy. Gere kiss sparks India protests\n" +
                "Touch anything of respect with your feet. If you stomp over a book, national flag, image of a deity etc, you can get into trouble. While stomping a book might invite strong frowns (people will think you are an idiot), deliberately stomping an image of a god of any religion or India's national symbols (such as the flag and the emblem) might get you arrested.\n" +
                "Physical contact with member of opposite sex. Hugging and handshakes are still frowned upon in most parts of the country among members of opposite sex. Unless the local offers to hug or handshake, don't. This is not illegal and no one goes to jail for hugging/handshakes. Just it is a custom.  On the other hand, among members of same sex hugging is pretty common. \n" +
                "Disrespecting any religion. While India is fairly tolerant of atheists and is officially secular, abusing any religion or caste is an offense. Insulting Christianity or Islam or any of the minority religions would be seen as a bigger offense. When you have 1.2 billion people of dozens of religions, such laws become essential. \n" +
                "Shorts/skirts in a place of worship. Dresses that show anything above the ankle is generally frowned upon in most places of worship and in someplaces officially banned. This applies to both sexes.");
    }
}
