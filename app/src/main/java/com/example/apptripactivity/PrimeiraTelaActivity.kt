package com.example.apptripactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PrimeiraTelaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira_tela)

        val btnAbrirBuscarPasseio: Button = findViewById<Button>(R.id.btn_buscarPasseio)
        val btnAbrirCadastrarPasseio: Button = findViewById<Button>(R.id.btn_cadastrarPasseio)

        btnAbrirBuscarPasseio.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        btnAbrirCadastrarPasseio.setOnClickListener {
            val i = Intent(this, CadastroPasseioActivity::class.java)
            startActivity(i)
        }

    }
}