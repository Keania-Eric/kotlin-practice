import com.app.Person
import com.app.PersonData
import java.util.Scanner

fun main(args: Array<String>) {


    // Strings
    val name : String  = "Keania Eric";
    println("My name is $name!")

    // Decisions
    val result  = if (name.contains('m')) {
        "Una men"
    }else {
        "You self never tire"
    }

    println("result : $result");

    println("Please enter a position below :")

    val sc: Scanner = Scanner(System.`in`)

    val position: Int = sc.nextInt()

    val medal = when(position) {
        1 -> "GOLD"
        2 -> "SILVER"
        else -> "NO MEDAL"
    }

    println("Your new position is $medal")

    // Ranges and Loops
    val range = 1..position+10
    for (i in range) {
        println("i:$i")
    }

    val reverseRange = position+10 downTo 1
    for (i in reverseRange step 2){
        println("reverse skip $i")
    }


    // while loops
    var whileCounter = 0;
    while(whileCounter < 5) {
        println("This is the current value of whileCounter : $whileCounter")
        whileCounter++
    }

    // do while loops
    var doWhileCounter = 0
    do {
        println("This is the current value of whileCounter : $doWhileCounter")
        doWhileCounter++
    }while(doWhileCounter < 5)


    val person : Person = Person(countryP = "Canada", nameP = "James Newton")
    person.speak()

    val personData : PersonData = PersonData("Calligary Tom", "United States")

    print(personData)







    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}