fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val resultSubstract = substract(firstNumber, secondNumber)
    val anotherResultSubstract = substract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $resultSubstract")
    println("$firstNumber - $thirdNumber = $anotherResultSubstract")
}

// Define add() function below this line
fun add(firstNumber: Int, secondNumber: Int): String {
    val result = firstNumber + secondNumber
    return "$result"
}

fun substract(firstNumber: Int, secondNumber: Int): String {
    val result = firstNumber - secondNumber
    return "$result"
}