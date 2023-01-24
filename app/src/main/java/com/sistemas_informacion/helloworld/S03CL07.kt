package com.sistemas_informacion.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
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

    fun sexoSeleccionado(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked
            
            when (view.getId()) {
                R.id.radioButtonMujer -> { 
                    Toast.makeText(this, "Se ha seleccionado mujer", Toast.LENGTH_SHORT).show()
                }
                R.id.radioButtonHombre -> { 
                    Toast.makeText(this, "Se ha seleccionado hombre", Toast.LENGTH_SHORT).show()
                }
                R.id.radioButtonIndefinido -> { 
                    Toast.makeText(this, "Se ha seleccionado indefinido", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


}