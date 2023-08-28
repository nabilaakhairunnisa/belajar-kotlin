fun main() {
    val text: String? = null
	
    //Elvis Operator
    		//Syntax: val result = someCondition() ?: defaultValue
    val textLength = text?.length ?: 7
    println(textLength)

    //If Else: mengecek jika text tidak null, maka cetak panjang text, jika null maka cetak 7
	val textLength2 = if (text != null) text.length else 7
    println(textLength2)
    
    //Contoh lain if else
    var total = 10000
    val discountPercentage = if (total > 50000) 10 else 5
    println("Discount: $discountPercentage%")
}
