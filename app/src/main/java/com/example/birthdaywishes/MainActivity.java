package com.example.birthdaywishes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.nextbutton);
        Random ran = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = ran.nextInt(3);
                x += 1;

                EditText sendtxt = findViewById(R.id.editTextPersonName);
                String name = sendtxt.getText().toString();

                if(x == 1){
                    Intent intent = new Intent(view.getContext(),WishesActivity.class);

                    intent.putExtra("message_key",name);

                    startActivity(intent);
                }else if(x == 2){
                    Intent intent = new Intent(view.getContext(),WishesActivity2.class);

                    intent.putExtra("message_key2",name);

                    startActivity(intent);
                }else{
                    Intent intent = new Intent(view.getContext(),WishesActivity3.class);

                    intent.putExtra("message_key3",name);

                    startActivity(intent);
                }

            }
        });

    }
}