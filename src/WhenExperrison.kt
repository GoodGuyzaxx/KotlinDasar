fun main() {
    var nilaiUAS = 'A'
    when (nilaiUAS) {
        'A' -> println("Mainnya Hebat")
        'B' -> {
            println("GG")
        }
        'C' -> println("Mulai")
        else -> println("Defeat")
    }

    when (nilaiUAS){
        'A','B','C' -> {
            println("Selamat Kamu Lulus")
        }
        else -> println("COBA TAHUN DEPAN")
    }
    nilaiUAS = 'Z'
    val nilaiLulus: Array<Char> = arrayOf('A','B','C')
    when (nilaiUAS){
        in nilaiLulus -> println("SELAMAT")
        !in nilaiLulus -> println("COBA TAHUN DEPAN")
    }

    val nama = "dewa"
    when (nama){
        is String -> println("Data yang anda masukan string")
        !is String -> println("Data yang anda masukan bukan string")
    }

    val NiliHasil =20
    when {
        NiliHasil > 60 -> println("Anda Lulus")
        NiliHasil > 50 -> {
            println("ULANG TAHUN DEPAN")
        }
        else -> println("NILAI ANDA ERROR")
    }
}