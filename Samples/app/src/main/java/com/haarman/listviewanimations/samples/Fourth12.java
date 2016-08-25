package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Fourth12 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("A secession will not happen and will not succeed because:\n" +
                "The biggest bone of contention in NE is the goal of autonomy for the tribes. The nature of Indian democracy means, the North East Tribes have some degree of autonomy and the ability to choose their leaders. In China, they would have none of that autonomy. The rebellion will be broken with an iron hand in China.\n" +
                "North-east Indians share a lot of characteristics with Tibetans and most Tibetans would choose to either be independent or join India, given a choice. So, it would be crazy for NE Indians go willingly to China.\n" +
                "North-east Indians are not one homogeneous group. There are 100s of tribal groups and there are frequently clashes among each other due to historic issues. Thus, there would be lesser agreement to split as a single group.\n" +
                "The status of minorities in China is not much better than those in India. It is quite likely that the North East Indians would face far greater discrimination in China than they currently experience in India.\n" +
                "China would loathe to disturb the stability in the region. If China incorporates north east, it is quite likely that the influx of huge non-Han population could destabilize Tibet.\n" +
                "Almost all North east Indians practice some religion or the other (mostly Hinduism, Buddhism and animism) and all of these will come under severe strain under an anti-religious China. In China, there is a lesser respect for cultural diversity than for economic development.\n" +
                "Tribes like Nagas or Bodos have always resisted the occupation of any outsider and will continue to fight Chinese if they choose to take that region. Why would China buy India's headache?\n" +
                "Oh and finally, Indian union will fight tooth and nail for every inch of the territory. In 1962 with a weak army, India fought hard for the barren Aksai Chin in Ladakh. It is quite likely that world opinion and UN will side with India.\n" +
                "I'm not denying that people from north-east face discrimination of some kind. But, you must realize that many Indians face discrimination in other parts of India (think of the anti-Bihari riots in Mumbai). The fight against discrimination has to come through democratic means - courts, laws and economic growth.");
    }
}
