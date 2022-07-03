fun toUpper(vlaue:String): String = vlaue.uppercase()

fun main() {
//Lambda
    val conothLambd: (String,Int) -> String = { fristName: String, firstAngka: Int ->
        //println(firstAngka)
        val convertAngka = firstAngka.toShort()
        val result = "$fristName $convertAngka"
            result
    }

    println(conothLambd("Dewa",19))
//it just for one type of data
    val sayzaxx: (String) -> String = {
        "Hello $it"
    }

    println(sayzaxx("Dewa"))
//Method expression
    val toUpperCases : (String) -> String = ::toUpper
    println(toUpperCases("goodguyzaxx"))

}