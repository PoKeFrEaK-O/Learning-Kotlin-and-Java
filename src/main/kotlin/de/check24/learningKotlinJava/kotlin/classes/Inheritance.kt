package de.check24.learningKotlinJava.kotlin.classes

// All classes in Kotlin have a common superclass, which is Any.
// Any has three methods: equals(), hashCode() and toString()

// By default, Kotlin classes are final: they can’t be inherited.
// To make a class inheritable, one needs to mark it with the open keyword:
open class Inheritable {
    val number1 = 5
    val number2 = 5
}

// Addition inherits the val number1 and val number2 from Inheritable:
class Addition : Inheritable() {
    val sum = number1 + number2
    init {
        println("Die Summe von $number1 und $number2 lautet $sum")
    }
}

fun main () {
    Addition()
}
// Ausgabe:
// Die Summe von 5 und 5 lautet 10
