package Lecture._5_Inheritance_VehicleApp

// SUPERCLASS (Parent class)
/* open class:
    By default, Kotlin classes cannot be inherited.
    The keyword 'open' allows this class to be extended. */
open class Vehicle(protected val make: String, protected val topSpeed: Int,
    protected val nWheels: Int) {
    // protected: Accessible inside this class AND in subclasses.

    /* open function: Methods must also be marked 'open'
        if we want subclasses to override them.*/
    open fun move() {
        println("Moving along...")
    }

    // toString() can also be overridden.
    override fun toString(): String {
        return "Make: $make Top Speed: $topSpeed Wheels: $nWheels"
    }
}