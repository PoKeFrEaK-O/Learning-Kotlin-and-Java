package de.check24.learningKotlinJava.kotlin

fun main() {
    val label = "The width is "
    val width = 94
    val widthLabel = label + width
    if(widthLabel is String) {
        println("widthLabel is of type String")
    }
    // widthLabel is a String

    // TypeCoercion Error Example:
    println('A' + 0)
    // A
    println('A' + 50 + "A")
    // sA
    println("A" + 'A' + 50)
    // AA50
}
