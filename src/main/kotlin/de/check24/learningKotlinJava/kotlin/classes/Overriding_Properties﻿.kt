package de.check24.learningKotlinJava.kotlin.classes

open class Number1 {
    open val firstNumber: Int = 5
}

class Number2 : Number1(){
    // Override the val firstNumber:
    override val firstNumber = 10
    init {
        println(firstNumber)
    }
}

fun main () {
    print("val firstNumber after override: ")
    Number2()
}
// Ausgabe:
// val firstNumber after override: 10
