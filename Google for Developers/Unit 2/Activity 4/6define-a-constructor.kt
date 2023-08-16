/*

tujuan utama constructor adalah untuk menentukan bagaimana sebuah objek dibuat
constructor menginisialisasi sebuah objek dan membuat objek tersebut siap digunakan
kode yang ada di dalam constructor dieksekusi ketika objek dibuat
kita bisa mendefinisikan constructor dengan atau tidak dengan parameter

aims: bertujuan

kita menggunakan parameter konstruktor untuk mengganti nilai properti yang bersifat hardcode

*/

class SmartDevice4 (val name: String, val category: String) {

    var deviceStatus = "online"

    fun turnOn(){
        println("Smart device is turned on.")
    }

    fun turnOff(){
        println("Smart device is turned off.")
    }
}

fun main(){
    SmartDevice4("Android Tv", "Entertainment")
}

