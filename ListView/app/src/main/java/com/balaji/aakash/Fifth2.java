

package com.balaji.aakash;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Fifth2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("\"What are my sons doing at the battle of Kukushetra? I'm very anxious. How are they doing compared to the Pandavas? How is the preparation of both sides? Tell me on what is going on at the battle, O Sanjaya,\" said the blind king Dhritarashtra.\n" +
                "\n" +
                "On the plains of Kurukshetra in northern India, an epic battle is starting between the cousins of the legendary Kuru clan. On one side, fight the Pandavas (sons of Pandu) lead by Yudhistra - the rightful heir to the throne. On the other side fight the Kauravas lead by Duryodhana, who usurped the kingdom in a game of dice. \n" +
                "\n" +
                "Major dynasties of India at the time of Mahabharata\n" +
                "\n" +
                "Dhritarashtra, the figurehead of the Kauravas is blind and hence is not at the battle. He is at the capital and is too anxious to know the results. Although he is good at heart, his mind is clouded by his affection towards his children. He is scared that his sons face the indomitable Pandavas assisted by Lord Krishna Himself.  Every major king in India is aligned to one side or the other, thus making it as one of the most monstrous the world has seen until then.\n" +
                "\n" +
                "Sanjaya is possessed with a power to see the happenings of the battle even while sitting at the capital. The blind king uses his services to constantly keep track of the proceedings at the battle. \n" +
                "\n" +
                "\"King Duryodhana has just taken a look at the Pandava side and is approaching Acharya Dhrona.,\" said Sanjaya. \n" +
                "\n" +
                "\"The Pandava side has arranged a variety of great warriors, Guru Dhronacharya,\" said Duryodhana. \"They have two formidable fighters in Bhima and Arjuna. These two are aided by Drishtaketu, Chekitana, Purujit, Kuntibhoja, Saibya, Yududhana, Abhimanyu and a variety of great leaders of Bharat.\"\n" +
                "\n" +
                "\"We have thousands of strong warriors on our side. Apart from you, we have the mighty Bhishma, Kripa, Karna Asvatthama, Vikarna, and Jayadratha.\"\n" +
                "\n" +
                "\"However, I don't know if we have the sufficient strength. Bhima's army looks more formidable than the army we have under Bhishma. Let us do everything possible to protect our General Bhishma,\" said Duryodhana. \n" +
                "\n" +
                "Sensing an inferiority complex and confusion in Duryodhana, General Bhishma took his conch and starts blowing the war cry. Bhishma's aim was to cheer up Duryodhana and his army, while making them forget the kind of challenge they are about to face. As the war cry is heard by their opponents, they are met with a much more thundering war cry from the conch shells of Krishna and Arjuna. \n" +
                "\n" +
                "\n" +
                "The war cry is deafening and both sides are now charged up. A mighty battle is going to start in a short while.");
    }

}
