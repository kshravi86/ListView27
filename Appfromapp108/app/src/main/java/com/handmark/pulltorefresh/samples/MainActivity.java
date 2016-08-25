package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.venki18.aakash.appfromapp108.R;

public class MainActivity extends Activity {

    String[] CHEESES = {

            "A Brief History of the World",
            "Reimagining Education: A Quora Book on Education",
            "Begininning with the Basics: What Everyone Should Know",
            "Ceaseless Conflicts: Quora Book on Present World Conflicts.",
            "Dancing with the Dharma: Quora book on Hinduism",
            "Eclectic Economics",
            "Fascinated by Finance",
            "Hamheaded Hostilities: Quora Book on World Wars.",
            "Hitler and the Holocaust",
            "Immersing in India: A Travel Book on India",
            "Marriage, Mango and the Monsoon",
            "Making of the Mahatma: On Gandhi.",
            "Puzzled with Pricing: Quora book on how businesses price things.",
            "The Mess in the Middle East: Quora book on the present crisis.",

            "Refining Reading",
            "From Tryst to Tendulkar: The History of Independent India",
            "Wandering for Wisdom: Quora book on Philosophy",
            " Writing Warriors: Quora book on Writing"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
       // setContentView(R.layout.sample_main);

        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, CHEESES);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

               switch( position )
               {
                   case 0:  Intent newActivity = new Intent(MainActivity.this, FirstActivity.class);
                       startActivity(newActivity);
                       break;
                   case 1:  Intent newActivity2 = new Intent(MainActivity.this, SecondActivity.class);
                       startActivity(newActivity2);
                       break;
                   case 2:  Intent newActivity3 = new Intent(MainActivity.this, ThirdActivity.class);
                       startActivity(newActivity3);
                       break;
                   case 3:Intent newActivity4 = new Intent(MainActivity.this, FourthActivity.class);
                       startActivity(newActivity4);
                       break;
                   case 4:Intent newActivity5 = new Intent(MainActivity.this, FifthActivity.class);
                       startActivity(newActivity5);
                       break;
                   case 5:Intent newActivity6 = new Intent(MainActivity.this, SixthActivity.class);
                       startActivity(newActivity6);
                       break;
                   case 6:Intent newActivity7 = new Intent(MainActivity.this, SeventhActivity.class);
                       startActivity(newActivity7);
                       break;
                   case 7:Intent newActivity8 = new Intent(MainActivity.this, EighthActivity.class);
                       startActivity(newActivity8);
                       break;
                   case 8:Intent newActivity9 = new Intent(MainActivity.this, NinthActivity.class);
                       startActivity(newActivity9);
                       break;
                   case 9:Intent newActivity10 = new Intent(MainActivity.this, TenthActivity.class);
                       startActivity(newActivity10);
                       break;
                   case 10:Intent newActivity11 = new Intent(MainActivity.this, EleventhActivity.class);
                       startActivity(newActivity11);
                       break;
                   case 11:Intent newActivity12 = new Intent(MainActivity.this, TwelthActivity.class);
                       startActivity(newActivity12);
                       break;
                   case 12:Intent newActivity13 = new Intent(MainActivity.this, ThirteenthActivity.class);
                       startActivity(newActivity13);
                       break;
                   case 13:Intent newActivity14 = new Intent(MainActivity.this, FourteenthActivity.class);
                       startActivity(newActivity14);
                       break;
                   case 14:Intent newActivity15 = new Intent(MainActivity.this, FifteenthActivity.class);
                       startActivity(newActivity15);
                       break;
                   case 15:Intent newActivity16 = new Intent(MainActivity.this, SixteenthActivity.class);
                       startActivity(newActivity16);
                       break;
                   case 16:Intent newActivity17 = new Intent(MainActivity.this, SeventeenthActivity.class);
                       startActivity(newActivity17);
                       break;
                   case 17:Intent newActivity18 = new Intent(MainActivity.this, EighteenthActivity.class);
                       startActivity(newActivity18);
                       break;


               }





            }
        });

    }

}
