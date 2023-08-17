fun main() {
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
}

/*
output :
       value 1 with index 0
       value 4 with index 1
       value 7 with index 2
       value 10 with index 3

Ada yang namanya fungsi withIndex()
Dia bisa menjelaskan index ke berapa nilai itu berada
*/
