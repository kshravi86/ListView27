package com.balaji.aakash;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class FifthActivity extends Activity
{
	
	String[] CHEESES = {

		"Bhagvad Gita 1: Arjuna's Despondency (Part 1)",
		"Bhagvad Gita 2: Arjuna's Despondency (Part 2)",
		"Bhagvad Gita3: Sankhya Yoga (Part 1)",
		"Bhagvad Gita 4: Sankhya Yoga (Part 2)",
		"Bhagvad Gita 5: Sankhya Yoga (Part 3)",
		"Bhagvad Gita 6: Karma Yoga (Part 1)",
		"What is Dharma?",
		"How correct am I in believing that (Hindu) mythology is actually just philosophical fiction? If so, is it logical to worship it?",
		"Why is the color Saffron so important in Hinduism, as well as otherwise?",

		/*"Why is it believed that the Ganges is self-cleaning?",
		 "Why is the cow a revered animal in Hinduism?",
		 "What is the significance of Nandi (the bull) in Indian Temples?",
		 "What is the Indian caste system? How does it work?",
		 "Why are most Hindu Brahmins vegetarian?",
		 "Why is traditional food served on a banana leaf in the states of South India?",
		 "How do I introduce Hinduism to a person who knows nothing about it?",
		 "What is the significance of the artwork of Kolam or Rangoli ? What are some interesting facts about them?",
		 "What is the significance of Sandhyavandanam in Hindu worship?",
		 "What should everyone know about Yoga?",
		 "What are the main scriptures for Hindus? How are they organized?",
		 "What are the top ten verses in the Hindu Scriptures that would enlighten a non-Hindu?",
		 "What is the historical background of Hinduism?",
		 "Why are Buddhist texts considered more historically reliable than Hindu scriptures?",
		 "How is the creation of the universe defined by Hinduism?",
		 "Mahabharata or Ramayana- which epic is greater and why?",
		 "What was the extent of the Bharata dynasty according to the Mahabharat? What kingdoms does the epic mention to have participated in the war?",
		 "Are there instances in the Ramayana and the Mahabharatha where people of lower castes were respected and treated well by those of higher castes?",
		 "Why is Raavan considered evil by many people?",
		 "Why did Hanuman not take away Sita with him while he was in Lanka?",
		 "Was Ekalavya the greatest warrior in Mahabharata?",
		 "Are Ravana, Duryodhana more of anti-heroes than outright villains?",
		 "Why is Lord Ganesh so popular in Hindu tradition?",
		 "Why do we have only few temples to Lord Brahma?",
		 "Why do most Indian Temples have the 'Navagrahas' ( Nine Planets)?",
		 "Why didn't Hinduism spread to any other part of the world, outside of the Indian subcontinent?",
		 "When was Vedic Hinduism and Brahminism introduced to the Tamil society?",
		 "Tracing the Sanskrit Influence in Southeast Asia",
		 "Misconceptions about Hinduism",
		 "Is caste system and sati system a flaw in Hinduism?",
		 "What are some mind-blowing facts about Hinduism?"
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
						case 0:  Intent newActivity = new Intent(FifthActivity.this, Fifth1.class);
							startActivity(newActivity);
							break;
						case 1:  Intent newActivity2 = new Intent(FifthActivity.this, Fifth2.class);
							startActivity(newActivity2);
							break;
						case 2:  Intent newActivity3 = new Intent(FifthActivity.this, Fifth3.class);
							startActivity(newActivity3);
							break;
						case 3:Intent newActivity4 = new Intent(FifthActivity.this, Fifth4.class);
							startActivity(newActivity4);
							break;
						case 4:Intent newActivity5 = new Intent(FifthActivity.this, Fifth5.class);
							startActivity(newActivity5);
							break;
						case 5:Intent newActivity6 = new Intent(FifthActivity.this, Fifth6.class);
							startActivity(newActivity6);
							break;
						case 6:Intent newActivity7 = new Intent(FifthActivity.this, Fifth7.class);
							startActivity(newActivity7);
							break;
						case 7:Intent newActivity8 = new Intent(FifthActivity.this, Fifth8.class);
							startActivity(newActivity8);
							break;
						case 8:Intent newActivity9 = new Intent(FifthActivity.this, Fifth9.class);
							startActivity(newActivity9);
							break;


					}
				}
			});

		
		}
	
	
	
}
