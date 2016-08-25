
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 8/7/16.
 */
public class Seventh8 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("The Story of Dutch East India Company\n" +
                "In 1602, Europe was in a state of restlessness. The voyages of Vasco da Gama and Columbus had produced an enormous level of excitement. Plenty of new lands were discovered and new trade routes opened them to exotic destinations. European entrepreneurs were running around trying to find their boat to travel to India and Americas and make a boat load of money in the trade.  \n" +
                "\n" +
                "\n" +
                "Although Spain and Portugal were the pioneers in the maritime game,  the Dutch soon followed. Amsterdam quickly became a major center of trade.  Dutch traders started to get active in India & South East Asia,  collectively termed the Indies.\n" +
                "\n" +
                "As the voyages started to mature, entrepreneurs found that they needed bigger ships, bigger guns and a lot of armed soldiers to tackle the natives of the new lands. The market was also getting complex. Pirates attacked the ships increasing the risk of the venture. Moreover, a lot of traders brought a huge amount of spices & gold and often these crashed the local markets with oversupply.\n" +
                "\n" +
                "It was at this point of time that a local politician, the Land's Advocate of Holland, Johan van Oldenbarnevelt, suggested the entrepreneurs pool efforts to form a joint entity. This new entity, Vereinigte Ostindische Compagnie (VOC) colloquially called the Dutch East India Company will change the history of Asia and finance. \n" +
                "\n" +
                "The entity realize that they needed a lot of money much more than an individual entrepreneur can afford. They needed 6 million guilders for the expedition and realized that they need to collect this money from a lot of people. Thus, they went to public. They offered the public a simple deal:\n" +
                "We will issue 2100 shares of our group, each with a nominal value of 3000 guilders. From the money we generate from our voyage, we will divide by 2100 parts and each shareholder will get his part, called the dividend. The holder of this share certificate, can sell it to anybody at any time.\n" +
                "\n" +
                "Apart from providing the ability to provide to sell the stock certificate, the company also provided a trading hall for the stockholder to come and transfer it to anybody. In that sense, they converted a part of a company to look more like a parcel of land. The shares can be signed to anybody else in the presence of two directors of the company.\n" +
                "\n" +
                "For the next 100 years, the company made huge riches from its Indian trade, and it was shared with its stockholders. The stock holders got 10-40% return every year on the share they held. In 1606 these holders got 75% of their money back in a single year. By 1669 VOC became the richest private company and owned 150 ships and 10,000 soldiers.\n" +
                "\n" +
                "Other people started to envy these shareholders (called the pepper sacks of Amsterdam) and offered to pay a higher amount and by 1720, people were willing to pay 12 times more than what the initial stock was worth. \n" +
                "\n" +
                "Eventually, the liquidity created by such colonial ventures created the market for more corporations. There were a few instances of trading that resembled equity investing in the ancient past, but the Dutch East India Company was the practical start of modern equity investing.");
    }
}
