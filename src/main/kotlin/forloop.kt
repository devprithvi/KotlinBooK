//for the whwnn loop...
fun describe(obj: Any): String =
    when (obj) {
        1 -> "one"
        "Hello" -> "Greetings"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }


fun main() {

    //for when Loop....
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

//////////////////////////////////////////////////////////////
    val items = listOf("apple", "banana", "Kiwifruit")
    for (item in items) {
        println(item)
    }
    ////// OR-------

    for (index in items.indices)
        println("item at $index is ${items[index]}")
//////////////////////////////////////////////////////////////////////
    println("While Loop is Running...")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    ////When Expression...
    println("When Expression...")

}