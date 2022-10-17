package com.upora.labtest.libraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun main(){
    var author:Authors = Authors("Janez", "Jansa")
    var song:Songs = Songs("Himna", 1)


    var list = mutableListOf<AlbumLibrary>()

    fun printList() : Unit {
        println(list.toString())
    }
    fun generate(n: Int){
        
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}