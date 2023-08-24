//kotlin collection: struktur data yang menyediakan banyak fungsi untuk mengelola dan memanipulasi data

fun main() {
  Fold()
  FoldRight()
  Drop()
  DropLast()
  Take()
  TakeLast()
}

fun Fold() {
  //melakukan setiap nilai tanpa iterasi satu-persatu
  val numbers = listOf(1, 2, 3)
  //menambahkan setiap item dengan 10
  val fold = numbers.fold(10) { current, item -> //parameter lambda function
    println("current: $current") //mempresentasikan nilai awal argumen
    println("item: $item") //mempresentasikan masing-masing item yang berada pada numbers
    current + item 
  }
  println("fold result: $fold")
  println()
  /*Output: 
  current: 10
  item: 1
  current: 11
  item: 2
  current: 13
  item: 3
  fold result: 16
  */
}

fun FoldRight() {
  //melakukan iterasi dari indeks terakhir
  val numbers = listOf(1, 2, 3)
  //menambahkan setiap data dengan 10
  val fold = numbers.foldRight(10) { item, current -> //argumen item berada pada posisi pertama
    println("current: $current") //mempresentasikan nilai awal argumen
    println("item: $item") //mempresentasikan masing-masing item yang berada pada numbers
    current +item 
  }
  println("fold result: $fold")
  println()
  /*Output: 
  current: 10
  item: 3
  current: 13
  item: 2
  current: 15
  item: 1
  fold result: 16
  */
}

fun Drop() {
  //membuang item di awal
  val numbers = listOf(1, 2, 3, 4, 5, 6)
  println(numbers.drop(3)) //membuang 3 item dari depan
  println()
  //Output:  [4, 5, 6]
}

fun DropLast() {
  //membuang item di akhir
  val numbers = listOf(1, 2, 3, 4, 5, 6)
  println(numbers.dropLast(3)) //membuang 3 item dari belakang
  println()
  //Output:  [1, 2, 3]
}

fun Take() {
  //mengambil beberapa elemen pertama dari collection di awal
  val numbers = listOf(1, 2, 3, 4, 5, 6)
  println(numbers.take(2)) //mengambil 3 item dari depan
  println()
  //Output:  [1, 2]
}

fun TakeLast() {
  //mengambil beberapa elemen pertama dari collection di awal
  val numbers = listOf(1, 2, 3, 4, 5, 6)
  println(numbers.takeLast(2)) //mengambil 2 item dari belakang
  println()
  //Output:  [5, 6]
}

  
