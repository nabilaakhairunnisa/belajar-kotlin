//Extension: Kotlin dapat meng-extends fungsi tanpa harus mewarisi kelasnya

class Animal(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

//Extension property getAnimalInfo yang dibuat di luar kelas
val Animal.getAnimalInfo: String
get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

fun main() {
  //Penggunaan properti pada sebuah objek dari kelas Animal
  val dicodingCat = Animal("Dicoding Miaw", 5.0, 2, true)
  println(dicodingCat.getAnimalInfo)
}

//Output: Nama: Dicoding Miaw, Berat: 5.0, Umur: 2 Mamalia: true
