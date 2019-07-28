package com.example.sh_enterprises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;


public class Detailes extends AppCompatActivity {



    private EditText qnty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailes);

        qnty = findViewById(R.id.iemail);

    }
}



