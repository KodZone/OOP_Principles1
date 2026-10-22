package Lecture._1_1_ClassAndObject_CatApp

// A class is a blueprint for creating objects.
class Cat(nameIn: String, ageIn: Int, weightIn: Int) {

    // Properties: the data stored by each cat.
    val name: String
    var age: Int
    var weight: Int

    // Runs when an object is created.
    // Copies constructor arguments into the object's properties.
    init {
        name = nameIn
        age = ageIn
        weight = weightIn
    }

    // Method: changes the weight of this cat.
    fun walk() {
        weight--
    }

    // Provides a readable description when the object is printed.
    override fun toString(): String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
