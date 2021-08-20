package com.example.supperapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private Button but_y, but_n;
    private ImageButton but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        but_y = findViewById(R.id.button1);
        but_n = findViewById(R.id.button2);
        but = findViewById(R.id.button3);

        but_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer x, y;
                y = 10 + (int)(Math.random() * 1390);
                x = 10 + (int)(Math.random() * 730);
                but_n.setX(x);
                but_n.setY(y);
            }
        });

        but_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("Я всегда знала!");
                but_n.setVisibility(View.GONE);
                but_y.setVisibility(View.GONE);
                but.setVisibility(View.VISIBLE);
            }
        });

        but.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                text.setText("Are you a LOH?");
                but_n.setVisibility(View.VISIBLE);
                but_y.setVisibility(View.VISIBLE);
                but_n.setX(610);
                but_n.setY(1000);
                but_y.setY(1000);
                but.setVisibility(View.GONE);
            }
        });
    }
}