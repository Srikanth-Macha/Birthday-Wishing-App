package com.example.birthdaywishes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WishesActivity2 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishes2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("message_key2");

        TextView txt = findViewById(R.id.DisplayText2);

        txt.setText("Happy Birthday " + name+ "!!");


    }
}