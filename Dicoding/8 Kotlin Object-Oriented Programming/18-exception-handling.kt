import kotlin.NumberFormatException
fun main() {
  TryCatch()
  TryCatchFinally()
  MultipleCatch()
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



fun MultipleCatch() {
  val someStringValue: String? = null
  var someIntValue: Int = 0

  try {
    someIntValue = someStringValue!!.toInt() //mangubah string menjadi int dan mennyimpannya ke dalam variabel someIntValue
  } catch (e: NullPointerException) {
    someIntValue = 0 //jika terjadi error, ubah nilai someIntValuemenjadi 0
  } catch (e: NumberFormatException) {
    someIntValue = -1 //jika terjadi kesalahan dalam format, maka ubah nilai someIntValuemenjadi -1
  } finally {
    when(someIntValue) {
      //ketika someIntValue bernilai 0, maka:
      0 -> println("Catch block NullPointerException terpanggil !") 
      //ketika someIntValue bernilai -1, maka:
      -1 -> println("Catch block NumberFormatException terpanggil !")
      //jika tidak terjadi exception
      else -> println(someIntValue)
    }
  }
}
      










