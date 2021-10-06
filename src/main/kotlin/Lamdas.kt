import kotlin.math.pow
import sum as sum1
import java.lang.Double.sum as sum2

/**
 * Kotlin Higher Order Function:::
 * Lamdas Expression
 * we can store a function in a variable
 *
 *"""""""""""""""""Higher Order Function""""""""""""
 * function that 'accept function as a argument' or 'return function'  or both
 *
 */
fun main() {
    println(sum1(12, 15))
    println(power2(10.0, 2.0))

    calculator(15.0, 19.0, ::sum1)

    var fn: (a: Double, b: Double) -> Double = ::sum1  //to store the function in a variable.
    println(fn(12.0, 16.0))
    var fn2: (a: Double, b: Double) -> Double = ::power2  //to store the function in a variable.
}

fun sum1(a: Double, b: Double): Double {
    return a + b
}

fun power2(a: Double, b: Double): Double {
    return a.pow(b)

}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {  //higher Order function

    val result = gn(a, b)
    println(result)


}