package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Tenth6 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("1. The temples. Kapaleeswarar Temple (the cultural heart of Chennai. A window to understand the South Indian Hindu/Tamil culture). Visit the adjacent Giri trading agency for access to various rare books on Vedas. The best time to visit the temple is during a Hindu festival. There are also dozens other great temples (including Parthasarthy temple at Triplicane and Tiruporur Temple 20 min from the city)\n" +
                "\n" +
                "\n" +
                "2. Beaches - Chennai has a long stretch of beaches - from the ever crowded Marina to the scenic Kovalam beach with plenty of calm beaches inbetween. Each beach has its own sub culture. Marina beach is usually thronged by local visitors and kids playing Cricket or Soccer. Beasant Nagar beach is relatively upscale and is visited by couples. Kovalam and other south Chennai beaches are usually visited by rich or foreign tourists. \n" +
                "\n" +
                "\n" +
                "3. Margazhi Music festival. This is the ultimate event for Indian music, especially South Indian music. Chennaites throng to the 100s of Sabhas and music auditoriums in the period (late November to early Jan) \n" +
                "\n" +
                "\n" +
                "4. Saravana Bhavan. One of the best places for South Indian food. Though it is more commercial and diverse now, the chain still has the charm. \n" +
                "\n" +
                "  \n" +
                "5. Valluvar Kottam, Nungambakkam. One of best monuments for Tamil in the heart of Chennai. \n" +
                "\n" +
                "\n" +
                "6. Kalakshetra, Tiruvanmiyur. Home of modern Bharatnatyam (one of the most popular dance forms of India)  \n" +
                "\n" +
                "\n" +
                "7. Guindy National Park in South west Chennai, Crocodile bank in south east Chennai and Zoological Park in Vandalur in the southern suburb of Chennai http://www.tripadvisor.handmark/Attra...");
    }
}