package de.check24.learningKotlinJava.kotlin

fun main() {
    val anListWithTheNameList = mutableListOf("catfish", "water", "tulips", "blue paint")
    anListWithTheNameList[1] = "bottle of water"
    for (s in anListWithTheNameList) {
        println(s)
    }
}