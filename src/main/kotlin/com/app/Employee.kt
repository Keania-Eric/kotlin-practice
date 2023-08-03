package com.app

data class Employee
    (val id : String, val name: String )
{

}


fun main()
{

    val nameNullable:String?
    val nameNullable2:String  = "nullable"

    val emp1 = Employee("ISB-665", "James Prowdy")
    println(emp1)

    val emp2 = Employee("ISB-665", "James Prowdy")
    println(emp1 === emp2)

    val emp3 = emp1.copy(id = "ISB-5332", name = "Seun Jimmy")
    println(emp3)
}