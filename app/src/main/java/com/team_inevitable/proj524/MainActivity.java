package com.team_inevitable.proj524;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText age;
    EditText college;
    Button submit;
    Button viewall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.et1);
        email = findViewById(R.id.et2);
        age = findViewById(R.id.et3);
        college = findViewById(R.id.et4);
        submit = findViewById(R.id.submit);
        viewall = findViewById(R.id.viewall);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _name = name.getText().toString();
                String _email = email.getText().toString();
                String _age = age.getText().toString();
                String _college = college.getText().toString();
                System.out.println(_name + _email + _age + _college);
                name.setText("");
                email.setText("");
                age.setText("");
                college.setText("");
                ArrayList arrayList = new ArrayList();
                arrayList.add(_name);
                arrayList.add(_email);
                arrayList.add(_age);
                arrayList.add(_college);
                AllViewActivity.userList.add(arrayList);

            }
        });


        viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, AllViewActivity.class);
                startActivity(myIntent);
            }
        });



    }
}
