package Lecture.`_1_Concise Style_CatApp`

// This file demonstrates OBJECT creation and usage
fun main() {
    // Create two separate objects using the Cat constructor.
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)

    // Each method call changes only that object's weight.
    binnie.walk()
    clyde.walk()

    // Printing each object automatically calls its toString().
    println(binnie)
    println(clyde)
}