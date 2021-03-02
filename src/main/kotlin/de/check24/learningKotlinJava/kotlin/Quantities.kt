package de.check24.learningKotlinJava.kotlin

fun main() {
    val a = listOf("a", "b", "c", "d")
    val b = listOf("d", "e", "f", "a")
    println("a=$a b=$b") // a=[a, b, c, d] b=[d, e, f, a]
    println("combined ${a + b}") // combined [a, b, c, d, d, e, f, a]
    println("union ${a.union(b)}") // union [a, b, c, d, e, f]
    val ab = a.toMutableList()
    ab.retainAll(b)
    println("a retainAll b $ab") // a retainAll b [a, d]
    val ba = b.toMutableList()
    ba.retainAll(a)
    println("b retainAll a $ba") // b retainAll a [d, a]
}
// Ausgabe:
// a=[a, b, c, d] b=[d, e, f, a]
// combined [a, b, c, d, d, e, f, a]
// union [a, b, c, d, e, f]
// a retainAll b [a, d]
// b retainAll a [d, a]
