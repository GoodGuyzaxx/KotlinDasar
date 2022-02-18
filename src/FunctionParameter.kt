fun sayHello(name1:String, name2:String?){
    //println("HI $name1 $name2")
    if (name2 == null) {
        println("Hello $name2")
    }else{
        println("Hello $name1 $name2")
    }
}

fun main() {
    sayHello("Dewantara","JOKO")
    sayHello("zaxx", null)
}