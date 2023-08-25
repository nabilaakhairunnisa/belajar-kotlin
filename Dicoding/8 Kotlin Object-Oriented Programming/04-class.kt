class Animal( //ini kelasnya
  //ini beberapa property atau atributnya
  val name: String,
  val age: Int,
  val isMammal: Boolean
) { //ini beberapa fungsi/behaviornya
  fun eat() {
    println("$name makan")
  }
  fun sleep() {
    println("$name tidur")
  }
}

fun main() {
  //sedangkan ini objek dari kelasnya
  val dicodingCat = Animal("Dicoding Meow", 2, true) //ini mengirim beberapa argumen ke dalam kelas Animal.
  println("Nama ${dicodingCat.name}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
  //ini memanggil function di dalam class Animal
  dicodingCat.eat()
  dicodingCat.sleep()
}

  
