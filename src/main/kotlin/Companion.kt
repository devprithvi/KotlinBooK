fun main() {

    //  MyClass.MyObject.f() //
    MyClass.f()
    MyClass.AnotherObject.g()

}

/**
 * we can define multiple object in the class
 * ij we don't want to use MyObj ...then we have to make
 * the mYObj Companion
 * in Kotlin we use companion for a factory Pattern..
 * Factory Pattern::  simple method ...passing parameters... return object
 */
class MyClass {
    companion object MyObject { //companion  :::

        @JvmStatic // this annotation tells that  method worked as static in java//
        fun f() {
            println("Hello, I am F From Object")
        }
    }

    //only one companion used in java.....Similar to Static in java....
    object AnotherObject {
        fun g() {
            println("Hello, I am G  From Another Object")
        }
    }
}
