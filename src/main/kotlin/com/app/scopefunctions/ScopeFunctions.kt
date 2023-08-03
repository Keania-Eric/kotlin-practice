package com.app.scopefunctions

import com.app.datasets.*


fun main() {

   // exploreApply()
   // exploreAlso()
   // exploreLet()
    exploreWith()
}

fun exploreWith() {

}

fun exploreLet() {
   val numbers = mutableListOf(1,2,3,4,5)
    val result = numbers.map{
    it*2
    }.filter {
        it > 5
    }.let{
        println(it)
        it.sum()
    }


}

fun exploreApply() {
   val course = Course(1, "Design Thinking in Kotlin", CourseCategory.DEVELOPMENT, null).apply {
      category = CourseCategory.DESIGN
       topicsCovered = listOf(KAFKA, ADVERTISING, JAVA)
   }

    println("course : $course")
}


fun exploreAlso() {
    val course = Course(1, "Design Thinking in Kotlin", CourseCategory.DEVELOPMENT, null).also {
        println("course : $it")
    }


}


