package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Fourteenth1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("These terms were coined the British Empire in relation to its colony in India. The term was actually coined by the British India office when Britain was playing the The Great Game. \n" +
                "\n" +
                " In fact, a lot of the mess that Britain made in the Middle East [such as the formation of Iraq] was related to their welfare/rule in India. In that view point, the Middle East became the broad geographical marker between Egypt and India. Far East became the marker for beyond India. \n" +
                "\n" +
                "Other possible alternatives to Middle East:\n" +
                "West Asia: But, this would exclude Turkey, Cyprus and Egypt - culturally middle east, but geographically not a part of Asia.\n" +
                "Arab world: That would not go well with Turkey or Iran.\n" +
                "Islamic world: That would exclude Israel and other formally secular nations like Turkey.\n" +
                "\n" +
                "Since none of the alternatives are attractive, the Middle East continues to hold sway. In fact, most of our geographical markers are randomly named this way. Why would you call China and India as Asia when it was originally used to mean Turkey? Why would you call a whole continent America based on just one explorer who happened to get a lot of press? Do you want to rename every such region in a politically correct way? Probably not");
    }






}

