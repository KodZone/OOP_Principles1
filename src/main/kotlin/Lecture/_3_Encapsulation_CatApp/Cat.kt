package Lecture._3_Encapsulation_CatApp

// Encapsulation: hide object data and expose methods to use it.
class Cat(
    private val name: String,  // Only accessible inside Cat; cannot be reassigned.
    private var age: Int,      // Only accessible inside Cat; can be changed.
    private var weight: Int    // Only accessible inside Cat; can be changed.
) {
    // Public methods can be called from outside the class.
    // "public" is optional because it is Kotlin's default.
    public fun walk() {
        weight-- // Reduce this cat's weight by one.
    }

    // Replace the inherited toString() with a readable description.
    // This method can access the private properties.
    public override fun toString(): String {
        return "Name: $name, age: $age, weight: $weight"
    }
}