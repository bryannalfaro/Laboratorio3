package com.example.laboratorio3final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3final.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var databinding2:ActivityMainBinding
    private var tester:Boolean?=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        databinding2= DataBindingUtil.setContentView(this,R.layout.activity_main)
        databinding2.star
        databinding2.star.setOnClickListener{
            switch_state()
        }
        databinding2.button6
        databinding2.button6.setOnClickListener {
            val intent = Intent(this,Places::class.java)
            intent.putExtra("boton6","Tikal")
            startActivity(intent)
        }
        databinding2.button7
        databinding2.button7.setOnClickListener {
            val intent = Intent(this,Places::class.java)
            intent.putExtra("boton7","Antigua")
            startActivity(intent)
        }
        databinding2.button8
        databinding2.button8.setOnClickListener {
            val intent = Intent(this,Places::class.java)
            intent.putExtra("boton8","Semuc")
            startActivity(intent)
        }
    }
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
