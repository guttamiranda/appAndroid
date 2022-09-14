package com.example.apptripactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PasseiosIlhaGrandeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passeios_ilha_grande)


        val btnPasseioUm: Button = findViewById<Button>(R.id.btn_passeio_um)

        btnPasseioUm.setOnClickListener {
            val i = Intent(this, IlhaGrandeActivity::class.java)
            startActivity(i)
        }
    }
}