package com.example.appcalculo.telasIrmas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.appcalculo.MainActivity;
import com.example.appcalculo.R;

import java.util.List;

public class IrmaoActivity extends AppCompatActivity {

    Button btnVoltar;
    TextView textTitulo;
    TextView textConteudo;
    List<Carta> cartas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irmao);

        btnVoltar = findViewById(R.id.btnVoltar);
        textTitulo = findViewById(R.id.textTitulo);
        textConteudo = findViewById(R.id.textConteudo);

        Intent intentMain = new Intent(IrmaoActivity.this, MainActivity.class);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentMain);
            }
        });

        // captador de valores enviados
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            // pega os valores enviados
            String titulo = bundle.getString("titulo");
            String conteudo = bundle.getString("conteudo");


            // Verificações caso o texto não exista ou esteja vazio
            if (titulo == null || titulo.isEmpty()) {
                textTitulo.setText("Nenhuma carta recebida ainda!");
            } else {
                textTitulo.setText(titulo);
            }

            if (conteudo == null || conteudo.isEmpty()) {
                textConteudo.setText("");
            } else {
                textConteudo.setText(conteudo);
            }
        }
    }
}
