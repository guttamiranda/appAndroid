package com.example.apptripactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AvaliacoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avaliacoes)

        val btnVoltar : Button = findViewById<Button>(R.id.btn_voltar)

        btnVoltar.setOnClickListener {
            val i = Intent (this, IlhaGrandeActivity::class.java)
            startActivity(i)

        }

    }
}