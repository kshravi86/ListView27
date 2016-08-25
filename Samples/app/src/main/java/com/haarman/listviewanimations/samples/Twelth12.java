package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Twelth12 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Absolutely. In fact, sadly, the biggest Gandhi hating segment lie within the Hindus and not outside it. And many of Gandhi's greatest fans are non-Hindus.\n" +
                "\n" +
                "Gandhi didn't make India's freedom struggle as a struggle between Indians and British. He always had great friendships with the British people and educated us to follow so. Think about this - when we got our independence we retained the British Viceroy as our first Governor General. This is Gandhi in London, swarmed by British commoners at the peak of his struggle with the British. If you know about English formality, pride of the world's largest empire and the role of Gandhi in dismantling the whole setup, you can immediately realize what is magic in the picture. \n" +
                "\n" +
                "On the midnight of August 14 1947 when India was getting liberated, Gandhi was not around in Delhi to view the celebrations. He was in Calcutta at the core of Hindu-Muslim battleground. Without his presence, millions of muslims in West Bengal could have perished as a revenge to 1946 Naokali Massacre in East Bengal. He almost single-handedly stopped one of the biggest human calamities to happen in that side of India. Meanwhile in the other side of India, things exploded without Gandhi's physical presence.http://www.prospectmagazine.co.u...\n" +
                "\n" +
                "\n" +
                "Gandhi provided a path that as revolutionary as quantum mechanics was to physics. It provided a new way of seeing things and doing things peacefully. It gave us the hope that poor can still be democratic and we can still achieve things against brutal regimes, in a peaceful way. This new discovery is universal in application. It just requires someone extremely truthful, patient and smart to pull off.\n" +
                "Gandhi helped us put a democratic system that could someday be a model for many other countries to follow. Although the cacophony of issues mask the core system, this is a system that lets even a poor minority rise up to the top roles in the cultural, political and business spheres. Zorastrians (Parsis), Christians, Sikhs, Jains and Muslims have held top roles in our society, even though 85% of India is Hindu. Can a minority Muslim or Hindu become a President or Chief Justice even in Scandinavian countries, Germany, Australia or other developed nations? Our system is completely unique in that and is a big part due to Mahatma & his disciples.\n" +
                "Gandhi was an inspiration to peace activists through the world including Martin Luther King and Nelson Mandela.");

    }
}
