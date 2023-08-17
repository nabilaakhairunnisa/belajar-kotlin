data class DataUser(val name : String, val age : Int)
 
fun main(){
    val dataUser1 = DataUser("nrohmen", 17)
    val dataUser2 = dataUser1.copy()
    val dataUser3 = dataUser2.copy(age = 21)
    
    println(dataUser1)
    println(dataUser2)
    println(dataUser3)
}

/*
Output:
DataUser(name=nrohmen, age=17)
DataUser(name=nrohmen, age=17)
DataUser(name=nrohmen, age=21)

Kalo ini namanya fungsi copy(), bisa ngecopy nilai dari parameter sebuah fungsi (argumen)
Ini memudahkan untuk mengubah salah satu nilai dari parameter.
Kita jadi tidak perlu menuliskan ulang semua argumennya
hanya perlu menuliskan argumen baru yang ingin diubah saja.
*/
