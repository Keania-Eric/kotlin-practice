package com.app

import com.app.datasets.CourseCategory
import com.app.datasets.courseList
import com.app.datasets.Course
import com.app.datasets.KAFKA


fun filterCourseLambda(courseList: MutableList<Course>, predicate:(c:Course)-> Boolean) {
    courseList.filter{
        predicate.invoke(it)
    }.forEach{
        println("This is a ${it.category} course : ${it.name}")
    }
}

fun mapCourseLambda(courseList: MutableList<Course>, predicate: (c: Course) -> Boolean){
    courseList.filter(predicate).map{
        " ${it.name} - ${it.category}"
    }.forEach{
        println(it)
    }
}

fun filterCourseByTopic(courseList:MutableList<Course>, topic:String): List<String> {
    val courses = courseList.flatMap {
        course ->
        val courseName = course.name
        course.topicsCovered?.filter {
            it == topic
        }?.map{
            courseName
        }?: emptyList()
    }

    return courses
}

fun main() {

    /**
    // list elements
    val names: List<String> = listOf("Alex", "Ben", "Chloe")
    println("Names : $names")

    val mutableNames: MutableList<String> = mutableListOf("Alex", "Ben", "Chloe")
    println("Mutable Names $mutableNames")
    mutableNames.add("Adams")
    println("Mutable Names $mutableNames")

    // map elements
    val maps: Map<String, Int> = mapOf("Sammy" to 20, "Eric" to 27)
    println("Ages: $maps")

    val mutableMaps:MutableMap<String, Int> = mutableMapOf("Sammy" to 20, "Eric" to 27)
    println("Ages: $mutableMaps")
    mutableMaps["Miracle"]  = 22
    println("Ages: $mutableMaps")

    **/

    // collection operations

    val courseList = courseList()

    val devPredicate = {c:Course -> c.category == CourseCategory.DEVELOPMENT}
    val designPredicate = {c:Course -> c.category == CourseCategory.DESIGN}
    filterCourseLambda(courseList, designPredicate)
    mapCourseLambda(courseList, devPredicate)


    // flat map vs map
    /**val list = listOf(listOf(1,2,3), listOf(4,5,6,7))

    val mapResult = list.map {
        outerList -> outerList.map{
            it.toDouble()
        }
    }

    println("Map Result: $mapResult")

    val flatMapResult = list.flatMap {
            outerList -> outerList.map{
        it.toDouble()
    }
    }

    println("flatMap Result: $flatMapResult")
    **/

    val courses = filterCourseByTopic(courseList, KAFKA)
    println(courses)


}