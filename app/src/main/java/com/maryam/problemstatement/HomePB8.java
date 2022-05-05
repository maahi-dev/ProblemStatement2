package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePB8 extends AppCompatActivity {
  Button btnLogout8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pb8);
        getSupportActionBar().setTitle("Dashboard");

        btnLogout8 = findViewById(R.id.btnLogout8);

        btnLogout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("userlogout" ,0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("userlogin",false);
                edit.commit();

                Intent i = new Intent(HomePB8.this , ProblemStatement8.class);
                startActivity(i);
                finish();
            }
        });
    }
}