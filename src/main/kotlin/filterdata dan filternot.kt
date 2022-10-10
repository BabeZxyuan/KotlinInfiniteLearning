fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)

    val evenlist = numberList.filter { it % 2 == 0 }

    val notEvenlist = numberList.filterNot { it % 2 == 0 }

    println(evenlist)
    println(notEvenlist)
}