package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Twelth5 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("There is a beautiful scene in the movie Gandhi that captures the emotion even if that movie scene is probably just fiction.\n" +
                "By the late 1920s, Indian Congress movement was losing momentum a bit although it became much broader in the audience it brought. The non-cooperation movement of 1920-22 ended somewhat as a failure and it was followed by years of prison for Mahatma Gandhi and others. Mahatma Gandhi came out of prison in the mid 1920s and setup his ashram near the Sabarmati river in Ahmedabad and focused a lot more on the social issues while at the same time build economic blockades through \"buy Indian\" movement.\n" +
                "\n" +
                "By 1928, the movement was starting out from its shell through the Bardoli Satyagraha that also brought Vallabhai Patel to the fore as a major national leader. The the Simon commission came to India with a promise of half-hearted reforms that didn't please the Congress. \n" +
                "\n" +
                "Gandhi wanted to create a major movement to accelerate the path towards swaraj [self rule] as the British reforms were too slow. The salt idea was a brilliant masterstroke. It was built atop the Bardoli Satyagraha's civil disobedience idea, but took to a different level:\n" +
                "\n" +
                "Salt is a very simple commodity and very easy to make. Thus, Indians from different parts of the country could easily break the laws.\n" +
                "Importance of salt is very well known in Indian culture. It is easy to unite the movement around that.\n" +
                "Heavy taxing of salt is one of the most egregious misuse of colonial power. Gandhi had a huge teachable movement from a very simple thing.\n" +
                "It would not provoke an immediate defense from British administration as they underestimated its value for Indians. This slow reaction allowed Gandhi to have a huge initial advantage.\n" +
                "That said, Gandhi wanted to give enough time to the British administration to react to Congress proposals following Simon commission fiasco. On March 2, he sent the final ultimatum. \n" +
                "\n" +
                "March is a good time in India to have mass movements.  It is neither too hot nor too cold. It is not the rainy season in any part of India. Thus, it was easier to have a mass movement around salt around that time of the year. Although everyone other than Gandhi underestimated the movement initially, it eventually became a huge success. Its iconic imagery still defines the freedom movement [and the subject of Google doodle on August 15, 2015].");
    }
}