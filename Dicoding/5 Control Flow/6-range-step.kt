fun main() {
    //Contoh 1
    val range1 = 1..10 step 1
    range1.forEach { range ->
        print(range)
    }
    println("\n")
    
    //Contoh 2
    val range2 = 1..10 step 2
    range2.forEach {
        print("$it")
    }
    println("\n")
    
    //Contoh 3
    val range3 = 1..10 step 3
    range3.forEach(::print)
}

/*
Output:

12345678910

13579

14710
*/
