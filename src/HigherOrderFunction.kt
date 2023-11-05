import javax.print.attribute.standard.PrinterLocation


//---------------------- lambda function ----------------------


fun sum(x: Int, y: Int): Int {
    return x + y
}

//------------------ Higher order function ---------------------

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

// Main function

fun main() {
    val addNumbers = {x: Int, y: Int -> x + y}
    val result = addNumbers(5, 3)
    println(result)

    // Calling the higher order function
    var results = calculate(4, 5, ::sum)
    println(results)

    // Calling the higher order function with lambda function
    val result2 = calculate(4, 5) { x, y -> x + y }
    println(result2)

    // filter function--------------------------------------------

    val fruits = listOf("Apple", "Banana", "Strawberry", "Orange", "Mango")
    val filteredFruits = fruits.filter { it.startsWith("A") }
    println(filteredFruits)

    val randomNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val evenNumbers = randomNumbers.filter { it % 2 == 0 }

    println(evenNumbers)

    val names = listOf("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn")
    var filteredNames = names.filter { it.startsWith('S', ignoreCase = true)
            || it.startsWith('P', ignoreCase = true)}
    println(filteredNames)

    // map function-----------------------------------------------
    val number = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val squaredNumbers = number.map { it * it }
    println(squaredNumbers)

    // reduce function--------------------------------------------

    val numbers = listOf(1, 2, 3, 4, 5)
    val sumOfNumbers = numbers.reduce { x, y -> x + y }

    // Combining filter and reduce -------------------------------
    val su = number.filter { it % 2 == 0 }.reduce { x, y -> x + y }



    // ---------------------- Assignments ----------------------

    fun filterEven(numbers: List<Int>): List<Int> {
        return numbers.filter { it % 2 == 0 }
    }

    fun mapStringLenghts(names: List<String>): List<Int> {
        return names.map { it.length }
    }

    fun sumList(numbers: List<Int>): Int {
        return numbers.reduce { x, y -> x + y }
    }

    fun squareAndSum(numbers: List<Int>): Int {
        return numbers.map { it * it }.sum()
    }

    fun addValue(value: Int): (Int) -> Int {
        return { it + value }
    }

    fun addCurried(a: Int): (Int) -> Int {
        return { b -> a + b }
    }

    fun <T, U, V> compose(f: (T) -> U, g: (U) -> V): (T) -> V {
        return { x -> g(f(x)) }
    }
}

