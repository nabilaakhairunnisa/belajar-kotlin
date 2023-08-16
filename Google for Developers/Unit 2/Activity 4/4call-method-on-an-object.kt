class SmartDevice {
    fun turnOn(){
        println("Smart device is turned on.")
    }

    fun turnOff(){
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice()
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}

/*

Keterangan kode:
cara memanggil method (fungsi di dalam sebuah class) adalah dengan:
- Buat variabel untuk menyimpan class. Variabel ini disebut sebagai class object
- Tuliskan variable tersebut diikuti tanda titik kemudian nama method/fungsi

*/
