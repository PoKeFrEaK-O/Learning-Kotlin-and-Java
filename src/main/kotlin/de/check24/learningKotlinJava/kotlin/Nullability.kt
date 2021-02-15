package de.check24.learningKotlinJava.kotlin

fun main() {
    var a: String = "value"
    //a = null
    // Error: Null can not be a value of a non-null type String

    var b: String? = "value"
    b = null
    println(b)
    // No Error
    // println(b) --> null

    // When we want to access the b reference, we must handle the null case explicitly:
    if (b != null) {
        println("b ist nicht null, sondern $b")
    } else {
        println("b ist null")
    }
}
