//apply: to analyze and configure objects in more concise and readable way

fun main() {
    //if we don't use apply:
    val builder = StringBuilder() //membuat objek dari kelas StringBuilder        
    builder.append("Hello ") //add Hello to the variabel
    builder.append("Kotlin!") //add Kotlin to the variabel 
    println(builder.toString()) //print builder into String

    //With apply function, we can change the code to this:
    val message = StringBuilder().apply { //membuat objek message dari kelas StringBuilder dengan menambahkan fungsi lambda apply
        append("Hello ") //use append method from StringBuilder
        append("Kotlin!") //so, we don't need to write the code repeatedly
    }
    println(message.toString())
}
