package com.example.apptripactivity

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseManager(Context: Context, name: String) : SQLiteOpenHelper(Context, name, null, 1){

    override fun onCreate(p0: SQLiteDatabase?) {

        val criarTabela = "CREATE TABLE tlb_cadastroPasseio (" +
                "id_passeio INT NOT NULL," +
                "cidade VARCHAR (30)," +
                "passeio VARCHAR (50)," +
                "preco FLOAT (6)," +
                "PRIMARY KEY (id_passeio));"

            p0!!.execSQL(criarTabela)

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("DROP TABLE IF EXISTS tbl_cadastroPasseio")
        onCreate(p0)

    }

    fun inserePasseio(id: Int, cidade: String, passeio: String, preco: Int) {
        var db = this.writableDatabase

        var cv = ContentValues()
        cv.put("id_passeio", id)
        cv.put("cidade", cidade)
        cv.put("passeio", passeio)
        cv.put("preco", preco)

        db.insert("tbl_cadastroPasseio", "id_passeio", cv)

    }

    fun listaPasseio() : Cursor{
        var db = this.readableDatabase
        var cur = db.rawQuery("SELECT cidade, passeio, preco FROM tbl_cadastroPasseio", null)
        return cur
    }

    fun removePasseio() {
        var db = this.writableDatabase
        db.delete("tbl_cadastroPasseio", "id_passeio=1", null)

    }


}
