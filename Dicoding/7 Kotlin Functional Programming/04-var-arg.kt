fun main() {
    val number = intArrayOf(40, 50, 60, 70)
    //kita juga bisa menambahkan array pada variable argumen
    sets(10, 20, 30, *number, 80)
}

fun sets(vararg number: Int) {
    //number di sini merupakan parameter yang menyimpan beberapa argumen 
    print("Nilai number: ")
    for (num in number) {
        print("$num ")
    }
    println("\nJumlah elemen dalam number: ${number.size}")
    println("Jumlah total dalam number: ${number.sum()}")
}
