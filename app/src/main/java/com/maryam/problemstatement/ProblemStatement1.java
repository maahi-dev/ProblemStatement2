package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProblemStatement1 extends AppCompatActivity {
    Button btnAdd;
    EditText etName, etAge, etAddress, etCity, etPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement1);
        getSupportActionBar().setTitle("Problem Statement 1");
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etAddress = findViewById(R.id.etAddress);
        etCity = findViewById(R.id.etCity);
        etPhone = findViewById(R.id.etPhone);
        btnAdd = findViewById(R.id.btnAddStudent);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProblemStatement1.this , ProblemStatement1_1.class);
                i.putExtra("Name",etName.getText().toString());
                i.putExtra("Age",etAge.getText().toString());
                i.putExtra("Address",etAddress.getText().toString());
                i.putExtra("City",etCity.getText().toString());
                i.putExtra("Phone",etPhone.getText().toString());
                startActivity(i);
            }
        });
    }
}