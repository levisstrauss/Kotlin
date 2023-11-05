class Fruit(var name: String = "", var weight: Int = 0, var color: String = ""){

    // Getters and Setters
    // Get Price of fruit
    fun getPrice(): Double = weight * 0.85

    // Get season of fruit
//    fun getSeason(): String {
//        return when (color) {
//            "Red" -> "Winter"
//            "Green" -> "Summer"
//            "Yellow" -> "Spring"
//            "Orange" -> "Autumn"
//            else -> "Unknown"
//        }
//    }

    fun getSeason(): List<String> {
        var seasons = hashMapOf(
            "apple" to listOf("Fall"),
            "banana" to listOf("Spring", "Summer"),
            "Strawberries" to listOf("Summer"))

        var  seasonOfFruit = seasons.get(name)
        if (seasonOfFruit != null) {
            return seasonOfFruit
        } else {
            return listOf("")
        }
    }
}

// Main
fun main() {
    var apple = Fruit("apple", 100, "Red")

    println("Name:" + apple.name)
    println("Weight:" + apple.weight)
    println("Color: " +apple.color)
    println("Price: $" + apple.getPrice())
    println("Season: " + apple.getSeason())

}