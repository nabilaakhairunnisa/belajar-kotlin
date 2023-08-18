fun main(){
    //Immutable list, datanya tidak bisa dimanipulasi
    val anyList1 = listOf('a', "Kotlin", 3, true)
   
    //Mutable list, datanya bisa dimanipulasi
    val anyList2 = mutableListOf('a', "Kotlin", 3, true)
    
    //sebelum data diubah
    println(anyList2)
   
    anyList2.add('d') // menambah item di akhir list
    anyList2.add(1, "love") // menambah item pada indeks ke-1
    anyList2[3] = false // mengubah nilai item pada indeks ke-3
    anyList2.removeAt(0) // menghapus item pada indeks ke-0
    
    //setelah data diubah
    println(anyList2)
}

/*
Output:
[a, Kotlin, 3, true]
[love, Kotlin, false, true, d]

List bisa berisi data class dan berbagai jenis tipe data.
*/
