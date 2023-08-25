//Recursion Call: memanggil fungsi di dalam fungsi itu sendiri

fun main() {
  println("Faktorial dari 5 adalah ${Factorial(5)}")
}

fun Factorial(n: Int): Int {
  return if (n == 1) {
    n
  } else {
    n * Factorial(n - 1) 
  }
}

