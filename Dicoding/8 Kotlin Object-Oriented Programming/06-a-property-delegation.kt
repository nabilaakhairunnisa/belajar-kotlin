//Delegate: kelas yang mengatur dan mengelola fungsi get set untuk property class
//Jika memiliki 3 buah kelas yang memerlukan fungsi get set, maka gunakan property delegation untuk meminimalisir kode
//Kita tidak perlu mengulang-ulang fungsi get set pada setiap kelas. Cukup panggil kelas Delegation saja.

//Cara buat class delegate
import kotlin.reflect.KProperty

class DelegateName {
  private var value: String = "Default" //ini menentukan nilai awal

  //ini untuk mengambi nilai
  operator fun getValue(classRef: Any?, property: KProperty<*>): String {
    println("Fungsi ini sama seperti getter untuk properti ${property.name} pada kelas $classRef")
    return value
  }

  //<*> ini namanya wildcard, yang artinya kita tidak ingin menentukan tipe secara eksplisit
  operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
    println("Fungsi ini sama seperti setter untuk properti ${property.name} pada kelas $classRef")           
    println("Nilai ${property.name} yaitu $value akan berubah menjadi $newValue")
    value = newValue
  }
}

class Animal {
  var name: String by DelegateName() //dengan begini, properti name dikelola melalui delegate
}

class Person {
  var name: String by DelegateName()
}

class Hero {
  var name: String by DelegateName()
}
  
fun main() {
  val animal = Animal()
  animal.name = "Dicoding Miaw"
  println("Nama Hewan: ${animal.name}\n")

  val person = Person()
  person.name = "Dimas"
  println("Nama Orang: ${person.name}\n")

  val hero = Hero()
  hero.name = "Gatotkaca"
  println("Nama Hero: ${hero.name}\n")
}
  
