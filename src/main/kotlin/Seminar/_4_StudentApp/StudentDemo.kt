package Seminar._4_StudentApp

fun main() {

    print("Enter student ID: ")
    val id = readln()

    print("Enter student name: ")
    val name = readln()

    print("Enter course: ")
    val course = readln()

    val student = Student(id, name, course)

    // Task E: Prompt for mark
    print("Enter mark (0–100): ")
    val inputMark = readln().toDouble()

    // Set mark using custom setter
    student.mark = inputMark

    println()
    println("Student Status")
    println("--------------")
    println("Mark: ${student.mark}")
    println("Grade: ${student.getGrade()}")
    println("Passed: ${student.didPass()}")
}

