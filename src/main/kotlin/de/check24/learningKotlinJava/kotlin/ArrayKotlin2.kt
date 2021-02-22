package de.check24.learningKotlinJava.kotlin

fun main() {
    // Declares an array of String and initialize the elements in one:
    val anArrayWithTheNameArray = arrayOf("catfish", "water",
        "tulips", "blue paint")

    // Replacing the second element
    anArrayWithTheNameArray[1] = "bottle of water"

    for (element in anArrayWithTheNameArray) {
        println(element)
    }
}