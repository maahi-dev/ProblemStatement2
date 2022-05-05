package com.maryam.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProblemStatement3_1 extends AppCompatActivity {
    Integer Value;
    TextView tvItem3,tvItemDescription3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement31);
        getSupportActionBar().setTitle("Description");
        tvItem3 = findViewById(R.id.tvItem3);
        tvItemDescription3 = findViewById(R.id.tvItemDescription3);
        Intent intent = getIntent();
        Value = intent.getIntExtra("Key", 0);
//        Toast.makeText(getApplicationContext(),
//                "Click ListItem Number " + Value.toString(), Toast.LENGTH_LONG)
//                .show();

        switch (Value){
            case 0:
                tvItem3.setText("Apple");
                tvItemDescription3.setText("Color: Red");
                break;
            case 1:
                tvItem3.setText("Banana");
                tvItemDescription3.setText("Color: Yellow");
                break;
            case 2:
                tvItem3.setText("Mango");
                tvItemDescription3.setText("Color: Green");
                break;
            case 3:
                tvItem3.setText("Pineapple");
                tvItemDescription3.setText("Color: Yellow");
                break;
            case 4:
                tvItem3.setText("Kiwi");
                tvItemDescription3.setText("Color: Dark Green");
                break;
        }
    }
}