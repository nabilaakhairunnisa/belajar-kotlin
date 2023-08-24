var message = "Kotlin"

fun main() {
  //*** Property References ***
  println(::message.name) //operator :: mereferensikan sebuah property
  println(::message.get()) //membaca nilai menggunakan get
  ::message.set("Kotlin Academy") //menetapkan nilai menggunakan set
  println(::message.get())
}
