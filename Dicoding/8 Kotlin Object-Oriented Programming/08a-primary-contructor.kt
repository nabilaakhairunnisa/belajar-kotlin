//Constructor: fungsi yang bisa menginisialisasi properti pada kelas

//Primary Constructor: mengirim nilai sesuai properti yang dibutuhkan

//Penulisannya mirip seperti parameter pada fungsi. Cukup ditambahkan val atau var 

class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)

fun main() {
  val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true) //membuat objek dan langsung memberikan nilai (argumen)
  println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
  //Output: Nama: Dicoding Miaw, Berat: 4.2, Umur: 2, mamalia: true
}



