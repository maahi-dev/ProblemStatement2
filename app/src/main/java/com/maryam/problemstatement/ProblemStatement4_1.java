package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ProblemStatement4_1 extends AppCompatActivity {
    ListView lvProgramme4;
    Integer index;
    public ArrayList<String> mylist = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement41);
        getSupportActionBar().setTitle("Department Programme List");
        lvProgramme4 = findViewById(R.id.lvProgramme4);

        Intent intent = getIntent();
        index = intent.getIntExtra("Key", 0);

        switch (index) {
            case 0:
                mylist.add("M.Sc.(I.C.T.)");
                mylist.add("M.Sc.(I.T.)");
                break;
            case 1:
                mylist.add("B.B.A.");
                mylist.add("M.B.A.");
                break;
        }

        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(
                this,
                androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
                mylist);
        lvProgramme4.setAdapter(arr);

        lvProgramme4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Click ListItem Number " + mylist.get(position), Toast.LENGTH_LONG)
                        .show();
                Intent intent = new Intent(ProblemStatement4_1.this,ProblemStatement4_2.class);
                intent.putExtra("Key", mylist.get(position));
                startActivity(intent);
            }
        });
    }
}