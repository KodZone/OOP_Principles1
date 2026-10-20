package Seminar._3_CatApp

fun main() {

    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 6)

    // Task A – walk with distance
    println(if (binnie.walk(3)) "Walk successful" else "Walk failed")
    println(if (clyde.walk(5)) "Walk successful" else "Walk failed")

    // Task B – eat with validation (max weight 20)
    println(if (binnie.eat(5)) "Eat successful" else "Eat failed")
    println(if (binnie.eat(10)) "Eat successful" else "Eat failed")

    println(binnie)
    println(clyde)
}