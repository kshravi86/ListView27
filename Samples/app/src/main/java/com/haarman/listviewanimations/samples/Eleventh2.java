package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Eleventh2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Brahma Vivah (ideal arranged marriage). The bride, groom and everyone else in the family are in agreement. An educated groom formally proposes the marriage to the bride's father and he takes it to his daughter. No dowry or use of force is allowed. Considered the highest form of marriage in Hinduism as everyone is made happy.\n" +
                "Prajapatya Vivaha (fall in love and then follow the rules). A girl and boy meet each other, fall in love. Then they call the priest and family to ceremonially wed to each other with all the Vedic chanting and exchange of vows. Among the most encouraged types of marriages in ancient era.\n" +
                "Gandharva Vivaha (fall in love, but don't follow the ceremonies). Fall in love, have sex and start implicit marriage. This is similar to the concept of \"common-law marriage\" in the west where no explicit ceremony is needed to prove marriage. Accepted but not encouraged.\n" +
                "Arsha Vivaha (man pays gifts) In this arrangement, the groom pays a small offering (a cow) and then gets the daughter. Symbolically the groom gives a productive asset and then takes a productive member from that family.\n" +
                "Daiva Vivaha (marriage during the ceremonial Yajna). Poor families who cannot wed their daughter choose to attend a major ceremonial Yajna and offer their daughter to an able bachelor attending the event and the marriage happens in the context of a ceremonial Yajna. \n" +
                "Asura Vivaha (marriage where the bride pays dowry). Asura means a demon. A person who marries for the dowry or demands dowry is equated to an Asura. Highly discouraged.\n" +
                "Rakshasha Vivaha (forced marriage) Rakshasha means a very vile demon. A person who marries a girl after abducting and against her will is said to perform a Rakshaha vivaha. Strongly forbidden.\n" +
                "Pisacha Vivaha (intoxicated marriage). Pisacha refers to ghosts. The most strongly forbidden marriage. The girl is drugged and raped in the name of marriage. More closer to the current concept of marital rape.");
    }
}
