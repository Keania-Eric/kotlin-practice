package com.app


// higher order functions are functions that threats functions as first class citizens i.e functions are passed as parameters
// and functions are also the return value of this type of functions

fun calculate(x:Int, y:Int, op: (x:Int, y:Int)-> Int):Int {
    return op(x, y)
}

fun main() {

    // lambda functions are anonymous functions that are very useful in functional programming
    // and can be passed as parameters to higher order functions
     val addLambda = {x:Int -> x + x}

     val result  = addLambda(3)

    println("Result : $result")

    val lambdaVal = calculate(2, 3) { a, b -> a * b }
    println("Higher order function val : $lambdaVal")
}