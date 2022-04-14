fun main() {
    val gajiPokok: Int = 2_000_000
    val tunjangan: Int = 500_000
    val potongan: Float = 0.5F
    val hasil1=(((gajiPokok+tunjangan)/potongan))
    println("Hasil= $hasil1")

    val hasil2:Int =hasil1.toInt()
    println(hasil2)
}