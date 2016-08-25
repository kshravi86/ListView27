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
public class EighthActivity extends
        ListActivity {


    String[] CHEESES = {
            "How can one summarize World War II in 10 sentences or less?",
            "Why is World War II so much more famous than World War I?",
            "100 Years Ago: History Rhymes & Repeats",
            "Why has every person who has dreamt of conquering Europe faltered in Russia?",
            "How do you explain Hitler's rise to power given his unusual background?",
            "Did Hitler know Subhas Chandra Bose was married to a White Austrian woman?",
            "How did Switzerland never participate in any world wars?",
            "Would the Allies have defeated the Axis in WWII without the intervention of the United States?",
            "Which country played the greatest role in winning WW2, Britain, USSR or USA?",


            "How did the war in Europe shape Japan's strategy in the Pacific?",
            "Were the atomic bombings of Nagasaki and Hiroshima justifiable? Were these bombings necessary? Why or why not?",
            "Were the Japanese bombed with nukes partially because they were Asian?"


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
                    case 1:  Intent newActivity = new Intent(EighthActivity.this, Eighth1.class);
                        startActivity(newActivity);
                        break;
                    case 2:  Intent newActivity2 = new Intent(EighthActivity.this, Eighth2.class);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(EighthActivity.this, Eighth3.class);
                        startActivity(newActivity3);
                        break;
                    case 4:Intent newActivity4 = new Intent(EighthActivity.this, Eighth4.class);
                        startActivity(newActivity4);
                        break;
                    case 5:Intent newActivity5 = new Intent(EighthActivity.this, Eighth5.class);
                        startActivity(newActivity5);
                        break;
                    case 6:Intent newActivity6 = new Intent(EighthActivity.this, Eighth6.class);
                        startActivity(newActivity6);
                        break;
                    case 7:Intent newActivity7 = new Intent(EighthActivity.this, Eighth7.class);
                        startActivity(newActivity7);
                        break;
                    case 8:Intent newActivity8 = new Intent(EighthActivity.this, Eighth8.class);
                        startActivity(newActivity8);
                        break;
                    case 9:Intent newActivity9 = new Intent(EighthActivity.this, Eighth9.class);
                        startActivity(newActivity9);
                        break;
                    case 10:Intent newActivity10 = new Intent(EighthActivity.this, Eighth10.class);
                        startActivity(newActivity10);
                        break;
                    case 11:Intent newActivity11 = new Intent(EighthActivity.this, Eighth11.class);
                        startActivity(newActivity11);
                        break;
                    case 12:Intent newActivity12 = new Intent(EighthActivity.this, Eighth12.class);
                        startActivity(newActivity12);
                        break;



                }


    }
}
