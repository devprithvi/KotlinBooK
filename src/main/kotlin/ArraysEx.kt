/**
 * Arrays in Kotlin are represented by the Array class.
 * It has get and set functions that turn into [] by operator overloading
 * conventions, and the size property, along with other useful member functions:
 */

/*
class Array<T> private constructor() {
    val size: Int
    operator fun get(index: Int): T
    operator fun set(index: Int, value: T): Unit

    operator fun iterator(): Iterator<T>
}

 */

fun main() {
    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(10) { i -> (i * i).toString() }
    asc.forEach { println(it) }

    /**
     * Kotlin also has classes that represent arrays of primitive types
     * without boxing overhead: ByteArray, ShortArray,
     * IntArray, and so on.
     */
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]

    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr0 = IntArray(5)
    for (i in arr0.indices) println(i)
// e.g. initialise the values in the array with a constant
// Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr1 = IntArray(5) { 42 }
    for (i in arr1.indices) println(i)
// e.g. initialise the values in the array using a lambda
// Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    var arr2 = IntArray(5) { it * 1 }
    for (i in arr2.indices) println(i)

    val array = arrayOf("a", "b", "c")
//sampleStart
    for (i in array.indices) {
        println(array[i])
    }



    val arrayNew = arrayOf("a", "b", "c")
//sampleStart
    for ((index, value) in arrayNew.withIndex()) {
        println("the element at $index is $value")
    }
//sampl

}