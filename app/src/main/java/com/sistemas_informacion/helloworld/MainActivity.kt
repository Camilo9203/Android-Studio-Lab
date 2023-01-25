package com.sistemas_informacion.helloworld

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var editTextName: EditText
    private lateinit var editTextAge: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        Log.i("LOGCICLO", "Entramos en método onCreate")
        editTextName = findViewById(R.id.editTextName)
        editTextAge = findViewById(R.id.editTextNumber)
//        val btnLogin: Button = findViewById(R.id.buttonLogin)
//        btnLogin.setOnClickListener{view-> 
//            Toast.makeText(this, "Click en el botón login", Toast.LENGTH_SHORT).show()   
//        }
        
        val textLogin: TextView = findViewById(R.id.textTitle)
        textLogin.setOnClickListener(this)
    }

    override fun onStart() {
        super.onStart()
        Log.i("LOGCICLO", "Entramos en método onStar")

    }
    override fun onResume() {
        super.onResume()
        Log.i("LOGCICLO", "Entramos en método onResume")

    }
    override fun onPause() {
        super.onPause()
        Log.i("LOGCICLO", "Entramos en método onPause")

    }
    override fun onStop() {
        super.onStop()
        Log.i("LOGCICLO", "Entramos en método onStop")

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("LOGCICLO", "Entramos en método onDestroy")

    }
    
    override fun onClick(v: View?) {
        Toast.makeText(this, "Click en titulo", Toast.LENGTH_SHORT).show()
    }

    fun clickOnLogin(view: View) {
        
        Log.i("APP", "Entramos en método clickOnLogin")
        
        val name = editTextName.getText().toString()
        val age = editTextAge.getText().toString()

        if (!name.isEmpty() && !age.isEmpty()) {
            val loginIntent = Intent(this, HomeActivity::class.java)
            loginIntent.putExtra("name", name)
            loginIntent.putExtra("age", age)
            startActivity(loginIntent)
        }
        else {
            editTextName.setError("Completa tu email")
            editTextAge.setError("Completa edad")
            Toast.makeText(this, "No se han completado los datos", Toast.LENGTH_SHORT).show()
        }
        
    }

}