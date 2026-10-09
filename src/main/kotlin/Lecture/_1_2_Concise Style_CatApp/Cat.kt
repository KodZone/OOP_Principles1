package Lecture.`_1_2_Concise Style_CatApp`

// Constructor parameters also declare and initialise the properties.
class Cat(val name: String, var age: Int, var weight: Int) {

    // Reduces this cat's weight by one.
    fun walk() {
        weight--
    }

    // Provides a readable description of this cat.
    override fun toString(): String {
        return "Name: $name Age: $age Weight: $weight"
    }
}