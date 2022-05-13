fun main(args: Array<String>) {

    // teks sambutan
    println("---------------------------------")
    println("Selamat datang di program biodata")
    println("Silahkan inputkan data pribadimu")
    println("---------------------------------")

    // mengambil input dan mengisinya ke variabel
    print("Nama lengkap: ")
    var namaLengkap = readLine()
    print("Jenis Kelamin: ")
    var jenisKelamin = readLine()
    print("Hobi: ")
    var hobi = readLine()

    // menampilkan output
    var templateBio = """
    +------------------------------------------+
    | BIO DATA PROGRAMMER        
    +------------------------------------------+
    | Nama lengkap: $namaLengkap
    | Jenis kelamin: $jenisKelamin
    | Hobi: $hobi
    """

    println(templateBio)

}