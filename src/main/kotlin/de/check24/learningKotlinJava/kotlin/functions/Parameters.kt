package de.check24.learningKotlinJava.kotlin.functions

fun main() {
    // Code that is executed
    var result = parameter(20,5)
    println("Das Ergebnis lautet: $result")
    result = parameterWithLinebreaks(20,5)
    println("Das Ergebnis lautet: $result")
}

// Definition of parameters: name: type
// Parameters are separated using commas.
fun parameter(number: Int, subtracted: Int): Int {
    return number - subtracted
    // The return keyword is used to return
    // the difference of the val number and val subtracted.
}

// Function with line breaks between parameters:
fun parameterWithLinebreaks(
        number: Int,
        subtracted: Int, // trailing comma
): Int // Type that is returned
{
    return number - subtracted
}
// Ausgabe:
// Das Ergebnis lautet: 15
// Das Ergebnis lautet: 15
