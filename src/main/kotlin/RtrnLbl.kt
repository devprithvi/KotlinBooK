fun foo() {
    run loop@ {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop
            print(it)
        }
    }
        println("  Done With nested level")

}

fun main() {
    foo()
}
