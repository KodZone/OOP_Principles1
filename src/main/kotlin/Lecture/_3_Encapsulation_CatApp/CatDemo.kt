package Lecture._3_Encapsulation_CatApp

// This file demonstrates OBJECTS and encapsulation behaviour
fun main() {
    // Create two objects, each with its own property values.
    val clyde = Cat("Clyde", 2, 5)
    val binnie = Cat("Binnie", 5, 4)

    // Direct access is blocked, even though weight uses var.
    // clyde.weight = 10 // Error: weight is private.

    // println() automatically calls each object's toString().
    println(clyde)  // Clyde: age 2, weight 5.
    println(binnie) // Binnie: age 5, weight 4.

    // Change private data through the public walk() method.
    clyde.walk()   // Clyde's weight becomes 4.
    binnie.walk()  // Binnie's weight becomes 3.

    // Display the updated state of each object.
    println(clyde)
    println(binnie)

    // Only Clyde walks again; Binnie's weight stays at 3.
    clyde.walk()   // Clyde's weight becomes 3.
    println(clyde)
}