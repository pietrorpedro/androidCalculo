package com.example.appcalculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalculoActivity extends AppCompatActivity {

    EditText input1, input2, input3;
    TextView somaCalculo;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        somaCalculo = findViewById(R.id.somaCalculo);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int val1 = Integer.parseInt(input1.getText().toString());
                    int val2 = Integer.parseInt(input2.getText().toString());
                    int val3 = Integer.parseInt(input3.getText().toString());

                    int soma = val1 + val2 + val3;

                    somaCalculo.setText(String.valueOf(soma));
                }catch(Exception e) {
                    somaCalculo.setText("Erro");
                }
            }
        });
    }
}