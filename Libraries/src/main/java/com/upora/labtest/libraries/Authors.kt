package com.upora.labtest.libraries

open class Authors(name:String, surname:String) {
    var name = name
    var surname = surname
    override fun toString(): String {
        return super.toString() + "Name: " + name + "\nSurname: " + surname
    }

    fun getAuthorName(): String {
        return name
    }

    fun getAuthorSurname() : String {
        return surname
    }
}