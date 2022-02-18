//Penggunaan String
fun main() {
    var Sname: String="Dewa";
    var Fname: String="Dewantara"
    var Bio: String="""
        |Hai Saya Dewantara 
        |Asal Saya dari Papua dan saya tinggal di 
        |Waena Perumnas III Gang Bobara II
        """.trimMargin()
    println(Sname)
    println(Fname)
    println(Bio)

    var f: String="$Sname $Fname"
    println(f)

    var desc: String="$f panjang=${f.length}"
    println(desc)
}