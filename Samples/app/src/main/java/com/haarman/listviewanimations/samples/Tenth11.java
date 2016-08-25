package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Tenth11 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("1. In Goa, take the scooter if you are comfortable riding it. This is the best way to see Goa and very cheap too. Even otherwise, Goa is a very comfortable destination for a foreigner.\n" +
                "\n" +
                "2. In Mumbai, use Google maps to know the route distances and different modes to travel. If there is a train available do use it. Take a first class ticket and ride during non busy times (avoiding 7-9am and 6-8pm). If the autorickshaw won't ply, bribe them with 10-20 bucks over the meter fare.\n" +
                "\n" +
                "3. Most foreigners stick to the standard script. Venture beyond Taj and Agra.\n" +
                "\n" +
                "4. If you travel down south, Chennai or BLR, really use google maps to find distances of where you are going. Don't go for the metered fare (they will always be doctored), but settle for a fixed fare. In general, you should try to haggle for Rs.10/km fare. Without knowing the distance, you will be at a great disadvantage. \n" +
                "\n" +
                "5. If you have spent more than a week in India, try one of the roadside chats in Mumbai or inside a big mall if you are too concerned about hygiene. Pani puri is absolutely awesome. \n" +
                "\n" +
                "6. Ask people questions if they look educated. Indians always love to help foreigners. Use your judgment on whom you should ask.\n" +
                "\n" +
                "7. Always go for bottled water. Tap water is usually not safe, especially if you are planning to be there for a short stay. \n" +
                "\n" +
                "8. When you are travelling by public transport, don't expose the skin too much. There might be dangling iron at the edge of seats, etc in many of the old buses. I wear my thickest jeans and sneakers when riding a bus. The shorts and sandals are only when I'm driving a car.");
    }
}
