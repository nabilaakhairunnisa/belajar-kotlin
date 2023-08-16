/*
fun main() {
    val city1 = "Ankara"
    val city2 = "Tokyo"
    val city3 = "Ankara"

    val lowTemperature1 =

    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()

    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()

    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}

fun weather(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int): String {
    return "$city $lowTemperature $highTemperature $chanceOfRain"
}
*/

//Kode di atas bisa kita sederhanakan menjadi seperti di bawah ini:

fun main() {
    weather("Ankara", 27, 31, 82)
    weather("Tokyo", 32, 36, 10)
    weather("Cape Town", 59, 64, 2)
    weather("Guatemala City", 50, 55, 7)
}

fun weather(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}
