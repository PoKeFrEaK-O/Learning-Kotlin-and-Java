package de.check24.learningKotlinJava.kotlin.classes

// You can provide default value to constructor parameters:
class defaultValue (name: String, age: Int = 18) {
    init {
        println("$name ist $age Jahre alt.")
    }
}

fun main () {
    defaultValue("Markus")
    defaultValue(name = "Max", age = 22)
}
// Ausgabe:
// Markus ist 18 Jahre alt.
// Max ist 22 Jahre alt.
