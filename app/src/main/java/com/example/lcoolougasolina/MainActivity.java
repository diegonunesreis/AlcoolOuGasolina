package com.example.lcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText alcoolEt, gasolinaEt;
    TextView resultadoTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alcoolEt = findViewById(R.id.precoAlcool);
        gasolinaEt = findViewById(R.id.precoGasolina);
        resultadoTv = findViewById(R.id.resultadoTxt);
    }

    public void calcular(View view){
        String alcoolText = alcoolEt.getText().toString();
        String gasolinaText = gasolinaEt.getText().toString();
        double precoAlcool = 0, precoGasolina = 0;

        if(!"".equals(alcoolText) && !"".equals(gasolinaText)){
            precoAlcool = Double.parseDouble(alcoolText);
            precoGasolina = Double.parseDouble(gasolinaText);
            if((precoAlcool / precoGasolina) < 0.7)
                resultadoTv.setText("Melhor utilizar o álcool");
            else
                resultadoTv.setText("Melhor utilizar gasolina");
        }
        else{
            resultadoTv.setText("Preencha todos os campos.");
        }
    }

    public void limpar(View view){
        alcoolEt.setText("");
        gasolinaEt.setText("");
        resultadoTv.setText("");
    }
}