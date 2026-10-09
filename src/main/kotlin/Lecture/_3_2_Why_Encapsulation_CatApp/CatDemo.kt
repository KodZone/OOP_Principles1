package Lecture._3_2_Why_Encapsulation_CatApp

fun main() {
    // Create Sniffy with age 5 and starting weight 7.
    val sniffy = Cat("Sniffy", 5, 7)

    // Attempt three walks; 1..3 includes both endpoints.
    for (i in 1..3) {
        // Call walk() once per iteration.
        // Its Boolean result determines which message is printed.
        println(
            if (sniffy.walk()) "Walk successful"
            else "Walk failed"
        )
    }

    // Walk 1: weight 7 → 6; returns true.
    // Walk 2: weight 6 → 5; returns true.
    // Walk 3: weight stays 5; returns false.

    // Outside code cannot bypass the rule by changing weight directly.
    // sniffy.weight = -1 // Compile-time error: weight is private.
}