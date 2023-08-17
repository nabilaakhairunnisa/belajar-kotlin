fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
 
    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
}

/*
Output:
123

Sedangkan keyword break menghentikan proses iterasi ketika kondisi terpenuhi
*/
