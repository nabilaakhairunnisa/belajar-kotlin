fun main() {
  println("Faktorial dari 5 adalah ${Factorial(5)}")
}

fun Factorial(n: Int): Int {
  return if (n == 1) {
    n
  } else {
    n * Factorial(n - 1) //anjay bisa manggil fungsi di dalam fungsi itu sendiri
  }
}

//Tail Call Recursion: 
//  sekumpulan urutan untuk menjalankan tugas tertentu 
//  diojalankan terakhir

fun FactorialTailCall(n: Int, result: Int = 1): Int {
  val newResult = n * result //mengalikan kedua parameter fungsi 
  return if (n == 1) { //Jika n sama dengan 1, maka 
    newResult
  } else {
    Factorial(n - 1, newResult) 
