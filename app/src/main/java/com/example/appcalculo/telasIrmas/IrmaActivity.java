package com.example.appcalculo.telasIrmas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.appcalculo.MainActivity;
import com.example.appcalculo.R;

public class IrmaActivity extends AppCompatActivity {

    TextView textEnviado;
    EditText inputTitulo, inputConteudo;
    Button btnEnviar, btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irma);

        textEnviado = findViewById(R.id.textEnviado);
        inputTitulo = findViewById(R.id.inputTitulo);
        inputConteudo = findViewById(R.id.inputConteudo);
        btnEnviar = findViewById(R.id.btnEnviar);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titulo = inputTitulo.getText().toString();
                String conteudo = inputConteudo.getText().toString();

                // cria o intent
                Intent intent = new Intent(IrmaActivity.this, IrmaoActivity.class);
                // coloca o nome e o valor das variaveis que vai levar para a IrmaoActivity
                intent.putExtra("titulo", titulo);
                intent.putExtra("conteudo", conteudo);

                textEnviado.setText("CARTA ENVIADA!!");
                // troca tela
                startActivity(intent);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IrmaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}