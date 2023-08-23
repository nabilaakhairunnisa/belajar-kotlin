//let: often used with nullabel object
//let only executes when the object was not null

fun main() {
    val message: String? = "Halo " //declare message with nullable var
	val length = message?.length ?: 0 * 2 //check of length of message is null, then result 0, else, then the operator not executed        
    val text = "text length $length" //declare text variable to print value of length package
    println(text) 
    
    //if we have another logic 
    val message2: String? = null //declare message with nullable var
    message2?.let { //extension with lambda function. if message not null, then the lambda function not executed
        val length2 = it.length * 2 //count message length and duplicate it
        val text2 = "text length $length"
        println(text2)
    } ?: run { //block code that is executed if the message was null
        val text2 = "message is null"
        println(text2)
    }
}
