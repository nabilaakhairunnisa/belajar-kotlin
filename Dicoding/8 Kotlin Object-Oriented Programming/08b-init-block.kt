//Blok init: jika properti tadi dituliskan seperti parameter, blok init menuliskan properti di dalam body
  //Berguna untuk memvalidasi nilai properti

class Animal(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){ //ini adalah parameter constructor
    //ini beberapa properti 
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean
 
    init {
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
        //Jika penamaan primary constructor dengan properti sama, maka gunakan keyword thi
        //Contoh: this.isMammal = isMammal
        //Penggunaan this merujuk pada properti
    }
}

fun main() {
  val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true) //buat objek dicodingCat dan langsung memberikan nilai
  println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
  //Output: Nama: Dicoding Miaw, Berat: 4.2, Umur: 2, mamalia: true
}




  
