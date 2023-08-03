package com.app

class Person() {

    private var country :String = ""
    private var name : String = ""

    // this is called a secondary constructor
    constructor(countryP : String, nameP : String) : this() {
        country = countryP
        name = nameP
    }

    fun speak() {
        println("${this.name}  from ${this.country} speaks very well")
    }
}