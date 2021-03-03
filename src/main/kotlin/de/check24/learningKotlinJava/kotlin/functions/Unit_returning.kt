package de.check24.learningKotlinJava.kotlin.functions

// If a function does not return any useful value, its return type is Unit.
// The Unit value does not have to be returned explicitly:
fun unit(name: String?): Unit { // The Unit return type declaration is optional.
    if (name != null) {
        println("Hello $name")
    } else {
        println("Hello")
    }
    // return Unit or return is optional
}
