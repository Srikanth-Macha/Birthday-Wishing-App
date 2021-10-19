package com.example.birthdaywishes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WishesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishes);

        Intent intent = getIntent();
        String name = intent.getStringExtra("message_key");

        TextView txt = findViewById(R.id.DisplayText);

        txt.setText("Happy Birthday " + name);

    }
}