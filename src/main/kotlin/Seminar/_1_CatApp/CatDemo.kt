package Seminar._1_CatApp

fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)

    binnie.walk()
    clyde.walk()

    binnie.eat()
    binnie.eat()

    println(binnie)
    println(clyde)
}