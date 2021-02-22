package de.check24.learningKotlinJava.kotlin

fun main() {
    // declares an array of String:

    // allocates memory for 4 String:
    val anArrayWithTheNameArray: Array<String?> = arrayOfNulls(4)
    // ? --> Can be null

    // initialize of elements:
    anArrayWithTheNameArray[0] = "catfish"
    anArrayWithTheNameArray[1] = "water"
    anArrayWithTheNameArray[2] = "tulips"
    anArrayWithTheNameArray[3] = "blue paint"

    // Replacing the second element
    anArrayWithTheNameArray[1] = "bottle of water"

    for (element in anArrayWithTheNameArray) {
        println(element)
    }
}
