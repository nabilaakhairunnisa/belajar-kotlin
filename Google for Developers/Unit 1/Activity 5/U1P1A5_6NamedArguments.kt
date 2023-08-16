fun birthday(name: String, umur: Int): String {
    val ucapan = "Met Ultah $name"
    val keterangan = "yang ke $umur"
    return "$ucapan $keterangan"
}

fun main() {
    //jadi mau naro parameternya secara acag juga bisa
    //kalo yang tanpa dinamain argumennya kan harus berurutan.
    println(birthday(name = "Nabila", umur = 21))
    println(birthday(umur = 20, name = "Arda"))
}