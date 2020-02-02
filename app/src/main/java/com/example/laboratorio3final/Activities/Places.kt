package com.example.laboratorio3final.Activities


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3final.R
import com.example.laboratorio3final.databinding.ActivityPlacesBinding
import com.example.laboratorio3final.models.Modelo

/**
 * @author Bryann Alfaro
 * @since February 2,  2020
 */

class Places : AppCompatActivity() {
    //binding for this activity
    private lateinit var binding1:ActivityPlacesBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        //Create the objects for the places
        val prueba =Modelo(getString(R.string.tikal), getString(R.string.phrase1),getString(
            R.string.descripcion1
        ))
        val prueba1=Modelo(getString(R.string.antigua), getString(R.string.phrase2),getString(
            R.string.descripcion2
        ))
        val prueba2=Modelo(getString(R.string.semuc), getString(R.string.phrase3),getString(
            R.string.descripcion3
        ))

        super.onCreate(savedInstanceState)

        binding1= DataBindingUtil.setContentView(this,
            R.layout.activity_places
        )
        //Comment button
        binding1.button5.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            intent.putExtra("comentario",binding1.editText.text.toString())
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)

        }
        //Get the data from the other activity
        val string: String? = intent.getStringExtra("boton6")
        val string1: String? = intent.getStringExtra("boton7")
        val string2: String? = intent.getStringExtra("boton8")

        //Evaluates the data
        if (string.equals("Tikal")){
            binding1.modelo=prueba

        }else if (string1.equals("Antigua")){
            binding1.modelo=prueba1
        }else if(string2.equals("Semuc")){
            binding1.modelo=prueba2
        }










    }
}
