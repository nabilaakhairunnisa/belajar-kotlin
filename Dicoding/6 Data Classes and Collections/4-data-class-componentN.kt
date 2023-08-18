data class DataUser(val name : String, val age : Int)
 
fun main(){
    val dataUser1 = DataUser("nrohmen", 17)
  	//ini membuat objek dan meletakkannya dalam sebuah variabel
	  //disebut juga sebagai destructuring declaration
    val name = dataUser1.component1()
    val age = dataUser1.component2()
    println("My name is $name, I am $age years old")
    
    val dataUser2 = DataUser("nabila", 21)
    //atau bisa juga seperti ini, membuat beberapa variabel dari objek secara langsung
    val (nama, umur) = dataUser2
    println("My name is $nama, I am $umur years old")
}

/*
Output:
My name is nrohmen, I am 17 years old
My name is nabila, I am 21 years old
*/
