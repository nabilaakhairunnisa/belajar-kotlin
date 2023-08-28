package belajarkotlin.dicoding.coroutines

import kotlinx.coroutines.*


fun main() = runBlocking {
    //Menginisialisasi fungsi job: membuat state New

    //CoroutineStart.LAZY membuat job tanpan langsung menjalankannya
    val jobLazy = launch(start = CoroutineStart.LAZY) {
        TODO("Not implement yet!")
    }

    //Menjalankan Job: membuat state Active
    val jobStart = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start New Job!")
    }

    val jobJoin = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start New Job!")
    }

    //Dengan fungsi start(): memulai job tanpa harus menunggu job selesai
    jobStart.start()
    println("Other task")
    //Output:
    //Other task
    //Start new job!

    //Dengan fungsi join(): menunda eksekusi sampai job selesai
    jobJoin.join()
    println("Other task")
    //Output:
    //Start new job!
    //Other task

}



