package com.example.skincare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signUp extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference reference;
    EditText signup_email, signup_password, signup_username, signup_name;
    Button signup_button;
    TextView loginRedirectText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signup_username = findViewById(R.id.signup_username);
        signup_name = findViewById(R.id.signup_name);
        signup_email = findViewById(R.id.signup_email);
        signup_password = findViewById(R.id.signup_password);
        signup_button = findViewById(R.id.signup_button);
        loginRedirectText = findViewById(R.id.loginRedirectText);


        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");


                String name = signup_name.getText().toString();
                String username = signup_username.getText().toString();
               String email = signup_email.getText().toString();
               String password = signup_password.getText().toString();


               HelperClass helperClass = new HelperClass(username,email,password,name);
                reference.child(username).setValue(helperClass);

                Toast.makeText(signUp.this,"You have signup successfully",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(signUp.this, logIn.class);
                startActivity(intent);
            }
        });

        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signUp.this,logIn.class);
                startActivity(intent);
            }
        });
    }
}