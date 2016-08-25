package com.balaji.aakash;


import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Sixth6 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Economics is not a pure Science, but a Social Science. The subjects (people) you are dealing with are extremely complex. None of the social sciences are as elegant as Mathematics or Physics. \n" +
                "\n" +
                "Economic theories impact your wallet more than theories in any other science. When somebody cracked the proof for Fermat's Last Theorem, it was celebrated, but common people were totally unaffected. But, think about the battle between economic theories such as Keynesian Economics vs. Communism vs. Monetarism. The results of these can significantly affect everybody's wallets and purchasing power. Thus, power centers and vested interests interfere in economics more than any other field of knowledge. \n" +
                "\n" +
                "\n" +
                "Given that you are dealing with live subjects, you are very limited to the amount of experiments you can do. Thus, most of the theories are in reality just untested hypotheses.\n" +
                "\n" +
                "FWIW, I find economics as fascinating as mathematics & physics. Just that they are different. Reducing economics to equations is as bad as converting mathematics to prose.");
    }

}
