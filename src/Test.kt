fun main() {
    var currentSalary = 125000.00
    var newSalary = getSalary(currentSalary)
    println(newSalary)

    var cars = arrayListOf("Toyota", "BMW", "Mercedes", "Audi", "Tesla Model Y")

    var size = cars.size
    println(size)
    cars.remove("Mercedes")
    println(size)
}

fun getSalary(currentSalary: Double): Double {
    var multiplier = if (currentSalary > 200000) 1.2 else 1.8
    var base = multiplyNumbers(multiplier, currentSalary)
    return base + 10000.0
}

fun multiplyNumbers(multiplier: Double, currentSalary: Double): Double {
    return multiplier * currentSalary
}