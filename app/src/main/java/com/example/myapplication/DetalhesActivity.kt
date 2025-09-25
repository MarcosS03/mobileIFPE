package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.DetalhesBinding

class DetalhesActivity : AppCompatActivity() {
    private lateinit var binding: DetalhesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Recupera os dados da Intent que iniciou esta Activity.
        val nome = intent.getStringExtra("nome_usuario")
        val id = intent.getIntExtra("id_usuario", -1) // O segundo parâmetro é um valor padrão.

        val textViewBoasVindas: TextView = findViewById(R.id.textView)
        textViewBoasVindas.text = "Olá, $nome! (ID: $id)"


        binding.buttonVoltar.setOnClickListener {
            finish()
        }



    }
}