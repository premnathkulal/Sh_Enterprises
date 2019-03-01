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
                i.putExtra("PASS","Biscuit");
                startActivity(i);
            }
        });

        cCandy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS","Candy");
                startActivity(i);
            }
        });

        bbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS","Bubble");
                startActivity(i);
            }
        });

        chps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS","Chips");
                startActivity(i);
            }
        });

        clate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS","Chocolate");
                startActivity(i);
            }
        });

        cofee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS","Cofee");
                startActivity(i);
            }
        });

        frtj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS","Fruit_Juce");
                startActivity(i);
            }
        });

        ghe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS","Ghee");
                startActivity(i);
            }
        });

        gndsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categories.this,Notes_List.class);
                i.putExtra("PASS","Ground_Spice_Powder");
                startActivity(i);
            }
        });

    }


}
