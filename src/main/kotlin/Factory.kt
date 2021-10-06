fun main() {
    var pizza1 =
        Pizza.Factory.create("Tomato") //calling via factory reference... dont want use Factory...makee it companion
    var pizza2 = Pizza.Factory.create("Mirch")
    println(pizza1)
    println(pizza2)

    var pizza3 = Pizza.create("jjjjj")
    println(pizza3)
}


class Pizza private constructor(val type: String, val topping: String) {

    companion object Factory { //this is the Factory Object
        fun create(pizzaType: String): Pizza {
            return when (pizzaType) {
                "Tomato" -> Pizza("Tomato", "Tomato , Cheese")
                "Peepy Paneer" -> Pizza("Paneer", "Paneer , Cheese,Tomato")
                else -> Pizza("Besic", "Onion , Cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type='$type' ,topping ='$topping')"
    }
}