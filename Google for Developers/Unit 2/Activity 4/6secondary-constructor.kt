class SmartDevice5(val name: String, val category: String) {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
}

/*

Konstruktor ada dua, yaitu primary dan secondary
Secondary cara menginisialisasinya dengan menuliskan keyword 'constructor'
Kemudian parameter jika ada
Lalu titik dua diikuti dengan keyword this()
Yang isinya parameter dari primary constructor

*/