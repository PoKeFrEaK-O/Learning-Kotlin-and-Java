package de.check24.learningKotlinJava.kotlin.functions

fun main(){
    println(over(number = 5))
}

fun over(number: Int): String {
    val multiplier = 5
    // Kotlin supports local functions, which are functions inside another function:
    fun local(multiplier: Int): Int {
        // The local function local can use the local val number of the outer function.
        return number * multiplier
    }
    return "The product of $number and $multiplier is: ${local(multiplier)}"
}
// Ausgabe:
// The product of 5 and 5 is: 25
