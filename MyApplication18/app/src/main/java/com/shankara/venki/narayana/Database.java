package com.shankara.venki.narayana;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by aakash on 22/7/16.
 */
public class Database extends ActionBarActivity {


  Button button;
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle bundle){

        super.onCreate(bundle);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final SQLiteDatabase sqLiteDatabase=openOrCreateDatabase("learnsql",MODE_PRIVATE,null);
        sqLiteDatabase.execSQL("create table if not exists venki (heading text,content text)");
        sqLiteDatabase.execSQL("insert into venki values('subbu','subrahmanya');");


        Cursor cursor=sqLiteDatabase.rawQuery("select * from venki",null);
        cursor.moveToFirst();
        String Fromdb=cursor.getString(cursor.getColumnIndex("heading"));
        Fromdb+=cursor.getString(cursor.getColumnIndex("content"));
        sqLiteDatabase.close();


        TextView tvKannada = (TextView) findViewById(R.id.tvKannada);

        tvKannada.setText(Fromdb);


    }

}