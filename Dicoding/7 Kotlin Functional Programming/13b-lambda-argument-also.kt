//also: similliar with apply, but doesn't modify the object.package
//where you want to use th object's context as an argument within the lambda block
//menggunakan konten objek sebagai argumen di dalam blok lambda

fun main() {
    val text - "Hello Kotlin" //declare a variable text 
    val result = text.also { //use also extension function on the text 
        println ("value length: ${it.length}")
    }
    println("text: $result")
}
