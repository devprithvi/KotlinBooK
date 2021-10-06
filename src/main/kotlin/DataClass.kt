fun main() {
    val p1 = Employee(1, "Roy");
    val p2 = Employee(1, "Roy");

    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)

    //utility Fun :: Copy
    val p3 = p1.copy(id = 3)
    println(p3)

    val (id, name) = p1
    println(id)
    println(name)
    println(p1.component1()) //component of the p1....id,name
}

data class Employee(val id: Int, val name: String) {

}
