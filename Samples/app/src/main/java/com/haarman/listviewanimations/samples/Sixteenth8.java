package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Sixteenth8 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Background: The anti-Hindi agitations in Tamil Nadu (1937-40 and 1965) prevented Hindi from becoming the national language of India. The agitations indirectly led to the acceptance of other languages as the official languages of the individual states. \n" +
                "\n" +
                "\n" +
                "Long term Effects\n" +
                "English protected: India's Constitution stipulated the use of English only for the first 15 years (until 1965). English was designated as a transition language. But for the Tamils, English would have ceased to be an official language of India after 1965 and would have curtailed our options in the global market. The agitations kept English relevant in India.\n" +
                "End of TN Congress: The agitation was used by the Dravidian parties to create a following and the protests weakened the Congress in TN. In the elections after the 1965 agitations, Congress lost power and has been declining since then. To this day, India's national parties are unable to impact the state in a big way. On the flip side, it has made almost impossible for a Tamil to become a Prime Minister. \n" +
                "\n" +
                "A controversial cartoon depicting the anti-Hindi agitation\n" +
                "Multicultural democracy: The absence of a national language prevented the integration of different states into a common national ethos & identity. However, it strengthened the multicultural tolerance in India.\n" +
                "Protection of regional arts & diversity: While the film industries and other cultural elements of states that accepted Hindi got diminished, in states that didn't accept Hindi the regional arts flourished. Thus, Tamil Nadu and Andhra Pradesh have the biggest movie industries in India after Bollywood.\n" +
                "Hampered national movement of Tamils: While the English acceptance helped Indians get a wider range of service jobs, it has also made the life of Tamils, who want to migrate to the rest of India, hard.\n" +
                "Withdrawal of Brahmins from Tamil politics: The Dravidian parties blamed Tamil Brahmins for bringing Hindi, despite the fact that many of Brahmin leaders such as Radhakrishnan opposing the Hindi imposition. Since the anti-Hindi agitations, TamBrams have withdrawn from most political activities in Tamil Nadu.\n");
    }






}
