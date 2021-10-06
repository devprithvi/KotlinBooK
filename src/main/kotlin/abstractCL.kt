import java.util.*

//Instantiate an abstract class...............pg201
abstract class abstractCL {
    abstract fun doSomething()
    abstract fun sleep()
}

fun main() {
    val myObject = object : abstractCL() {
        override fun doSomething() {
            println("Coading to conquer")
        }

        override fun sleep() {
            println("Good sleep can improve your health ")
        }
    }
    myObject.doSomething()
    myObject.sleep()
}