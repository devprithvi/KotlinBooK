class Ranges {

}

fun main() {
    //check no. with in a range....
    val x = 10
    val y = 9
    if (x in 1..y) {
        println("fits in range")
    } else {
        println("not in range")
    }

    //check if a number is out of range...
    val list = listOf("a", "b", "C")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range...")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
//iterate over a range......
    for (x in 1..5) {
        print(x)
    }
    //Over a Progression...
    println()
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) { //take step of 3 down to..
        print(x)
    }
}