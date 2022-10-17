package com.upora.labtest.libraries

import com.upora.labtest.libraries.Songs

open class AlbumLibrary(var albumName: String, var song: Songs, var author: Authors) : Comparable<AlbumLibrary> {
    val id = LibraryId
    var Name = albumName
    var SongName = song.get()
    var AuthorName = author.getAuthorName()
    var AuthorSurname = author.getAuthorSurname()

    override fun toString(): String {
        return super.toString() + "Album name: " + albumName + "\nSong name: " + song.toString() + "\nAuthor: " + author.toString()
    }

    override fun compareTo(other: AlbumLibrary): Int {
        if (this.id > other.id){
            return 1
        }
        return 0
    }
}