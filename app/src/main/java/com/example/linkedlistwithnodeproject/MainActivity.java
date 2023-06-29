package com.example.linkedlistwithnodeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddToast();


    }

    private void AddToast() {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }
}


