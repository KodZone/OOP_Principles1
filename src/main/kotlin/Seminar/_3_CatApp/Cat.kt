package Seminar._3_CatApp

class Cat(val name: String, var age: Int, var weight: Int) {

    // Updated walk(): accepts distance and returns Boolean
    fun walk(distance: Int): Boolean {
        return if (weight - distance >= 5) {
            weight -= distance
            true
        } else {
            false
        }
    }

    // Updated eat(): increases weight by amount and returns Boolean
    fun eat(amount: Int): Boolean {
        return if (weight + amount <= 20) {
            weight += amount
            true
        } else {
            false
        }
    }

    override fun toString(): String {
        return "Name: $name Age: $age Weight: $weight"
    }
}