package de.check24.learningKotlinJava.kotlin

fun main() {
    val a = mutableListOf("a", "b", "c", "d", "e")
    val b = mutableListOf("f", "e", "h", "b", "e")

    println("Liste A: $a")
    println("Liste B: $b")


    val symmetricDiff = mutableSetOf<String>()
    symmetricDiff.addAll(a)
    symmetricDiff.addAll(b)
    // symmetricDiff now contains the union
    println("Union of a and b: $symmetricDiff")

    val intersection = mutableSetOf<String>()
    intersection.addAll(a)
    intersection.retainAll(b)
    // intersection now contains the intersection
    println("Intersection of a and b: $intersection")

    symmetricDiff.removeAll(intersection)
    // union minus intersection equals symmetric-difference
    println("------------------")
    println("Symmetric difference of A and B: $symmetricDiff")
}
// Ausgabe:
// Liste A: [a, b, c, d, e]
// Liste B: [f, e, h, b, e]
// Union of a and b: [a, b, c, d, e, f, h]
// Intersection of a and b: [b, e]
// ------------------
// Symmetric difference of A and B: [a, c, d, f, h]