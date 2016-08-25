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
public class FirstActivity extends ListActivity{



    String[] CHEESES = {

            "What is a summary of major events in world history?",
            "Modern humans are estimated to be about 200,000 years old, but it seems that 99% of technological progress has occurred in the last 10,000 years. What were we doing before that ?",
            "What events in history would be most tweeted about if Twitter existed during those events?",
            "Rise and Fall of Civilizations.",
            "What are the turning point events which triggered some major changes/revolutions/wars/discoveries in history?",
            "Why are countries like India and China so densely populated? What are the circumstances and reasons?",
            "How Geography Shaped Cultural Boundaries",
            "In the olden days, where did people go to exchange ideas?",
            "Why civilizations and cultures tend to expand east-west?",

            "How world empires change every 1500 years.",
            "3 Global Climate Change Events that Changed Indian History",
            "Why did not people X conquer territory Y?",
            /*
            "Major Epidemics that Changed History.",
            "How did humanity end up living in deserts?",
            "How Domestication of Plants and Animals Impacted World History.",
            "Evolution of Humans.",
            "How the last Ice Age shaped the human history?",
            "Why did Native American diseases not result in the massive pandemics upon transferal that Old World diseases did in the Americans?",
            "If the world is ending tomorrow, what is the most significant moment in history?",
            "In the olden days, where did people go to exchange ideas?",
            "Spread of Gunpowder.",
            "Spread of Paper.",
            "Why haven't countries other than U.S. gone to the Moon?",
            "What is the reason that majority of the scientists / Mathematicians famous today were from 1500 AD to 1900 AD and from Europe?",
            "Considering that all cultures are equal, why have Europeans achieved so much more than other cultures throughout history?",
            "How did the university system of education come into existence?",
            "What was the greatest empire in world history?",
            "Superpowers and Empires",
            "Why did Genghis Khan not attack India?",
            "How was Japan able to occupy so many countries up to 1942?",
            "What were the factors that led to the fall of the Portuguese empire given that it is one of the longest-lasting (600 years) in the history of mankind?",
            "French empire vs. Spain and Portugal did?",
            "Why is the British Empire considered to have been so successful?",
            "How Mohammad Helped Create Europe.",
            "Why was old Germany called the Holy Roman Empire?",
            "Why has every person who has dreamt of conquering Europe faltered in Russia?",
            "Why do we romanticize violent invaders of the past such as the Vikings and are shocked by the brutal tactics of ISIS?",
            "A Brief History of Russia.",
            "The History of Europe",
            "A Brief History of Africa",
            "Ascendance of America: A Quora Book on American History.",
            "What should everyone know about Chinese history?",
            "How did the map of India change from 1 AD to the 21st century?",
            "Greater India: Tracing the Sanskrit Influence in Southeast Asia.",
            "What is the summary of the history of Indonesia?",
            "Formation of Turkey.",
            "What is the political history of Iraq?",
            "History of Sectarianism in Iraq.",
            "How did Switzerland never participate in any war?",
            "How did Israel become so powerful?",
            "Was Japan undefeated in history till World War 2?",
            "Why was Christopher Columbus searching for India?",
            "If Columbus thought he was in India, why did he treat the Indians so incredibly poorly, even killing and enslaving them?",
            "Struggle for Independence and Decolonizing the World.",
            "Why couldn't the British settle in India by 'exterminating' the native population as it did in the Americas and Australia?",
            "Why have European colonial powers never conquered China like they did with India?",
            "Why did British colonialism fail in America but succeed marvellously in India?",
            "Why did the British empire decline in the twentieth century?",
            "The Indus Valley Civilization was one of the most advanced civilizations. Yet India is a poor country now. What went wrong?",
            "What were the social and cultural factors that led to India's downfall in the past?",
            "Why Colonization was Bad for India?",
            "Just how did a handful of British manage to rule India?",
            "Were the British benevolent with India?",
            "How could India have prevented being colonized by Britain?",
            "What was the most successful revolution in history?",
            "How did languages evolve?",
            "Why did all five of the world's major religions begin in Asia?",
            "The Age of Philosophy",
            "How did Christianity become one of the world's most popular religions?",
            "What is the story of Jews?",
            "Why and how was the Muslim conquest so successful?",
            "Why is North India not so diverse compared to South India?",
            "Short Summary of Major Wars.",
            "What battles, prior to World War One, did most to affect the course of human history?",
            "What was the 3rd biggest war in the history of the world? (biggest in terms of individuals involved, not casualties)",
            "Three Centuries of Great European War",
            "What should one know about the two world wars?",
            "Was WWI and WWII two wars or one war with a period of peace in between?",
            "How can one summarize World War I in ten sentences or fewer?",
            "How can one summarize World War II in 10 sentences or less?",
            "What is the Israel-Gaza conflict?",
            "Why have Japan and Germany shown contrasting attitudes towards accepting and apologizing for their crimes in World War II?",
            "Were the atomic bombings of Nagasaki and Hiroshima justifiable? Were these bombings necessary? Why or why not?",
            "What country won World War II? Which country benefited most from the war?",
            "Why do Indians insist they won the 1965 Indo-Pak even though they wanted a ceasefire?",
            "Who started the Indo-Pakistani War of 1971?",
            "How did the Korean War start?",
            "What are the historical background and consequences of Vietnam War?",
            "Are we experiencing right now the best period in human history?",
            "How do you explain Hitler's rise to power given his unusual background?",
            "Charlemagne: Father of Western Europe",
            "Why did the Huns led by Attila invade Europe and not China?",
            "What other now commonplace items did the Napoleons help promote?",
            "In all of world history, who was the most powerful person on earth for his/her time?",
            "Great conquerors have always won over weak empires.",
            "Who are the greatest international leaders since 1945?",
            "How did gold become the historical standard store of value?",
            "What is Bronze Age? Why is it important?"
*/

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptr_list);
        setListAdapter(new ArrayAdapter<String>(this, R.id.pull_refresh_list, CHEESES));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;

                switch( position )
                {
                    case 1:  Intent newActivity = new Intent(FirstActivity.this, First1.class);
                        startActivity(newActivity);
                        break;
                    case 2:  Intent newActivity2 = new Intent(FirstActivity.this, First2.class);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(FirstActivity.this, First3.class);
                        startActivity(newActivity3);
                        break;
                    case 4:Intent newActivity4 = new Intent(FirstActivity.this, First4.class);
                        startActivity(newActivity4);
                        break;
                    case 5:Intent newActivity5 = new Intent(FirstActivity.this, First5.class);
                        startActivity(newActivity5);
                        break;
                    case 6:Intent newActivity6 = new Intent(FirstActivity.this, First6.class);
                        startActivity(newActivity6);
                        break;
                    case 7:Intent newActivity7 = new Intent(FirstActivity.this, First7.class);
                        startActivity(newActivity7);
                        break;
                    case 8:Intent newActivity8 = new Intent(FirstActivity.this, First8.class);
                        startActivity(newActivity8);
                        break;
                    case 9:Intent newActivity9 = new Intent(FirstActivity.this, First9.class);
                        startActivity(newActivity9);
                        break;
                    case 10:Intent newActivity10 = new Intent(FirstActivity.this, First10.class);
                        startActivity(newActivity10);
                        break;
                    case 11:Intent newActivity11 = new Intent(FirstActivity.this, First11.class);
                        startActivity(newActivity11);
                        break;
                    case 12:Intent newActivity12 = new Intent(FirstActivity.this, First12.class);
                        startActivity(newActivity12);
                        break;






                }







    }


}
