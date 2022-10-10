fun main() {
    val days = arrayOf(
        "Monday", "Thuesday", "Wednesday",
        "Thursday", "Friday",
        "Saturday", "Sunday"
    )

    for ((index, value) in days.withIndex()) {
        println("Value $value with index $index")
    }
}