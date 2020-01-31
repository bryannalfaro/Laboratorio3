package com.example.laboratorio3final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3final.databinding.ActivityPlacesBinding
import com.example.laboratorio3final.models.Modelo

class Places : AppCompatActivity() {
    private lateinit var binding1:ActivityPlacesBinding
    val prueba:Modelo=Modelo("ESTO FUNCIONO", "ESTO ES SUBTITULO")
    val prueba1:Modelo=Modelo("ESTO FUNCIONO2", "ESTO ES SUBTITULO")
    val prueba2:Modelo=Modelo("ESTO FUNCIONO3", "ESTO ES SUBTITULO")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main2)
        binding1= DataBindingUtil.setContentView(this,
            R.layout.activity_places
        )

        binding1.modelo=prueba

    }
}
