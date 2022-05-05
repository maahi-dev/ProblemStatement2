package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ProblemStatement7_1 extends AppCompatActivity {
    ListView lvValues;
    String newValue;
    public static ArrayList<String> mylist = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement71);
        getSupportActionBar().setTitle("Items List");
        lvValues = findViewById(R.id.lvValues7);
        Intent intent = getIntent();
        newValue = intent.getStringExtra("NewValue");
        mylist.add(newValue);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(
                this,
                androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
                mylist);
        lvValues.setAdapter(arr);
    }
}