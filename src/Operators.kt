

fun main() {

    /* ----------- Arithmetic Operators ----------------- */
    //             ==, !=, >, <, >=, <=
    var xs: Double = 3.6 +4.53
    var x: Int = 7
    var y: Int = 6
    y++
    --y
    println(x == y)
    println(x != y)
    println(x + y)
    println(x/y)
    println(x*y)
    println()

    /* ----------- Assignment Operators ----------------- */

    var number: Int =  8
    number += 5
    var modulo: Int = number%2

    /* ----------- Comparison Operators ----------------- */
    var t: Int = 7
    var z: Int = 10
    var isEqual: Boolean = (t == z)

    // On string
    var ex: String = "Hello"
    var ex2: String = "Hello"
    println(ex.compareTo(ex2))
    println(ex.get(0))
    println(ex.equals(ex2))

    /* ----------- Logical Operators ----------------- */
        /*
        &&  and Both values must be true
        OR  ||  Either value must be true
        NOT !   Reverses the boolean value
         */

    /* ----------  Assignments ----------------- */
    var result: Double = 6.5 +3.0
    val remainder:Int = 10 % 3
    var temperature: Double = 34.5
    temperature += 2.5

    var price: Double = 45.0
    var budget: Double = 60.3
    val isAffordable: Boolean = price < budget

    val isSunny: Boolean = true
    val isHot: Boolean = false
    val isGoodDay: Boolean = isSunny && isHot

    var counter: Int = 5
    counter++
    counter -= 2

}