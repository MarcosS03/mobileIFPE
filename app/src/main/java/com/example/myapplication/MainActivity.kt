package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import androidx.core.net.toUri

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

    private fun discarNumero(){
        var uri = "Tel: +5581989332144".toUri()
        val intent = Intent(Intent.ACTION_CALL, uri)

        var numero = uri.toString()

        Toast.makeText(this, numero, Toast.LENGTH_SHORT).show()
        if (intent.resolveActivity(packageManager)!= null){

            startActivity(intent)
        }
    }

}