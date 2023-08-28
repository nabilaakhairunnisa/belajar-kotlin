package belajarkotlin.dicoding.coroutines

import kotlinx.coroutines.*

//Hanya job yang sedang active yang bisa dibatalkan

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000) //job membutuhkan waktu 5 detik untuk dijalankan
        println("Start New Job!")
    }

    delay(2000) //namun ketika mencapai waktu 2 detik
    job.cancel(CancellationException("Time is up!")) //job dicancel
    println("Cancelling job...")
    if (job.isCancelled) {
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}