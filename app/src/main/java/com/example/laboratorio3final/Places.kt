package com.example.laboratorio3final


import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3final.databinding.ActivityPlacesBinding
import com.example.laboratorio3final.models.Modelo

class Places : AppCompatActivity() {
    private lateinit var binding1:ActivityPlacesBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        val prueba:Modelo=Modelo(getString(R.string.tikal), "ESTO ES SUBTITULO",getString(R.string.bio))
        val prueba1:Modelo=Modelo(getString(R.string.antigua), "ESTO ES SUBTITULO","Descripcion")
        val prueba2:Modelo=Modelo(getString(R.string.semuc), "ESTO ES SUBTITULO","Descripcion")

        super.onCreate(savedInstanceState)

        binding1= DataBindingUtil.setContentView(this,
            R.layout.activity_places
        )

        val string: String? = intent.getStringExtra("boton6")
        val string1: String? = intent.getStringExtra("boton7")
        val string2: String? = intent.getStringExtra("boton8")

        if (string.equals("Tikal")){
            binding1.modelo=prueba
            //Toast.makeText(this,strings,Toast.LENGTH_SHORT)
        }else if (string1.equals("Antigua")){
            binding1.modelo=prueba1
        }else if(string2.equals("Semuc")){
            binding1.modelo=prueba2
        }










    }
}
