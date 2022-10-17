package com.upora.labtest.libraries

open class Songs(name:String, id:Short) {
    val Id = id
    var songName = name

    override fun toString(): String {
        return super.toString() + "\nSong name: " + songName
    }

    fun get(): String {
        return songName
    }
}