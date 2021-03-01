package de.check24.learningKotlinJava.kotlin

fun main() {
    val a = mutableListOf("a", "b", "c", "d", "e")
    val b = mutableListOf("f", "e", "h", "b", "e")

    println("Liste A: $a")
    println("Liste B: $b")

    val setab = mutableSetOf<String>()

    // Adds the elements of lists a and b to the set setab:
    setab.addAll(a)
    setab.addAll(b)

    println(setab)
}
// Ausgabe:
// Liste A: [a, b, c, d, e]
// Liste B: [f, e, h, b, e]
// [a, b, c, d, e, f, h]