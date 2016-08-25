package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 8/7/16.
 */
public class Seventh5 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Here is the first of this series: Walking the Bull: A New Series on Investing. This is the story of the world's first major corporation, the first company to issue stocks that could be bought by public. This is the story of where it all started.\n" +
                "\n" +
                "The Story of Dutch East India Company\n" +
                "In 1602, Europe was in state of restlessness. The voyages of Vasco da Gama and Columbus had produced enormous level of excitement. Plenty of new lands were discovered and new trade routes opened them to exotic destinations. European entrepreneurs were running around trying to find their boat to travel to India and Americas and make a boat load of money in the trade.  \n" +
                "\n" +
                "\n" +
                "Although Spain and Portugal were the pioneers in the maritime game,  Dutch soon followed. Amsterdam quickly became a major center of trade.  Dutch traders started to get active in India & South East Asia,  collectively termed the Indies.\n" +
                "\n" +
                "As the voyages started to mature, entrepreneurs found that they needed bigger ships, bigger guns and a lot of armed soldiers to tackle the natives of the new lands. The market was also getting complex. Pirates attacked the ships increasing the risk of venture. Moreover, a lot of traders brought a huge amount of spices & gold and often these crashed the local markets with oversupply.\n" +
                "\n" +
                "It was at this point of time that a local politician, the Land's Advocate of Holland, Johan van Oldenbarnevelt, suggested the entrepreneurs pool efforts to form a joint entity. This new entity, Vereinigte Ostindische Compagnie (VOC) colloquially called the Dutch East India Company will change the history of Asia and finance. \n" +
                "\n" +
                "The entity realize that they needed a lot of money much more than an individual entrepreneurs can afford. They needed 6 million guilders for the expedition and realized that they need to collect this money from a lot of people. Thus, they went to public. They offered the public a simple deal:\n" +
                "We will issue 2100 shares of our group, each with a nominal value of 3000 guilders. From the money we generate from our voyage, we will divide by 2100 parts and each shareholder will get his part, called the dividend. The holder of this share certificate, can sell it to anybody at anytime.\n" +
                "\n" +
                "Apart from providing the ability to provide to sell the stock certificate, the company also provided a trading hall for the stockholder to come and transfer it to anybody. In that sense, they converted a part of a company to look more like a parcel of land. The shares can be signed to anybody else in the presence of two directors of the company.\n" +
                "\n" +
                "For the next 100 years, the company made huge riches from its Indian trade, and it was shared with its stockholders. The stock holders got 10-40% return every year on the share they held. In 1606 these holders got 75% of their money back in a single year. By 1669 VOC became the richest private company and owned 150 ships and 10,000 soldiers.\n" +
                "\n" +
                "Other people started to envy these shareholders (called the pepper sacks of Amsterdam) and offered to pay a higher amount and by 1720, people were willing to pay 12 times more than what the initial stock was worth. \n" +
                "\n" +
                "What is a Stock?\n" +
                "Entrepreneurs have been building companies and trading things since the start of the civilization. If Ron and Jane need money to start their shop, they will mop up from all sources, their private savings, from their parents, friends and if lucky banks. \n" +
                "\n" +
                "However, there are many ventures that are much bigger than a single entrepreneur can mop. For instance, if you want to start an automobile company, you can never build a viable venture without a few million dollars. The person who has those few million dollars might have neither the interest nor the inclination to start a venture.\n" +
                "\n" +
                "This is where public stocks come from. They allow entrepreneurs to collect small amounts of money from a large group of people. Each of these investors are given a share in the company that is proportional to the amount of money you put in. If Mike puts 10% of the total money, he gets 10% of the total shares in the company.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Just like you can divide a big parcel of land into multiple smaller units owned by different people, a big company could be divided into a large number of units. Each of those units (called a share) could be bought by anybody in the public. More importantly, anyone can transfer these holding to anybody else who has the money to buy the share.\n" +
                "\n" +
                "Stock markets help transfer these shareholdings easily. It helps you make an instantaneous transfer of a share at a mutually agreed price. In the future parts we will see more on this transfer and price.\n" +
                "Next part: Let's get into stock market");
    }
}
