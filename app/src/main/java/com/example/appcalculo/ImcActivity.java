package com.example.appcalculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ImcActivity extends AppCompatActivity {

    Button btnCalcularImc;
    TextView textResultadoImc, textClassificacao;
    EditText nome, idade, peso, altura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        btnCalcularImc = findViewById(R.id.btnCalcularImc);
        textResultadoImc = findViewById(R.id.textResultadoImc);
        nome = findViewById(R.id.inputNome);
        idade = findViewById(R.id.inputIdade);
        peso = findViewById(R.id.inputPeso);
        altura = findViewById(R.id.inputAltura);
        textClassificacao = findViewById(R.id.textClassificacao);

        btnCalcularImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    // peso em quilos / altura² em metros

                    double pesoD = Double.parseDouble(peso.getText().toString());
                    double alturaD = Double.parseDouble(altura.getText().toString());

                    double imc = pesoD / (alturaD * alturaD);
                    String classificacao = "Nome: " + nome.getText().toString() + "\n Idade: " + idade.getText().toString() + "\n Peso: " + peso.getText().toString() + "\n Altura: " + altura.getText().toString() + "\n Classificação: " + classificacaoImc(imc);
                    textResultadoImc.setText("Seu IMC: " + String.valueOf(imc));
                    textClassificacao.setText(classificacao);
                }catch (Exception e) {
                    textResultadoImc.setText("Erro ao calcular o IMC");
                }

            }
        });
    }

    private String classificacaoImc(Double imc) {
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obeso";
        }

        return classificacao;
    }
}