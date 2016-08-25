package com.haarman.listviewanimations.samples;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by listviewanimations on 6/7/16.
 */
public class TwelthActivity extends ListActivity {


    String[] CHEESES = {

            "How did Mahatma Gandhi unite millions of people to fight for independence in a non-violent fashion?",
            "Mahatma's Modus Operandi",
            "Gandhi's 4 Cardinals",
            "Mahatma Gandhi's vs Sachin Tendulkar: Comparing freedom movement with Cricket",
            "Why did Gandhi start the Dandi march in 12 March 1930, even though taxation on salt was started in 1759, and Purna Swaraj was given on 26 January 1930?",
            "If Mahatma Gandhi was not assassinated, and had he lived for another 20 years, then what change he would have brought in India ?",
            "Is Mahatma Gandhi unduly credited for India's long freedom struggle and Indian Independence?",
            "Is Mahatma Gandhi's concept of non-violent struggle (Satyagraha) still relevant in the present world?",
            "Why did Nathuram Godse assassinate Gandhi?",

            "Misconceptions about Mahatma Gandhi",
            "Is the Gandhian ideology sound or is it all just hype?",
            "Was Mahatma Gandhi a good leader to people beyond Hindus?",
           /* "How Gandhiji managed to come out of jail in very little time everytime compared to other revolutionaries?",
            "Is Mahatma Gandhi responsible for the death of Bhagat Singh, Sukhdev and Rajguru?",
            "If Mahatma Gandhi was not assassinated, and had he lived for another 20 years, then what change he would have brought in India ?",
            "Why did Gandhi never call for military disobedience but only for a civil disobedience movement?",
            "Why did MK Gandhi not lead India after Independence? Could his behaviour post Independence be termed somewhat irresponsible?",
            "How would Mahatma Gandhi have reacted if a thief sneaked into his house and tried to kill his wife or son?",
            "What was the reaction(s) of Mahatma Gandhi after the twin Atom Bomb blast on Japan in August 1945?",
            "What the Maker culture and Mahatma Gandhi have in common?",
            "Who are the greatest strategists in world history?",
            "Why wasn't Gandhi's idea of non-violence, civil disobedience adopted by the Jews in Adolf Hitler's Germany?",
            "Why were so many Indian men (including Gandhi, Nehru, Patel and even Jinnah) all learning law in British India in such an economy?",
            "If Gandhiji wanted, could he have abolished caste system?",
            "If Gandhi suddenly appeared, what would be the hardest thing to explain to him about Indian politics today?",
            "If not for Mahatma Gandhi, would India still be under British rule?",
            "Why did Mahatma Gandhi not get Bharat Ratna or the Nobel Peace Prize?"

    */
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptr_list);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CHEESES));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;

                switch( position )
                {
                    case 1:  Intent newActivity = new Intent(TwelthActivity.this, Twelth1.class);
                        startActivity(newActivity);
                        break;
                    case 2:  Intent newActivity2 = new Intent(TwelthActivity.this, Twelth2.class);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(TwelthActivity.this, Twelth3.class);
                        startActivity(newActivity3);
                        break;
                    case 4:Intent newActivity4 = new Intent(TwelthActivity.this, Twelth4.class);
                        startActivity(newActivity4);
                        break;
                    case 5:Intent newActivity5 = new Intent(TwelthActivity.this, Twelth5.class);
                        startActivity(newActivity5);
                        break;
                    case 6:Intent newActivity6 = new Intent(TwelthActivity.this, Twelth6.class);
                        startActivity(newActivity6);
                        break;
                    case 7:Intent newActivity7 = new Intent(TwelthActivity.this, Twelth7.class);
                        startActivity(newActivity7);
                        break;
                    case 8:Intent newActivity8 = new Intent(TwelthActivity.this, Twelth8.class);
                        startActivity(newActivity8);
                        break;
                    case 9:Intent newActivity9 = new Intent(TwelthActivity.this, Twelth9.class);
                        startActivity(newActivity9);
                        break;
                    case 10:Intent newActivity10 = new Intent(TwelthActivity.this, Twelth10.class);
                        startActivity(newActivity10);
                        break;
                    case 11:Intent newActivity11 = new Intent(TwelthActivity.this, Twelth11.class);
                        startActivity(newActivity11);
                        break;
                    case 12:Intent newActivity12 = new Intent(TwelthActivity.this, Twelth12.class);
                        startActivity(newActivity12);
                        break;

                }


    }
}
