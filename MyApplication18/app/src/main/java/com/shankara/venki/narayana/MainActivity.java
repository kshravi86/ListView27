package com.shankara.venki.narayana;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedData) {

        super.onCreate(savedData);

        setContentView(R.layout.single_expandable_list);

        ActionSlideExpandableListView list = (ActionSlideExpandableListView)this.findViewById(R.id.list);


        list.setAdapter(buildDummyData());

        // listen for events in the two buttons for every list item.
        // the 'position' var will tell which list item is clicked

    }


    public ListAdapter buildDummyData() {
        final int SIZE = 20;
        String[] values = new String[SIZE];
      values[0]="Create Table";
        values[1]="Insert Into";
        values[2]="Where Clause ";
        values[3]="Update";
        values[4]="Delete";
        values[5]="Order By";
        values[6]="Group By";
        values[7]="Alter table";
        values[8]="Union clause";
        values[9]="Like clause";
        values[10]="Join";
        values[11]="Create View";
        return new ArrayAdapter<String>(
                this,
                R.layout.expandable_list_item,
                R.id.text,
                values
        );
    }


/*

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button shivapancha=(Button)findViewById(R.id.shivapancha);
        Button bhajago=(Button)findViewById(R.id.bhajago);
        Button mahaganesha=(Button)findViewById(R.id.mahaganesha);
        Button nirvana=(Button)findViewById(R.id.nirvana);
        Button kanaka=(Button)findViewById(R.id.kanaka);
        Button annapurna=(Button)findViewById(R.id.annapurna);
        Button jyotir=(Button)findViewById(R.id.jyotir);
        Button actyuta=(Button)findViewById(R.id.actyuta);
        Button narayana=(Button)findViewById(R.id.narayana);
        Button govinda=(Button)findViewById(R.id.govinda);
        Button lalitapancha=(Button)findViewById(R.id.lalitapancha);
        Button ramapancha=(Button)findViewById(R.id.ramapancha);


        shivapancha.setText("Create Table");
        bhajago.setText("Insert Into");
        mahaganesha.setText("Where Clause ");
        nirvana.setText("Update");
        kanaka.setText("Delete");
        annapurna.setText("Order By");
        jyotir.setText("Group By");
        actyuta.setText("Alter table");
        narayana.setText("Union clause");
        govinda.setText("Like clause್");
        lalitapancha.setText("Join");
        ramapancha.setText("Create View");

        shivapancha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                Intent activityChangeIntent = new Intent(MainActivity.this, ShivaPanchakshari.class);

                // currentContext.startActivity(activityChangeIntent);

                startActivity(activityChangeIntent);
            }
        });

        bhajago.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Bhajago.class);


                startActivity(activityChangeIntent);
            }
        });

        mahaganesha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Mahaganesha.class);


                startActivity(activityChangeIntent);
            }
        });

        kanaka.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Kanaka.class);


                startActivity(activityChangeIntent);
            }
        });


        annapurna.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Annapurna.class);


                startActivity(activityChangeIntent);
            }
        });


        jyotir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Jyotir.class);


                startActivity(activityChangeIntent);
            }
        });


        actyuta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Actyuta.class);


                startActivity(activityChangeIntent);
            }
        });




        narayana.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Narayana.class);


                startActivity(activityChangeIntent);
            }
        });



        govinda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Govinda.class);


                startActivity(activityChangeIntent);
            }
        });



        lalitapancha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Lalitapancha.class);


                startActivity(activityChangeIntent);
            }
        });


        ramapancha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Ramapancha.class);


                startActivity(activityChangeIntent);
            }
        });

        nirvana.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                Intent activityChangeIntent = new Intent(MainActivity.this, Nirvana.class);

                // currentContext.startActivity(activityChangeIntent);

                startActivity(activityChangeIntent);
            }
        });










    }
    */

}
