package com.sistemas_informacion.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var textViewName : TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val name:String = intent.getStringExtra("name").toString()
        val age:String = intent.getStringExtra("age").toString()
        
        textViewName = findViewById(R.id.textViewName)
        //textViewName.text = "Bienvenido"
        textViewName.setText("Bienvenido: " + name)
    }
}