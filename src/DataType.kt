
const val PI = 3.14;

fun main() {


    /* ----------- Variables ----------------- */

    val my_name: String = "John Doe"; // constant
    var my_age: Int = 20; /* Integer variable */
    var animal: String = "Dog";
    println("My age is: $my_age");


    /* ----------- Variables ----------------- */

    val myNum: Byte = 100;
    val myNum2: Int = 5000;
    val myNum3: Double = 5.2;


    /* ----------- Strings ----------------- */

    var greeting: String = "Hello";
    println(greeting);
    println(greeting[0]);
    greeting.length

    var name: String = "John";
    var getFirstLetter: Char = name[0];
    println(getFirstLetter);

    /* ----------- Booleans ----------------- */

    var isAlive: Boolean = true;
    var isDead: Boolean = false;
    println(isAlive);


    /* ----------- Null ----------------------*/
    var cat: String? = null;
    cat = "Cat";
    println(cat);
    var length = cat!!.length;

    /* ----------- Constants ----------------------*/
    println(PI);

    /* ----------- Problems ----------------------*/

    var myAge: Int = 25
    val favoriteColor: String = "Blue"
    var temperature: Int? = 22
    temperature = null

    var celsiusTemperature: Double = 26.7
    val isSunny: Boolean = true
    val largeNumber: Long = 100_000_000_000
    val grade: Char = 'A'
    var userName: String? = "John Doe"
    userName = null
    var pi: Double = 3.14




}
