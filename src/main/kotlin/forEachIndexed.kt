fun main() {
    val days = arrayOf(
        "Monday", "Thuesday", "Wednesday",
        "Thursday", "Friday",
        "Saturday", "Sunday"
    )

    days.forEachIndexed { index, value ->
        println("Day $value with index: $index")
    }
}