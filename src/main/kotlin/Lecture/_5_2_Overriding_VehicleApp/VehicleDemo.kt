package Lecture._5_2_Overriding_VehicleApp

// Demonstrates inheritance and overriding
fun main() {
    val c = Car("Ford", 120, 2000)
    val b = Bike("Raleigh", 30, true, 27)

    println(c)
    println(b)

    c.move()   // Car version (engine stopped)
    c.start()
    c.move()   // Car version (engine running)
    c.stop()

    b.move()   // Vehicle version
}