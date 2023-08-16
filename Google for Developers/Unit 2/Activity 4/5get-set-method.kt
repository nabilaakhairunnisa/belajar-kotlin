class SmartDevice3 {
    var speakerVolume = 1000
        set (value) {
            if (value in 0.. 100) {
                field = value
            }
        }
}

fun main(){
    val smartTvDevice = SmartDevice3()
    println("Speaker volume is: ${smartTvDevice.speakerVolume}")
}

/*

Get Set itu bakal auto generated kalo kita deklarasiin properti pake var
Tapi gak keliatan karena dibuat di latar belakang

untuk membaca nilai dari properti dalam get fun
atau memperbarui nilai di set fun kita butuh properti backing field
yang di mana itu dibuat otomatis oleh kotlin compiler

jangan menggunakan properti sebagai nilai ari get set
jika menaruh field/parameter untuk nilai dari speakerVolume
maka kode akan infinite looping

jadi, set membutuhkan parameter
nilai dari parameternya ditaro di field
dan nama parameternya terserah, kita yang buat

*/