//Merupakan keyword yang diletakkan di bagian awal pendeklarasian sebuah fungsi
//Agar mempercepat proses eksekusi program

fun main() {
    printResult(10, sum)
}

//Contoh penggunaan Inline
inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value}
