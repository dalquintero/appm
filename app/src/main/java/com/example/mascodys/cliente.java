package com.example.mascodys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cirugias:
                Intent intent = new Intent(this, detallecirujia.class);
                startActivity(intent);

                break;
            case R.id.estetica:
                Intent intent2 = new Intent(this, detalleestetica.class);
                startActivity(intent2);
                break;
            case R.id.vacuna:
                Intent intent3 = new Intent(this, detallevacunas.class);
                startActivity(intent3);
                break;






        }
    }

}
