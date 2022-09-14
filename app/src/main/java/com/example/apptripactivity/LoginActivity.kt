package com.example.apptripactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnEntrar = findViewById<Button>(R.id.btn_entrar)
        val btnCadastro = findViewById<Button>(R.id.btn_cadastro)

        btnEntrar.setOnClickListener {
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)}

        btnCadastro.setOnClickListener {
            val i = Intent(this, CadastroUsuarioActivity::class.java)
            startActivity(i)}



    }

}

