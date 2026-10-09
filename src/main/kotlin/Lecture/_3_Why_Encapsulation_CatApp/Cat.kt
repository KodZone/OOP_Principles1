package Lecture._3_Why_Encapsulation_CatApp

// Hide the cat's data and control changes through public methods.
class Cat(
    private val name: String,
    private var age: Int,
    private var weight: Int
) {
    // Returns true if the walk succeeds, or false if it is refused.
    // Methods are public by default in Kotlin.
    fun walk(): Boolean {
        // Only allow walking when weight is above 5.
        if (weight > 5) {
            weight--     // Reduce this cat's weight by one.
            return true  // Report success and exit the method.
        }

        // Weight is 5 or less: leave it unchanged.
        return false
    }

    // Provide a readable description when the object is printed.
    override fun toString(): String {
        return "Name: $name, age: $age, weight: $weight"
    }
}