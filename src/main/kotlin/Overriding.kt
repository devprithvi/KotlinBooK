fun main() {
    val oneplus = onePlus("smartPhone")
    oneplus.display()
    println(oneplus.toString())

}

open class Mobile(val type: String) {
    open val name: String = ""
    open val size: Int = 5
    fun makeCall() = println("calling from mobile")
    fun powerOff() = println("calling function powerOff")
    open fun display() = println("simple mobile display") //open to override.
}

class onePlus(typeParam: String) : Mobile(typeParam) {
    override val name: String = "OnePlus"
    override val size: Int = 6
    override fun display() {
        super.display() //to call the parent class...
        println("OnePlus Display")
    }

    override fun toString(): String {
        return "onePlus(name='$name', size=$size)"
    }


}