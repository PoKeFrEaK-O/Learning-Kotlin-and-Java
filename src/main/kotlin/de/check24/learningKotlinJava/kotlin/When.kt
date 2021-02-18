package de.check24.learningKotlinJava.kotlin

fun main() {
    var zahl: Int = 2
    when (zahl) {
        1 -> println("Zahl ist gleich 1")
        2 -> println("Zahl ist gleich 2")
        else -> {
            println("Zahl ist weder 1 noch 2")
        }
    }
}