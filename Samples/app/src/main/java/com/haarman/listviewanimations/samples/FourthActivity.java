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
public class FourthActivity extends ListActivity {


    String[] CHEESES = {

            "What is India's relationship with Afghanistan?",
            "Why did China invade India in 1962?",
            "What exactly is the Arunachal Pradesh Conflict between India and China?",
            "What is the complete history behind the disputes between India, Pakistan and China, over their conflicting national borders?",
            "Why does India have a larger area than Pakistan?",
            "Why did the partitioning of India cause violence?",
            "How important is Bhutan to India?",
            "What is Operation Blue Star?",
            "What is the best political solution to Kashmir?",

            "What are the benefits and drawbacks to India in letting Kashmir be an independent state/country?",
            "Why doesnt India utilise its powerful Army to neutralise the Naxalite threat and instead continue to use the police and paramilitary forces?",
            "Should the North Eastern states of India try to secede from India, and try to join China?",

           /* "Is spending tons of money on defense justified, when on the other side India is poor country?",
            "Who among Gandhi and Bhagat Singh was right in his approach towards the British rule in India?",
            "What's the history of the Islamic insurgency in Iraq? How did the unrest progress? Is momentum building?",
            "Why and how was the Muslim conquest so successful?",
            "What would be an outcome of Iran's nuclear strike on Riyadh?",
            "Why have the Islamic countries failed to develop even with resources like oil, whilst countries with no resources like Switzerland have flourished?",
            "Why are there so many problems in Africa?",
            "Why has every superpower tried to conquer Afghanistan, even though the country has nothing special like oil, coal, natural gas or valuable minerals?",
            "How was a smaller country like Japan able to dominate and/or oppress much of China for the last century?",
            "What did the Dalai Lama do to provoke the Chinese government?",
            "How many countries has China invaded in its history?",
            "Why do people continuously say that World War III will be triggered because of the lack of water?",
            "Why does the United States give so much foreign aid to Pakistan?",
            "How did Switzerland never participate in any world wars?",
            "Why does terrorism get so much more publicity and focus than other far more deadly problems?",
            "Why do the three deaths at the Boston Marathon Attack weigh so much more heavily than the thousands who died in America that same day?",
            "We seem to live in a very peaceful time in modern history, where the percentage of people killed in armed conflicts worldwide is at a historic low. What are the underlying causes for this phenomenon?"

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
                    case 1:  Intent newActivity = new Intent(FourthActivity.this, Fourth1.class);
                        startActivity(newActivity);
                        break;
                    case 2:  Intent newActivity2 = new Intent(FourthActivity.this, Fourth2.class);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(FourthActivity.this, Fourth3.class);
                        startActivity(newActivity3);
                        break;
                    case 4:Intent newActivity4 = new Intent(FourthActivity.this, Fourth4.class);
                        startActivity(newActivity4);
                        break;
                    case 5:Intent newActivity5 = new Intent(FourthActivity.this, Fourth5.class);
                        startActivity(newActivity5);
                        break;
                    case 6:Intent newActivity6 = new Intent(FourthActivity.this, Fourth6.class);
                        startActivity(newActivity6);
                        break;
                    case 7:Intent newActivity7 = new Intent(FourthActivity.this, Fourth7.class);
                        startActivity(newActivity7);
                        break;
                    case 8:Intent newActivity8 = new Intent(FourthActivity.this, Fourth8.class);
                        startActivity(newActivity8);
                        break;
                    case 9:Intent newActivity9 = new Intent(FourthActivity.this, Fourth9.class);
                        startActivity(newActivity9);
                        break;
                    case 10:Intent newActivity10 = new Intent(FourthActivity.this, Fourth10.class);
                        startActivity(newActivity10);
                        break;
                    case 11:Intent newActivity11 = new Intent(FourthActivity.this, Fourth11.class);
                        startActivity(newActivity11);
                        break;
                    case 12:Intent newActivity12 = new Intent(FourthActivity.this, Fourth12.class);
                        startActivity(newActivity12);
                        break;


                }






    }
}
