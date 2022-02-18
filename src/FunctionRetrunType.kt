fun jumlahkan(a:Int, b:Int):Int{
    val total = a + b
    return total
}

fun bagi(a:Int, b:Int):Int{
    if (a == 0){
        return 0
    }else if (b == 0){
        return 0
    }else{
        val result = a / b
        return result
    }
}

fun main() {
    val hasil= jumlahkan(10, 10)
    println(hasil)

    println(jumlahkan(100,100))

    println(bagi(0, 0))
}