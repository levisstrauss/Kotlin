class FootballPlayer (
    // Constructor
    name: String,
    sport: String,
    country: String,
    var team: String,
    var position: String,
    var height: Double,
    var totalGamesPlayed: Int,
    var totalGoalsMade: Int,       // Inheritance                // Interface
    var numberOfAssistsMade: Int): Athlete(name, sport, country), Person{

    //Override retired value
    override var retired = false

    // Wave function
    override fun wave() = println("$name waved")



    //Kick the ball
    fun kick() {
        println("$name kicked the ball")
    }

    // Pass the ball
    fun pass() {
        println("$name passed the ball")
    }

    fun averageGoalsPerGame(): Double = totalGoalsMade.toDouble() / totalGamesPlayed
    fun averageAssistsPerGame(): Double = numberOfAssistsMade.toDouble() / totalGamesPlayed

    fun assist(assisted: Boolean) {
        if (assisted) {
            numberOfAssistsMade++
            println("$name ha assisted a goal")
        } else {
            println("$name has not assisted a goal")
        }
    }

    fun goal(goalMade: Boolean) {
        if (goalMade) {
            totalGoalsMade++
            println("$name has scored a goal")
        } else {
            println("$name has not scored a goal")
        }
    }

}

// Basketball Player
class BasketballPlayer(
    name: String, country: String,
    sport: String, var totalGamesPlayed: Int,
    var totalBasketsMade: Int): Athlete(name, sport, country)

// Interface
interface Person {
    var retired: Boolean
    fun wave()
    fun hello() = "Hello there!" // Default implementation

}


// Abstract class
abstract class Athlete (val name: String, val sport: String, val country: String) {

    fun getBio() {
        println("$name is a $sport player from $country")
    }
}

// Main
fun main() {
    var ronaldo = FootballPlayer(
        "Ronaldo",
        "Football",
        "Country",
        "Portugal",
        "Forward",
        1.87,
        100,
        50,
        25)

    println("The player's name is " + ronaldo.name)
    ronaldo.kick()
    ronaldo.pass()

    println(ronaldo.averageGoalsPerGame())
    println(ronaldo.averageAssistsPerGame())

    for(i in 1..9) {
        ronaldo.assist(true)
    }
    ronaldo.goal(false)

    for(i in 0..9){
        ronaldo.goal(true)
    }
    ronaldo.getBio()

    ronaldo.wave()
    ronaldo.hello()


    // Basketball Player
    var lebron = BasketballPlayer(
        "Lebron James",
        "USA",
        "Basketball",
        100,
        50)
    lebron.getBio()


}