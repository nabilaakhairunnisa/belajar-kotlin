fun main() {
  println("Faktorial dari 5 adalah ${FactorialTailCall(5)}")
}

//Tail Call Recursion: 
  //pemanggilan rekrusif merupakan pernyataan terakhir dalam fungsi
  //hasil dari pemanggilan rekrusif langsung dikembalikan tanpa melakukan operasi tambahan

//kita punya parameter n dan result bertipe Int
tailrec fun FactorialTailCall(n: Int, result: Int = 1): Int {
  val newResult = n * result //n dikali 1
  return if (n == 1) { //Jika n sama dengan 1, maka panggil variabel newResult
    newResult
  } else {
    FactorialTailCall(n - 1, newResult) //Jika n selain 1 maka panggil fungsi FactorialTailCall    
  }
}
