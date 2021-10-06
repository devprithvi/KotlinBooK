class collection {
}

fun main() {
    //Iterate Over collection...
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    //check if a collection contain an object using in operator.

    when {

        "apple" in items -> println("apple is fine too")
        "orange" in items -> println("Juicy")
    }
    //Using lambda expression...**************************>>>>>??????
    println("**************************>")
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    val laptop = listOf("hp", "asus", "mi", "appple")
    laptop
        .filter { it.startsWith("m") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
     ///pg No. 196..

}