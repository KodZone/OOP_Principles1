package Seminar._5_StudentApp

fun main() {

    val u1 = Undergraduate("U001", "Alice", "Computing")
    u1.mark = 72.0

    val u2 = Undergraduate("U002", "Bob", "Business")
    u2.mark = 45.0

    val m1 = Masters("M001", "Charlie", "Data Science")
    m1.mark = 68.0

    val m2 = Masters("M002", "Dina", "Cyber Security")
    m2.mark = 38.0

    val students: List<Student> = listOf(u1, u2, m1, m2)

    for (s in students) {
        println(s)
        println("Grade: ${s.getGrade()}")
        println("Passed: ${s.didPass()}")
        println()
    }
}

