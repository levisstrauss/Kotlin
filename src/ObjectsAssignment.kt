open class Student (val name: String, val age: Int){
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

class Teacher(name: String, age: Int, val subject: String): Student(name, age) {
    fun explain() {
        println("Teaching $subject")
    }

}

// -------------------------------------------------

abstract class Shape {
    abstract fun area(): Double
}

class Rectangle(val width: Double, val height: Double): Shape() {
    override fun area(): Double {
        return width * height
    }
}

class Circle(val radius: Double): Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

// -------------------------------------------------

interface Drawable {
    fun draw()
}

class Circle2(val radius: Double): Drawable {
    override fun draw() {
        println("Drawing Circle")
    }
}

class Rectangle2(val width: Double, val height: Double): Drawable {
    override fun draw() {
        println("Drawing Rectangle")
    }
}

// -------------------------------------------------

class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if(amount > 0) {
            balance += amount
        } else {
            println("Invalid amount")
        }
    }

    fun withdraw(amount: Double) {
        if(amount > 0 && amount <= balance) {
            balance -= amount
        } else {
            println("Invalid amount")
        }
    }
}

// -------------------------------------------------

abstract class Animal {
    abstract fun sound()
}

class Dog: Animal() {
    override fun sound() {
        println("Wouf Wouf")
    }
}

class Cat : Animal() {
    override fun sound() {
        println("Meow Meow")
    }
}

// -------------------------------------------------

interface Readable {
    fun read()
}

open class Book: Readable {
    override fun read() {
        println("Reading a physical Book")
    }
}
class Ebook: Book() {
    override fun read() {
        println("Reading an Ebook")
    }
}

// -------------------------------------------------

open class Vehicle {
    open fun startEngine() {
        println("Engine Started")
    }
}

class Car: Vehicle() {
    override fun startEngine() {
        println("Car Engine Started")
    }
}

class Bicycle : Vehicle() {
    override fun startEngine() {
        println("Bicycle Engine Started")
    }
}