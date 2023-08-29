package dicoding.generics

//bagaimana kita membatasi tipe untuk parameter
//menggunakan titik dua setelah tipe parameter

//FUNCTION WITH CONTRAINT TYPE PARAMETER
fun <T : Number> addNumbers(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

//CLASS WITH CONTRAINT TYPE PARAMETER
class Container<T : Number>(private val value: T) {
    fun getValue(): T {
        return value
    }
}

fun main() {
    //FUNCTION
    val result1 = addNumbers(5, 10) // Tipe parameter secara otomatis diinferensi sebagai Int
    val result2 = addNumbers(3.5, 2.7) // Tipe parameter secara otomatis diinferensi sebagai Double

    println("Result 1: $result1") //Output: Result 1: 15.0
    println("Result 2: $result2") //Output: Result 2: 6.2

    //CLASS
    val intContainer = Container(42)
    val doubleContainer = Container(3.14)

    //mendapatkan nilai dari objek dulu
    val intValue = intContainer.getValue()
    val doubleValue = doubleContainer.getValue()

    //baru nilianya dicetak
    println("Int Value: $intValue") //Int Value: 42
    println("Double Value: $doubleValue") //Double Value: 3.14
}


