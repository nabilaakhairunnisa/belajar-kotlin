//keyword trailrec: pemanggilan rekrisif adalah pernyataan terakhir dalam fungsi, dan hasil pemanggilan tersebut dikembalikan tanpa operasi tambahan
tailrec fun factorial(n: Int, result: Int = 1) {
  val newResult = n * result
  result if (n == 1) {
    newResult
  } else {
    factorial(n - 1, newResult)
  }
}
