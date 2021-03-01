package de.check24.learningKotlinJava.kotlin


fun main() {
    val a = mutableListOf("a", "b", "c", "d", "e")
    val b = mutableListOf("f", "e", "h", "b", "e")

    println("Liste A: $a")
    println("Liste B: $b")

    a.removeAll(b) // Removes all elements of b that are also contained in a.

    println("------------------")
    println("Relative complement of a and b: $a")
    println(a-b)
}
// Liste A: [a, b, c, d, e]
// Liste B: [f, e, h, b, e]
// ------------------
// Relative complement of a and b: [a, c, d]