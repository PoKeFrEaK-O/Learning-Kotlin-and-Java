package de.check24.learningKotlinJava.kotlin.functions

// Functions in Kotlin are declared using the fun keyword:
fun main() {
    val result1 = double1(2, 2)
    val result2 = double2(2,2)

    println("double1: $result1 \ndouble2: $result2")
    // You can also call the function inside the println function:
    println("double1: ${double1(2,2)}\ndouble2: ${double2(2,2)}")

    println(double3(zahl = 5)) // The default value multiplier = 2 is used.
}

fun double1(zahl: Int, multiplier: Int): Int {
    return zahl * multiplier
}

// Function with line breaks between parameters:
fun double2(
        zahl: Int,
        multiplier: Int, // trailing comma
): Int
{
    return zahl * multiplier
}

// Function parameters can have default values,
// which are used when you skip the corresponding argument:
fun double3(
        multiplier: Int = 2,
        zahl: Int,
): Int
{
    return zahl * multiplier // The product of the val zahl and multiplier is returned.
}
// Ausgabe:
// double1: 4
// double2: 4
// double1: 4
// double2: 4
// 10
