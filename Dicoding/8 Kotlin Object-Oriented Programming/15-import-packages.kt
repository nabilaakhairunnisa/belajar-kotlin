//Package: pengelompokkan kelas, fungsi, dan variabel yang mempunyai kemiripan fungsionalitas

//Contoh mengimport package:
  //import packagename.ClassName
  //import packagename.functionName
  //import packagename.propertyName

import kotlin.math.PI
import kotlin.math.* //ini import seluruh kelas pada package
import kotlin.math.cos as cosinus //ini mengganti nama kelas
import kotlin.math.sqrt as akar //jadi lebih enak dibaca
 
fun main(){
    println(PI)
    println(cosinus(120.0))
    println(akar(9.0))
}
