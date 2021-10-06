fun main() {
    val sum = add(12, 13)
    println(sum)

    val sumnum = add(10, 11)
    println(sumnum)

    evenOrodd(9)
    //passing the arguments
    evenOrodd(10)

    printMsg(5)
    printMsg()
}

fun add(a: Int, b: Int) = a + b //same output...
//{
//    val result = a + b
//    return result
//}

fun evenOrodd(num1: Int) {
    val result = if (num1 % 2 == 0) "Even" else "Odd"
    println(result)

}

fun printMsg(count: Int = 2) { //parametrers....default 2
    for (i in 1..count) {
        println("Hello $i")
    }
}