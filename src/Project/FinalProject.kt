package Project

import java.time.LocalDate
// Define an Animal interface
interface Animal {
    val name: String
    val birthdate: LocalDate
    val habitat: String
    fun makeSound()
    fun feed()
    fun displayDetails()
}
// Define an abstract Mammal class as the base class
abstract class Mammal(
    override val name: String,
    override val birthdate: LocalDate,
    override val habitat: String) : Animal {
    override fun displayDetails() {
        println("Animal: $name")
        println("Birthdate: $birthdate")
        println("Habitat: $habitat")
    }
}
// Define specific animal classes that inherit from the
//abstract class and implement the Animal interface
class Lion(
    name: String,
    birthdate: LocalDate,
    habitat: String)
    : Mammal(name, birthdate, habitat) {
    override fun makeSound() {
        println("$name the Lion roars loudly.")
    }
    override fun feed() {
        println("$name the Lion is being fed.")
    }
}
class Elephant(
    name: String,
    birthdate: LocalDate,
    habitat: String)
    : Mammal(name, birthdate, habitat) {
    override fun makeSound() {
        println("$name the Elephant trumpets joyfully.")
    }
    override fun feed() {
        println("$name the Elephant is being fed.")
    }
}
class Penguin(
    name: String,
    birthdate: LocalDate,
    habitat: String)
    : Mammal(name, birthdate, habitat) {
    override fun makeSound() {
        println("$name the Penguin squawks and waddles around.")
    }
    override fun feed() {
        println("$name the Penguin is being fed.")
    }
}
fun main() {
    val animals: List<Animal> = listOf(
        Lion("Simba"
            , LocalDate.of(2010, 3, 15),
            "Savannah"),
        Elephant("Dumbo"
            , LocalDate.of(2015, 7, 21),
            "Jungle"),
        Penguin("Chilly"
            , LocalDate.of(2019, 5, 8),
            "Antarctica"),
        Lion("Nala"
            , LocalDate.of(2011, 4, 12),
            "Savannah"),
        Elephant("Babar"
            , LocalDate.of(2016, 8, 3),
            "Jungle"),
        Penguin("Skipper"
            , LocalDate.of(2020, 6, 15),
            "Antarctica")
    )
// Functional programming: Filter animals by habitat
    val jungleAnimals = animals.filter { it.habitat == "Jungle" }
    val savannahAnimals = animals.filter { it.habitat == "Savannah" }
    println("Jungle Animals:")
    jungleAnimals.forEach { it.displayDetails() }
    println()
    println("Savannah Animals:")
    savannahAnimals.forEach { it.displayDetails() }
    println()


    // Exception handling example: Try to feed a non-existing animal
    try {
        val nonExistentAnimal =
            Elephant("Phantom"
                , LocalDate.of(2022, 1, 1),
                "Unknown Habitat")
        nonExistentAnimal.feed()
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}