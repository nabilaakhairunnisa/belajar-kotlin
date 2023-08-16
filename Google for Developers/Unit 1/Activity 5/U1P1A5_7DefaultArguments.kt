fun birthdayGreeting(name: String = "Nabila", umur: Int): String {
    //ini tanpa ribet bikin variabel baru
    //langsung aja taro valuenya di return
    return "Met ultah, $name! yang ke $umur"
}

fun main() {
    //ini ngasih argumen umur pake named argument
    println(birthdayGreeting(umur = 100))
    //ini ngasih argumen nama dan umur
    println(birthdayGreeting("Arda", 50))
}

//Outputs:
//Met ultah, Nabila! yang ke 100
//Met ultah, Arda! yang ke 50