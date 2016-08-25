package com.balaji.aakash;


import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Fourth1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Until the arrival of Talibans (essentially Pakistan's protege), India enjoyed a strong relationship with Afghanistan. There is a very strong historical connection that runs for 1000s of years. A lot of Afghan leaders, including the current President Karzai studied in India. \n" +
                "\n" +
                "India was also close friends with the Northern Alliance that helped topple the Talibans in the aftermath of 2001. Since 2001, India has helped Afghanistan substantially in its reconstruction. Could Iran and India be Afghanistan’s ‘Plan B?’\n" +
                "\n" +
                "In a Gallup poll done in 2010, majority of Afghans preferred Indians over both Americans and Pakistanis. 71% of Afghans say India playing most positive role in country: Poll. Afganistan stands at #3 when it comes to aid receipts from India.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Why India's role is quite unnoticed in the West?\n" +
                "Pakistan is an ally of the US and US media tends to report the story of the army and the allies.\n" +
                "West always looked Pakistan more favorably than India even before this war. In fact, since 80s India was complaining about Mujahideen and OBL, while US was still training these baddies. In India, there is always a resentment that US media and establishment give Pakistan far more coverage than it deserves. Although the recent economic growth changed things a bit, when it comes to geopolitics US is still clueless in South Asia (and no wonder America's Afghan campaigns are failing).\n" +
                "India doesn't share a border with Afghanistan (in our maps it shows a small shared border, but the that border has been under Pakistan's control for decades). Afghanistan is landlocked and that rules out ships. That means, India has to depend on its arch enemy Pakistan's airspace to deliver aid to Afghanistan. This makes the delivery of a lot of essential things from India harder and contributions less noticeable than they should be.\n");
    }

}
