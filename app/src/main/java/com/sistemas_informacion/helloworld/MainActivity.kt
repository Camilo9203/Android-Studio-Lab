package com.sistemas_informacion.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        Log.i("LOGCICLO", "Entramos en método onCreate")
        
        val btnLogin: Button = findViewById(R.id.buttonLogin)
        btnLogin.setOnClickListener{view-> 
            Toast.makeText(this, "Click en el botón login", Toast.LENGTH_SHORT).show()   
        }
        
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

    fun clickOnLogin(view: View) {
        
        when(view.id) {
            R.id.buttonLogin -> {

            }
        }
    }

    override fun onClick(v: View?) {
        Toast.makeText(this, "Click en titulo", Toast.LENGTH_SHORT).show()
    }

}