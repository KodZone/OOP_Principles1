package Seminar._1_CatApp

class Cat(val name: String, var age: Int, var weight: Int) {

    fun walk() {
        weight--
    }

    // NEW METHOD: increases the cat's weight by 1
    fun eat() {
        weight++
    }

    override fun toString(): String {
        return "Name: $name Age: $age Weight: $weight"
    }
}