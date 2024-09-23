package id.ac.polbeng.miza.test_kelas

class InitOrder(name: String) {
    val firstProperty = "First property: $name".also(:: println)
    init{
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init{
        println("Second initializer block that print ${name.length}")
    }
}
fun main(){
    val initOrder = InitOrder("RPL")
}