package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Sixteenth1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Indus is a major river system in South Asia and the only water source for Pakistan and North-western India. The sharing of its water is the second biggest issue in India-Pakistan relationship (after Kashmir). As water gets increasingly scarce in South Asia, this issue is getting more important than ever.\n" +
                "\n" +
                "India is the upstream country and has built a few dams along the rivers. Pakistan feels threatened by some of the dams and disputed this. This is a highly technical issue whose details are debated before international organizations. Some of the disputes such as Baglihar Dam and Kishanganga have been in India's favor, but the key issues are how much India is allowed to draw the water down. The devil is in the details and I'm not an expert in either irrigation engineering or International law to see if India is violating the provisions or not.\n" +
                "\n" +
                "\n" +
                "Brief Background:\n" +
                "There are 6 main rivers that flow from India to Pakistan. These 6 rivers form the Indus Water System that gave origin to Indian civilization & her name. Over 300 million people depend on these waters in a water scarce desert. Since India's partition in 1947, both water-short countries were fighting for the scarce water resource.  \n" +
                "\n" +
                "In 1960, World Bank brokered a water sharing agreement between these warring nations: Indus Waters Treaty\n" +
                "\n" +
                "The three top rivers in map below - Indus, Jhelum and Chenab were awarded to Pakistan. India is allowed to construct projects that doesn't store water (called the \"run of the river\" hydro electric projects).\n" +
                "The three bottom rivers in the map - Sutlej, Beas and Ravi were completely awarded to India.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Thorny Issues\n" +
                "3 rivers to India and 3 to Pakistan should sound fair enough. But, it has also robbed the state of Jammu & Kashmir of its key water resources (all the 3 rivers allocated to Pakistan flow through this state). It was essentially robbing Jammu & Kashmir to help Punjab & Rajasthan (the bottom 3 rivers benefit these 2 states). The water abundant state is facing a water shortage. India Central government wants to redress a part of this grievance under pressure from the state government.\n" +
                "India wants to exploit the hydro electric power potential of the rivers. This is allowed by the treaty. However, the treaty is 53 years old and dam engineering has significantly improved since then. Earlier, they didn't know what to do with the silt that is deposited by the river waters in the dam. Now, the state of dam engineering requires you to \"flush\" out the silt from the dam using stored water. While the 1960 treaty allows \"run of the river\" projects that doesn't allow water to be stored, it is antiquated and is not applicable in an era where you are required to remove the silt with stored water. \n" +
                "\n" +
                "Essentially the dispute is this:\n" +
                "According to India, the treaty allows India to draw power from the rivers and that would mean storing some water to flush the silt that is accumulated in the power projects. This was not originally an issue in 1960 as it was not thought out. \n" +
                "\n" +
                "According to Pakistan, the treaty doesn't allow India to store water and \"rob\" Pakistan of its water. India is violating the treaty in their perspective.\n" +
                "\n" +
                "In short, we are dealing with an outdated treaty that has failed to keep up with the developments in irrigation engineering. Both sides are loathe to change the treaty (it takes decades to come to any kind of agreement) and given that both countries are not talking enough with each other, the broken treaty continues to exists as a sticking finger. \n" +
                "\n" +
                "Winning the battle but losing the war \n" +
                "http://cmsdata.iucn.org/download...\n" +
                "SHOULD THE INDUS WATER TREATY BE RVISED\n" +
                "India seeks clarification on Kishanganga order \n" +
                "Power point\n" +
                "EMERGING CHALLENGES TO INDUS WATERS TREATY");
    }






}
