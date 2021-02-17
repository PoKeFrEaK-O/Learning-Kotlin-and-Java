package de.check24.learningKotlinJava.kotlin

fun main() {
    for (counter in 1..5) {
        println("Zaeler ist bei: $counter")
    }
}
// No need to declare the data type of variable.
// If iterating over a range, we can use in
// the lower and upper (including) limit can
// be defined on both the sides of .. Operator.