fun main() {
    val setItems = mutableSetOf(1, 2, 3, 5, 1, 4)
    setItems.add(6)
    setItems.remove(2)

    println(setItems)
}