package com.example.apptripactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  val btnAbrirMaragogi: Button = findViewById<Button>(R.id.btn_abrir_Maragogi)
        val btnAbrirIlhaGrande: Button = findViewById<Button>(R.id.btn_abrir_Ilha_Grande)
      //  val btnAbrirIlhaMel: Button = findViewById<Button>(R.id.btn_abrir_Ilha_Mel)
        val btnAbrirHome: Button = findViewById<Button>(R.id.btn_home)

      // btnAbrirMaragogi.setOnClickListener {
      //    val i = Intent(this, MaragogiActivity::class.java)
       //   startActivity(i)
      //  }


        btnAbrirIlhaGrande.setOnClickListener {
            val i = Intent(this, PasseiosIlhaGrandeActivity::class.java)
            startActivity(i)
        }

        btnAbrirHome.setOnClickListener {
            val i = Intent(this, PrimeiraTelaActivity::class.java)
            startActivity(i)
        }


      //  btnAbrirIlhaMel.setOnClickListener {
       //    val i = Intent(this, IlhaMelActivity::class.java)
        //    startActivity(i)
       // }

    }
    }










