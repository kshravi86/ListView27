
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 9/7/16.
 */
public class Fifteenth3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("There was a question on how Oliver Emberton reads close to 200 books a year and that got me thinking. Can we all do that?\n" +
                "How does Oliver Emberton read such a great number of books in a significantly less amount of time?\n" +
                "\n" +
                "An average adult can read at about 300 words per minutes (WPM). Let us assume Oliver can read at 400 WPM at a minimum (I suspect he is doing much faster). That works to about 24000 words per hour. \n" +
                "\n" +
                "A lot of smart people spend I know about 3 hours reading per day. Half of this is in the form of news, tweets, emails, documents and the rest on books. That leaves about 1.5 hours of book reading/day. A lot of people could afford this during their commutes. If you are honest, you could afford this time.\n" +
                "\n" +
                "In total, you could easily do 24k * 1.5 hours = 36k words of book reading per day (this is less than a third of what most people spend on TV). Multiply that by 7 and you get 252k words/week. A typical good book is about 60k words long. That means you can read 4.2 books per week. \n" +
                "\n" +
                "A number of smart people I know have maintained this reading rate for years. Once you have picked up a reasonable familiarity with a topic (due to past reading) your reading speed goes even more as you can afford to skip most of the fluff. Even the best books contain only about 2-3 hours of original content that is not known to an average practitioner in that field. \n" +
                "Some ways to manage your reading:\n" +
                "Mix and match. Don't pick up Virginia Woolf, James Joyce, Tolstoy and Ayn Rand on the same weekend. You will die. Pick one heavy book at the max per week. Choose lighter books for the rest 3. The heavier book will usually consume your mental downtimes (showering, walking, cooking).\n" +
                "Choose movie adaptations as a precursor. I'm not smart enough to read War and Peace in one go. So, I would choose a movie adaptation to get the overall story and then dive into the details. Strategically choose movies to watch before your heavier reading - fiction or non-fiction. \n" +
                "Take a lighter book wherever you go. When you are waiting for the doctor, auto mechanic, bus or wherever, you should have your lighter book ready. It is possible to finish a book like \"Who moved my Cheese\" before the dentist calls you for a rootcanal. \n" +
                "Attempt to build a web of knowledge. When you are picking up the books for the week, attempt to build a common theme (say learning RoR or South Asia or psychology). When you read a few good books around the same topic in a shorter period of time, you tend to build a web around that topic. It might be faster to read this way, instead of reading randomly - with no connection between two books you pick up for the weekend. \n" +
                "\n" +
                "You could read 4 books a week if you really want to if you could spare 1.5 hours a day to reading quality books. As you make this into an habit, speed will automatically improve");
    }






}

