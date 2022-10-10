var balance = 10_000

fun main() { // Dibuat Oleh Andika Kurnia Sandi Yuda

    val playTheGame = {
        balance -= 1_000
        println("playing the game!")
    }

    doTransaction(playTheGame)

}
inline fun doTransaction(doPlay:() -> Unit) {

    println("Balance before play: $balance")

    doPlay()

    println("Balance after play: $balance")

}