open class Phone {
    init {
        println("parent Constructor is called")
    }

    val name: String = ""
    val type: String = ""
    val volume: Int = 10

    fun makeCall() {}
    fun display() {}
    fun powerOff() {}
    fun getDeviceInfo() {
        println("Communication Device")
    }
}

class besicPhone : Phone() {
    init {
        println("child: basicPhone  Constructor is called")
    }

    fun getScreenInfo() {
        println("Black and white Screen")
    }
}

class smartPhone : Phone() {
    init {
        println("child: smartPhone Constructor is called")
    }

    fun playMovie() {}
    fun takePicture() {}
    fun getLocation() {
        println("Get Location...")
    }
}

fun main() {
    val obj = Phone()
    val obj2 = besicPhone()
    val obj3 = smartPhone()
    obj.getDeviceInfo()
    obj2.getScreenInfo()
    obj3.getLocation()
}
