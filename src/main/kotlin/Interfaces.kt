fun main() {
    dragObject(arrayOf(RectangleA(1.0, 2.0), SquareA(2.0), TriangleA(1.2, 5.0), Player("Smiley")))

}

fun dragObject(objects: Array<Draggable>) {
    for (obj in objects) {
        obj.drag()
    }
}

interface Draggable {   //Interface behaves same as abstract classes...
    //val dragSpeed: Int
    fun drag()  //by default abstract..

}

abstract class Shapee : Draggable, Cloneable { //abs classes are by default ope
    abstract fun area(): Double
    abstract override fun drag()
}

class RectangleA(val length: Double, val bridth: Double) : Shapee() {
    override fun area(): Double {
        return length * bridth
    }

    override fun drag() = println("Rectangle is dragging: ")
}

class SquareA(val side: Double) : Shapee() {
    override fun area(): Double {
        return side * side
    }

    override fun drag() = println("Square is dragging: ")
}

class TriangleA(val base: Double, val height: Double) : Shapee() {
    override fun area(): Double {
        return 0.5 * base * height
    }

    override fun drag() = println("Triangle is dragging: ")
}

class Player(val name: String) : Draggable {
    override fun drag() = println("$name is dragging")
}
/**
 *
 * Group Objects based on behaviours
 * to use polymorphism in unrelated set of classes (i.e. class which do not belong to same hierarchy.
 *
 */