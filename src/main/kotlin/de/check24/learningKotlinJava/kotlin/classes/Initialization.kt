package de.check24.learningKotlinJava.kotlin.classes

// Initialization code can be placed in initializer blocks,
// which are prefixed with the init keyword.

// During an instance initialization,
// the initializer blocks are executed in the same order
// as they appear in the class body, interleaved with the property initializers:
class InitTestClass(zahl: Int) {
    // val and var that have been declared outside
    // of an init can be used by all following inits:
    val someString1 = "Hello"

    init {
        println("Die Zahl lautet: $zahl")
        // val and var, which were declared within an init,
        // can also only be used in this init:
        val someString2 = "World"
        println("$someString1 $someString2")
    }

    val zahlAdded2 = zahl + 2
    init {
        println("Die Zahl $zahl + 2 lautet: $zahlAdded2")
        println(someString1.toUpperCase())
    }

}

fun main () {
    // Executing the class InitTestClass:
    InitTestClass(5)
}
// Ausgabe:
// Die Zahl lautet: 5
// Hello World
// Die Zahl 5 + 2 lautet: 7
// HELLO
