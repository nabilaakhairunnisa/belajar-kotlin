fun main() {
    //Cara mengirim argumen ke extension property nullable receiver
    val value: Int? = null
    println(value.slice)
    //Output: 0
    
    //Bisa dilihat, di sini tidak perlu menggunakan safe call (?) 
    val value1: Int? = 4
    println(value1.slice1)
    //Output: 2
    
    //Mengirim argumen ke extension property yang non nullable receiver
    val value2: Int? = 8
    println(value2?.slice2) //menggunakan safe call
    //Output: 4
}
 
//Extension Property dengan Nullable Receiver menggunakan If Expression 
val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)

//Extension Property dengan Nullable Receiver menggunakan Elvis Operator
val Int?.slice1: Int
    get() = this?.div(2) ?: 0

//Extension Property non nullable receiver
val Int.slice2: Int
    get() = this.div(2)
    
