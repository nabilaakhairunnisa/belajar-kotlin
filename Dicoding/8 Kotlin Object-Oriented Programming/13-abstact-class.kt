//Tidak dapat direalisasikan dalam sebuah objek
//Fungsi abstract: mengeneralisasi konsep, merancang arsitektur

abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean) {
  fun eat(){
    println("$name sedang makan !")
  }
  fun sleep(){
    println("$name sedang tidur !")
  }
}

fun main(){
    val animal = Animal("dicoding animal", 2.6, 1, true)
}

//Output: Cannot create an instance of an abstract class
