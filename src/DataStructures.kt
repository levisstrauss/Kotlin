fun main() {

    /* ----------- Arrays ----------------- */
    var names: Array<String> = arrayOf("John", "Jane", "Mary", "Mark")
    names[0] = "Josh"
    names.size
    names.contains("John")
    names.reverse()
    println(names[0])

    /* ----------- Built your array ----------------- */
    var cars = arrayOf("Toyota", "BMW", "Mercedes", "Audi", "Tesla Model Y")
    var car = cars[0]
    println(car)
    println("Size of the array:" + cars.size)

    if("Audi" in cars){
        println("Audi is in the array")
    } else {
        println("Audi is not in the array")
    }



    /* ----------- ArrayLists ----------------- */
    var names1: ArrayList<String> = arrayListOf("John", "Jane", "Mary", "Mark")
    var names2: MutableList<String> = mutableListOf("John", "Jane", "Mary", "Mark")
    names2.add("Paul")
    var index = names2.indexOf("John")
    names2.size
    names2.add(0, "Josh")
    names2.contains("John")
    names2.remove("John")
    names2.removeAt(0)
    names2.isEmpty()
    names2.clear()
    println(names2)

    /* ----------- Built your own ArrayLists ----------------- */
    var cars1 = arrayListOf("Toyota", "BMW", "Mercedes", "Audi", "Tesla Model Y")
    var ind = cars1.indexOf("Audi")
    var value = cars1.get(1)  // Get the value at index 1
    var size = cars1.size // The size of the array
    cars1.reverse() // Reverse the array
    cars1.remove("Audi") // Remove Audi from the array
    cars1.removeAt(0) // Remove the first element from the array
    cars1.add("Audi") // Add Audi to the array at the end of the array
    cars1.add(0, "Audi") // Add Audi to the array at index 0

    for(car in cars1){
        println(car)
    }



    /* ----------- hashMaps ----------------- */
    var names3: HashMap<String, String> = hashMapOf("name" to "John", "age" to "20", "animal" to "Dog")
    var names4: MutableList<Pair<String, String>> = mutableListOf("name" to "John", "age" to "20", "animal" to "Dog")
    names3.size


    /* ----------- Built your own HashMaps ----------------- */
    val map = hashMapOf<Int, List<String>>()
    map.put(5000, listOf("2009 Toyota Corolla", "2010 Honda Civic", "2012 Ford Focus"))
    map.put(10000, listOf("2014 Toyota Corolla", "2015 Honda Civic", "2016 Ford Focus"))
    map.put(15000, listOf("2017 Toyota Corolla", "2018 Honda Civic", "2019 Ford Focus"))

    // Another simple way to create a HashMap
    val map1 = hashMapOf(
        5000 to listOf("2009 Toyota Corolla", "2010 Honda Civic", "2012 Ford Focus"),
        10000 to listOf("2014 Toyota Corolla", "2015 Honda Civic", "2016 Ford Focus"),
        15000 to listOf("2017 Toyota Corolla", "2018 Honda Civic", "2019 Ford Focus")
    )

    var carsFor5k = map.get(5000) // This will return the list of cars associate with 5k

    if(carsFor5k != null){
        if(carsFor5k.contains("2010 Honda Civic")){
            println("2010 Honda Civic is in the list")
        } else {
            println("2010 Honda Civic is not in the list")
        }
    }


    /* ----------- Assignments ----------------- */
    // ------------ Array

    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(numbers[2])
    println(numbers.size)
    println(numbers.contains(3))
    println(numbers.reverse())

    // ------------ ArrayList

    val names5 = ArrayList<String>()
    names5.add("John")
    names5.add("Jane")
    names5.add("Mary")
    names5.add("Mark")
    println(names5.size)
    println(names5.contains("John"))
    println(names5.remove("John"))
    println(names5.removeAt(0))
    println(names5.isEmpty())
    println(names5.clear())


}