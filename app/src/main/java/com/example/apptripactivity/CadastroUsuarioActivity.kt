package com.example.apptripactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CadastroUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_usuario)

        val btnSalvar = findViewById<Button>(R.id.btSalvar)
        val btnCadastroPasseio = findViewById<Button>(R.id.btCadastroPasseio)

        btnSalvar.setOnClickListener {
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)}

        btnCadastroPasseio.setOnClickListener {
            val i = Intent(this, CadastroPasseioActivity::class.java)
            startActivity(i)}


    }
}