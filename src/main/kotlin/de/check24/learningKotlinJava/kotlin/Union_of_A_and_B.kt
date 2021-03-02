package de.check24.learningKotlinJava.kotlin

fun main() {
    val a = mutableListOf("a", "b", "c", "d", "e")
    val b = mutableListOf("f", "e", "h", "b", "e")

    println("Liste a: $a")
    println("Liste b: $b")

    val setab = mutableSetOf<String>()

    // Adds the elements of lists a and b to the set setab:
    setab.addAll(a)
    setab.addAll(b)

    println("Union of a and b: $setab")

    // In Kotlin there is the function .union() which
    // makes it much easier to get to the union of two collections:
    println("Union of a and b: ${a.union(b)}")
}
// Ausgabe:
// Liste a: [a, b, c, d, e, f, h]
// Liste b: [f, e, h, b, e]
// Union of a and b: [a, b, c, d, e, f, h]
// Union of a and b: [a, b, c, d, e, f, h]
