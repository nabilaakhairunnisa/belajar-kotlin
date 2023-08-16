fun main() {
    val secondOperatingSystem = "Windows"
    val secondEmailId = "user_two@gmail.com"

    val thirdOperatingSystem = "Mac OS"
    val thirdEmailId = "user_three@gmail.com"

    println(displayAlertMessage(emailId = "user_one@gmail.com"))
    println(displayAlertMessage(secondOperatingSystem, secondEmailId))
    println(displayAlertMessage(thirdOperatingSystem, thirdEmailId))
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

//output
//There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.
//There's a new sign-in request on Windows for your Google Account user_two@gmail.com.
//There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com.
