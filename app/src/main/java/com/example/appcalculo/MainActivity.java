package com.example.appcalculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCalculoSimples, btnImc, btnBhaskara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculoSimples = findViewById(R.id.btnCalculoSimples);
        btnImc = findViewById(R.id.btnImc);
        btnBhaskara = findViewById(R.id.btnBhaskara);
        btnCalculoSimples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                startActivity(intent);
            }
        });
        btnImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImcActivity.class);
                startActivity(intent);
            }
        });
        btnBhaskara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BhaskaraActivity.class);
                startActivity(intent);
            }
        });
    }
}