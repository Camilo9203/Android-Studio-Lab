package com.sistemas_informacion.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class JavaMainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btnLogin = findViewById(R.id.buttonLogin);
        
        btnLogin.setOnClickListener( view -> {
            Toast.makeText(this, "Click en el botón login", Toast.LENGTH_SHORT).show();
        });

        TextView textLogin = findViewById(R.id.textTitle);
        textLogin.setOnClickListener(this);
        /*
        *
        * Kotlin
        * 
        * setContentView(R.layout.activity_main)
        
        Log.i("LOGCICLO", "Entramos en método onCreate")
        
        val btnLogin: Button = findViewById(R.id.buttonLogin)
        btnLogin.setOnClickListener{view-> 
            Toast.makeText(this, "Click en el botón login", Toast.LENGTH_SHORT).show()   
        }
        
        val textLogin: TextView = findViewById(R.id.textTitle)
        textLogin.setOnClickListener(this)
         */
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Click en el titulo", Toast.LENGTH_SHORT).show();
    }
}