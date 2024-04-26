package com.example.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class chat3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat3);

        RadioGroup group = findViewById(R.id.radioGrp3);
        RadioButton r1 = findViewById(R.id.less);
        RadioButton r2 = findViewById(R.id.more);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chat3.this,chat4.class);
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();


        switch (view.getId()) {
            case R.id.less:
                if (checked) {
                    Intent i = new Intent(chat3.this, chat4.class);
                    startActivity(i);
                } else
                    break;

            case R.id.more:
                if (checked) {
                    Intent i = new Intent(chat3.this, chat4.class);
                    startActivity(i);
                } else
                    break;


        }
    }
}