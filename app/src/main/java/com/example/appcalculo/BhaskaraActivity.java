package com.example.appcalculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BhaskaraActivity extends AppCompatActivity {

    private EditText editTextA, editTextB, editTextC;
    private Button buttonCalcular;
    private TextView textViewResultado, textViewDelta, textViewRaizes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhaskara);

        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        editTextC = findViewById(R.id.editTextC);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        textViewResultado = findViewById(R.id.textViewResultado);
        textViewDelta = findViewById(R.id.textViewDelta);
        textViewRaizes = findViewById(R.id.textViewRaizes);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularBhaskara();
            }
        });
    }

    private void calcularBhaskara() {
        try {
            double a = Double.parseDouble(editTextA.getText().toString());
            double b = Double.parseDouble(editTextB.getText().toString());
            double c = Double.parseDouble(editTextC.getText().toString());

            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                textViewResultado.setText("Resultado: Não há raízes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                textViewResultado.setText("Resultado: Uma raiz real.");
                textViewDelta.setText("Delta: " + delta);
                textViewRaizes.setText("Raiz: " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                textViewResultado.setText("Resultado: Duas raízes reais.");
                textViewDelta.setText("Delta: " + delta);
                textViewRaizes.setText("Raiz 1: " + raiz1 + "\nRaiz 2: " + raiz2);
            }
        } catch (NumberFormatException e) {
            textViewResultado.setText("Por favor, insira valores válidos para A, B e C.");
            textViewDelta.setText("");
            textViewRaizes.setText("");
        }
    }
}