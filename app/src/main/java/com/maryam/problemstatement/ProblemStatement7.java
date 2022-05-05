package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProblemStatement7 extends AppCompatActivity {
    EditText etValue;
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement7);
        getSupportActionBar().setTitle("Problem Statement 7");
        etValue = findViewById(R.id.etValue7);
        btnNext = findViewById(R.id.btnNext7);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProblemStatement7.this,ProblemStatement7_1.class);
                intent.putExtra("NewValue",etValue.getText().toString());
                startActivity(intent);
            }
        });
    }
}