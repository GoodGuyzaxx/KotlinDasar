fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTramsformer = transformer(name)
        return "Hello $nameTramsformer"
    }

    val lambdaUpper = { value: String -> value.uppercase()}
    println(hello("dewa" , lambdaUpper))

    println(hello("DEWA") {value: String, -> value.lowercase() })
//Trailing Lambda
    val hasl = hello("dewa") {value: String ->
        value.uppercase()
    }
    println(hasl)

}