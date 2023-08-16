class SmartDevice2 {

    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"

    fun turnOn(){
        println("Smart device is turned on.")
    }

    fun turnOff(){
        println("Smart device is turned off.")
    }
}

fun main(){
    val smartTvDevice = SmartDevice2()
    println("Device name is: ${smartTvDevice.name}")
}

/*
Cara manggil properti dari class:
- Buat variabel untuk menyimpan class. Variabel ini disebut sebagai class object
- Tuliskan variable tersebut diikuti tanda titik kemudian nama properti

Properti:
- Adalah variabel yang isinya menggambarkan sebuah class
- Kelebihan properti dari variable adalah bisa mengimplementasi get set function
- Set adalah untuk meembuat pengaturan awal
- Get adalah untuk mengambil nilai, apakah sesuai dengan pengaturan awal atau tidak

*/
