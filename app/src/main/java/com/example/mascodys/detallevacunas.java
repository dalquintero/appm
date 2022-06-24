package com.example.mascodys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detallevacunas extends AppCompatActivity {


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallevacunas);
        button = findViewById(R.id.buttonvet);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonvet:
                startActivity(new Intent(this, veterinarias.class));
                break;

        }
    }
    }