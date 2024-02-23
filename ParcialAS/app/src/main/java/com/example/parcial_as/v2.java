package com.example.parcial_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class v2 extends AppCompatActivity {

    TextView no,ap;

    Button apl,to,buy;

    static TextView canti, canti2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v2);

        no=findViewById(R.id.Nombre);
        ap=findViewById(R.id.suename);
        apl=findViewById(R.id.apple);
        to=findViewById(R.id.Tomato);
        canti=findViewById(R.id.canti);
        canti2=findViewById(R.id.canti2);
        buy=findViewById(R.id.buy);


        String names = getIntent().getStringExtra("nombre");
        String apelli = getIntent().getStringExtra("apellido");

        no.setText(names);
        ap.setText(apelli);

        final int[] n = {0};
        final int[] s = {0};

        apl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cuenta;
                cuenta=count(n[0]);
                canti.setText("cantidad="+cuenta);
                n[0] = n[0] +1;



            }
        });
        to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cuenta2;
                cuenta2=count(s[0]);
                canti2.setText("cantidad="+cuenta2);
                s[0] = s[0] +1;

            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v2.this, v3.class);
                String manzana = canti.getText().toString();
                intent.putExtra("manzana", manzana);

                String tomate = canti2.getText().toString();
                intent.putExtra("tomate",tomate );

                String names = no.getText().toString();
                intent.putExtra("nombre", names);

                String apelli = ap.getText().toString();
                intent.putExtra("apellido", apelli);

                startActivity(intent);
            }
        });
    }

    public static int count(int n){
        return n+1;
    }
}