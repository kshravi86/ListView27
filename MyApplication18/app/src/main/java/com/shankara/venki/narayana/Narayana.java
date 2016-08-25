package com.shankara.venki.narayana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Narayana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvKannada = (TextView) findViewById(R.id.tvKannada);
        tvKannada.setMovementMethod(new ScrollingMovementMethod());



        tvKannada.setText("SELECT column1 [, column2 ]\n" +
                "FROM table1 [, table2 ]\n" +
                "[WHERE condition]\n" +
                "UNION\n" +
                "SELECT column1 [, column2 ]\n" +
                "FROM table1 [, table2 ]\n" +
                "[WHERE condition]");
    }
}
