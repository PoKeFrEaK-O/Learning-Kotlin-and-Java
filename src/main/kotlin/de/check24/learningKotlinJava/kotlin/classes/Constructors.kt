package de.check24.learningKotlinJava.kotlin.classes

// A class in Kotlin can have a primary constructor and one or more secondary constructors.

// The primary constructor is part of the class header,
// it goes after the class name (and optional type parameters):
class withconstructorKeywort constructor(firstName: String) {
    // Code of the class Person
}

// primary constructor: constructor(firstName: String)

// If the primary constructor does not have any annotations or
// visibility modifiers, the constructor keyword can be omitted:
class withoutconstructorKeywort (firstName: String) {
    // Code of the class Person
}
