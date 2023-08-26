//Exception: Kejadian/hal buruk yang harus dihindari, kesalahan pada kode

fun main() {
  //ArithmeticException: karena kita membagi suatu bilangan dengan nol
  val someValue = 6
  println(someValue / 0)
  
  //NumberFormatException: kesalahan dalam format angka 
  val someStringValue = "18.0"
  println(someStringValue.toInt()) //ingin mengubah string menjadi integer, tapi formatnya salah

  //NullPointerException: 
  val someNullValue: String? = null //variabel bernilai null
  //variabel yang tidak boleh bernilai null 
  //tapi diisi dengan variabel someNullValue yang mana bernilai null
  val someMustNotNullValue: String = someNullValue!!
  println(someMustNotNullValue)
}  
