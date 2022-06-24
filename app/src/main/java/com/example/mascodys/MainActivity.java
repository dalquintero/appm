package com.example.mascodys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.button);
        button2= findViewById(R.id.button2);
        button3= findViewById(R.id.button3);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2:
                startActivity (new Intent (this, iniciosesion.class));
                break;
            case R.id.button:
                startActivity (new Intent (this, iniciosesion.class));
                break;
            case R.id.button3:
                startActivity (new Intent (this, iniciosesion.class));
                break;
        }
    }
}
