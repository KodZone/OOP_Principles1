package Seminar._2_StudentApp

fun main() {

    while (true) {

        print("Enter student ID: ")
        val id = readln()

        print("Enter student name (or quit to stop): ")
        val name = readln()

        if (name == "quit") {
            break
        }

        print("Enter course: ")
        val course = readln()

        print("Enter mark: ")
        val mark = readln().toDouble()

        val student = Student(id, name, course, mark)

        println(student)
        println()
    }

    println("Program finished.")
}