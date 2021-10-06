fun main() {
    val p1 = People("Rohan kumar", 32)
    println(p1.name)
    p1.age = -25
}

//Setter and getter
class People(nameParam: String, ageParam: Int) {

    var name = nameParam
        //Getter......................
        get() {
            return field.uppercase()
        }
    var age = ageParam
        //Setter...............................
        set(value) {
            if (value > 0) {
                field = value  //field ....give value..
            } else {
                println("age cant be Negative")
            }
        }
}
/*
class Calculator() {
    lateinit var message: String

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtrcat(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        return a / b
    }

    fun remainder(a: Int, b: Int): Int {
        return a % b
    }
}

 */