fun fullName(firstName:String,
             middleName:String,
             lastName:String,
) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
  fullName("Good","Guy","zaxx")
  fullName(
      firstName = "Good",
      lastName = "zaxx",
      middleName = "Guy"
  )
}
