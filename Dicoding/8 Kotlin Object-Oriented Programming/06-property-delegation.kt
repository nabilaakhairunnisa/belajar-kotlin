//Delegate: kelas yang mengatur dan mengelola fungsi get set untuk property class

//Cara buat class delegate
import kotlin.reflect.KProperty

class DelegateName {
  private var value: String = "Default"

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

    
