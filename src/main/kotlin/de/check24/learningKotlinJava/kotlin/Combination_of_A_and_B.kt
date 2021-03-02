package de.check24.learningKotlinJava.kotlin

fun main() {
    val a = mutableListOf("a", "b", "c", "d", "e")
    val b = mutableListOf("f", "e", "h", "b", "e")

    println("Liste a: $a")
    println("Liste b: $b")

    a.addAll(b) // Inserts the elements of list b at the end of list a.
    println("Combination of a and b: $a")
}
// Ausgabe:
// Liste a: [a, b, c, d, e]
// Liste b: [f, e, h, b, e]
// Combination of a and b: [a, b, c, d, e, f, e, h, b, e]