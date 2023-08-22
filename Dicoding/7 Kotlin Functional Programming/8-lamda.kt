//Biasa disebut anonymous function karena tidak memiliki nama

//Contoh Fungsi Lamda dengan parameter message bertipe String
val printMessage = { message: String -> println(message) }
//Tanda -> untuk memisahkan antara parameter dengan body

//Contoh fungsi lamda dengan return
val messageLength = { message: String -> message.length }

fun main() {
  //Mengirim argumen ke fungsi printMessage
  printMessage("Hello")
  //Output: Hello

  val length = messageLength("Hello From lambda")
  println("Message length $length")
  //Output: Message length 17
}
