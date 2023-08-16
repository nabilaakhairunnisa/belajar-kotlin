fun ultah(name: String): String {
    //nah, di sini tambahin nilai dari name
    //yang di mana nilainya akan diberikan pada fungsi main
    val ucapan = "Happy Birthday, $name"
    val umur = "yang ke 21 tahun!"
    return "$ucapan $umur"
}

fun main() {
    //memberikan argumen ke parameter name
    println(ultah("Nabila"))
}
