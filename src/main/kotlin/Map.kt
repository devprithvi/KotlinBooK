/**
 *  *****************<<MAPS>>*****************
 *   STUDENT
 *   KEY VALUE PAIR
 *   1  RAM
 *   2  Shyam
 *   3  Rahul
 *   4  Summit
 *   5  Raman
 *
 * Key should be unique
 */

fun main() {
    //Mutable Map:::::::::
    val students = mutableMapOf<Int, String>()
    students.put(1, "Ryan")
    students.put(2, "Rahul")
    students.put(3, "RAM")
    students.put(4, "Summit")

    println(students.get(1))
    println(students.get(4))

    //looping of MAp::
    for ((key, value) in students) {
        println("$key  -  $value")
    }
    students[5] = "Prithvi"
    println(students[5])

    //Immutable Map::::::

    val map = mapOf<Int, String>(1 to " Sita", 2 to "Ram", 3 to " prithvi")
    // map.put    ::: We can use 'put' here bcz it is Immutable.;;;
    println(map)


    ///for more Utility follow the Documentation :::::

}