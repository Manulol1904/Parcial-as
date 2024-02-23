package com.example.parcial_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText n,a;

    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n=findViewById(R.id.Name);
        a=findViewById(R.id.apellido);
        enter=findViewById(R.id.entrar);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, v2.class);
                String names = n.getText().toString();
                intent.putExtra("nombre", names);

                String apelli = a.getText().toString();
                intent.putExtra("apellido", apelli);

                startActivity(intent);
            }
        });
    }
}