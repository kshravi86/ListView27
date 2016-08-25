package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Tenth7 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("My wife and I spent 5 days in Goa, early this year and we really loved the place. \n" +
                "\n" +
                "Soak in Goa. Remember there is nothing \"must-see\". Goa is an experience. So, don't go for cramped plans. Just let the relaxed lifestyle there set on you. \n" +
                "\n" +
                "\n" +
                "Try to stick to just one part of Goa, if you are there for just 4 days. North Goa is good for partying and South Goa is good for solitude & relaxation. If you try to do both in a short time, you will just spend too much of time on the road.\n" +
                "Rent a bike/scooter. Don't think about car or public transportation. The best way to see Goa is on a two wheeler. The driving is not hard compared to other Indian cities and you can rent these vehicles from the hotel you stay.\n" +
                "Try taking a boat cruise in Panjim. It is a nice city with an European feel to it. You might want to skip the over-hyped Dona Paula beach that s close to the city.\n" +
                "Live closer to the beach. We stayed in Pam Pirache resort just opposite the Morjim beach on the north. Even in the peak season, the place was less crowded. Try to have long walks in the beach. Other beaches, we liked are Bogmalo beach (closer to the airport), Palolem, Anjuna (mostly visited by foreigners). Skip the popular Calangute beach, if you want to avoid the swarm of Indian tourists.\n" +
                "Hike to the forts. There are a few forts in Goa, usually built on top of small hills closer to a river mouth. The fort at the top of Vagator beach offers a nice panorama.\n" +
                "If you are religious, try visiting Old Goa. It has got both old churches and old temples.");
    }
}