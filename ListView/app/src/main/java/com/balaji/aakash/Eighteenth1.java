package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Eighteenth1 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("We brush in the morning and throughout the day we accumulate enormous amount of bad stuff in the teeth. Thus, before we start a new day we brush again and get the teeth back to its original cleanliness. We brush our teeth, wash our clothes, apply soap on the body and shampoo on the hair. Because real world is dirty and we don't want to accumulate the dirt.\n" +
                "\n" +
                "What do we do to clean our mind of everyday crap - the rumors, stupidities, fads, reality shows, news and all other dirt we attract from our surrounding world? Periodic exposure to good books washes off the ignorance and gets us back to the state of knowledge.\n" +
                "\n" +
                "Btw.. if you are losing most of the core content you read in the books you could do to improve reading skills:\n" +
                "\n" +
                "    Look to take notes by keeping a handy journal. It is crazy that even after spending most of my schooling taking notes, I still suck at it. This is one skill most of us could improve.\n" +
                "    While/After reading a good book, spend a lot of time thinking about the book. For every hour of reading, spend two hours of thinking & mulling on the ideas. I see too many people impatiently trying to finish a book, instead of spending enough time on digesting it. Start connecting the book's ideas with other ideas you have learnt. Our brain works primarily on connections - try to connect the book's ideas with as much of the existing stuff you have. Better the connections, better is the memory recall.\n" +
                "    Doing often strengthens the learning & recall. This is why we were brought a lot of play things while we were in kindergarten. Physical world helps us connect with book's ideas more. For instance, if you visit the locations mentioned in your favorite book, you will remember the book even better for years to come. For non-fiction, often try to implement some of the ideas. For instance, if you are spending too much time reading about business, try spending some time implementing some of the ideas in a pet project.\n" +
                "    Try reading similar books. Once you have finished reading a good book, try to find other works that somewhat overlaps. For instance, after reading \"War and Peace\" you could read something about Napoleon or history of Russia. This helps you create dense networks in your brain instead of shallow ones.");
    }
}
