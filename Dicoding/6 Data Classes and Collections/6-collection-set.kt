fun main(){
	  val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    val setC = setOf(1, 5, 7)

    // Otomatis membuang angka yang duplikat
    println(setA)
    // Output: [1, 2, 4, 5]

    // Mengecek apakah isi dari setA sama dengan setB
    println(setA == setB)
    // Output: true

    // Mengecek apakah angka 5 termasuk dalam setA
    println(5 in setA)
	  // Output: true

    // Gabungan setA dan setC
    val union = setA.union(setC)
    println(union)
    // Output: [1, 2, 4, 5, 7]
    
    // Irisan setA dengan setC
    val intersect = setA.intersect(setC)
    println(intersect)
    // Output: [1, 5]
}
