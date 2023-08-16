fun main() {
    val timeSpent = timeScreen(300, 250)
    println("$timeSpent")
}

fun timeScreen(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    var timeSpent: Boolean = true
    timeSpent = timeSpentToday > timeSpentYesterday
    return timeSpent
}
