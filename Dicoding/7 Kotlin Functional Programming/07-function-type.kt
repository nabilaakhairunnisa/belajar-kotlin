//Merupakan sebuah fungsi yang bisa menjadi tipe data

(Int, Int) -> String
//Yang berada dalam tanda kurung merupakan parameter yang menjelaskan tipe data dari parameter tersebut
//String merupakan tipe kembalian (return)
//Jika tidak memiliki tipe kembalian, maka tidak bisa menuliskan Unit atau tidak menuliskannya sama sekali

//Type Alias
//Untuk function type yang sama

//Memberi nama Arithmetic pada function type
typealias Arithmetic = (Int, Int) -> Int
//Kemudian menjadikannya tipe data untuk variabel sum
val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
//Dan juga variable multiple
val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

//Menggunakan instance pakai operator invoke()
val sumResult = sum.invoke(10, 10)
//Atau bisa secara langsung menghilangkan invoke()
val multiplyResult = multiply(20, 20)

//Menandai function type sebagai nullable
typealias Arithmetic = ((Int, Int) -> Int)?
val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
sum?.invoke(10, 20)
