//A reference must be explicitly marked as nullable
//A reference must be explicitly marked as nullable
// Nullable type names have ? at the end.

/*Return null if str does not hold an integer:

fun parseInt(str:String):Int?{
..////
}
 */

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    /*
    //Usinf 'x * y' yields eoor because they may holds nulls.
    if (x != null && y != null) {
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }

     */

    //---------------------OR-------------------
    if (x == null) {
        println("Wrong number format in '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in '$arg2'")
        return
    }
    println(x * y)
}

fun main() {

    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("99", "b")


}