fun ultah(name: String, umur: Int): String {
    val ucapan = "Met Ultah $name"
    val keterangan = " yang ke $umur"
    return "$ucapan $keterangan"
}

fun main() {
    println(ultah("Nabila", 21))
}
