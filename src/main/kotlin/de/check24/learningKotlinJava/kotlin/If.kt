package de.check24.learningKotlinJava.kotlin

fun main() {
    var zahl: Int = 2
    if (zahl <= 1) {
        println("$zahl kleiner oder gleich 1")
    } else if (zahl == 2) {
        println("$zahl ist gleich 2")
    } else {
        println("$zahl ist größer als 2")
    }
}