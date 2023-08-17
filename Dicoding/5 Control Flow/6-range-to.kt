fun main() {
    val oneToTen = 1.rangeTo(10)
    oneToTen.forEach { range ->
        print("$range ")
    }
    
    println()
    val tenToOne = 10.downTo(1)
    tenToOne.forEach { range ->
        print("$range ")
    }
    
    println()  
    val rangeChar = 'A'.rangeTo('F')
    rangeChar.forEach { range ->
        print("$range ")
    }
}

/*
Output:
1 2 3 4 5 6 7 8 9 10 
10 9 8 7 6 5 4 3 2 1 
A B C D E F 
*/
