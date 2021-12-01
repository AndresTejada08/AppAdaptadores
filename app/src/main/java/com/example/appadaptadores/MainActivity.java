package com.example.appadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appadaptadores.R;

public class MainActivity extends AppCompatActivity {

    Button bttnBienvenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttnBienvenido = findViewById(R.id.bttn_bienvenido);

        bttnBienvenido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
                startActivity(intent);
            }
        });
    }
}