/**
 * class can not be instantiated.
 * abst class have both abstract and non abstract properties and method.
 *
 */
fun main() {
    val rectangle: Shape = RectangleArea(4.0, 2.2)
    val square: Shape = SquareArea(5.0)
    val triangle: Shape = TriangleArea(5.0, 2.0)
    rectangle.desplay()
    println("Area of rectangle : " + rectangle.area() + " MSqr")
    square.desplay()
    println("Area of Square : " + square.area() + " MSqr")
    triangle.desplay()
    println("Area of Triangle : " + triangle.area() + " MSqr")

}

abstract class A {
    fun method1() {
        println("i am a method")
    }
}

abstract class Shape { //abs classes are by default open
    abstract fun area(): Double
    abstract fun desplay()
}

class RectangleArea(val length: Double, val bridth: Double) : Shape() {
    override fun area(): Double {
        return length * bridth
    }

    override fun desplay() {
        println("Rectangle Area is getting display: ")
    }


}

class SquareArea(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }

    override fun desplay() {
        println("Square Area is getting display: ")
    }
}

class TriangleArea(val base: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }

    override fun desplay() {
        println("Triangle Area is getting display: ")
    }


}

