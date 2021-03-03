package de.check24.learningKotlinJava.kotlin.functions

fun main() {
    // Code that is executed
    var result = parameter(5,5)
    println("Das Ergebnis lautet: $result")
    result = parameterWithLinebreaks(5,5)
    println("Das Ergebnis lautet: $result")
}

// Definition of parameters: name: type
// Parameters are separated using commas.
fun parameter(zahl: Int, multiplikator: Int): Int {
    return zahl * multiplikator
}

// Function with line breaks between parameters:
fun parameterWithLinebreaks(
        zahl: Int,
        multiplikator: Int, // trailing comma
): Int // Type that is returned
{
    return zahl * multiplikator
    // The return keyword is used to return the product of the val zahl and multiplikator.

}
// Ausgabe:
// Das Ergebnis lautet: 25
// Das Ergebnis lautet: 25