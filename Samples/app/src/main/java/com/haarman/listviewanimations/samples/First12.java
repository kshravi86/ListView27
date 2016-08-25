package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class First12 extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("This question follows the format: \"Why didn't X conquer Y?\" - something that is asked far too much on Quora. \n" +
                "\n" +
                "In general, powers conquered lands only when they both had a need and the ability. The need includes resources, trade routes and bringing ethnicities.\n" +
                "\n" +
                "Ruling is not a free operation. It is fairly costly given that you need to convince some of your best people to move to the conquered territories as rulers and administrators. If the conquered territory is lawless, you need to also supply a fair number of your people for policing and public works. Again, you need to provide a large army to both conquer as well as later defend the territory from other seekers. \n" +
                "\n" +
                "Cost of ruling over a territory is vastly reduced when there are existing rulers whom you can subordinate. For instance, in India Britain tried keeping existing rulers intact wherever they submitted. Cost of ruling is also reduced when:\n" +
                "The terrain is familiar & easily accessible\n" +
                "The people are familiar and/or speak close languages.\n" +
                "\n" +
                "A region is conquered/ruled only when the tradeoff (ruling cost vs rewards) makes sense. For most of the outsiders including the Arab Caliphates, Subsaharan Africa was a region with unfavorable tradeoff. Due to:\n" +
                "\n" +
                "Inaccessible terrain. Sahara is a barrier and so are the various rainforests and deserts all across Africa. It was not until the modern ages was the coasts of Africa fully explored. For instance, even when the legends of Mali were around Europe, most Europeans could not reach that.\n" +
                "Unfamiliar terrain with deep tropical jungles. For both the Middle Easterners and Europeans this was very unfamiliar and unpleasant.\n" +
                "There were not many established states in most of the continent. This meant that the conqueror has to build a lot of the institutional infrastructure.\n" +
                "There were a plethora of languages that was not related to the languages outside Africa.\n" +
                "In summary, a territory is ruled by an outside power only when there the benefits from the territory is far more than the cost of ruling. ");
    }




}
