package com.example.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class chat1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat1);

        RadioGroup group = findViewById(R.id.radioGrp1);
        RadioButton r1 = findViewById(R.id.male);
        RadioButton r2 = findViewById(R.id.female);
        RadioButton r3 = findViewById(R.id.nonbinary);

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chat1.this,chat.class);
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();


        switch(view.getId()){
            case R.id.male:
                if(checked) {
                    Intent i = new Intent(chat1.this,chat.class);
                    startActivity(i);
                }else
                    break;

            case R.id.female:
                if(checked) {
                    Intent i = new Intent(chat1.this, chat.class);
                    startActivity(i);
                }else
                    break;

            case R.id.nonbinary:
                if(checked) {
                    Intent i = new Intent(chat1.this, chat.class);
                    startActivity(i);
                }else
                    break;

        }

    }
}