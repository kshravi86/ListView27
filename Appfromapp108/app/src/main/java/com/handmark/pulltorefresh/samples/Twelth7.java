package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Twelth7 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Britain didn't want to give up any territory. In 1956 they fought a bitter war to retain ownership of Suez. (Suez Crisis) In 1982 they were involved in a war with Argentina over the remote Falkland Islands. Colonialism didn't end with World War and but for Indian independence movement (that led them to quit South & Southeast Asia) they could have jolly well stayed here for a long time.\n" +
                "Even assuming that the colonialism was ending after the war, you put the cart before the horse. Indian independence was the reason that led to the fall of the empire. The reason to leave Myanmar and Sri Lanka was related to the independence of India. If Britain could not hold India (and access its armed forces & bases), there was little way they could hold the other colonies nearby. However, in colonies far from India, England still clung on to power (until the 1980's in Africa and Caribbean)  and it fought a war in Suez in 1950's\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Contrary to popular myth, the British didn't directly rule the whole of India. Until the Indian independence in 1947, a large chunk of India (in dark shade in the map below) was ruled by Indian monarchs who pledged the allegiance to the British crown and had quite a distinct culture from the Raj. In 1947, they almost secured an independence for their own kingdoms. So, even Britian didn't forge a single identity of India. It was Gandhi and his disciple, Sardar Patel, who helped unite India into a single union. Without Gandhi's vision absorbing the whole of India and pulling people from everywhere  infused with a sense of patriotism and single identity, we would be talking about a 150 nation subcontinent now. \n" +
                "\n" +
                "One of the reasons why Britain held a number of colonies around India was to protect the empire's crown jewel. See the The Great Game. Without India there was no point in engaging in such games.\n" +
                "\n" +
                "\n" +
                "Independence of India and its active campaign in Africa and rest of Asia contributed greatly to end of colonialism. Without the independence of India, it is arguable whether colonialism would have ended this soon.\n" +
                "Gandhiji legitimized India's struggle in the West. Americans and British public started appreciating the India's quest for freedom that greatly eased the transfer of power. \n" +
                "\n" +
                "Before Mahatma entered India politics, Congress was merely an intellectual grouping with a hodgepodge of journalists and lawyers cribbing out the finer details. What Mahatma did was to bring the politics to the Indian masses. For the only time in Indian history, the masses were seriously involved in nation building and seriously cared about something beyond their daily life. This widened the campaign beyond Punjab, Bengal and Bombay province and brought every Indian grouping to the table. This is a big reason why India still remains as a single nation.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Mahatma's peaceful campaign meant that India-Britain relationship was never strained. India remains as a part of the commonwealth and retains the British symbols that still unites the nation (Railways, Tea, English language, Cricket and local democratic institutions). Without Mahatma, Indian leaders might have been tempted to break all those ties and weaken the things that link the nation. \n" +
                "\n" +
                "\n" +
                "More importantly, the Mahatma's campaign was not merely to end British rule. For the Mahatma, independence meant end of India's evils and that is the reason he never celebrated the end of British rule. His active role in the freedom struggle might not have hastened the end of British, but it surely helped in India not ending up like Myanmar, Pakistan or Afghanistan. India is able to manage its heterogeneity without ending up like a basket case or in perpetual crisis like it other neighbors");
    }
}