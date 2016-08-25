package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Twelth6 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("[Gandhi said] I want to go to Lahore... and to Rawalpindi... On January 27, it was agreed that Gandhi would arrive in Pakistan on February 8 or 9...What he would say in Pakistan was spelt out by Gandhi and his emissaries: the Pak government should protect minorities and ask those who had fled to India to return to their homes.\n" +
                "\n" +
                "What If Gandhi Had Lived On?\n" +
                "\n" +
                "Had Mahatma Gandhi lived longer, it was very likely that he would have headed to (West) Pakistan and tried to reduce violence there.\n" +
                "\n" +
                "A lot of Indians tend to underestimate the last few months of Mahatma's life. It is then the Mahatma produced some of his best miracles. In August 1946, Bengal was burning [a great movie on this is: Hey Ram] and the situation looked hopeless. In the following 15 months, Mahatma Gandhi traveled all over Bengal, especially places like Noakhali where Hindus were brutally raped and murdered and in other places where Hindus did the same crimes. \n" +
                "\n" +
                "\n" +
                "He was faced with the mighty Ganga and the Mahatma at his old age learned the delicate art of balancing on wooden poles and planks to cross the rivers and streams to reach these isolated villages and heal there. He saved far more Hindu lives than many of the so called Hindu activists who claimed to \"fight\" for Hindus. If Gandhi was not assassinated, he would have gone on to Pakistan and probably saved many more Hindus - and even Jinnah agreed for Gandhi to spread his peace message there.\n" +
                "\n" +
                "\n" +
                "Crossing the Ganges on wooden planks\n" +
                "\n" +
                "At the dawn of freedom in 1947, everyone expected Bengal to go to hell. Mountbatten's army was sent to Punjab and Bengal was far bigger, far denser, far disconnected. But, there was the Mahatma. With his intervention, Bengal contributed to only a small portion of the deaths in August 1947 and beyond. East Pakistan and its successor Bangladesh thus became India's friends as a result.\n" +
                "\n" +
                "\n" +
                "Mahatma went home after home, pleading Hindus to be spared by Muslims and vice versa. It worked.\n" +
                "\n" +
                "On the other hand, it was Punjab that became a hell-hole. No one expected the Punjabis to tear apart each other like what they did in August 1947. Thus, slowly Gandhi began a westward journey. His first stop was in Delhi where he would first address the concerns of the Muslims and refugees. Only when he addresses those, can he go to Lahore and Karachi and ask the Muslims there to spare the Hindus.\n" +
                "\n" +
                "Had Godse not killed Gandhi, the latter might have reached Lahore in the spring of 1948 and attempted to replicate in Punjab what he did in Bengal. It would not have been easy, but no one expected the Bengal miracle either.\n" +
                "\n" +
                "I constantly ponder what would have that scenario have been had the Mahatma succeeded. Just like Bangladesh is a friendly country to India, having avoided brutal partition scenes, Pakistan might not have been as hostile a country if the partition wounds were quickly healed. Not easy, not probable, but was possible. Only Mahatama could have done that. He was so close - a mere week away from traveling to Pakistan and fighting violence there.\n" +
                "\n" +
                "He was stopped.\n");
    }
}