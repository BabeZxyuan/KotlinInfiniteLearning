    open class Honda {
        init {
        println("Aku Adalah Manusia")
    }
}
    open class Striing: Honda() {
        init {
        println("Yang Bukan Sempurna")
    }
}
    class AkuManis: Striing() {
        init {
        println("dan aku bukan lah manusia yang baik")
    }
}
    fun main() {
        AkuManis()
}