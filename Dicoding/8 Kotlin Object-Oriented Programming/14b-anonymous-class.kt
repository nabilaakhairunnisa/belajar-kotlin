//Kelas yang tidak memiliki nama

//Proses ini sering disebut juga dengan listener atau callback

//Extends: mendefinisikan hubungan pewarisan antara kelas-kelas

//override: mengubah atau mengganti method yang sudah ada pada parent class

interface IFly { //blueprint yang menginisialisasi fungsi-fungsi dan properti
    fun fly()
    val numberOfWings: Int
}

fun flyWithWings(bird: IFly) { //fungsi flyWithWings meng-extends interface IFly
  bird.fly() //objek bird memanggil fungsi fly yang berada dalam interface
}

fun main() {
  flyWithWings(object: IFly { //mendefinisikan anonym class dengan keyword object
    override fun fly() {
      if(numberOfWings > 0) println("Flying with $numberOfWings wings")
      else println("I'm Flying without wings")
    }

    override val numberOfWings: Int 
      get() = 2
  })
}
