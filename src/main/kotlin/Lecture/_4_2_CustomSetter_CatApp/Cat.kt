package Lecture._4_2_CustomSetter_CatApp

class Cat(
    private val name: String,
    private var age: Int,
    weightIn: Int
) {
    var weight = weightIn
        set(newWeight) {
            if (newWeight >= 5) {
                field = newWeight // Store the accepted value.
            }
            // Otherwise, keep the existing value.
        }
}

fun main() {
    val sniffy = Cat("Sniffy", 5, 7)
    println(sniffy.weight) // Prints 7.

    sniffy.weight = 6      // Setter accepts 6.
    println(sniffy.weight) // Prints 6.

    sniffy.weight = 4      // Setter rejects 4.
    println(sniffy.weight) // Still prints 6.
}