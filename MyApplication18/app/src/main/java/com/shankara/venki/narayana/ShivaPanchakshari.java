package com.shankara.venki.narayana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ShivaPanchakshari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvKannada = (TextView) findViewById(R.id.tvKannada);
        tvKannada.setMovementMethod(new ScrollingMovementMethod());




        tvKannada.setText("CREATE TABLE table_name(\n" +
                "column1 datatype,\n" +
                "column2 datatype,\n" +
                "column3 datatype,\n" +
                ".....\n" +
                "columnN datatype,\n" +
                "PRIMARY KEY( one or more columns )\n" +
                ");");
    }
}
