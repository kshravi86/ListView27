package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class First7 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Geography had a big say in why China is one country, while Europe with the same size is many many countries. Here is a quick look at the topographical map of China.\n" +
                "\n" +
                "You can see that the eastern China is practically flat land stretching all the way from the north to the south for thousands of miles. There are no natural boundaries - huge mountain, seas, impassable rivers in between. Thus, it is hard to keep China split as multiple nations. Sooner or later some ambitious ruler would take one of the two key river systems - Yellow and Yangtze rivers - and use that resources to get the smaller rulers into submission. There is nowhere for the smaller rulers to run and hide. However, it was in the mountainous west where there are these natural boundaries from which the native Mongolian and Tibetan cultures grew as independent regions.\n" +
                "\n" +
                "\n" +
                "Compare the situation of eastern China to Europe. In its 2500 years of known history, less than 250 years were spent under empires that had united a significant portion of the continent. Between England and France sits the English channel. Between France and Iberian peninsula [Spain & Portugal] sits these tall Pyrenees. Thus, Spain and Portugal developed a close culture that was fairly distinct from that on the other side of Pyrenees. Italy is fairly isolated by the Alps. Greece has its own set of mountains. While the Russians have little barriers to influence Poland, Hungary or Ukraine, they have no influence on the cultures on the other side of the Alps. These tall mountains in central Europe creates a neat cleavage between the east and west.\n" +
                "\n" +
                "Only France and Germany lacked a natural border between them and that was a major source of centuries long wars including the World Wars.\n" +
                "\n" +
                "India stands somewhere in between China and Europe. Like China it has no massive feature in the middle to prevent a unification. Thus, sooner or later India was unified every few centuries. However, unlike China there is somewhat a barrier - the Vindhya range in the center that is neither as tall as Alps to create two distinct halves nor as flat as eastern China to create a nice flow of one culture. Thus, the north and south sort of developed different cultures that were still quite connected.\n" +
                "\n" +
                "Here is Africa's topography. You can see this massive flatland in the West. This was the source of major empires like of Ghana, Mali and Shonghai. The northeast is also flat and supported Egypt. There is a huge southern plateau. In a sense, Africa resembles India's geography but at a much larger scale. Also, the barriers in the middle are far bigger. The rainforests around the Congo river were practically impassable for a long time.\n" +
                "\n" +
                "When we see why some land bodies began grouping into a nation and a few others didn't, geography is oftentimes the reason.\n");
    }
}
