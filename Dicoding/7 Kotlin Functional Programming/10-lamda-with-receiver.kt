//Biasa digunakan untuk DSL (Domain Specific Languages)

//DSL adalah bahasa komputer untuk domain aplikasi seperti Gradle dan SQL

//Deklarasi fungsi buildString yang merupakan higher order function 
fun buildString(action: StringBuilder.() -> Unit): String {
    //Deklarasi variabel stringBuilder untuk menyimpan kelas StringBuilder   
    val stringBuilder = StringBuilder()
    //Menggunakan this.action() untuk menjalankan fungsi lambda
    stringBuilder.action
    return stringBuilder.toString()
}

fun main() {
    //Deklarasi variabel message untuk menyimpan fungsi buildString 
    val message = buildString {
        //Memanggil method append untuk menambahkan kata
        append("Hello ")
        append("from ")
        append("lambda ")
    }
    println(message)
    //Output: Hello from lambda
}

/*Jika tanpa lambda with reciever, akan ada pemanggilan berulang-ulang seperti berikut:
fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}
*/
