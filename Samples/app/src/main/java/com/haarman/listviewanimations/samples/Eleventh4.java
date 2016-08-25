package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Eleventh4 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("TL;DR - Dowry used to be very common worldwide, and there are a number of logical reasons for its existence. However, in modern era it makes no sense, and it is a pure evil.\n" +
                "\n" +
                "1. Dowry is as old as human civilization. Dowry system was prevalent in many societies in the world. Essentially, it was a means to transfer wealth to the daughter of the family. In paternal societies, the sons get to keep the family's fixed assets - house, lands, etc and the daughters get the liquid assets - gold, jewelry. This way, the family can hold on to its ancestral property while still giving the girl child her due. Until about 30 years ago, Indian laws didn't allow the daughter the right over her ancestral property, and thus needed a dowry. Read more on Dowry history\n" +
                "\n" +
                "Hammurabi code - the first known written legal code - of ancient Babylon talks about their dowry system. Native Americans, Europeans, Africans and East Asians had it. Dowry system is mainly associated with arranged marriages. However, currently the system is mainly prevalent in the subcontinent as arranged marriages in rest of the world have gone out of fashion.\n" +
                "\n" +
                "2. Another contributing factor for dowry in recent times is that until about 20 years ago India was really poor, and a well-educated, salaried groom who was on a good career track was a premium. For instance, a guy passing out of IAS (Indian Administrative Service), Medical college or a top engineering college was literally one among a million. Thus, they went for a really high price (dowry actually is a sale of a groom for a set price). The parents of brides who wanted to avoid the uneducated, unkempt grooms of their village, chased after these trophy sons-in-law. \n" +
                "\n" +
                "\n" +
                "3. Until recently, India had a very low participation of women in the labor force. Thus, the parents of grooms thought that they are giving up their \"revenue-generation asset\" for a \"non-revenue generation asset\". In a poor country, such cattle comparisons couldn't be avoided. So, they justified the dowry stating that they are compensating it for the girl's lack of earning potential. \n" +
                "\n" +
                "4. In many business families, dowry is the seed fund for the new couple to start the venture on their own. Some of the top scions in Indian business (including Dhriubhai Ambani) took this route. In those cases, it is essentially a trasfer of funds from a low-growth phase of life to a high-growth phase of life. \n" +
                "\n" +
                "5. People used to have a lot of kids until recently and in big numbers there were both girls and boys. Thus, the dowry to their girl kids was often compensated by the dowry from their new daughter-in-laws. Everybody was happy in that kind of deal.  \n" +
                "\n" +
                "----------------------\n" +
                "Current Reality\n" +
                "----------------------\n" +
                "Although the dowry system has a logical origin, in India it is a major social evil now. Some of the logic above no longer applies. \n" +
                "Instead of a simple split of family wealth, bride's family is forced to borrow huge sums to pay the groom's side.\n" +
                "Given the changes in law (allowing daughters an equal share of property), it makes less sense to continue with the transfer of wealth solely through dowry.\n" +
                "The supply-demand dynamics has changed as there is a serious shortage of brides. A free market should actually reverse the direction of dowry.\n" +
                "Parents have only 1-2 kids now and many parents have no sons to equalize the flows that historically got balanced by having enough of each gender. Thus, there is a net outflow/inflow of wealth depending on your genetic lottery.\n" +
                "\n" +
                "8200 dowry deaths and countless girl babies are aborted due to this evil. I wish it were not a part of Indian tradition at all.\n");
    }
}
