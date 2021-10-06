fun main() {
    var gender: String = "Male"
    var gender2: String? = null //accept value as well null
    var isAdult: Boolean? = null //...we dont know the Value...


    println(gender2?.uppercase())

    gender2.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")
    }
    var selectedValue = gender2 ?: "NA"  //elvis Operator
    var value: String = gender2!!.uppercase()  //if object is non null then call function otherwise error  //not null asserted
}