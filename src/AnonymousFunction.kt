fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTramsformer = transformer(name)
        return "Hello $nameTramsformer"
    }

    val upper = fun(value: String): String{
        if (value == ""){
            return "Data Kosong"
        }else {
            return value.uppercase()
        }
    }

    println(hello("Dewa", upper))
    println(hello("", upper))

    println(hello("DEWANTARA", fun (value: String): String {
        return value.lowercase()
    }))
}