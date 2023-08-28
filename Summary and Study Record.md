# Summary and Study Record

### **Thursday, 17 August 2023**
1. perulangan while dan do while
2. perulangan for
3. rangeTo downTo
4. forEach indexed
5. break and continue
6. data class toString
7. data class copy
8. data class equals

### **Friday, 18 August 2023**
1. data class componentN()
2. collection
   - bagaimana kita menyimpan beberapa nilai
4. collection list
5. collection set
6. collection map
7. collection dan fungsi operasi

### **Sunday, 20, August 2023**
1. variable argument
2. extension
3. nullable receiver
4. function type

### **Tuesday, 22 August 2023**
1. lambda function
   - anonymous function, don't have a name, use -> to seperate parameter and body 
2. inline function
   - in order to speed up the process of program execution
3. higher order function
   - function that use as parameter at another function
4. lambda with receiver
5. kotlin standard library
   - this and it. this calling a scope function at class. it calling a scope function at variabel
6. scope function
    - run, with, apply (this/ lambda receiver). let, also (it/lambda arguement)
7. lambda receiver run
    - return value with expression declared at lambda scope

### **Wednesday, 23 August 2023**
1. lambda receiver with
   - not an extension, it just a normal function. for access a context with no return. a variable that call 'with' function and set a parameter into it.
2. lambda receiver apply
   - to analyze and configure objects in more concise and readable way. create an object and access an 'apply' extension directly to use some method from the object
3. lambda argument let
   - often used with nullabel object. let only executes when the object was not null
4. lambda argument also
   - use the object's context as an argument within the lambda block without configure or modify the object itself
  
### **Thursday, 24 August 2023**
1. property reference
   - use operator reference function (::) bisa menaruh fungsi sebagai argumen pada fungsi lain. misalnya fungsi filter 
2. function inside function
    - bisa membuat fungsi di dalam fungsi dan menggunakan parameter fungsi luar untuk fungsi dalam
3. fold
     - menambahkan parameter dengan setiap elemen
4. drop
    - membuang elemen
5. take
    - mengambil elemen
6. slice 
    - menyaring elemen berdasarkan range
7. distinct
    - menyaring elemen yang sama
8. chunked
    - memecah karakter menjadi beberapa bagian

### **Friday, 25 August 2023**
1. recursion
    - memanggil fungsi di dalam fungsi itu sendiri
2. oop
    - includes class, attributes, function, and object
3. property delegation
    - mengatur dan mengelola fungsi get set agar tidak mengulang-ulang kode pada setiap kelas
4.  extension properties
    - extends kelas tanpa harus mewarisi kelasnya
6.  primary constructor
    - memungkinkan kita untuk menginisialisasi properti pada parameter
7. block init
    - menuliskan properti dalam body dan menambahkan logic baru
8. secondary constructor
    - sama seperti blok init, namun bisa menambahkan parameter baru
9. modifiers
    - hak akses suatu anggota
10. inheritances
    - pewarisan

### **Saturday, 26 August 2023**
1. overloading
    - beberapa fungsi dengan naman yang sama namun parameternya berbeda
2. abstract class
    - kelas yang tidak bisa langsung direalisasikan sebagai objek
3. interfaces
    - blueprint yang mendefinisikan fungsi dan properti yang nantinya diimplementasikan oleh kelas lain.
4. anonymous class
    - kelas tanpa nama, langsung didefinisikan di fun main() menggunakan keyword object
5. package
    - pengelompokkan kelas, fungsi, dan variabel yang mempunyai kemiripan fungsionalitas
6. create new package
    - menggunakan intellij, lalu new package
7. exception
    - kesalahan pada kode
8. exception handling
    - cara meng-handle exception. ada try-catch, try-catch-finally, dan multiple catch

### **Sunday, 27 August 2023**
1. class generics declaration
    - class NamaKelas<T>(parameter: T)
3. function generics declaration
    - fun <T> namaFungsi(parameter: T): T


