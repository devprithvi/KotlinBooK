fun main() {
    var i = 20;
    println(i.plus(30))
    println(i.toFloat())

    val p1 = Person("Prithvi", 22)
    val p2 = Person("Sumit", 22)
    val p3 = Person("Kartik", 18)
    val p4 = Person("Raman", 19)

    p1.age =17
    println(p1.canVote())
    println(p2.canVote())
    println(p3.canVote())
    println(p4.canVote())
}

class Person(val name: String, var age: Int) {
    fun canVote(): Boolean {
        return age > 18
    }
}