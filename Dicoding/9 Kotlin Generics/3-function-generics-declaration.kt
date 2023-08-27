package dicoding

//List<T> adalah membuat data collection dengan tipe generic T
//slice adalah nama fungsinya, ia merupakan fungsi ekstensi,
    //yaitu fitur yang dapat menambahkan fungsi baru dari sebuah kelas
    //tanpa melakukan inheritance atau memodifikasi
//Iterable adalah tipe parameter yang dapat melakukan iterasi
//indices merupakan nama parameter yang dapat diiterasi
//indices tidak perlu bertipe ghenerik karena dia digunakan untuk kumpulan indeks yang biasanya bertipe Int.

public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
    val result = mutableListOf<T>()
    for (index in indices) { //mengiterasi setiap elemen yang berada pada List
        if (index >= 0 && index < size) { //jika index >= 0 dan kurang dari size (jumlah elemen) List
            result.add(get(index)) //maka elemen pada index tersebut akan ditambahkan ke dalam variabel result
        }
    }
    return result
}

fun main() {
    //deklarasi variabel numbers dengan nilai 1 sampai 100 dan memasukkannya ke dalam List
    val numbers = (1..100).toList()
    //memanggil fungsi slice menggunakan variabel numbers yang bertipe Int dan mencetak index 1 sampai 10
    println(numbers.slice(1..10))
}
