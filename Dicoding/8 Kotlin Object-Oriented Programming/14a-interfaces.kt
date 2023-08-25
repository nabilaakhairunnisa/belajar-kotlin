//Merupakan konsep sifat umum yang digunakan oleh kelas agar dapat memiliki sifat tersebut
//Tujuan: agar kelas yang mengimplementasikannya harus melakukan override seluruh properti dan fungsi
//Penamaan interface dengan huruf awal I kapital

interface IFly { //ini interface
  fun fly() //ini method
  val numberOfWings: Int  //ini properti, namun tidak boleh inisialisasi nilai
}

//ini kelas Bird yang mengimplementasikan interface IFly (pake titik 2)
class Bird(override val numberOfWings: Int): IFly { //ini cara override properti
  override fun fly() { //wajib meng-override fungsi yang ada pada interface
    if(numberOfWings > 0) println("Flying with $numberOfWings wings")
    println("I'm flying without wings")
  }
}

fun main() {
  var myBird = Bird(2)
	myBird.fly() //oalah, jadi yang dipanggil tuh fungsinya toh
}
