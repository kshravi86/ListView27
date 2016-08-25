/*******************************************************************************
 * Copyright 2011, 2012 Chris Banes.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.haarman.listviewanimations.samples;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LauncherActivity extends ListActivity {

	public static final String[] options = {  "A Brief History of the World",
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
		setContentView(R.layout.activity_ptr_list3);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent;

		switch (position) {
			default:
			case 1:
				intent = new Intent(this, FirstActivity.class);
				break;
			case 2:
				intent = new Intent(this, SecondActivity.class);
				break;
			case 3:
				intent = new Intent(this, ThirdActivity.class);
				break;
			case 4:
				intent = new Intent(this, FourthActivity.class);
				break;
			case 5:
				intent = new Intent(this, FifthActivity.class);
				break;
			case 6:
				intent = new Intent(this, SixthActivity.class);
				break;
			case 7:
				intent = new Intent(this, SeventhActivity.class);
				break;
			case 8:
				intent = new Intent(this, EighthActivity.class);
				break;
			case 9:
				intent = new Intent(this, NinthActivity.class);
				break;
			case 10:
				intent = new Intent(this, TenthActivity.class);
				break;
			case 11:
				intent=new Intent(this,EleventhActivity.class);
				break;
			case 12:
				intent=new Intent(this,TwelthActivity.class);
				break;
			case 13:
				intent=new Intent(this,ThirteenthActivity.class);
			case 14:
				intent=new Intent(this,FourteenthActivity.class);
				break;
			case 15:
				intent=new Intent(this,FifteenthActivity.class);
				break;
			case 16:
				intent=new Intent(this,SixteenthActivity.class);
				break;
			case 17:
				intent=new Intent(this,SeventeenthActivity.class);
				break;
			case 18:
				intent=new Intent(this,EighteenthActivity.class);
				break;
		}

		startActivity(intent);
	}

}
