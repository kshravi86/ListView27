package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 6/7/16.
 */
public class SeventeenthActivity extends Activity {


    String[] CHEESES = {

            "When the wind is behind you, run. Run very fast.",
            "Lessons from the Blind men and the elephant",
            "Quit Reading Fast. Read Slow.",
            "The Pursuit of Happiness",
            "How can I make my life simpler?",
            "The Pursuit of Truth",
            "What should we focus on learning in an age where almost all information is at your fingertips?",
            "Wisdom from a 2000 year old Tamil Poem",
            "Everyone has a Master",

/*            "Answers must not be given. They should emerge from within the asker.",
            "What are middle-class values?",
            "What's the best approach to starting a new religion?",
            "If there were ten commandments in Indian politics, what would they be?",
            "If companies were to be totally honest, how would they advertise their products?",
            "Popular Culture: Is there any nation more obsessed with celebrities than the USA?",
            "If Indian Cricketers were Politicians",
            "Sad, Skewed View of History.",
            "3 Types of Nations",
            "Economies and Little Kids.",
            "An Ignorant Leader is Worse Than an Evil Leader",
            "What are the main/fundamental ideas in science?",
            "Why aren't there a significant number of scientists as opposed to musicians and actors in TIME Magazine's The 100 Most Influential People in the World: Readers Poll?",
            "A Trivial Pursuit",
            "The Purpose of History",
            "What relevance does 'history' hold, in the current world led by science and technology?",
            "Random thought: RAM people and DVD people",
            "Great minds discuss ideas Average minds discuss events. Small minds discuss people.?",
            "Lasting Fame",
            "How does the Indian concept of individuality differ from its Western counterpart?"
*/
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  super.onCreate(savedInstanceState);
        // setContentView(R.layout.sample_main);

        setContentView(R.layout.activity_main2);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, CHEESES);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                switch( position )
                {
                    case 0:  Intent newActivity = new Intent(SeventeenthActivity.this, Seventeenth1.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity2 = new Intent(SeventeenthActivity.this, Seventeenth2.class);
                        startActivity(newActivity2);
                        break;
                    case 2:  Intent newActivity3 = new Intent(SeventeenthActivity.this, Seventeenth3.class);
                        startActivity(newActivity3);
                        break;
                    case 3:Intent newActivity4 = new Intent(SeventeenthActivity.this, Seventeenth4.class);
                        startActivity(newActivity4);
                        break;
                    case 4:Intent newActivity5 = new Intent(SeventeenthActivity.this, Seventeenth5.class);
                        startActivity(newActivity5);
                        break;
                    case 5:Intent newActivity6 = new Intent(SeventeenthActivity.this, Seventeenth6.class);
                        startActivity(newActivity6);
                        break;
                    case 6:Intent newActivity7 = new Intent(SeventeenthActivity.this, Seventeenth7.class);
                        startActivity(newActivity7);
                        break;
                    case 7:Intent newActivity8 = new Intent(SeventeenthActivity.this, Seventeenth8.class);
                        startActivity(newActivity8);
                        break;
                    case 8:Intent newActivity9 = new Intent(SeventeenthActivity.this, Seventeenth9.class);
                        startActivity(newActivity9);
                        break;


                }
            }
        });


    }
}
