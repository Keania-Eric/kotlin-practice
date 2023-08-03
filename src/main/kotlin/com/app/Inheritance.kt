package com.app

//object classes instantiate and create an instance of a class at the same time
object Authenticate {

    fun authenticate(username:String, password: String): Unit {

        println("User authenticated for $username")
    }

}

open class User(name: String)
{
    private val name: String = ""

    open var isLoggedIn:Boolean = false

    open fun login() {
        println(" user don login like this")
    }

    private fun secret() {
        println("i am secret")
    }

    protected fun logout()
    {
        println("only for me and the kids")
    }
}

class Student(name: String) : User(name)
{
    override var isLoggedIn:Boolean  = false

    override fun login(){
        println(" student don login like this")
        super.login()
    }

    // companion object introduces static functionality to a class
    companion object {
        fun country() : String{
            return "Canada"
        }
    }
}
class Instructor(name: String) : User(name)



fun main()
{

    Authenticate.authenticate("carver", "password")

    println(Student.country())

    val student:Student = Student("Ezekiel")
    student.login()



    val instructor:Instructor = Instructor("James")
    instructor.login()
}