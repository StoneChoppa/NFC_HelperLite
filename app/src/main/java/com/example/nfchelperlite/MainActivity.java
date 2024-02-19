package com.example.nfchelperlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    AppCompatImageButton info;
    AppCompatButton read, data, write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        read = findViewById(R.id.readbtn);
        read.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ReadClass.class));
        });

        write = findViewById(R.id.writebtn);
        write.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, WriteClass.class));
        });

        data = findViewById(R.id.databtn);
        data.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, BaseClass.class));
        });

        info = findViewById(R.id.info);
        info.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, InfoClass.class));
        });

    }
}