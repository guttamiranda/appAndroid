package com.example.apptripactivity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class CadastroPasseioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_passeio)

    val btnSalvar = findViewById<Button>(R.id.btSalvar)
    val btnExibirPasseios = findViewById<Button>(R.id.btExibirPasseios)
    val etCidade = findViewById<EditText>(R.id.etCidade)
    val etPasseio = findViewById<EditText>(R.id.etPasseio)
    val etPreco = findViewById<EditText>(R.id.etPreco)

        val db = DatabaseManager(this, "Passeios")

    btnSalvar.setOnClickListener (View.OnClickListener {

        db.removePasseio()
        db.inserePasseio(1, etCidade.editableText.toString(), etPasseio.editableText.toString(), etPreco.editableText.toString()
            .toInt())

        Toast.makeText(this, "Passeio gravado com sucesso!", Toast.LENGTH_SHORT).show()

    })

      btnExibirPasseios.setOnClickListener(View.OnClickListener {

          val i = Intent(this, ListaPasseiosActivity::class.java)
          startActivity(i)

      })

        }


    }

/* val cadastroPasseioPersistencia = this.getSharedPreferences("cadastroPasseio", Context.MODE_PRIVATE)
      val editor = cadastroPasseioPersistencia.edit()

      editor.putString("cidade", etCidade.editableText.toString())
      editor.putString("passeio", etPasseio.editableText.toString())
      editor.putString("preco", etPreco.editableText.toString())
      editor.apply()*/






  /*  lateinit var etCidade: EditText
    lateinit var etPasseio: EditText
    lateinit var etPreco: EditText
    lateinit var btSalvar: Button
    lateinit var btExibirPasseios: TextView



        etCidade = findViewById(R.id.etCidade)
        etPasseio = findViewById(R.id.etPasseio)
        etPreco = findViewById(R.id.etPreco)
        btSalvar = findViewById(R.id.btSalvar)
        btExibirPasseios = findViewById(R.id.btExibirPasseios)

        btSalvar.setOnClickListener {

            FakeDatabase.database.add(
                Passeio(
                    etCidade.text.toString(),
                    etPasseio.text.toString(),
                    etPreco.text.toString().toDouble()
                )
            )
        atualizarLista(FakeDatabase.database)
        limparCampos()

        }

    }
        fun atualizarLista(listaPasseios:List<Passeio>) {
            var saida = ""
            listaPasseios.forEach { passeio ->
                saida += "${passeio.cidade}, ${passeio.passeio}, ${passeio.preco}\n"

            }

            btExibirPasseios.text = saida

        }

        fun limparCampos() {
            etCidade.text.clear()
            etPasseio.text.clear()
            etPreco.text.clear()
        }


    }*/




