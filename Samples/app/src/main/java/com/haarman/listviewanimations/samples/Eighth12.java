package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Eighth12 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Germany had already surrendered by the time the Atomic bomb was ready. There are plenty of reasons why Germany would not have been chosen even if the bomb were invented earlier. \n" +
                "\n" +
                "Racism reasons are weak: The wartime America was clearly racist towards the \"Japs\". The racism made the decision a little easy. But, racism alone is not a big factor. Germany lost a lot more people during its bombing than Japan did. German cities were all reduced to a rubble. If the US were sympathetical to the Germans because they were \"whites\", that kind of a destruction on Germany would have been unwarranted. I believe that the hatred for Germans was as much as the hatred for Japanese. In the following decade, Russians would be hated even more. \n" +
                "\n" +
                "Possibility of getting shot down and leaking the secret: The Germans had a much stronger aerial defense. Allied forces lost over 20,000 bomber planes in Europe in bombing the Nazis. That means that the Germans had a higher likelihood of shooting the plane containing the nuclear bomb. When they shoot a plane, they would examine the wreckage to steal relevant technology. Imagine the Germans having an unexploded nuclear bomb in their hands. The war could have even gone in the other direction as Germans needed only a few gaps to fill in building their own atomic bomb. \n" +
                "\n" +
                "Weak structures: Germany had far more concrete structures than Japan did. Also Germany's population density was not that much. That means the impact of a nuclear bomb would not have been as great. If the deadliest bomb turned out to be a dud, US would have lost a big fear lever. The first nukes were not that powerful. Little boy had yield less than 15 KT of TNT, 1000X smaller than some of the modern nukes.\n" +
                "Need for big bombers: During the second world war, missile technology had not advanced enough to carry a nuclear weapon. That means they have to be dropped from an airplane. But, the US forces in Europe had no B-29s (atomic bombs needed a big plane like the B-29 Superfortress). They were reluctant to ship the planes to England and drop a weapon through the RAF. \n" +
                "\n" +
                "Japanese defenses: Japan had a weaker aerial defense by the time of the atomic bomb attack. Japanese fighters didn't even pursue the planes containing the nukes, as they were conserving that for a big squadron of fighter planes. Their atomic program was still way behind for them to utilize the nuclear technology even in the worst case of having an unexploded bomb.\n" +
                "Lack of alternatives to nuking: Germany had land borders with Allied countries. A land invasion was quite feasible. Japan was an isolated island and given its unique geography land invasion was deemed extremely expensive.\n" +
                "\n" +
                "Would the atomic bomb have been used against Germany?");
    }
}
