package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProblemStatement1_1 extends AppCompatActivity {
    TextView tvMName, tvAge, tvAddress, tvCity, tvPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement11);
        getSupportActionBar().setTitle("Employee Details");
        tvMName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);
        tvAddress = findViewById(R.id.tvAddress);
        tvCity = findViewById(R.id.tvCity);
        tvPhone = findViewById(R.id.tvPhone);

        Intent intent = getIntent();
        tvMName.setText(intent.getStringExtra("Name"));
        tvAge.setText(intent.getStringExtra("Age"));
        tvAddress.setText(intent.getStringExtra("Address"));
        tvCity.setText(intent.getStringExtra("City"));
        tvPhone.setText(intent.getStringExtra("Phone"));
    }
}