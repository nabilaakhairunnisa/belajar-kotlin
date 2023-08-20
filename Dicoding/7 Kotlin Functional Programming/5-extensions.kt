fun main() {
    10.printInt()
    println(10.slice)
}

//Extension Functions
fun Int.printInt() {
    print("value $this")
    //Output: value 10
}    

//Extension Properties
val Int.slice: Int
get() = this / 2
//Output: 5
