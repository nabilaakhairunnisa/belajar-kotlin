//with: not an extension, it just a normal function
//for access a context with no return
fun main() {
    
    val message = "Nabila " //declare a variable message 
    val result = with(message) { //use the with function to access the context (which is message) within a lambda block.
        //this is a lambda function block
        println("value is $this") 
        println("with length ${this.length}")
    } 
    println(result)
}
