package com.example.laboratorio3final.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

import androidx.databinding.DataBindingUtil
import com.example.laboratorio3final.R
import com.example.laboratorio3final.databinding.ActivityMainBinding

/**
 * @author Bryann Alfaro
 * @since February 2,  2020
 * Main activity for the application about Guatemala
 */

class MainActivity : AppCompatActivity() {

    //Creates the binding connection
    private lateinit var databinding2:ActivityMainBinding
    private var tester:Boolean?=true//Evaluate if the FloatingButton is selected

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        databinding2= DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )
        databinding2.star
        databinding2.star.setOnClickListener{
            switch_state()
        }

        databinding2.tikalButton
        databinding2.tikalButton.setOnClickListener {
            val intent = Intent(this, Places::class.java)
            intent.putExtra("boton6","Tikal")

            startActivity(intent)

        }
        databinding2.antiguaButton
        databinding2.antiguaButton.setOnClickListener {
            val intent = Intent(this, Places::class.java)
            intent.putExtra("boton7","Antigua")

            startActivity(intent)

        }
        databinding2.semucButton
        databinding2.semucButton.setOnClickListener {

            val intent = Intent(this, Places::class.java)
            intent.putExtra("boton8","Semuc")

            startActivity(intent)

        }
        //Get the data from the other activity
        val string1: String? = intent.getStringExtra("comentario")
        if(string1.isNullOrEmpty()){

        }else{
            Toast.makeText(this,string1,Toast.LENGTH_SHORT).show()
        }



    }

    /**
     * Function that switch the state of the view
     */
    private fun switch_state(){
        if(tester==true){
            var name=databinding2.editText2.text.toString()

            databinding2.nameSet.setText(name)
            databinding2.editText2.setText("")
            databinding2.editText2.visibility= View.GONE
            databinding2.textView3.visibility= View.GONE
            databinding2.nameSet.visibility= View.VISIBLE
            tester=false
        }else{

            databinding2.editText2.visibility= View.VISIBLE
            databinding2.textView3.visibility= View.VISIBLE
            databinding2.nameSet.visibility= View.GONE
            tester=true
        }
    }


}
