package de.check24.learningKotlinJava.kotlin.functions

fun main() {
    // If the file of the function you wish to call is
    // not in the same package, you must import that file.
    // Calling the Parameters function from the Parameters.kt file:
    var result = parameter(number = 10, subtracted = 5) // subtracted and number are named arguments
    // You can freely change the order in which you call named arguments:
    println("Das Ergebnis lautet: $result")
    result = parameter(subtracted = 5, number = 10)
    println("Das Ergebnis lautet: $result")
}
// Ausgabe:
// Das Ergebnis lautet: 5
// Das Ergebnis lautet: 5
