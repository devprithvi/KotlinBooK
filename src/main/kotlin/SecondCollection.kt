fun main() {
    val num = listOf(1, 2, 3)    //immutable list
    val num2 = mutableListOf(1, 2, 3)    //mutable list
    println(num.indexOf(3)) //finding index no.
    println(num.contains(4)) //no. contains or not...

    num2[1] = 2
    num2.add(5)
    num2.remove(1)
    println(num2)

    val list2 = listOf(10, 12, 14,15)
    num2.addAll(list2)  //we can merge the one list to anotherlist
    println(num2)
}