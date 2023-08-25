//Kalo ini kelas delegasi yang bisa menerrima semua tipe data (pake Any)

import kotlin.reflect.KProperty

class DelegateGenericClass {
  private var value: Any = "Default"
  
  operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }
 
    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}
 
class Animal {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

fun main() {
  val animal = Animal()
  animal.name = "Dicoding Cat" //yang ini tipe data string
  println("Nama: ${animal.name}\n")
  
  animal.weight = 6.2 //ini tipe data float
  println("Berat: ${animal.weight}\n")
  
  animal.age = 1 //ini tipe data int
  println("Umur: ${animal.age} Tahun\n")
}
  
  
