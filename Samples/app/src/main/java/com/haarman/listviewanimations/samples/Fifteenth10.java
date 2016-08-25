package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Fifteenth10 extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.eighteenth_1);

     TextView textView = (TextView) findViewById(R.id.textView);
     textView.setMovementMethod(new ScrollingMovementMethod());
     textView.setText("During teenage you want to open up your mind to the world.  Great books help in activating your different faculties. Instead of a conventional reading list, I'm putting these books in pairs to help you get multiple perspectives on the same idea. It is all about gaining perspectives, not about storing a large number of words. \n" +
             "\n" +
             "Fountainhead & Animal Farm: To provide you a fantastic perspective of how world chains achievers. (You might want to skip Atlas Shrugged & 1984 until you are past teens.)\n" +
             "The Alchemist & Siddhartha: Paulo Coelho and Herman Hesse provide you  stunning stories that can be mesmerizing. It is all about following your heart. \n" +
             "20,000 leagues under the sea & Around the world in 80 days: Both of these provide brilliant science fiction. Although many of the predictions are already a reality, Jules Verne is a must read for anyone with a curious mind. \n" +
             "A Passage to India & To kill a mockingbird : A good way to understand the British Raj and racism. Mockingbird provides an amazing story about justice and indignation.\n" +
             "War and Peace & Anna Karennina. If you are a strong reader, Tolstoy could be a great one. But, Russian novels can be quite hard on young teens if you are not used to the explosion of characters. \n" +
             "Oliver Twist & David Copperfield: Most of Charles Dickens is good for this period. It helps you understand the time of the Industrial Revolution.\n" +
             "Don Quixote & Gullivers Travels: Understand the medieval times and the birth of Renaissance with this queer story.\n" +
             "Story of my experiments with Truth & Freedom at Midnight: Gandhi's autobiography is a fascinating read on the formation of one of the greatest men. Freedom provides a great insight into India's partition.\n" +
             "Asterix & Tintin: If you think these are for kids, you need to read. Asterix can be read even if you are late 80s. Stunning perspective of 20th century Europe. \n" +
             "Rich dad, Poor dad & Think and Grow rich: These two provide insights into entrepreneurship and managing your money. \n" +
             "\n" +
             "Don't read all the good books at once. Periodically, read lesser quality popular books (such as those from Grisham, Crichton) help you appreciate classical works even better. \n" +
             "\n" +
             "Remember that you are in no contest to read the max number of books. A book should be like a map that takes you on an adventure. The adventure happens in your mind and the book is merely a map/guide. The more you immerse in the adventure, the better the value you get.\n");

 }
}
