//Variance: adalah sebuah tipe data yang memiliki sub tipe

//SUPERCLASS
open class Animal(val name: String) {
    open fun speak() {
        println("$name makes a sound")
    }
}

//SUBCLASS
class Dog(name: String) : Animal(name) {
    override fun speak() {
        println("$name barks")
    }
}

//SUBCLASS
class Cat(name: String) : Animal(name) {
    override fun speak() {
        println("$name meows")
    }
}

//Fungsi yang menggunakan parameter covariant
//Covariant: nilai tipe parameternya hanya bisa digunakan sebagai tipe return
//Tidak bisa digunakan sebagai tipe argumen untuk fungsi yang ada dalam kelas tersebut
fun printAnimalSounds(animals: List<out Animal>) {
    for (animal in animals) {
        animal.speak()
    }
}

//Fungsi yang menggunakan parameter contravariant
//Contravariant: nilai tipe parameternya bisa digunakan sebagai tipe argumen
fun feedAnimal(animal: Animal, food: String) {
    println("${animal.name} is eating $food")
}

fun main() {
    val dogs: List<Animal> = listOf(Dog("Buddy"), Dog("Max"))
    val cats: List<Animal> = listOf(Cat("Whiskers"), Cat("Mittens"))

    val dog = Dog("Buddy")
    val cat = Cat("Whiskers")

    //Menggunakan fungsi printAnimalSounds dengan parameter covariant
    printAnimalSounds(dogs)
    printAnimalSounds(cats)

    //Menggunakan fungsi feedAnimal dengan parameter kontravariant
    feedAnimal(dog, "dog food")
    feedAnimal(cat, "cat food")
}
