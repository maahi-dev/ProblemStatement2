package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProblemStatement8 extends AppCompatActivity {
    Button btnLogin8;
    EditText etPhone8 , etPassword8;
    TextView tvRegsiter8;

    dbPS8 dbObject = new dbPS8(ProblemStatement8.this , null , null , 1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement8);
        getSupportActionBar().setTitle("Problem Statement 8");

        tvRegsiter8 = findViewById(R.id.tvRegister8);
        etPhone8 = findViewById(R.id.etnumber8);
        etPassword8 = findViewById(R.id.etPassword8);
        btnLogin8 = findViewById(R.id.btnLogin8);

        btnLogin8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = etPhone8.getText().toString();
                String pass = etPassword8.getText().toString();

                if (user.equals("") || pass.equals("")){
                    Toast.makeText(ProblemStatement8.this , "Please enter all the filed" , Toast.LENGTH_SHORT).show();
                }
                else{
                    Boolean chkUserPass = dbObject.chkUsernamePassword(user , pass);

                    if (chkUserPass == true){
                        Toast.makeText(ProblemStatement8.this , "Login Successfully",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(ProblemStatement8.this , HomePB8.class);
                        startActivity(i);
                        finish();
                    }
                    else{
                        Toast.makeText(ProblemStatement8.this , "Invalid User and Password",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        tvRegsiter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProblemStatement8.this , RegisterPB8.class);
                startActivity(intent);
            }
        });
    }
}