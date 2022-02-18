//Penggunaan Variabel

//Variabel Consant
const val APP ="Belajar Kotlin"
const val VER ="0.0.1"

fun main() {
    //immutable
    val cth1 ="Dewantara"
    //cth1 ="zaxx"
    println(cth1)

    //mutable
    var cth2 ="zaxx"
    println(cth2)

    //null Variabel
    var cth3: String?=null
    println(cth3)

    println("HI $APP verinya $VER")
}