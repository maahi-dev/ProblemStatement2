package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterPB8 extends AppCompatActivity {
    TextView tvLogin8;
    Button btnRegister;
    EditText etRNumber8,etRPassword8 , etRePassword8;
    dbPS8 dbObject = new dbPS8(RegisterPB8.this , null , null , 1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_pb8);
        getSupportActionBar().setTitle("Register");

        tvLogin8 = findViewById(R.id.tvLogin8);
        etRNumber8 =findViewById(R.id.etRnumber8);
        etRPassword8 = findViewById(R.id.etRPassword8);
        etRePassword8 = findViewById(R.id.etRePassword8);
        btnRegister = findViewById(R.id.btnRegister8);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  user = etRNumber8.getText().toString();
                String pass = etRPassword8.getText().toString();
                String rePass = etRePassword8.getText().toString();

                if (user.equals("") || pass.equals("")){
                    Toast.makeText(RegisterPB8.this ,"Please enter All the fields" , Toast.LENGTH_SHORT).show();
                }
                else{
                    if (pass.equals(rePass)){
                        Boolean chkUser = dbObject.chkuserName(user);
                        if (chkUser == false){
                            Boolean insertUser =  dbObject.addUser(user, pass);
                            if (insertUser == true){
                                Toast.makeText(RegisterPB8.this ,"Registered successfully" , Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(RegisterPB8.this ,ProblemStatement8.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(RegisterPB8.this ,"Registered Failed " ,Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(RegisterPB8.this , "User Already exsits", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(RegisterPB8.this , "Password Not matching" , Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        tvLogin8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(RegisterPB8.this , ProblemStatement8.class);
                startActivity(i);
            }
        });
    }
}