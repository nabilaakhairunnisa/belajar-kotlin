package belajarkotlin.dicoding.coroutines

/*

    Coroutines Builder: Fungsi yang mengambil suspending (menghentikan) lambda dan membuat coroutine untuk menjalankannya
        - launch: untuk membatalkan eksekusi
        - runBlocking: memblokir hingga eksekusi coroutine selesai
        - async: menangkap setiap exception yang terjadi pada coroutine.
            mengembalikan deferred yang berisi exception
        - karena coroutines dijalankan secara sekuensial,
            maka dibutuhkan async ketika dua fungsi tidak memiliki keterkaitan
            dan ingin menjalankan kedua fungsi tersebut secara bersamaan


*/

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }
    println("Completed in $timeOne ms vs $timeTwo ms")
}