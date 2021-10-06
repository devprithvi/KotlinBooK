/**
 * The is operator checks if an expression is an instance of a type.
 * If an immutable local variable or property is checked
 * for a specific type, there's no need to cast it explicitly:
 */

fun getStringLength(obj: Any): Int? {
    if (obj is String) { //
        //if (obj !is String) return null
        //// `obj` is automatically cast to `String` in this branch
        //return obj.length
        //------OR.----------
        //obj` is automatically cast to `String` on the right-hand side of `&&`
        //if (obj is String && obj.length > 0) {
        //return obj.length
        //}
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }
    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

fun main() {
    fun printLength(obj: Any) {
        println(
            "Getting the length of '$obj' . Result: ${
                getStringLength(obj) ?: "Error: The object is not a string"
            }"
        )
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))

}
