package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class Fourth7 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("India is a sort of natural fort - with Indian ocean being the moat and the Himalayas being the wall. I have drawn red line to denote the wall and various ancient Himalyan kingdoms as sort of castles. The dark green regions adjacent to the wall are India's most fertile and populated regions. Kashmir (Ladakh) & Himachal slope into Punjab, Nepal into Bihar & UP and finally Bhutan, Sikkim & Arunachal into Assam. \n" +
                "\n" +
                "Controlling all the regions above was thus always super-essential to India's plains. Over the past century, India has thus integrated Ladakh, Arunachal Pradesh and Sikkim into the union, and also increased control on Bhutan & Nepal. \n" +
                "\n" +
                "\n" +
                "China. Bhutan and Nepal are big buffers between India and China. Until 1949, Tibet performed this job. Leaving Bhutan to Chinese sphere of influence is considered a big risk for India's security. The perpetual insecurity among India's policy makers is a big driver of Indo-Bhutanese relationships. \n" +
                "\n" +
                "Managing insurgents in Northeast India. There are various militant groups fighting for independence in India's North East. Among the most violent of these - ULFA - often use the Bhutan's hills to camp. India needs Bhutan's help to flush the terrorists out from their side. \n" +
                "Energy from Bhutan's rivers. India is energy deficient and invests heavily in Bhutanese dams to get access to precious energy. India wants to develop 10 GW capacity in Bhutan in the next 6 years.\n" +
                "Friendly neighbor. Bhutan is among India's best friends and it never hurts to have a friend that close.");
    }

}
