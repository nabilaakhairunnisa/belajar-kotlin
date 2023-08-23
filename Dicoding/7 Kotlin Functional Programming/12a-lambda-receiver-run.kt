//run: mengembalikan nilai berdasarkan expression yang berada dalam blok lambda
fun main() {
  val text = "Hai " //deklarasi variabel text yang berisi string Hello
  val result = text.run { //deklarasi variabel result yang mengakses fungsi run yang merupakan lambda function
    val from = this //deklarasi variabel from yang berisi receiver this
    val to = this.replace("Hai", "Hello") //deklarasi variabel to untuk menyimpan nilai yang menggantikan nilai dari text
    "replace text from $from to $to" //$from dan $to menggantikan kata kunci this
  }
  println("result: $result") //$result juga merupakan cara pemanggilan konteks menggunakan lambda receiver
  //Output: result: replace text from Hai to Hello
}
      
                        
    
