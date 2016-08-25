

package com.balaji.aakash;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class First8 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Throughout human history we learned from the other people. The key to idea exchange lies in observation. While the Internet has improved the speed of communication it did nothing to improve the key aspect of learning - observation. This key human skill has been with us throughout. Let's say I notice that you have a better way to hunt deer - a task takes me days to finish, I will imitate your method. If I didn't imitate, I would perish [as you would hunt all the deer]. Thus, learning was often a survival requirement.  In some sense, the people you see now are descendents of those who were open to imitation. Humans learned whenever they interacted with people other cultures.\n" +
                "\n" +
                "However, the problem is that the interaction was often limited by geography. Once people settled in a region with abundant food resources, they were mostly disconnected from the rest of humanity. Thus, you see plenty of cultures that never changed much in thousands of years.  \n" +
                "\n" +
                "Before the contemporary era, there were two main groups of people who helped spread ideas. These were the merchants and the religious missionaries. Both of these had a significant urging to travel long distances and learn distant cultures. For gold and heaven, they would risk everything they have and their risk taking was how ideas moved around.\n" +
                "\n" +
                "For the most part in human history, the agendas of merchants and missionaries were highly intermingled. Merchants helped spread religions, starting from the first missionary religion of Buddhism and eventually, Christianity and Islam. For the merchants the key motivation was to find the exotic things that might impress their Emperor, Maharajah or Sultan. Like bees in search of honey, they were busy, curious and helped cross-pollinate. Religions often returned the favor by making it easy for the merchants to interact and often even housed the traveling merchants in their churches, temples and mosques. \n" +
                "Where did the people go to exchange ideas?\n" +
                "To the bazaar. The biggest place of cultural and idea exchange occurred at the bazaar. Marco Polo and a variety of other travelers document their account traveling to these bazaars of the distant land. The trading areas of Constantinople, Mecca, Aden, Varanasi, Baghdad, Mumbai, London, New York, Singapore, Tyre, Bactria all gave rise to significant ideas of humanity. Religions often came from such places.\n" +
                "To the town square. Next to the market was places such as the Agora [in case of Athens], Forum in case of Rome, Alun-alun in case of Indonesia and Town square in various parts of modern Europe. [Agoraphobia is thus the fear of such large assemblies and open environments and the Roman word of course is the source for its Internet equivalent] The townsquare enabled the citizens to come together and discuss. In many cases, the rulers thus rewarded good behavior and punished bad behavior in the townsquares. \n" +
                "To the bath. In ancient India there were these great baths [such as the Great Bath, Mohenjo-daro] where the public would come to bath. This is also common in ancient Greece and Rome. In these places, upper class men networked at a leisurely place, possibly exchanging gossips, fears and excitement. It was possibly the equivalent of modern day Golf. Archimedes had one such revelation while sitting at a public bath.\n" +
                "To the pilgrimage. One of the things that gave a significant advantage to the Medieval era Islamic culture is the annual pilgrimage to the Mecca. It brought a variety of people from across the world at one point at once. Pilgrimages are often times of significant cultural exchange.\n" +
                "To the coffeehouse. The modern tradition of discussing ideas while sipping coffee possibly came from the Islamic tradition. Mecca, Damascus and Cairo have had coffee houses for centuries. Historically, people discussed ideas while sipping the beverage. Even today, tea shops in China & India and coffee shops in the Europe, North America have a huge cultural importance.\n" +
                "To the universities. Aristocrats and ruling classes have sent their kids to training for thousands of years. These were also complemented by merchant guilds to learn skills. These universities can often be very influential. One university professor at Taxila helped create India's first empire 2300 years ago. Till today, universities remain the best places to form and explore ideas. \n" +
                "To the inns. Merchants, knights and other travelers would often break their journey in inns and precursors to modern hotels. As their horses rested and their trip planned, these people had a significant exchange of new ideas from faraway places.\n" +
                "To a place of worship. For most of human history, education was closely associated with religious learning. People trained to become monks or priests and did a lot of work in learning, copying and other forms of idea exchange.");
    }
}
