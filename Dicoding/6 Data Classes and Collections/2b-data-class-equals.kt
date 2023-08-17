data class DataUser(val name : String, val age : Int)
 
fun main(){
    val dataUser1 = DataUser("nabila", 21)
    val dataUser2 = DataUser("nabila", 21)
    val dataUser3 = DataUser("dimas", 24)
 
    println(dataUser1.equals(dataUser2))
    println(dataUser1.equals(dataUser3))
}

/*
Output:
true
false

Data class juga menghasilkan fungsi equals
Kita bisa mengecek nilai yang diberikan sama atau tidak dengan menggunakan fungsi equals()
Dan hasil akhirnya berupa boolean
*/
