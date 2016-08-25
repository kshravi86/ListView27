package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Fifth10 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Without the monsoons, India is almost a desert. Thus, the perennial rivers that flows throughout the year like Ganga, Yamuna, Brahmaputra and Sindhu (Indus) are given a high importance in the culture. \n" +
                "\n" +
                "Indians have traditionally celebrated all the rivers. Rising from a river valley civilization, it was but natural to celebrate the rivers this way. Given that a river water is a running one, it was typically the cleanest alternative that the ancient people got. You can see Hindus celebrating rivers as holy, across India.\n" +
                "\n" +
                "Ganga gets the highest attention, because it passes through the center of the densest plains in India. These plains formed the core of the Indian civilization with Ganga at the center and thus Ganga got a bigger reputation.\n" +
                "\n" +
                "Medicinal qualities\n" +
                "Throughout history, people found many medicinal qualities in the Ganga water.  There were many research reports that Ganga water possesses the antibacterial properties through Bacteriophage and these were first discovered in the waters of Ganga Bacteriophage prehistory.\n" +
                "\n" +
                "This 2009 paper claims that:\n" +
                "These findings suggest that Ganga water has certain novel antimicrobial attributes, besides its remarkable fluidity, which may provide a much-needed basis for the development of new antimicrobial compounds.\n" +
                "Self-purificatory Ganga water facilitates dea... [Curr Microbiol. 2009]\n" +
                "\n" +
                "In this 1993 paper, authors claim that:\n" +
                "Dissolved oxygen (DO) levels are are fairly high, indicating a reasonable self-purifying capability for the River Ganga.\n" +
                "Water quality of the River Ganga (The Ganges) and some of its physico-chemical properties\n" +
                "\n" +
                "More works:\n" +
                "Mystery Factor Gives Ganges a Clean Reputation\n" +
                "Polluted Ganga still has medicinal qualities\n" +
                "\n" +
                "However,\n" +
                "These days, this water is quite abused substantially - with detergents, industrial effluents and sewage. The river's medicinal qualities cannot handle these things and are thus quite harmful for human consumption. Like the major rivers around the world, we have substantially polluted the river and even the great properties of Ganga cannot take the infinite amount of abuse we are putting her through.");
    }
}
