package de.check24.learningKotlinJava.kotlin

fun main() {
    var zahl: Int = 1
    while (zahl <= 3){
        println(zahl)
        zahl++
    }
    println()
    do {
        println("Ich werde vor der Bedingung mindestens einmal ausgeführt.")
        println(zahl)
        zahl++
    } while (zahl <= 3)
}
