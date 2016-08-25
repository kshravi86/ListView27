package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Eleventh8 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("It is not always that bride's side pay for the wedding. In the cases of many of my friends, their communities stipulated that wedding is groom's responsibility. It happens in many communities in TN. In many other instances these days, the expenses are shared when the bride's family is unable to pay. For instance, although in my community the grooms only pay for engagement expenses while bride paying for the rest, in a couple of my relatives' cases, we paid half the amount to the bride's family when we found them struggling financially.\n" +
                "People make weddings into a prestige affair. Thus, the groom's side try to boast how worthy the groom is (in education/salary/property ownership) and the bride's side try to boast how big a wedding they could make. These egos are often stupid, but people are people.\n" +
                "If you start reading the Vedic manthras for vivaha (wedding), it is assumed that the guy might have no family of his own. The relevant manthras are actually interesting Sanskrit conversations where the groom goes with his friend and starts talking to the girl's father.  In fact, while there are manthras for girl's father, girl and the guy,  the guy's father & mother have no real role in a Vedic ceremony. My father in law is a Vedic scholar and asked him about this anomaly, he said the life expectancies of those times were so low that the guy's parents were less likely to be alive by the time the guy gets to the marriage stage. Girls parents were assumed to be alive since the girls get married off pretty young. Thus, a good chunk of wedding responsibilities were assigned to the girl's side. My guess is that many of those historic things got passed off without anybody realizing their background.\n" +
                "Many people are looking at this only from the guy's side. In my family one of the girls demanded that her father give her enough of the family jewelry during the wedding, as she feared she might not get her fair share that her sisters & cousins got. In modern practice, even if the groom's side don't ask for it, many girls do implicitly place a requirement if their fathers have the potential to pay.\n" +
                "\n" +
                "Like dowry, this is an ancient relic that has no real reason to exist now. It is just pride & ego that is pushing this. In fact, there is no real reason to have an overly pompous wedding when the bride and/or groom are poor.\n" +
                "\n" +
                "To understand why Dowry should not exist now, go here:\n" +
                "What is the difference between dowry and a girl righteously asking for equal share in her father's property?");
    }
}
