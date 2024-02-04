package com.example.starview.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.starview.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        AppCompatButton getInBtn = findViewById(R.id.getInBtn);
        getInBtn.setOnClickListener(view -> {
            startActivity(new Intent(IntroActivity.this, LoginActivity.class));
        });
    }
}