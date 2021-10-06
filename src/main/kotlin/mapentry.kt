class mapentry {
}
fun main(){
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["c"])

    //
    for ((k,v) in map){ //k and v can be any convenient names, such as name and age.

        println("$k -> $v")
    }
}