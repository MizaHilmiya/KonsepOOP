package id.ac.polbeng.miza.test_kelas

import java.util.*

open class Base(val name: String) {
    init{
        println("Initializing Base")
    }
    open val size: Int = name.length.also{
        println("Initializing size ini Base: $it ")
    }
}
class Derived(name: String , val lastName: String ):
        Base(name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }.also {println("Argumenr for Base: $it") }){
            init{
                println("Initilizing Derived")
            }
        override val size: Int = (super.size + lastName.length).also{
            println("Initializng size in Derived: $it")
        }
        }

fun main() {
    val turunan = Derived("Miza", "Hilmiya")
    turunan.size
}