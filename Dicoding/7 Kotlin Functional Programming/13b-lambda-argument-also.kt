//also: similliar with apply, but doesn't modify the object.package
//where you want to use th object's context as an argument within the lambda block without configure or modify the object itself
//menggunakan konten objek sebagai argumen di dalam blok lambda tanpa mengkonfigurasi atau mengubah objek tersebut (nilainya)

fun main() {
    val text - "Hello Kotlin" //declare a variable text. create an instance of the 'string' class
    val result = text.also { //use also extension function on the text. also takes a lambda as an argument 
        //it provides the object text as the receiver for that lambda
        //menyediakan objek (text) sebagai receiver untuk lambda
        println ("value length: ${it.length}")
    }
    println("text: $result")
}
