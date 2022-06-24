package com.example.mascodys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iniciosesion extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciosesion);
        button = findViewById(R.id.btmI);
        button = findViewById(R.id.btnV);
        button=findViewById(R.id.btnregistro);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btmI:
                startActivity(new Intent(this, cliente.class));
                break;

            case R.id.btnV:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.btnregistro:
                startActivity(new Intent(this, registro.class));
                break;


        }
    }
}