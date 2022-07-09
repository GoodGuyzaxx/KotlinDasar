fun main() {
    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun(){
        println("Anonymous Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    anonymousIncrement()
    anonymousIncrement()
    anonymousIncrement()
    anonymousIncrement()
    anonymousIncrement()
    anonymousIncrement()
    anonymousIncrement()

    println(counter)
}