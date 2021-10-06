fun main() {
    val mustang = Car("Mustang", "Petrol", 100)
    val tesla = Car("Tesla", "Electric", 150)
    val tata = Car("Tiago", "Petrol", 200)

    mustang.driveCar()
    tesla.driveCar()
    mustang.applyBreaks()
}

class Car(val name: String, val type: String, var KmRum: Int) {

    fun driveCar() {
        println("${name} Car is driving.. at the speed of $KmRum Km/hr")
    }

    fun applyBreaks() {
        println("Applied breaks")
    }

}