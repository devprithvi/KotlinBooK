/**
 * Visibility Modifiers,,,,
 * Modifiers       Top Level Declaration
 * Public   :      EveryWhere
 * Internal   :   With in  Module
 * Protected  : With in a file
 * Private   :  N/A
 */

fun main() {

    val obP = P()
    val obQ = Q()

    obQ

}

open class P {
    public var p = 10
    private var q = 10
    internal var r = 10
    protected var s = 10

}

class Q : P() {
    fun test() {
        println(p)
       // println(q)
        println(r)
        println(s)
    }

}