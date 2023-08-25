//Sama seperti init, secondary constructor digunakan untuk menambahkan logic baru
//Dalam sebuah kelas bisa terdapat lebih dari satu secondary constructor

class Animal(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean
 
    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false
    }

    //ini merupakan secondary constructor yang memanggil primary constructor dan menambahkan parameter baru yaitu isMammal
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}
 
fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
 
    val dicodingBird = Animal("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")
}
 
/*
    Output:
    Nama: Dicoding Miaw, Berat: 2.5, Umur: 2, mamalia: true
    Nama: Dicoding tweet, Berat: 0.5, Umur: 1, mamalia: false
*/
