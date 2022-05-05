package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ProblemStatement6 extends AppCompatActivity {
    ConstraintLayout constraintLayout6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement6);
        getSupportActionBar().setTitle("Problem Statement 6");
        constraintLayout6 = findViewById(R.id.constraintLayout6);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.red:
                constraintLayout6.setBackgroundResource(R.color.red);
                Toast.makeText(getApplicationContext(),"Red Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.green:
                constraintLayout6.setBackgroundResource(R.color.green);
                Toast.makeText(getApplicationContext(),"Green Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.blue:
                constraintLayout6.setBackgroundResource(R.color.blue);
                Toast.makeText(getApplicationContext(),"Blue Selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}