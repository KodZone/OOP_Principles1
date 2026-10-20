package Seminar._4_StudentApp

class Student(
    val id: String,
    val name: String,
    val course: String
) {

    // Task D: mark is no longer passed in constructor
    // It is initialised to 0
    var mark: Double = 0.0
        set(value) {
            // Task A: custom setter validation (0–100 only)
            if (value in 0.0..100.0) {
                field = value
            }
            // If invalid, ignore update
        }

    // Task B: getGrade() method
    fun getGrade(): String {
        return when {
            mark >= 70 -> "First"
            mark >= 60 -> "2/1"
            mark >= 50 -> "2/2"
            mark >= 40 -> "Third"
            else -> "Fail"
        }
    }

    // Task C: didPass() method
    fun didPass(): Boolean {
        return mark >= 40
    }

    override fun toString(): String {
        return "Name: $name Course: $course Mark: $mark"
    }
}
