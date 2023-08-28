package dicoding.coroutines

/*

Bukan bagian dari bahasa Kotlin
Ia merupakan library yang disediakan oleh JetBrains

Untuk bisa menggunakan coroutine, tambahkan dependensi pada build.gradle.kts

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
}

*/

import kotlinx.coroutines.*

fun main() = runBlocking { //fungsi untuk memulai coroutine utama
    launch { //fungsi untuk menjalankan coroutine baru
        delay(1000L) //setelah mencetak Hello, maka akan delay selama 1 detik
        println("Coroutines!") //baru lanjut ke proses selanjutnya
    }
    println("Hello,")
    delay(2000L)
}
