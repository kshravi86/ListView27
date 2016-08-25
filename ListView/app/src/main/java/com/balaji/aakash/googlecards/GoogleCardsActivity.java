/*
 * Copyright 2014 Niek Haarman
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
 */
package com.balaji.aakash.googlecards;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.balaji.aakash.BaseActivity;
import com.balaji.aakash.R;
import com.nhaarman.listviewanimations.itemmanipulation.swipedismiss.OnDismissCallback;

public class GoogleCardsActivity extends BaseActivity implements OnDismissCallback {

    private static final int INITIAL_DELAY_MILLIS = 300;
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

    };

    private GoogleCardsAdapter mGoogleCardsAdapter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googlecards);

        ListView listView = (ListView) findViewById(R.id.activity_googlecards_listview);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, CHEESES);
      //  mGoogleCardsAdapter = new GoogleCardsAdapter(this);
        //SwingBottomInAnimationAdapter swingBottomInAnimationAdapter = new SwingBottomInAnimationAdapter(new SwipeDismissAdapter(mGoogleCardsAdapter, this));
        //swingBottomInAnimationAdapter.setAbsListView(listView);

        //assert swingBottomInAnimationAdapter.getViewAnimator() != null;
        //swingBottomInAnimationAdapter.getViewAnimator().setInitialDelayMillis(INITIAL_DELAY_MILLIS);

        listView.setAdapter(adapter);

        for (int i = 0; i < 100; i++) {
            mGoogleCardsAdapter.add(i);
        }
    }

    @Override
    public void onDismiss(@NonNull final ViewGroup listView, @NonNull final int[] reverseSortedPositions) {
        for (int position : reverseSortedPositions) {
            mGoogleCardsAdapter.remove(position);
        }
    }
}
