package de.check24.learningKotlinJava.kotlin.functions

fun main() {
    fun greet(name: String, day: String): String {
        return "Hello $name, today is $day."
    }
    fun greet2(name: String, day: String) {
        println("Hello $name, today is $day.")
    }

    // Aufrufen der Funktion greet
    println(greet("Bob", "Tuesday"))

    // Aufrufen der Funktion greet2
    greet2("Max","Monday")
}
// Ausgabe:
// Hello Bob, today is Tuesday.
// Hello Max, today is Monday.
