import kotlin.math.pow
import kotlin.reflect.KFunction2

fun main() {
    ////val result = multiplication(10.3, 14.2)
    ////val result2=multiplication(12,11)
    //println(multiplication(10.3, 14.2))
    //println(multiplication(12, 11))
    ////Name arguments*****************
    //println(multiplication(a = 12, b = 12))

    var fn: KFunction2<Int, Int, Int> = ::multiplication //store a function in a variable...
    println(fn(10, 2))
    var fn2: KFunction2<Double, Double, Double> = ::power
    println(fn2(2.0, 3.0))
}

fun multiplication(a: Int, b: Int): Int {
    return a * b
}

//
fun power(a: Double, b: Double): Double {
    return a.pow(b)
}
