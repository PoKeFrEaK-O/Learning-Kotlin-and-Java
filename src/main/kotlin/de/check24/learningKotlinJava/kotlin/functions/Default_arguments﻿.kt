package de.check24.learningKotlinJava.kotlin.functions

fun main() {
    var result = product(zahl = 5) // Default argument multiplikator is used.
    println("Das Ergebnis lautet: $result")
    result = product(5,3) // Default argument multiplikator is not used.
    println("Das Ergebnis lautet: $result")
}

// Function parameters can have default values,
// which are used when you skip the corresponding argument:
fun product(
        zahl: Int,
        multiplikator: Int = 5,
): Int
{
    return zahl * multiplikator
}
// Ausgabe:
// Das Ergebnis lautet: 25
// Das Ergebnis lautet: 15
