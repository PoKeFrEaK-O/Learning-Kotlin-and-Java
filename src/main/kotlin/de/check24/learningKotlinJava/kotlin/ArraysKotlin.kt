package de.check24.learningKotlinJava.kotlin

fun main() {
    val shoppingList = arrayOf("catfish", "water",
    "tulips", "blue paint")
    shoppingList[1] = "bottle of water"
    for (element in shoppingList) {
        println(element)
    }
}
