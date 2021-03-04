package de.check24.learningKotlinJava.kotlin.functions

import de.check24.learningKotlinJava.kotlin.test

fun main() {
    val result = product(5,5)
    // The product function from the Default_arguments.kt
    // file can be used because it is puplic.
    // If the modifier is not specified, it is puplic.

    println(result)
    hello()
    test()
}
// The modifier private means that the function hello
// can only be used in the file where it was declared.
private fun hello() {
    return println("Hello")
}

// internal is an alternative to Java’s package-private.
// internal means that the declarations are visible inside a module.

// protected:
// Declarations are only visible in its class and in its subclassess
