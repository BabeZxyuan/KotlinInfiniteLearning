fun main() {
    val timeOpen = 8
    val timeClosed = 10
    val timeNow = 9

    val classStatus = if(timeNow >= timeClosed) {
        "Class Already closed"
    } else if(timeNow >= timeOpen) {
        "Class is open"
    } else {
        "Class is not open yet"
    }

    println(classStatus)
}