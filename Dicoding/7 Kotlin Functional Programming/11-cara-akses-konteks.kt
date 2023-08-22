/*Kotlin Standard Library: memiliki beberapa function (scope function) untuk bagaimana menuliskan logika kode dalam objek 

Scope Fungction: Untuk mengeksekusi blok kode dalam sebuah objek.

Cara akses konteks dari sebuah objek:
1. this (lambda receiver)
   - run
   - with
   - apply
  
2. it (lambda argumen)
   - let 
   - also */

//Contoh Akses Konteks this (lambda receiver)
//StringBuilder().apply adalah cara akses konteks itu sendiri
//StringBuilder() adalah sebuah class
//apply{} merupakan lambda function
val buildString = StringBuilder().apply { 
  //append adalah sebuah method dari class StringBuilder()
  append("Hello")
  append("Kotlin")
}

//Contoh Akses Konteks it (lambda argumen)
//Deklarasi variabel text yang berisi String Hello
val text = "Hello"
//let {} merupakan lambda function yang memiliki parameter bernama value 
//Mengakses dan mengambil nilai dari variabel text
text.let { value ->
  val message = "$value Kotlin"
  println(message)
}

