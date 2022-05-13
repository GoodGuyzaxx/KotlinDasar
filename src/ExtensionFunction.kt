fun String.hello(): String = "hello $this"

fun String.pHello(): Unit {
    println("Hello $this")
}

//fun Int.kali(): Unit {
//    println(12)
//}

fun main() {
    val name = "Dewa"

    println(name.hello())

    name.pHello()
    "Dewan".pHello()

    //val angk = 12 * 12
  //  println(angk.kali())
}