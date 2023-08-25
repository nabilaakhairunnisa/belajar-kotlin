fun main() {
  SomeString()
  println()
  ChangeDataType()
}

fun SomeString() {
  val someString = "Dicoding" //someString adalah objek realisasi dari kelas String
  println(someString.reversed()) //someString memiliki beberapa fungsi di dalamnya
  //Output: gnidociD
  println(someString.toUpperCase())
  //Output: DICODING
  println(someString.toLowerCase())
  //Output: dicoding
}

fun ChangeDataType() {
  //Ubah Tipe Data
  val someString = "123"
  val someInt = someString.toInt()
  println(someInt is Int)
  //Output: true
  
  val someOtherString = "12.34"
  val someDouble = someOtherString.toDouble()
  println(someDouble is Double)
  //Output: true
}
