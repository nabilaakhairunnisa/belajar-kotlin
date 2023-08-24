fun main() {
  Slice()
  SliceRange()
  SliceSpecific()
  Distinct()
  DistinctWithParameter()
  DistinctLength()
  Chunked()
  ChunkedModif()
}

fun Slice() {
  //menyaring item dari posisi tertentu
  val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val slice = total.slice(3..6) //memilih elemen dari index ke 3 sampai 6
  println(slice)
  println()
  //output: [4, 5, 6, 7]
}

fun SliceRange() {
  val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val sliceStep = total.slice(3..8 step 2) //mengambil elemen dari index 4 hingga 8 dilongkap 2
  println(sliceStep)
  println()
  //output: [4, 6, 8]
}

fun SliceSpecific() {
  val index = listOf(2, 3, 5, 8) //collection yang menyimpan data untuk menyaring index
  val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) //data collection
  val sliceSpecific = total.slice(index) //menyaring collection berdasarkan data dari index
  println(sliceSpecific)
  println()
  //output: [3, 4, 6, 9]
}

fun Distinct() {
  //menyaring elemen yang sama
  val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
  println(total.distinct()) 
  println()
  //output: [1, 2, 3, 4, 5]
}

data class Item(val key: String, val value: Any)
 
fun DistinctWithParameter() {
    val items = listOf(
       Item("1", "Kotlin"),
       Item("2", "is"),
       Item("3", "Awesome"),
       Item("3", "as"),
       Item("3", "Programming")
    )

    val distinctItems = items.distinctBy { it.key } //menyaring key yang sama
    distinctItems.forEach { println("${it.key} with value ${it.value}") }
    println()
    /*
       output:
       1 with value Kotlin
       2 with value is
       3 with value Awesome
    */
}

fun DistinctLength() {
  //hanya yang memiliki panjang karakter yang berbeda saja yang dipilih
  val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
  val distinct = text.distinctBy { it.length }
  println(distinct)
  println()
  //Output: [A, CC, EEE, GGGG]
}

fun Chunked() {
  val word = "QWERTY"
  println(word.chunked(3)) //memecah karakter menjadi 3
  println()
  //output:[QWE, RTY]
}

fun ChunkedModif() {
  val word = "QWERTY"
  val chunkedModif = word.chunked(3) { //dipecah menjadi saling 3
    it.toString().toLowerCase()
  }
  println(chunkedModif)
  println()
  //Output: [qwe, rty]
}




