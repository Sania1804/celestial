package com.example.skincare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class dashBorad extends AppCompatActivity {

    CardView cardview1;
    CardView cardview2;
    CardView cardview3;
    CardView cardview4;
    CardView cardView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_borad);

        cardview1 = findViewById(R.id.clothingCard);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashBorad.this,dailyRoutines.class);
                startActivity(intent);
            }
        });

        cardview2 = findViewById(R.id.Tips);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashBorad.this,tip.class);
                startActivity(intent);
            }
        });

        cardview3 = findViewById(R.id.doc);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashBorad.this,docCheck.class);
                startActivity(intent);
            }
        });

        cardview4 = findViewById(R.id.profile);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashBorad.this,profile.class);
                startActivity(intent);
            }
        });

        cardView5 = findViewById(R.id.products);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashBorad.this,routine.class);
                startActivity(intent);
            }
        });

    }
}