package de.check24.learningKotlinJava.kotlin

fun main() {
    val a = mutableListOf("a", "b", "c", "d", "e")
    val b = mutableListOf("f", "e", "h", "b", "e")

    println("Liste a: $a")
    println("Liste b: $b")

    a.retainAll(b) // Retains only the elements in a that are contained in b.
    println("Intersection of a and b: $a")

    // In Kotlin there is the function .intersect() which
    // makes it much easier to get to the intersection of two collections:
    println("Intersection of a and b: ${a.intersect(b)}")
}
// Ausgabe:
// Liste a: [a, b, c, d, e]
// Liste b: [f, e, h, b, e]
// Intersection of a and b: [b, e]
// Intersection of a and b: [b, e]
