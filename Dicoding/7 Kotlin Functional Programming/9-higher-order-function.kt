//Merupakan fungsi yang parameternya merupakan sebuah fungsi 

fun main() {
    //Memanggil fungsi printrResult dan mengirim argumen 10 dan sum
    printResult(10, sum)
}

//Buat fungsi printResult dengan parameter value bertipe int juga parameter sum yang merupakan sebuah lamda function
fun printResult(value: Int, sum: (Int) -> Int) {
    //Mendeklarasikan variabel result yang menyimpan nilai value yaitu 10 untuk fungsi sum
    val result = sum(value)
    //Mencetak nilai result
    println(result)
    //Output: 20
}

//Membuat fungsi lamda yang mengembalikan nilai bertipe Int
var sum: (Int) -> Int = { value -> value + value}
//Fungsi tersebut menerima argumen dari fun main yaitu 10 dan menjumlahkannya 
