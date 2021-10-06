import java.io.File

class notnull {
}

//pgno. 202
/*
map nullable value
Execute if not null..

 */

fun main() {
    val files = File("Test").listFiles()
    println(files?.size) //size is printed if files is not null
    // println(files? .size ?: "empty")
    val emails = ""
    val mainEmail = emails.firstOrNull() ?: ""

}