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
public class SixteenthActivity extends Activity {


    String[] CHEESES = {

            "Indus Water Treaty",
            "Why is the National Emergency of 1975 seen as one of the most controversial times in the History of India?",
            "How would India have evolved had it been Pandit Nehru receiving the bullets of Nathuram's gun instead of Mahatama Gandhi?",
            "Why isn't India a superpower or global leader?",
            "Is the creation of Telangana good for India?",
            "Has the division of the India into linguistic states served it well?",
            "Are there any insights as to how Vallabhai Patel convinced the princely states to unite as one common nation?",
            "What are the short-term and long-term effects of the anti-Hindi protests in Tamil Nadu?",
            "What exactly happened to the Indian Economy in 1991 in layman's terms?",

        /*    "What was it like to witness the 1991 economic reforms in India?",
            "Why has Indian rupee devalued from around Re. 5 per $1 at independence to around Rs 60 per $1 today?",
            "What is Article 370 of the Constitution of India? What would be the consequences of repealing it?",
            "Section 377: India is Caught in a Victorian Trap.",
            "Why India doesn't have a Jury system to punish criminals?",
            "Why should India implement a uniform civil code?",
            "What is the difference between Republic Day and Independence Day?",
            "What are some things everyone should know about India's Republic Day?",
            "What were some reasons why 'Sarey jahan sey accha' wasn't chosen as the Indian National Anthem?",
            "Should India change its name to Bharat/Hindustan?",
            "How can you explain all Indian Political parties in layman's terms?",
            "Should India move to a Presidential system rather than Westminster model?",
            "Why is Abdul Kalam widely loved and respected by everyone?",
            "Why is Pratibha Patil widely hated & disrespected, despite holding prestigious post of President of India?",
            "Why has the Indian Army never tried to stage a coup and take control of India's governance?",
            "Why was Jawaharlal Nehru selected as the first Prime Minister of India instead of Sardar Vallabhbhai Patel?",
            "Was Non-Aligned Movement a bad idea for India? If yes, Why?",
            "Lessons from Indian elections 2014",
            "Can someone explain the reasons for the Babri Masjid demolition?",
            "Why didn't NATO attack India when India annexed Goa?",
            "What are the benefits and drawbacks to India in letting Kashmir be an independent state/country?",
            "Why did Indira Gandhi agree to returning captured land and 93000 PoWs after the 1971 war?",
            "Why did China invade India in 1962?",
            "What is India's involvement in LTTE movement?",
            "What is Operation Blue Star?",
            "What incidents and events have made India proud?",
            "Are there any modern-day plagues? If not, what was the last one?",
            "What is the darkest moment in Indian history?",
            "Who are some of the notable people in modern Indian history that every Indian should know about?",
            "Remembering the Indian Scientists of the 20th Century: Part 1",
            "Remembering the Indian Scientists of the 20th Century: Part 2",
            "From Bullock Carts to Mars.",
            "Indian Space Mission, Poverty and Closet Racism",
            "Awesome Reading Materials on Indian History"
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
                    case 0:  Intent newActivity = new Intent(SixteenthActivity.this, Sixteenth1.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity2 = new Intent(SixteenthActivity.this, Sixteenth2.class);
                        startActivity(newActivity2);
                        break;
                    case 2:  Intent newActivity3 = new Intent(SixteenthActivity.this, Sixteenth3.class);
                        startActivity(newActivity3);
                        break;
                    case 3:Intent newActivity4 = new Intent(SixteenthActivity.this, Sixteenth4.class);
                        startActivity(newActivity4);
                        break;
                    case 4:Intent newActivity5 = new Intent(SixteenthActivity.this, Sixteenth5.class);
                        startActivity(newActivity5);
                        break;
                    case 5:Intent newActivity6 = new Intent(SixteenthActivity.this, Sixteenth6.class);
                        startActivity(newActivity6);
                        break;
                    case 6:Intent newActivity7 = new Intent(SixteenthActivity.this, Sixteenth7.class);
                        startActivity(newActivity7);
                        break;
                    case 7:Intent newActivity8 = new Intent(SixteenthActivity.this, Sixteenth8.class);
                        startActivity(newActivity8);
                        break;
                    case 8:Intent newActivity9 = new Intent(SixteenthActivity.this, Sixteenth9.class);
                        startActivity(newActivity9);
                        break;


                }
            }
        });


    }
}
