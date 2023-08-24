fun setWord(message: String) {
  fun printMesage() { 
    println(message)//bisa akses parameter luarnya
  }
  printlnMessage()//akses inner function hanya setelah fungsi itu didefinisikan
}

//Implementasi Iner Function
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
  fun validateNumber(value: Int) {
    if (value == 0) { //memeriksa apakah argumen yang diberikan bernilai null
      throw illegalArgumentException("value must be better than 0")
    }
  }
  validateNumber(valueA)
  validateNumber(valueB)
  validateNumber(valueC)

  return valueA + valueB + valueC
}

//Inner Function as Extension Function
fun multiple(valueA: Int, valueB: Int, valueC: Int): Int {
  fun Int.validateNumber() {
    if (this == 0) { //ini merupakan fungsi ekstensi
      throw illegalArgumentException("value must be better than 0")
    }
  }
  validateNumber() //jadi, kita hanya perlu memanggil fungsinya sama tanpa parameter
  validateNumber()
  validateNumber()

  return valueA * valueB * valueC
}
