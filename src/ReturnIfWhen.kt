fun main() {
    fun sayHello(name: String= ""): String {
        when (name){
            ""-> return "Hi Bro"
            else -> return "HI $name"
        }
 //       return if (name ==""){
 //           "Hi Bro"
//        } else {
//            "Hi $name"
//        }
    }

    println(sayHello())
    println(sayHello("DEWA"))

}