package com.example.apptripactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IlhaGrandeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ilha_grande)


     val btnAvaliacoes: Button = findViewById<Button>(R.id.btn_avaliacoes)
     val btnComprarPasseio:Button = findViewById<Button>(R.id.btn_comprar_passeio)
     val btnVoltarInicio:Button = findViewById<Button>(R.id.btn_voltar_inicio)

     btnAvaliacoes.setOnClickListener{
            val i = Intent (this, AvaliacoesActivity::class.java)
            startActivity(i)
        }

        btnComprarPasseio.setOnClickListener {
            val i = Intent (this, PagamentoActivity::class.java)
            startActivity(i)
        }

        btnVoltarInicio.setOnClickListener {
            val i = Intent (this, PrimeiraTelaActivity::class.java)
            startActivity(i)
        }
    }
}