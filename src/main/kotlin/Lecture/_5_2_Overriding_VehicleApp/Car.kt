package Lecture._5_2_Overriding_VehicleApp

// SUBCLASS of Vehicle
class Car(make: String, topSpeed: Int,
          private val engineCapacity: Int)
    : Vehicle(make, topSpeed, 4) {     // Cars always have 4 wheels

    private var engineRunning = false

    // Car-specific behaviour
    fun start() { engineRunning = true }
    fun stop() { engineRunning = false }

    // Replace Vehicle's move() with Car-specific behaviour.
    override fun move() {
        if (engineRunning) {
            println("Driving along...")
        } else {
            println("Can't drive: the engine is stopped!")
        }
    }

    /* super.toString(): Calls the superclass version of toString()
        and extends it with Car-specific information. */
    override fun toString(): String {
        return super.toString() +
                " Engine running? $engineRunning, Engine Capacity: $engineCapacity"
    }
}