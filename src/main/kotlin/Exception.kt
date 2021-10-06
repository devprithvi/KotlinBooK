import java.lang.IllegalArgumentException
import java.lang.NullPointerException

fun main() {
    val arr = arrayOf(1, 2, 3)
    try {
        println(arr[5])
    }// to handle the multiple type of exception.
    // we can us multiple catch block
    catch (e: NullPointerException) {

    } catch (e: Exception) {  //base class :::end of the catch block
        println("Please Check the array index")
    } finally {
        println("I will execute ,,No Matter")
    }

    println("This is will not run:: ")


    createUSerList(10)
    //Throw Example
    createUSerList(-5)

}

fun createUSerList(count: Int) {
    if (count < 0) {
        //Exception Raised...
        throw IllegalArgumentException("Count Must be greater then 0")
    } else {
        println("User list created containing $count  users ")
    }
}