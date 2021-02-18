package de.check24.learningKotlinJava.kotlin

fun main() {
    for (i in 0..4) {
        println(i)
        if (i == 3) {
            continue
        }
        println("nach continue")
    }
    println("nach Schleife")
}