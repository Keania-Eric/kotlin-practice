package com.app.interfaces

// dealing with conflicting interfaces
interface A {
    fun log(){
        println("logging in A")
    }
}

interface  B {
    fun log(){
        println("logging in B")
    }
}

class AB : A, B {

    override fun log() {
        super<A>.log()
    }
}
// end dealing with conflicting interfaces


data class Course(val id: Int, val name: String, val author: String, val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT){

}

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

interface CourseRepository {

    fun getById(id:Int): Course

    fun save(course: Course): Int {
        println("course: $course")
        return course.id
    }
}

class SqlCourseRepository : CourseRepository {

    override fun getById(id: Int): Course {
       return Course(id, "Reactive Programming with Modern Java", "Kelvin")
    }
}

fun main () {

    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(2)
    println("Course is $course")

    val course1 = Course(34, "Reactive Programming with Modern Java", "Kelvin");
    val courseId = sqlCourseRepository.save(course1)
    print("course id is $courseId")

    val conflictInf = AB()
    conflictInf.log()
}