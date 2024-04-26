package com.example.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class dailyRoutines extends AppCompatActivity {

    TextView detailsText;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_routines);

        detailsText = findViewById(R.id.details);
        layout = findViewById(R.id.layout);

    }

    public void expand(View view) {

        int v = (detailsText.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        detailsText.setVisibility(v);


    }
}