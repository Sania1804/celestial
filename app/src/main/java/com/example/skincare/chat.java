package com.example.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        RadioGroup group = findViewById(R.id.radioGrp);
        RadioButton r1 = findViewById(R.id.normal);
        RadioButton r2 = findViewById(R.id.oily);
        RadioButton r3 = findViewById(R.id.dry);
        RadioButton r4 = findViewById(R.id.sensitive);
        RadioButton r5 = findViewById(R.id.combination);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chat.this,chat2.class);
                startActivity(intent);
            }
        });

    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();


        switch(view.getId()){
            case R.id.oily:
                if(checked) {
                    Intent i = new Intent(chat.this,chat2.class);
                    startActivity(i);
                }else
                    break;

            case R.id.normal:
                if(checked) {
                    Intent i = new Intent(chat.this, chat2.class);
                    startActivity(i);
                }else
                    break;

            case R.id.dry:
                if(checked) {
                    Intent i = new Intent(chat.this, chat2.class);
                    startActivity(i);
                }else
                    break;

            case R.id.sensitive:
                if(checked) {
                    Intent i = new Intent(chat.this, chat2.class);
                    startActivity(i);
                }else
                    break;

            case R.id.combination:
                if(checked) {
                    Intent i = new Intent(chat.this, chat2.class);
                    startActivity(i);
                }else
                    break;

        }



    }
}