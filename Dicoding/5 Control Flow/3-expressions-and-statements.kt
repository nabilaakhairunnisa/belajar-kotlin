//statement tidak mengembalikan nilai apapun
//sedangkan expression adalah statement yang dapat mengembalikan nilai
//dan dapat disimpan ke dalam sebuah variabel

fun main() {
    sum(1 , 1 * 4)
}

//ternyata penulisan function di kotlin bisa kayak gini pake sama dengan langsung

fun sum(value1: Int, value2: Int) = value1 + value2
