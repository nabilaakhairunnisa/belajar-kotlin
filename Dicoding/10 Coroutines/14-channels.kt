package belajarkotlin.dicoding.coroutines

/*

    Jika ada dua coroutines yang ingin saling berinteraksi
    Masalah proses kebanyakan disebabkan oleh pengalokasian memori
    Channels: nilai deferred yang mentransfer nilai antar coroutine
        Memungkinkan komunikasi dengan mengirim dan menerima pesan tanpa peduli berada di thread mana

*/

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking(CoroutineName("main")) {
    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")){
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x) //mengirim nilia hasil komputasi dengan fungsi send
    }
    repeat(5) {println(channel.receive())} //menerima nilai
    println("received in ${Thread.currentThread().name}")
}