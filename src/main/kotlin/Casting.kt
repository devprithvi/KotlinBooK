fun main() {
    val circle = Circle(7.0)
    val player = Player2("Smiley")
    val arr = arrayOf(circle, player,Test())

    for (obj in arr) {
        if (obj is Circle) {
            println(obj.area())
        } else {
            (obj as Player2).sayMyName()
        }
    }
    // if (circle is Circle) {
    //     println("This is Circle and Area is ${circle.area()}")
    // }

}

interface Draggable2 {
    fun drag()
}

abstract class Shape2 : Draggable2 {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape2() {
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() = println("Circle is Dragging...")

}

class Player2(val name: String) : Draggable2 {
    override fun drag() = println("$name is dragging")
    fun sayMyName() = println("Hey, My name is  - $name")

}

class Test(){

}