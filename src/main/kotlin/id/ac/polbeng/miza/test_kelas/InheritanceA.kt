package id.ac.polbeng.miza.test_kelas

//parent class
open class Computer(val name: String, val brand: String){
}
//Chile class(initializes the parent class)
class Laptop(name: String, brand: String, val batteryLife: Double): Computer(name, brand){
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : X$batteryLife")
    }
}

fun main() {
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    println(myLaptop.info())
}