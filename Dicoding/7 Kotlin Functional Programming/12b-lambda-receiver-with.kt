//with: not an extension, it just a normal function
//for access a context with no return
fun main() {
    
    val message = "Nabila " //declare a variable message 
    val result = with(message) { //declare a variable result, call a with function and use a message variable for the arguemen
        //this is a lambda function block
        println("value is $this") 
        println("with length ${this.length}")
    } 
    println(result)
}
