package com.example.apptripactivity

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.apptripactivity.R

class ListaPasseiosActivity : AppCompatActivity() {
    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_passeios)

        val ListaPasseios: TextView = findViewById(R.id.txvListaPasseios)
        val db = DatabaseManager(this, "passeios")

        val cursor = db.listaPasseio()

        var cidade = ""
        var passeio = ""
        var preco = ""

        if(cursor.count > 0) {
            cursor.moveToFirst()

            cidade = cursor.getString(cursor.getColumnIndex("Cidade"))
            passeio = cursor.getString(cursor.getColumnIndex("Passeio"))
            preco = cursor.getString(cursor.getColumnIndex("Preco"))

        }

          



       /* val txvListaPasseios = findViewById<TextView>(R.id.txvListaPasseios)

        val listaSharedPreferences =
            this.getSharedPreferences("cadastroPasseio", Context.MODE_PRIVATE)

        val cidade = listaSharedPreferences.getString("cidade", "")
        val passeio = listaSharedPreferences.getString("passeio", "")
        val preco = listaSharedPreferences.getString("preco", "")*/






    }

    }