package de.check24.learningKotlinJava.kotlin.classes

// Classes in Kotlin are declared using the keyword class:
class Classname {
    // Code of the class Classname
}

// If the class has no body, curly braces can be omitted:
class Empty

// Declaring a class with multiple properties:
class Person(
        val firstName: String,
        val lastName: String,
        var age: Int, // trailing comma
) {
    // Code of the class Person
}
