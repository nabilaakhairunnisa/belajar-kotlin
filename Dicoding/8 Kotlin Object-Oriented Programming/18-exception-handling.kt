fun main() {
  TryCatch()
  TryCatchFinally()
}

fun TryCatch() {
  //Try and Catch
    //kode yang ingin dites disimpan di try, 
    //jika terjadi kesalahan/exception maka panggil blok catch
  val someNullValue: String? = null
  //lateinit var adalah cara mendeklarasikan properti yang akan diinisialisasi nanti (late initialization)
  lateinit var someMustNotNullValue: String 
  try {
    someMustNotNullValue = someNullValue!!
    println(someMustNotNullValue)
  } catch (e: Exception) {
    println("Nilai String Null")  
    //Output: Nilai String Null
  }
}

fun TryCatchFinally() {
  //Finally selalu dieksekusi terlepas dari apakah pengecualian terjadi atau tidak.
      try {
        //Kode yang mungkin menghasilkan pengecualian
        val result = 10 / 0 //Pembagian oleh nol, akan menghasilkan ArithmeticException
        println("Hasil: $result")
    } catch (e: ArithmeticException) {
        //Penanganan pengecualian jika terjadi ArithmeticException
        println("Terjadi kesalahan aritmatika: ${e.message}")
    } finally {
        //Blok ini akan selalu dieksekusi, terlepas dari apakah pengecualian terjadi atau tidak
        println("Blok finally dieksekusi")
    }
    println("Program berlanjut setelah blok try-catch-finally")
}

import kotlin.NumberFormatException

fun MultipleCatch() {
  val someString










