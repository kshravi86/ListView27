package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Twelth11 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("...[W]here there is only a choice between cowardice and violence, I would advise violence. -- Mahatma Gandhi\n" +
                "\n" +
                "It is really sad that after 66 years of his death, most Indians are clueless about the Mahatma. It would be a grave injustice to view Gandhian struggle as mere driving out the British. In fact, he very well knew that he could have driven out the British anytime - at the cost of chaos. If the non cooperation movement had gone further ahead, the mayhem and anarchy would have driven the Brits out of the subcontinent. Just that there would not have been any India to speak of. \n" +
                "\n" +
                "Gandhi's struggle was a social one - not merely driving out aliens\n" +
                "Most of the Gandhian struggle was against the slavery we imposed on ourselves. 90% of his time was spent on things like abolishing untouchability (Vaikkom), giving farmers their due rights (Champaran), calming down religious tensions (Naokhali), fighting for women's rights, working against the impact of alcoholism, preparing Indians for democracy, building farm economy, reviving textile industry (Khaadi) and so on. He and his disciples stitched together the India we know of - a multicultural democracy that spreads across the vast breadth of the subcontinent. \n" +
                "\n" +
                "Once you understand that Gandhian struggle was not merely against the British, but building the fabric of Indian society, you can better understand his position on Bose, Bhagat Singh and others who sought to merely drive out the British through violent means.\n" +
                "\n" +
                "Had we gone violent (like how Sri Lankan Tamils, Palestinians or Sikhs did in the recent decades) we would have had little sympathy from the rest of the world and we would have imploded on our own weight. Gandhi helped avoid that kind of violence and the repurcussions that come with it. \n" +
                "\n" +
                "Gandhi's fight was for moral superiority over the Raj and by achieving it, he effectively isolated the British administration from their allies, the world and their own citizens (many common Britishers grew to liking Gandhi). That is the masterstroke of Gandhi.\n" +
                "\n" +
                "Other misconceptions in the question:\n" +
                ">>Gandhi had enough influence to suggest abolition of the caste system. \n" +
                "No human had that power. Indians will not listen to anybody when it comes to abolishing the caste system or religious practices.  Even Emperor Ashoka, who ruled the subcontinent for decades, could not remove the caste system and rather worked alongside it. Gandhi thus worked towards removing the discriminatory aspects of the caste system.\n" +
                "\n" +
                ">> he pandered to the Muslim League to an unholy extent.\n" +
                "Without the Mahatma, millions of Hindus in East Pakistan (Bangladesh) would have perished. The Mahatma moved from village after village and worked on reducing the violence in the grassroots in 1946-47. \n" +
                "\n" +
                ">>If England were to adopt Gandhian methods against Nazi Germany, would they have been successful? \n" +
                "Mahatma Gandhi was not against all type of wars. He supported the recruitment of Indians during WW-I. During Boer wars and other times, helped heal the wounds of British soldiers. However, he got tired of Western hypocrisy. \n" +
                "\n" +
                ">>isolation of Subhash Chandra Bose\n" +
                "Gandhiji justifiably was worried about the repurcussions of an armed struggle. And their fight was on an idea. Gandhiji called Netaji the \"Prince among the patriots\" and it was Netaji who first called Gandhiji the father of our nation (years after their fallout). They both loved the nation and each other. Just that they differed on an idea. \n" +
                "\n" +
                "I WOULD risk violence a thousand times rather than risk the emasculation of a whole race. -- Mahatma Gandhi\n" +
                "\n" +
                "\n" +
                "\n" +
                "Peace, Nonviolence and Conflict Resolution\n");

    }
}
