
//Penggunaan Range
fun main() {
    //downTO
    val range=1 .. 100 step 2
    println(range.count())
    println(range.contains(10))
    println(range.contains(120))
    println(range.first)
    println(range.last)
    println(range.step)
}