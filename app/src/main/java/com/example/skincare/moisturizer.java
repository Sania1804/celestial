package com.example.skincare;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class moisturizer extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Data> dataList;
    DatabaseReference databaseReference;
    ValueEventListener eventListener;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moisturizer);

        recyclerView = findViewById(R.id.recyclerView_moisturizer);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(moisturizer.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        AlertDialog.Builder builder = new AlertDialog.Builder(moisturizer.this);
        builder.setCancelable(false);
        builder.setView(R.layout.progress_layout);
        AlertDialog dailog = builder.create();
        dailog.show();

        dataList = new ArrayList<>();

        adapter = new Adapter(moisturizer.this, dataList);
        recyclerView.setAdapter(adapter);

        databaseReference = FirebaseDatabase.getInstance().getReference("Moisturizer");
        dailog.show();

        eventListener = databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                dataList.clear();
                for(DataSnapshot itemSnapshot: snapshot.getChildren()){
                    Data data = itemSnapshot.getValue(Data.class);
                    data.setKey(itemSnapshot.getKey());
                    dataList.add(data);
                }
                adapter.notifyDataSetChanged();
                dailog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                dailog.dismiss();

            }
        });

    }
}