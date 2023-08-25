//Override pada fungsi get set untuk dapat menambahkan kode lainnya
class Animal {
  var name: String = "Dicoding Miaw"
  get() {
    println("Fungsi Getter terpanggil")
    return field
  }
  set(value) {
    println("Fungsi Setter terpanggil")
    field = value
  }
}

fun main() {
  val dicodingCat = Animal() //membuat objek dicodingCat dari kelas Animal
  println("Nama: ${dicodingCat.name}")
  dicodingCat.name = "Goose" //mengubah nama menjadi Goose
  println("Nama: ${dicodingCat.name}")
}

/*
  Output:
  Fungsi Getter terpanggil
  Nama: Dicoding Miaw
  Fungsi Setter terpanggil
  Fungsi Getter terpanggil
  Nama: Goose
*/
