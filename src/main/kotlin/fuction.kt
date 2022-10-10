fun main() {

    val hasil = setUser("Andika", 25, "Pria")

    println(hasil)
}
fun setUser(name: String, age: Int, sex: String): String {
    return "Nama kamu adalah $name, dan umur kamu $age tahun, kamu adalah seorang $sex"
}