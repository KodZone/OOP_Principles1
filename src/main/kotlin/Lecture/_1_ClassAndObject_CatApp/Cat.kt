package Lecture._1_ClassAndObject_CatApp

// This file contains the Cat CLASS (the blueprint)
class Cat(val name: String, var age: Int, var weight: Int) {

    fun walk() {
        weight--
    }

    override fun toString(): String {
        return "Name:## $name Age: $age Weight: $weight"
    }
}