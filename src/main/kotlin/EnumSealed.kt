/**
 * enum: VAlues ::: Only one Objects
 * sealed: Types  :: multiple Object
 */
fun main() {
    val day = Day.FRIDAY
    println(day)
    println(day.number)
    for (i in Day.values()) {
        println(i)
    }

    day.printFormattedDay()


    /////SEALED
    val tile1 = Red("Mushroom", 25)
    val tile2 = Red("Fire", 30)

    println("${tile1.points}-${tile1.type}")

    ////
    val tile3: Tile = Red("Mushroom", 25)
    val points = when (tile3) {
        is Blue -> tile3.points * 4
        is Red -> tile3.points * 5
    }
    println(points)
}

enum class Day(val number: Int) {
    //IN THE ENUM CLASS WE GAVE PERTICULAR VALUES
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun printFormattedDay() {
        println("Day is $this")
    }
}

sealed class Tile
class Red(val type: String, val points: Int) : Tile()
class Blue(val points: Int) : Tile()