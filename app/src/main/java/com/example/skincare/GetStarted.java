package com.example.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStarted extends AppCompatActivity {

    Button start_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        start_Button = findViewById(R.id.start_Button);
        start_Button.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GetStarted.this, imgWalkThrough.class);
                startActivity(i);
                finish();
            }
        });
    }
}