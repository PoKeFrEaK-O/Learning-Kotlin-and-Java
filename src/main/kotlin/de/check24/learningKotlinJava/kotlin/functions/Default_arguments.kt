package de.check24.learningKotlinJava.kotlin.functions

fun main() {
    var result = product(number = 5) // Default argument multiplier is used.
    println("Das Ergebnis lautet: $result")
    result = product(5,3) // Default argument multiplier is not used.
    println("Das Ergebnis lautet: $result")
}

// Function parameters can have default values,
// which are used when you skip the corresponding argument:
fun product(
        number: Int,
        multiplier: Int = 5, // This is a default value
): Int
{
    return number * multiplier
}
// Ausgabe:
// Das Ergebnis lautet: 25
// Das Ergebnis lautet: 15
