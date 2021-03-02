package de.check24.learningKotlinJava.kotlin

// Functions in Kotlin are declared using the fun keyword:
fun main() {
    val result1 = double1(2, 2)
    val result2 = double2(2,2)

    println("double1: $result1 \ndouble2: $result2")
    // You can also call the function inside the println function:
    println("double1: ${double1(2,2)}\ndouble2: ${double2(2,2)}")

    println(double3(zahl = 5)) // The default value multiplikator = 2 is used.
}

fun double1(zahl: Int, multiplikator: Int): Int {
    return zahl * multiplikator
}

// Function with line breaks between parameters:
fun double2(
        zahl: Int,
        multiplikator: Int, // trailing comma
): Int
{
    return zahl * multiplikator
}

// Function parameters can have default values,
// which are used when you skip the corresponding argument:
fun double3(
        multiplikator: Int = 2,
        zahl: Int,
): Int
{
    return zahl * multiplikator
}
// Ausgabe:
// double1: 4
// double2: 4
// double1: 4
// double2: 4
// 10
