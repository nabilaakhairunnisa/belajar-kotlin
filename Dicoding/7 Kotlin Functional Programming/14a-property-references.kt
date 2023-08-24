//Reflection: fitur bahasa dan library untuk mengamati struktur kode secara langsung
​
val sum: (Int, Int) -> Int = ::count //Function Type
fun count(valueA: Int, valueB: Int): Int {
  return valueA + valueB
}

fun main() {
  //*** Function References ***
  val numbers = 1.rangeTo(10) // deklarasi var numbers bernilai 1 sampai 10
  val evenNumbers = numbers.filter(::isEvenNumber) //Gunakan operator :: referensi fungsi
  println(evenNumbers)
​
  //Mereferensikan extension function
  val evenNumbers2 = numbers.filter(Int::isEvenNumber2)
  println(evenNumbers2)
}

fun isEvenNumber(number: Int) = number % 2 == 0
//Jika menggunakan extension function:
fun Int.isEvenNumber2() = this % 2 == 0

​
