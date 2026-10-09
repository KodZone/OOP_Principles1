package Lecture._4_1_Simple_Getter

class Cat(
    private val name: String,
    private var age: Int,
    weightIn: Int
) {
    // Public getter: outside code can read weight.
    var weight = weightIn
        private set // Only Cat can change it.

    fun walk(): Boolean {
        if (weight > 5) {
            weight-- // Allowed inside the class.
            return true
        }
        return false
    }
}

fun main() {
    val sniffy = Cat("Sniffy", 5, 7)
    println(sniffy.weight) // Prints 7: reading is allowed.

    sniffy.walk()
    println(sniffy.weight) // Prints 6.

    // sniffy.weight = -1  // Error: setter is private.
}