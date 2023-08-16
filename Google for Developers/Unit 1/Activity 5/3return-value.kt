//Kalo pake unit berati gak mengembalikan nilai
fun birthdayGreeting(): Unit {
    println("Happy Birthday")
    println("Nabila")
}

//Kalo pake tipe data String, maka dia harus mencantumkan return
fun birthdayGreeting2(): String {
    val ucapan = "Happy Birthday"
    val nama = "Nabila"
    return "$ucapan $nama"
}

fun main() {
    birthdayGreeting()

    //dan pada fungsi main harus membuat variabel lbaru untuk menyimpan nilai dari fungsi tsb
    val greeting = birthdayGreeting2()
    //lalu tambahkan perintah untuk mencetak nilai di sini
    print(greeting)
}
