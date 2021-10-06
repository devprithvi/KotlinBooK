/*
Kotlin has two types of string literals:
escaped strings that may contain escaped characters
raw strings that can contain newlines and arbitrary text
 */
fun main() {

    //Here's an example of an escaped string:
    val s = "Hello, world!\n"
    println(s)

    //A Raw String
    val text = """
for (c in "foo")
print(c)
"""
    println(text)

    val text2 = """
|Tell me and I forget.
|Teach me and I remember.
|Involve me and I learn.
|(Benjamin Franklin)
""".trimMargin()
    println(text2)

}