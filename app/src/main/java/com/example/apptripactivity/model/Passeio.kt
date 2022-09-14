package com.example.apptripactivity.model

//@Entity
data class Passeio(

    //@PrimaryKey(autoGenerate = true)
    //var id:Long=0,
    var cidade:String,
    var passeio:String,
    var preco: Double
)