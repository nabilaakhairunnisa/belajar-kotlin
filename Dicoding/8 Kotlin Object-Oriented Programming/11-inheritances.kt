//Deklarasi kelas Animal yang merupakan super class:
open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
  open fun eat() {
    println("$name sedang makan")
  }
  open fun sleep() {
    println("$name sedang tidur")
  }
}

//Membuat child class 
class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
  : Animal(pName, pWeight, pAge, pIsCarnivore) { //titik dua di sini artinya meng-extend kelas Animal

    fun playWithHuman() {
      println("$name sedang bermain dengan manusia")
    }

    
    override fun eat() { //implement super class's behavior
      println("$name sedang makan ikan")
    }

    override fun sleep() {
      println("$name sedang tidur")
    }
}

fun main() {
  val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4) //implement super class's property
  //Memanggil beberapa fungsi dari kelas Cat
  dicodingCat.playWithHuman()
  dicodingCat.eat()
  dicodingCat.sleep()
}

/*
    Output:
    Dicoding Miaw sedang bermain dengan manusia
    Dicoding Miaw sedang makan ikan
    Dicoding Miaw sedang tidur
*/

    
