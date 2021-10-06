class Rectangle(length: Int, Bridth: Int) {
    var paremeter = (length + Bridth) * 2
}

class area(length: Int, Bridth: Int) {
    var area = length * Bridth
}

fun main() {
    val rectangle = Rectangle(12, 10)
    val areaRect = area(12, 12)
    println("paremetre of Recatngle = ${rectangle.paremeter}")
    println("Area of Recatngle = ${areaRect.area}")
}