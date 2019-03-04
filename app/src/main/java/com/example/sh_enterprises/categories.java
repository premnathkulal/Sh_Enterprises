package com.example.sh_enterprises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        CardView cbiscate = findViewById(R.id.Biscuit);
        CardView cCandy = findViewById(R.id.Candy);

        CardView bbl = findViewById(R.id.Bubble);
        CardView chps = findViewById(R.id.Chips);

        CardView clate = findViewById(R.id.Chocolate);
        CardView cofee = findViewById(R.id.Cofee);

        CardView frtj = findViewById(R.id.Fruit_Juce);
        CardView ghe = findViewById(R.id.Ghee);

        CardView gndsp = findViewById(R.id.Ground_Spice_Powder);

        cbiscate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS1","Biscuit");
                i.putExtra("PASS2","cat");
                startActivity(i);
            }
        });

        cCandy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS1","Candy");
                i.putExtra("PASS2","cat");
                startActivity(i);
            }
        });

        bbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS1","Bubble");
                i.putExtra("PASS2","cat");
                startActivity(i);
            }
        });

        chps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS1","Chips");
                i.putExtra("PASS2","cat"); i.putExtra("PASS2","cat");
                startActivity(i);
            }
        });

        clate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS1","Chocolate");
                i.putExtra("PASS2","cat");
                startActivity(i);
            }
        });

        cofee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS1","Cofee");
                i.putExtra("PASS2","cat");
                startActivity(i);
            }
        });

        frtj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS1","Fruit_Juce");
                i.putExtra("PASS2","cat");
                startActivity(i);
            }
        });

        ghe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS1","Ghee");
                i.putExtra("PASS2","cat");
                startActivity(i);
            }
        });

        gndsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS1","Ground_Spice_Powder");
                i.putExtra("PASS2","cat");
                startActivity(i);
            }
        });

    }


}
