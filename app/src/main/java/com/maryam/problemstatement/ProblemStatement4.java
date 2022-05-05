package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ProblemStatement4 extends AppCompatActivity {
    ListView lvDepartments4;
    public static ArrayList<String> mylist = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement4);
        lvDepartments4 = findViewById(R.id.lvDepartments4);
        getSupportActionBar().setTitle("problem Statement 4");
        mylist.add("Department of ICT");
        mylist.add("Department of Management");
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(
                this,
                androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
                mylist);
        lvDepartments4.setAdapter(arr);

        lvDepartments4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(ProblemStatement4.this,ProblemStatement4_1.class);
                intent.putExtra("Key",position);
                startActivity(intent);
            }
        });
    }
}