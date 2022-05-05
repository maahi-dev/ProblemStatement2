package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProblemStatement4_2 extends AppCompatActivity {
    TextView tvProgramme4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement42);
        getSupportActionBar().setTitle("Programme List");
        tvProgramme4 = findViewById(R.id.tvProgramme4);

        Intent intent = getIntent();
        tvProgramme4.setText(intent.getStringExtra("Key"));
    }
}