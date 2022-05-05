package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ProblemStatement3 extends AppCompatActivity {
    ListView lvValue3;
    public static ArrayList<String> mylist = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement3);
        getSupportActionBar().setTitle("Problem Statement 3");
        lvValue3 = findViewById(R.id.lvValues3);
        mylist.add("Apple");
        mylist.add("Banana");
        mylist.add("Mango");
        mylist.add("Pineapple");
        mylist.add("Kiwi");

        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(
                this,
                androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
                mylist);
        lvValue3.setAdapter(arr);

        lvValue3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(ProblemStatement3.this,ProblemStatement3_1.class);
                intent.putExtra("Key",position);
                startActivity(intent);
            }
        });

    }
}