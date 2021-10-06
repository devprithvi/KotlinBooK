fun main() {

    // val number = 5

    // val result = number in 1..5 //1 2 3 4 5
    // val result2 = number in 1 until 5 //1 2 3 4
    // print(result)
    // print(result2)

    /*
     if (animal == "horse") {
         ("Animal is Horse")
     } else if (animal == "cat") {
         ("Animal is cat")

     } else if (animal == "Dog") {
         ("Animal is Dog")
     } else {
         ("Animal not found")
     }

     */
    //OR WE CAN USE WHEN >>>>>>
    val animal = "Dog"
    val result = when (animal) {
        "Horse" -> "Animal is Horse"
        "Cat" -> "Animal is Cat"
        "Dog" -> "Animal is Dog"
        else -> "Animal not found."

    }
    println(result)

    val number = 13
    val result2 = when (number) {
        2 -> "Two"
        10 -> "Ten"
        13 -> "Thirteen"
        else -> "number not found"
    }
    println(result2)

}