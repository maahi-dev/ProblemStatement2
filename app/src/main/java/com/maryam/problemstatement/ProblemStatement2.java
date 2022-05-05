package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemStatement2 extends AppCompatActivity {
    ListView lv1;
    EditText et1;
    Button btn1;
    String[] ListElements = new String[]{
            "Apple",
            "Mango",
            "Banana",
    };
    String[] pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement2);
        getSupportActionBar().setTitle("Problem Statement 2");

        lv1 = findViewById(R.id.lvItems);
        et1 = findViewById(R.id.txtItem);
        btn1 = findViewById(R.id.btnAdd);

        final List<String> ListElementArrayList = new ArrayList<>(Arrays.asList(ListElements));
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ListElementArrayList);
        lv1.setAdapter(adapter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListElementArrayList.add(et1.getText().toString());
                adapter.notifyDataSetChanged();
                et1.setText("");
            }
        });

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ListElementArrayList.remove(i);
                adapter.notifyDataSetChanged();
            }
        });

    }
}