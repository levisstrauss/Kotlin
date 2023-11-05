fun main() {

    /* ----------- If Statements ----------------- */

    var case1: Boolean = false
    var case2: Boolean = false

    var outcome1 = "Printed outcome 1"
    var outcome2 = "Printed outcome 2"
    var outcome3 = "Printed outcome 3"

    if(case1){
        println(outcome1)
    } else if(case2){
        println(outcome2)
    } else{
       println(outcome3)
    }


    /* ----------- when Statements ----------------- */

    val day = 5
    when (day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }

    var dayOfTheWeek: String = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(dayOfTheWeek)

    /* ----------- For loop ----------------- */

    for (i in 1..5) {
        println(i)
    }
    for (i in 5 downTo 1) {
        println(i)
    }
    for (i in 1..5 step 2) {
        println(i)
    }
    for(chars in 'a'..'z'){
        println(chars)
    }

    /* ----------- While loop ----------------- */

    var i: Int = 1
    while (i <= 5) {
        println(i)
        i++
    }

    /* ----------- Do While loop ----------------- */

    var j: Int = 1
    do {
        println(j)
        j++
    } while (j <= 5)

    /* ----------- Nested For Loops ----------------- */

    for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
        }
    }

    /* ----------- Assignments ----------------- */
    var age = 20
    if (age >= 18){
        println("You can vote now!")
    } else {
        println("You are too young to vote")
    }


    val temperature = 20
    if (temperature > 25) {
        println("It's hot outside")
    } else if (temperature < 10) {
        println("It's cold outside")
    } else {
        println("It's ok outside")
    }

    var temp = 1
    while (temp <= 5){
        println(temp)
        temp++
    }


    for (i in 1..5) {
        if (i % 2 == 0) {
            println(i)
            break // or continue
        }
        println(i)
    }


    val names = listOf("John", "Jane", "Mary", "Mark")
    for (name in names) {
        println(names)
    }
}























