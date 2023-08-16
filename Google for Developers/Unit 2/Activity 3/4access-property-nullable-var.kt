/*
fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor.length)

    /*
    Error:
    Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    */

}
*/

/*
fun main() {
    var favoriteActor: String? = null
    println(favoriteActor?.length)

    /*
    Output:
    9

    Tanda ?. artinya safe-call operators on non-nullable variables
    */

}
*/

/*
fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor!!.length)

    /*
        Output:
    9

    !!. artinya not-null assertion operator
    */

}
*/

/*
fun main() {
    var favoriteActor: String? = null
    println(favoriteActor!!.length)
    /*
        Error:
    Exception in thread "main" java.lang.NullPointerException
     at FileKt.main (File.kt:3)
     at FileKt.main (File.kt:-1)
     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (:-2)

     not-null gak bisa dipake buat variabel yang isinya null
    */
}
*/

/*
fun main() {
    var favoriteActor: String? = null

    if(favoriteActor != null) {
      println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
      println("You didn't input a name.")
    }
}
*/

fun main() {
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        println("You didn't input a name")
    }
    println("The number of characters on yout fav actor's name is $lengthOfName")

    /*
    Keterangan kode:
    - Buat variabel bernama lengthOfName untuk menyimpan panjang karakter dari variabel favoriteActor
    - Isi variabel lengthOfName menggunkan if else.
    - Jika favoriteActor tidak sama dengan null, maka hitung panjang karakter
    - Setelah itu, di luar if else, buat println untuk mencetak panjang dari karakter favoriteActor
    */
}




