fun main() {
    var i =0
    while (true){
        println("perulangan $i")
        i++
        if  (i > 10){
            println("Berhasil Break")
            break
        }
    }
    for (i in 1..1000){
        if (i % 2 == 0){
            continue
        }
        println(i )
    }
}