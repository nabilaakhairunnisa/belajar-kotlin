fun main(){
    //Map menyimpan data dengan format key-value
    
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    
    //Jakarta merupakan key dan Indonesia sebagai valuenya
    
    //Akses data dengan fungsi getValue 
    println(capital.getValue("Jakarta"))
  	//Output: Indonesia
   
    //Akses data dengan indexing
    println(capital["Amsterdam"])
    //Output: null
    
    //Akses semua keys
    println(capital.keys)
  	//Output: [Jakarta, London, New Delhi]
 	
  	//Akses semua value
  	println(capital.values)
 	  //Output: [Indonesia, England, India]

    //Akses map immutable capital
    println(capital)
    //Output: {Jakarta=Indonesia, London=England, New Delhi=India}
    
 	  //Ubah Map capital menjadi mutable
 	  val mutableCapital = capital.toMutableMap()
    
    //Mengubah data
    mutableCapital.put("Amsterdam", "Netherlands")
	  mutableCapital.put("Berlin", "Germany")
    mutableCapital.remove("Jakarta")

    //Akses Map mutable capital
    println(mutableCapital)
    //Output: {London=England, New Delhi=India, Amsterdam=Netherlands, Berlin=Germany}
}
