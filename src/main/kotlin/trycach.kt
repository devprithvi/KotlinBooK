import java.lang.IllegalStateException

class trycach {
}

//Return on when statement.........................
fun transform(color: String): Int = when(color) {
    //return when (color) {  <---OR
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value ")
    }


fun test() {
    val result = try {
        //cout()
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
}

fun theAnswer() = 42

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

fun main() {
    test()
    transform("Green")
    println(theAnswer())
    arrayOfMinusOnes(10)
}