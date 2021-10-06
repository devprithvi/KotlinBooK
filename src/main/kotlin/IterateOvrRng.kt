class IterateOvrRng {
}
fun main(){
    for (i in 1..10) { print(i) } // closed range: includes 10
    println("   ")
    for (i in 1 until 10) { print(i) } // half-open range: does not include 100
    println("   ")
    for (x in 2..10 step 2) { print(x) }
    println("   ")
    for (x in 10 downTo 1) { print(x) }
    //if (x in 1..10) { print(x) }
}