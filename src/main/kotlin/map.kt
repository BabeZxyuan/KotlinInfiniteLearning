fun main () {
    val groupMap = mapOf(
        1 to "Group 1",
        2 to "Group 2",
        3 to "Group 3",
        4 to "Group 4",
        5 to "Group 5",
        6 to "Group 6",
        7 to "Group 3",
    )
    println(groupMap)
    println(groupMap[3])
    println(groupMap.getValue(3))
    println(groupMap.values)
    println(groupMap.keys)
}