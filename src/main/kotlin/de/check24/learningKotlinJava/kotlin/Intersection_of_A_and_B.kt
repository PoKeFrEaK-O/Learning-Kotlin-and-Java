package de.check24.learningKotlinJava.kotlin

fun main() {
    val a = mutableListOf("a", "b", "c", "d", "e")
    val b = mutableListOf("f", "e", "h", "b", "e")

    println("Liste A: ${a.intersect(b)}")
    println("Liste B: $b")

    a.retainAll(b) // Retains only the elements in a that are contained in b.
    println("Intersection of a and b: $a")
}
// Ausgabe:
// Liste A: [a, b, c, d, e]
// Liste B: [f, e, h, b, e]
// Intersection of a and b: [b, e]