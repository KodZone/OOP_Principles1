package Lecture._5_1_Inheritance_VehicleApp

// Demonstrates inheritance and overriding
fun main() {
    val c = Car("Ford", 120, 2000)
    val b = Bike("Raleigh", 30, true, 27)

    println(c)
    println(b)

    c.move()   // Vehicle version
    c.start()
    c.move()   // Vehicle version
    c.stop()

    b.move()   // Vehicle version
}