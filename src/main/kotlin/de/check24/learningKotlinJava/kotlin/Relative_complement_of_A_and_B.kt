package de.check24.learningKotlinJava.kotlin

fun main() {
    val a = mutableListOf("a", "b", "c", "d", "e")
    val b = mutableListOf("f", "e", "h", "b", "e")

    println("Liste A: $a")
    println("Liste B: $b")

    val relativeComplement = mutableSetOf<String>()
    relativeComplement.addAll(a)
    relativeComplement.addAll(b)
    // symmetricDiff now contains the union
    println("Union of a and b: $relativeComplement")

    val intersection = mutableSetOf<String>()
    intersection.addAll(a)
    intersection.retainAll(b)
    // intersection now contains the intersection
    println("Intersection of a and b: $intersection")

    relativeComplement.removeAll(intersection)
    // union minus intersection equals symmetric-difference
    println("Symmetric difference of a and b: $relativeComplement")
    // ---------------

    relativeComplement.removeAll(b)
    // symmetric-difference minus b equals relativeComplement

    println("------------------")
    println("Relative complement of a and b: $relativeComplement")
}
// Ausgabe:
// Liste A: [a, b, c, d, e]
// Liste B: [f, e, h, b, e]
// Union of a and b: [a, b, c, d, e, f, h]
// Intersection of a and b: [b, e]
// Symmetric difference of a and b: [a, c, d, f, h]
// ------------------
// Relative complement of a and b: [a, c, d]
