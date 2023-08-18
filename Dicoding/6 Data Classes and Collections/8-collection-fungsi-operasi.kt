fun main(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
	  //Fungsi filter menyaring data di dalam list menjadi angka genap saja
	  val evenList = numberList.filter { it % 2 == 0 }
    println(evenList)
	  //Output: [2, 4, 6, 8, 10]
	
    //Fungsi filterNot menyaring data di dalam list menjadi angka ganjil saja
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println(notEvenList)
  	//Output: [1, 3, 5, 7, 9]
 	
    //Fungsi map mengalikan setiap data dengan 5. it berarti item
	  val multipliedBy5 = numberList.map { it * 5 }
    println(multipliedBy5)
  	//Output: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
 	
  	//Fungsi count menghitung jumlah item pada data
	  println(numberList.count())
	  //Output: 10
	
   	//Fungsi count menghitung jumlah item yang habis dibagi 3
	  println(numberList.count { it % 3 == 0 })
 	  //Output: 3
 	
 	  //Fungsi find mencari item pertama yang bernilai ganjil
  	val firstOddNumber = numberList.find { it % 2 == 1 }
    println(firstOddNumber)
    //Output: 1
    
    //Fungsi firstOrNull sama seperti fungsi find
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    println(firstOrNullNumber)
    //Output: null
    
    //Fungsi lastOrNull mencari item yang berupa angka ganjil paling terakhir
    val lastOrNullNumber = numberList.lastOrNull { it % 2 == 1 }
    println(lastOrNullNumber)
    //Output: 9
    
    //Fungsi first mencari item pertama yang lebih dari 8
   	val moreThan10 = numberList.first { it > 8 }
	  println(moreThan10)
    //Output: 9
    
    //Fungsi first mencari item pertama yang lebih dari 8
   	val lessThan10 = numberList.last { it < 10 }
	  println(lessThan10)
    //Output: 9

    //Fungsi sum menjumlahkan seluruh item
    val total = numberList.sum()
    println(total)
    //Output: 55
    
    //Fungsi sorted ascending
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)
    //Output: [i, k, l, n, o, t]
    
    //Fungsi sorted descending    
    val descendingSort = kotlinChar.sortedDescending()
	  println(descendingSort)
    //Output: [t, o, n, l, k, i]
}
