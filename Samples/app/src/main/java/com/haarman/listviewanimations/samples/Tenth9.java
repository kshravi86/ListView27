package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Tenth9 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Navratri\n" +
                "This is a pan-Indian festival that is celebrated in different ways in different parts of India. It is celebrated as Garbha-Dandiya, Ramlila, Golu and Durga Pooja in various parts of the country (explained in detail below). It is probably the most important Indian festival you have never heard of. Essentially it is an art festival and the celebration of good over the evil. \n" +
                "\n" +
                "Families in Southern India build mini-museum in their homes\n" +
                "\n" +
                "Women take a central stage in this festival and it is a celebration of femine qualities such as dance, music and decoration. It is celebrated over 10 days in September-October. It is also a reminder of historic status of women in India and how they held lot more power in ancient India. \n" +
                "\n" +
                "If you are interested in arts, this is one of the best time to visit India. It is just after the monsoons and the weather is not too hot, nor cold in most parts of the country. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "South India\n" +
                "In Tamilnadu, it is called Golu. We buy 100s of idols and try to create various settings that portray our culture and heritage. These idols & dolls are arranged in wood/steel stair specially built for this purpose. It is like a mini-museum at home. Some of these settings will talk about mythology and others about the lives during ancient times. Few others get more creative and set more modern scenes (such as a Cricket field or contemporary Indian life). \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "On the 9th day, we stop all work and decorate the stuff that is essential for our professions. These are then put to use on the 10th and final day. Little kids begin their kindergarten at the end of this festival and in most south Indian homes you would find the kids from neighbors homes singing and getting a gift (a sort of an elaborate \"Trick or treat\" during American Halloween)\n" +
                "\n" +
                "\n" +
                "In the state of Karanata, this is celebrated as a royal festival and the legendary palace at Mysore is supremely decorated and large number of elephants are decorate and brought in. \n" +
                "\n" +
                "\n" +
                "   \n" +
                "\n" +
                "East India\n" +
                "In the east, this festival is celebrated as \"Durga Pooja\" where the goddess Durga wins over a demon. It celebrates both the victory of truth and the greatness of feminism. If you end up in the eastern city of Kolkata at this time, you will see swarms of Durga idols dotting all over the city and people of all walks celebrating in the street. It is a happy time.  \n" +
                "\n" +
                "\n" +
                "\n" +
                "Durga idols under preparation\n" +
                "\n" +
                "West India  \n" +
                "In Western India, the festival is celebrated as the dance festival - Garbha. This is absolutely fun and you will find people dancing in the streets with two decorated sticks. Many universities in the US organize this event in October and if you are around a major university, do take your time to attend this event. \n" +
                "\n" +
                "\n" +
                "  \n" +
                "North India\n" +
                "The north celebrates it as a victory of King Rama over the demon Ravana in the festival Ramlila. King Rama is celebrated in the great Indian epic of Ramayana and is one of the most revered/respected gods in India. Rama is known for truth & honesty, and is life is believed to be worthy of emulation of commoners. At the end of 10 day battle, huge effigies of demon Ravana is burnt in each neighborhood.  \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Nepal\n" +
                "Nepali Hindus also celebrate this festival in a big way. On this festival the emphasis on family ties and put the red colored kumkum on each other's forehead. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Navarathri is one of the longest and most diverse festivals of India. It celebrates arts like no other Indian festival. It is the most colorful Indian festival and super fun. Sadly, the festival is losing some of its ground in India as our generation doesn't fully grasp the story behind this awesome festival.");
    }
}