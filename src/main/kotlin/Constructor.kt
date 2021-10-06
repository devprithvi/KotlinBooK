fun main() {
    var car = Automobile("Tata", "petrol")
    var bikes = Automobile("yamaha",  "petrol")
    var Bus = Automobile("Mahindra", "petrol")

    var person2 = Person2("Lakshaya", 20)
    println(person2.age)
    println(person2.name)
}

class Automobile(val name: String, val tyre: Int, val maxSeating: Int,val engineType:String) {
    //initializer block
    init {
        println("$name is created")
    }
    //Secondary constructor
    constructor(nameParam: String,engineParam: String):this(nameParam,4,5,engineParam)
    fun drive() {}
    fun applyBreaks() {}

}

class Empty {}
class Person2(nameParam: String, ageParam: Int) {
    val name: String = nameParam
    val age: Int = ageParam

}