class User1(val name : String, val age : Int)
 
data class User2(val name : String, val age : Int)

class User3(val name : String, val age : Int){
    override fun toString(): String {
        return "name=$name, age=$age"
    }
}
 
fun main(){
	  println(User1("nrohmen", 17))
    println(User2("nrohmen", 17))
    println(User3("nrohmen", 17))
}

/*
Output:
User1@7291c18f
User2(name=nrohmen, age=17)
name=nrohmen, age=17

Kelas User1 merupakan kelas biasa, sehingga menghasilkan memory address kelas tersebut, bukan nilainya langsung.
Jika ingin mencetak nilainya, maka harus menggunakan fungsi toString() seperti kelas User3
Sedangkan data class sudah otomatis menghasilkan fungsi toString(), sehingga langsung mencetak nilai yang diberikan.
*/
