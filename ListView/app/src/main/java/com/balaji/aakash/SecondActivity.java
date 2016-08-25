package com.balaji.aakash;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class SecondActivity extends Activity
{
	
	
	String[] CHEESES = {

		"A Trivial Pursuit by Balaji Viswanathan",
		"Why don't Indian poor people start a revolution?",
		"Ramanujan got only 56% in Mathematics at his Matriculation exam. Yet he is still a genius in Mathematics. How is this possible?",
		"What is true education?",
		"Given a chance to design Indian Education system, How would you do that?",
		"Why is there such a great emphasis on education, and specifically getting a degree, these days?",
		"What is wrong with giving a student higher grade than what he/she deserves?",
		"What can be a good set of evaluation parameters to reward students who can make a difference?",
		"Shouldn't top universities admit the weakest students?",
		/*
		 "Why did schooling become so expensive in India suddenly?",
		 "If all humans are born blank slates to be educated, then why are some students excelling while others are dropping out?",
		 "What is the life of a backbencher 10 years after graduation as compared to those studious 1st benchers?",
		 "Do you think going to college is necessary (Yes/No)? Why?",
		 "When is an MBA valuable?",
		 "Why doesn't economics have the aesthetic elegance like mathematics, physics, or computer science?",
		 "Are there skills (other than coding) that I can learn to get a good paid job?",
		 "What would Balaji Viswanathan advise to students from low tier engineering colleges?"
		 */

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
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
						case 0:  Intent newActivity = new Intent(SecondActivity.this, Second1.class);
							startActivity(newActivity);
							break;
						case 1:  Intent newActivity2 = new Intent(SecondActivity.this, Second2.class);
							startActivity(newActivity2);
							break;
						case 2:  Intent newActivity3 = new Intent(SecondActivity.this, Second3.class);
							startActivity(newActivity3);
							break;
						case 3:Intent newActivity4 = new Intent(SecondActivity.this, Second4.class);
							startActivity(newActivity4);
							break;
						case 4:Intent newActivity5 = new Intent(SecondActivity.this, Second5.class);
							startActivity(newActivity5);
							break;
						case 5:Intent newActivity6 = new Intent(SecondActivity.this, Second6.class);
							startActivity(newActivity6);
							break;
						case 6:Intent newActivity7 = new Intent(SecondActivity.this, Second7.class);
							startActivity(newActivity7);
							break;
						case 7:Intent newActivity8 = new Intent(SecondActivity.this, Second8.class);
							startActivity(newActivity8);
							break;
						case 8:Intent newActivity9 = new Intent(SecondActivity.this, Second9.class);
							startActivity(newActivity9);
							break;





					}





				}
			});
			


    }
	
	
	
	
}
