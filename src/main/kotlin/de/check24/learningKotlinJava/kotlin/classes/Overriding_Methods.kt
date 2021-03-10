package de.check24.learningKotlinJava.kotlin.classes

open class First {
    open fun number (zahl: Int): Int{
        return zahl * 2
    }
}

class Second() : First() {
    init {
        println(number(5))
    }
    // The override modifier overwrites the
    // original function with the following one:
    override fun number(zahl: Int): Int {
        return zahl * 3
    }
    // To prohibit re-overriding, put the
    // keyword final in front of the keyword override:
    // final override fun number(zahl: Int): Int
}

fun main () {
    print("Die Summe lautet: ")
    Second()
}
// Ausgabe:
// Die Summe lautet: 15
