import org.w3c.dom.ranges.Range

//Pengguanaan Array
fun main() {
    val names: Array<String> = arrayOf("zaxx", "Dewa", "Jon")
    names[0]="Dewantara"
    println(names[0])

    val number: Array<Int> = arrayOf(1,2,3)
    println(number[1])

    val nulls: Array<String?> = arrayOfNulls(3)
    nulls.set(1,"Dewa")
    println(nulls[1])

    val contoh: Array<Int> = arrayOf(1,2,3)
    contoh[0]=100
    println(contoh[0])
}