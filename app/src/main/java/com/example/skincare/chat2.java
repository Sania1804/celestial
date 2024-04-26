package com.example.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class chat2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat2);

        RadioGroup group = findViewById(R.id.radioGrp2);
        RadioButton r1 = findViewById(R.id.acne);
        RadioButton r2 = findViewById(R.id.darkcircles);
        RadioButton r3 = findViewById(R.id.blackheads);
        RadioButton r4 = findViewById(R.id.wrinkles);

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chat2.this,chat3.class);
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();


        switch (view.getId()) {
            case R.id.acne:
                if (checked) {
                    Intent i = new Intent(chat2.this, chat3.class);
                    startActivity(i);
                } else
                    break;

            case R.id.darkcircles:
                if (checked) {
                    Intent i = new Intent(chat2.this, chat3.class);
                    startActivity(i);
                } else
                    break;

            case R.id.blackheads:
                if (checked) {
                    Intent i = new Intent(chat2.this, chat3.class);
                    startActivity(i);
                } else
                    break;

            case R.id.wrinkles:
                if (checked) {
                    Intent i = new Intent(chat2.this, chat3.class);
                    startActivity(i);
                } else
                    break;


        }
    }
}