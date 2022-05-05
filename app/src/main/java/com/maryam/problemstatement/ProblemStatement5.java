package com.maryam.problemstatement;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class ProblemStatement5 extends AppCompatActivity {
    EditText name, city, phone,Id;
    Button insert, update, delete, view;
    EmpDBPS5 EmpDB = new EmpDBPS5(ProblemStatement5.this,"emp",null,1); ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement5);
        getSupportActionBar().setTitle("Problem Statement 5");
        Id =  findViewById(R.id.Id);
        name = findViewById(R.id.name);
        city = findViewById(R.id.city);
        phone = findViewById(R.id.phone);
        insert = findViewById(R.id.btnInsert);
        update = findViewById(R.id.btnUpdate);
        delete = findViewById(R.id.btnDelete);
        view = findViewById(R.id.btnView);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String IdTXT = Id.getText().toString();
                String nameTXT = name.getText().toString();
                String cityTXT = city.getText().toString();
                String phoneTXT = phone.getText().toString();

                Boolean checkinsertdata = EmpDB.AddEmployee(IdTXT,nameTXT, cityTXT, phoneTXT);
                if(checkinsertdata==true)
                    Toast.makeText(ProblemStatement5.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(ProblemStatement5.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
            }        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String IdTXT = Id.getText().toString();
                String nameTXT = name.getText().toString();
                String cityTXT = city.getText().toString();
                String phoneTXT = phone.getText().toString();

                Boolean checkupdatedata = EmpDB.updateEmployee(IdTXT,nameTXT, cityTXT, phoneTXT);
                if(checkupdatedata==true)
                    Toast.makeText(ProblemStatement5.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(ProblemStatement5.this, "New Entry Not Updated", Toast.LENGTH_SHORT).show();
            }        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String IdTXT = Id.getText().toString();
                Boolean checkudeletedata = EmpDB.deleteEmployee(IdTXT);
                if(checkudeletedata==true)
                    Toast.makeText(ProblemStatement5.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(ProblemStatement5.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
            }        });

        view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Cursor res = EmpDB.getEmployee();
                if(res.getCount()==0){
                    Toast.makeText(ProblemStatement5.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Id :"+res.getString(0)+"\n");
                    buffer.append("Name :"+res.getString(1)+"\n");
                    buffer.append("City :"+res.getString(2)+"\n");
                    buffer.append("Phone :"+res.getString(3)+"\n\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(ProblemStatement5.this);
                builder.setCancelable(true);
                builder.setTitle("Employee Entries");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
    }
}