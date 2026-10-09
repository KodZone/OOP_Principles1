package Lecture._7_AbstractClass_AnimalApp

// ABSTRACT SUPERCLASS

/* abstract class: An abstract class CANNOT be instantiated.
    - It exists only to be inherited by subclasses.
    - It provides common data and behaviour. */

abstract class Animal(protected var age: Int, protected var weight: Double) {

    /* ABSTRACT METHOD: This method has NO body (no implementation).
        - It forces all subclasses to provide their own version of makeNoise().
        - There is no default noise for a generic Animal. */

    abstract fun makeNoise(): String
}