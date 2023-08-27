class Box<T>(val value: T) //T merupakan generics

fun main() {
    val intBox = Box(42) // Tipe parameter secara otomatis menjadi Int
    val stringBox = Box("Hello, Kotlin") // Tipe parameter secara otomatis menjadi String

    println(intBox.value) // Output: 42
    println(stringBox.value) // Output: Hello, Kotlin
}
