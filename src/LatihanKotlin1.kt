const val angka1: Int=12
const val angka2: Int=10

fun main() {
    val kelas: Array<String> = arrayOf("A","C","D")
    println(kelas[0])
    println(kelas[1])
    println(kelas[2])
    println("----------------------------------------------------------------------")
    println(angka1+angka2)
    println(true)
    println("--------------------------------------------------------------------")
    val Teks1: String="""
        Mata Mu
    """.trimIndent()
    println(Teks1)

    val num12: Array<Int> = arrayOf(1,2,3)
    println(num12[1])

    val hasl: Int =num12[2] * angka2
    println(hasl)

}