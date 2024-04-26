package com.example.skincare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class routine extends AppCompatActivity {

    CardView cleanser;
    CardView moisturizer;
    CardView eyecream;
    CardView toner;
    CardView serum;
    CardView sunscreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);

        cleanser = findViewById(R.id.Cleanser);
        cleanser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(routine.this,product.class);
                startActivity(intent);

            }
        });


        moisturizer = findViewById(R.id.Moisturizer);
        moisturizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(routine.this,moisturizer.class);
                startActivity(intent);

            }
        });

        eyecream = findViewById(R.id.EyeCream);
        eyecream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(routine.this,eyecream.class);
                startActivity(intent);

            }
        });

        serum = findViewById(R.id.Serum);
        serum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(routine.this,serum.class);
                startActivity(intent);

            }
        });

        sunscreen = findViewById(R.id.Sunscreen);
        sunscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(routine.this,sunscreen.class);
                startActivity(intent);

            }
        });

        toner = findViewById(R.id.Toner);
        toner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(routine.this,toner.class);
                startActivity(intent);

            }
        });


    }
}