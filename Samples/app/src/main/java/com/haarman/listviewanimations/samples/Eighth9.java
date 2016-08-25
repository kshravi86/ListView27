package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 8/7/16.
 */
public class Eighth9 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Although Britain and USSR had big contributions in terms of men and resources, it was the US that played the biggest role in bringing the war to an end.  For most of the war, the Soviets were just saving their ass and were merely defending. They had little role in the major offensives in the Pacific, North African and Western European theaters. \n" +
                "\n" +
                "In fact, without the American entry into the North African battle, Germany could have very well succeeded in taming Russia (using the vast resources from the region). Until the entry of the US, the war looked pretty bleak and the reversal for Germany started after the Americans entered in 1942.\n" +
                "Sheer size. 16 million Americans served in the US military during the war (Military history of the United States during World War II), while British army only had 3.5 million people serving them at the peak. British Army during the Second World War. Americans had an unbelievable economy and manpower that was unrivaled elsewhere. In also every equipment, Americans outnumbered other armies.\n" +
                "Pacific Theater. None of the other allies were managing the Pacific theater where Japan was conquering anything under the Sun. Britain was barely holding and China was already down. Had the Americans not entered the war, Japan would have taken the war to the Soviets and defeated them like they did 4 decades before then. Without USA, there was no way for Britain or USSR to fight Japan.  \n" +
                "Operation Torch. US employed two of its war geniuses - Eisenhower and Patton to clear the Germans out of Tunisia and Morrocco. The opening of this front took Hitler's attention off the Soviets and gave them the breather. \n" +
                "Strategic Bombing. Although the Americans entered the war much later than the other two powers, they lead the destruction through aerial route. Without the B-17s bombing Germany incessantly, Germany would have fought way longer. \n" +
                "\n" +
                "Atom bomb. Americans raced the Germans when it comes to nuclear weapons and had the war dragged long (very likely without a US entry) Germans would have had the nuclear weapons. And they would have very likely used it over London and Moscow. German nuclear energy project It was primarily poor organization of the nuclear project (split into two rival teams) that slowed the Germans down enough to have Americans a first go at it.\n" +
                "\n" +
                "That said, Britain was very crucial to putting the Germans out in North Africa and Soviets were critical in the eastern European theater.\n");
    }
}
