package com.sistemas_informacion.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class S03CL07 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s03_cl07)
    }

    fun onCheckHobbie(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            
            when (view.id) {
                R.id.checkBoxDeporte -> {
                    if (checked) {
                        Toast.makeText(this, "Se marco deporte", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText( this, "Se desmarco deporte", Toast.LENGTH_LONG).show()
                    }
                }
                R.id.checkBoxVideojuegos -> {
                    if (checked) {
                        Toast.makeText(this, "Se marco videojuegos", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this, "Se desmarco videojuegos", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
    }


}