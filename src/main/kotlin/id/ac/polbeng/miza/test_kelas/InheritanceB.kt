package id.ac.polbeng.miza.test_kelas
//chile class (initializes the parent class)
class LaptopB : Computer {
    val batteryLife: Double
    //Calls super() to initialize the Parent class
    constructor(name: String, brand: String, batteryLife: Double) : super(name, brand) {
        this.batteryLife = batteryLife
    }
    //calls another constructor(which calls super())
    constructor(name: String, brand: String) : this(name, brand, 0.0) {
    }
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}
fun main(){
    val myLaptop = LaptopB("Asus Think Pad", "Asus")
    println(myLaptop.info())
}