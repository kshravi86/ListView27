package com.balaji.aakash;


import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Sixth8 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("\n" +
                "Long term:\n" +
                "Productivity growth. When people get more productive it puts down inflation and pushes up GDP, simultaneously. This results in a rapid strengthening of the currency.\n" +
                "Inflation. Inflation is inversely proportional to currency strength.\n" +
                "\n" +
                "Fiscal health of the government. More debts and more deficits means weak currency.\n" +
                "GDP growth. When everything else is the same, the currency of a growing economy is stronger than that of a weak economy.\n" +
                "\n" +
                "Medium Term:\n" +
                "Trade Imbalance. Country with imports > exports will have its currency weakened.\n" +
                "Capital outflow. China and Japan invest a lot in the US (through treasuries) and this capital outflow weakens their currency.\n" +
                "Interest rates. Higher interest rates attract more capital.\n" +
                "Restrictions on capital flow. If more restrictions are imposed, currency weakens in the medium term, though in the long term things can even out if everything else is the same.\n" +
                "Investment opportunities. If the economy is open to investments and there are a number of attractive, investable assets, currency moves up due to inflows.\n" +
                "Political stability.\n" +
                "Health of the financial system & banks.\n" +
                "\n" +
                "Short term:\n" +
                "Portfolio investments from Foreign Institutional Investors (FII) and domestic instituitons. Investment flows push up the currency and vice versa.\n" +
                "Stability and fiscal condition of neighbors or peers in the same economic category.\n" +
                "Market psychology of traders in the global Forex market.\n" +
                "Major purchases or sales of the currency by businesses\n" +
                "Trading actions of the central bank\n" +
                "Stock market and real estate market movement\n" +
                "Change in consumer habits (touring overseas more or having a fad on imported goods)\n" +
                "\n" +
                "As Warren Buffet says - \"In the short term, the market is a voting machine, but in the long term, the market is a weighing machine\".");
    }

}
