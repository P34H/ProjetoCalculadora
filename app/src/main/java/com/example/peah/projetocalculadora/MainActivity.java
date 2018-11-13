package com.example.peah.projetocalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt1;//mapeando campos
    EditText edt2;
    EditText edtR;
    Button bt;
    Button btSub;
    Button btMult;
    Button btDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText) findViewById(R.id.editTextValor1);//ligar o componente do layout por id forçando um typecast
        edt2 = (EditText) findViewById(R.id.editTextValor2);
        edtR = (EditText) findViewById(R.id.editTextResultado);
        bt = (Button) findViewById(R.id.buttonSoma);
        btSub = (Button) findViewById(R.id.buttonSub);
        btMult = (Button) findViewById(R.id.buttonMult);
        btDiv = (Button) findViewById(R.id.buttonDiv);

        //açao para o botao soma
        bt.setOnClickListener(new View.OnClickListener() {// gerar um evento on Click
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double res;
                v1 =Double.parseDouble( edt1.getText().toString());//converte variavel para tipo double
                v2 =Double.parseDouble( edt2.getText().toString());
                res = v1+v2;
                edtR.setText(res.toString());

            }
        });

        //açao para o botao SUBTRAÇAO
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double res;
                v1 =Double.parseDouble( edt1.getText().toString());//converte variavel para tipo double
                v2 =Double.parseDouble( edt2.getText().toString());
                res = v1-v2;
                edtR.setText(res.toString());

            }
        });

        //açao para o botao MULTIPLICAÇÃO
        btMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double res;
                v1 =Double.parseDouble( edt1.getText().toString());//converte variavel para tipo double
                v2 =Double.parseDouble( edt2.getText().toString());
                res = v1*v2;
                edtR.setText(res.toString());

            }
        });

        //açao para o botao DIVISÃO
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double res;
                v1 =Double.parseDouble( edt1.getText().toString());//converte variavel para tipo double
                v2 =Double.parseDouble( edt2.getText().toString());
                res = v1/v2;
                edtR.setText(res.toString());

            }
        });


    }
}
