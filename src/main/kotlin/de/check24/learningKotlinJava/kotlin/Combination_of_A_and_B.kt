package de.check24.learningKotlinJava.kotlin

fun main() {
    val a = mutableListOf("a", "b", "c", "d", "e")
    val b = mutableListOf("f", "e", "h", "b", "e")

    println("Liste A: $a")
    println("Liste B: $b")

    a.addAll(b) // Inserts the elements of list b at the end of list a.
    println(a)
}
// Ausgabe:
// Liste A: [a, b, c, d, e]
// Liste B: [f, e, h, b, e]
// [a, b, c, d, e, f, e, h, b, e]