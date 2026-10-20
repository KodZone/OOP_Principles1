package Lecture._4_3_Method_Parameter_CatApp

class Cat(
    private val name: String,
    private var age: Int,
    weightIn: Int
) {
    var weight = weightIn
        private set

    fun walk(distance: Int): Boolean {
        // Reject invalid distances or a resulting weight below 5.
        if (distance <= 0 || weight - distance < 5) {
            return false
        }
        weight -= distance // Same as weight = weight - distance.
        return true
    }
}

fun main() {
    val sniffy = Cat("Sniffy", 10, 15)

    sniffy.walk(5)         // Weight: 15 → 10.
    println(sniffy.weight)

    sniffy.walk(3)         // Weight: 10 → 7.
    println(sniffy.weight)
}