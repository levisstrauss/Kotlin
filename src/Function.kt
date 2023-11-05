
fun getNewSalary(currentSalary: Double, yearOfExperience: Int): Double {
    var newSalary: Double = currentSalary + 10000.0
    newSalary += yearOfExperience * 1500
    return newSalary
}

fun promoteEmployer(): Double {
    return 20000.00
}


fun main() {
    var levisSalary: Double = getNewSalary(50000.0, 10)
    var salSalary: Double = getNewSalary(60000.00, 2)
    var joshSalary: Double = getNewSalary(70000.00, 3)

    println(levisSalary)
    println(salSalary)
    println(joshSalary)

    println()

    levisSalary += (promoteEmployer() + promoteEmployer())
    salSalary += promoteEmployer()
    joshSalary += promoteEmployer()

    println(levisSalary)
    println(salSalary)
    println(joshSalary)

    //var totalComp = LevisSalary + salSalary + joshSalary


    /* ----------- Error handling ----------------- */
    try {
        val totalComp = levisSalary + salSalary + joshSalary
        println(totalComp)
    } catch (e: Exception) {
        println("Error: $e")
    } finally {
        println("This is the finally block")
    }

    /* ----------- Assignments ----------------- */

    fun greet(name: String, age: Int) {
        println("Hello $name, you are $age years old")
    }

    fun greet(name: String ="Stranger"): String{
        return "Hello $name"
    }

    var greeting = greet("John", 20)


    fun divide(numerator: Int, denominator: Int): Double {
        if (denominator == 0) {
            throw IllegalArgumentException("Denominator cannot be zero")
        }
        return numerator.toDouble() / denominator
    }


    try {
        val result = divide(100, 0)
        println(result)
    } catch (e: Exception) {
        println("Error: $e")
    } finally {
        println("This is the finally block")
    }

    fun calculateArea(length: Double, width: Double): Double {
        return length * width
    }
    var area = calculateArea(8.0, 5.0)

}


