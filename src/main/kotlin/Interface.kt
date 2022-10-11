interface Kamu{
    fun cetakNamaKamu()
    fun namaKamuAdalah(){
        println("Ini Nama Kamu")
    }
}
// interface kedua
interface Dia{
    fun cetakNamaDia()
    fun namaDiaAdalah(){
        println("Nama Panggilannya")
    }
}

class Buah: Kamu, Dia{
    override fun cetakNamaKamu() {
        println("Andika Kurnia Sandi Yuda")
    }

    override fun cetakNamaDia() {
        println("Honda.String()")
    }
}

fun main() {
    val buah = Buah()

    buah.cetakNamaKamu()
    buah.namaKamuAdalah()

    buah.cetakNamaDia()
    buah.namaDiaAdalah()

}