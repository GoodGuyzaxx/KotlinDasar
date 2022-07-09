fun labelBreak (){
    loopI@ for (i in 1..10){
        loopJ@ for (j in i..10 ){
            println("$i * $j = ${i * j}")
            if (j > 5 ){
                break@loopI
            }
        }
    }
}

fun main() {

    fun test(name: String, Operation:(String) -> Unit) = Operation(name)

    test("dewa")test@{
        if (it == " "){
            return@test
        } else {
            println("dewa")
        }
    }

    labelBreak()

}