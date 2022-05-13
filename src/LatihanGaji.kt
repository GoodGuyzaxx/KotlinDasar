fun hasilGaji(){
    print("Masukan Gaji: ")
    val gajiPokok: String = readln()
    val gajipokokconf = gajiPokok.toInt()
    print("uang makan: ")
    val uangMakan: String = readln()
    val uangMakanconf = uangMakan.toInt()

    val hasil = gajipokokconf + uangMakanconf
    println(hasil)

}
fun main( ) {
    hasilGaji()

    println("Tekan Enter Unutk Melanjutkan")
    readln()
    println("OK")
}