package belajarkotlin.dicoding.coroutines

/*
    Coroutine Dispatcher: untuk mengetahui coroutine berjalan di thread mana
    Beberapa objek pada kelas CoroutineDispatcher:
        1. Dispatchers.Default: berisi launch, async.
                launch(Dispatchers.Default){} atau
                launch {} saja
        2. Dispatchers.IO: membongkar pemblokiran operasi I/O
                Menggunakan kumpulan thread yang dibuat berdasarkan permintan
                launch(Dispatcher.IO){}
        3. Dispatchers.Unconfirmed
                menjalankan coroutines sampai titik penangguhan
*/

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    //Dispatchers Unconfirmed
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()

    //Menjalankan coroutine pada thread yang kita tentukan
    val dispatcher = newSingleThreadContext("myThread") //myThread di sini merupakan thread yang ditentukan
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()


}
