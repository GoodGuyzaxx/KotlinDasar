fun main() {


     fun functionLoop(value: Int): Int {
         var result = 1
         for (i in value downTo 1){
             result *= i
         }
         return result
    }
    println(functionLoop(10))

    fun recursiveFunction(value: Int): Int{
        return when (value){
            1 -> 1
            else -> value * recursiveFunction(value - 1 )
        }
    }
    println(recursiveFunction(10))
}