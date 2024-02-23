package com.example.parcial_as;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class v3 extends AppCompatActivity {

    TextView ma,tom,nam,surn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v3);

        ma=findViewById(R.id.Manzana);
        tom=findViewById(R.id.tomate);
        nam=findViewById(R.id.Nombre);
        surn=findViewById(R.id.suename);



        String names = getIntent().getStringExtra("nombre");
        String apelli = getIntent().getStringExtra("apellido");

        String manzana= getIntent().getStringExtra("manzana");
        String tomate = getIntent().getStringExtra("tomate");

        nam.setText(names);
        surn.setText(apelli);

        ma.setText(manzana);
        tom.setText(tomate);
    }
}