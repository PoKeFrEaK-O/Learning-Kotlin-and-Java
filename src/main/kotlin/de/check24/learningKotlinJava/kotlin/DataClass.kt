package de.check24.learningKotlinJava.kotlin

fun main() {
    data class GasPrices(val a: Double, val b: Double,
                         val c: Double)
    // data --> vereint schon viele coole Funktionen/Methoden die man in Java
    // noch erzeugen lassen muss.
    // Dazu noch Beispiele schreiben,
    // vorallem zu equals and hashCode
    fun getGasPrices() = GasPrices(3.59, 3.69, 3.79)
    println(getGasPrices())
    val x = GasPrices(1.1,2.2,3.3)
    val y = GasPrices(2.1,3.2,4.3)
    val z = GasPrices(2.1,3.2,4.3)
    // val v = GasPrices(b = 2.1, a = 3.2)

    val list = mutableSetOf<GasPrices>()
    list.add(x)
    list.add(y)
    list.add(z)
    println(list)

    val (a,b,c) = x
    println(a)
    println(b)
    println(c)

}