package de.check24.learningKotlinJava.kotlin.classes

class Instances (nachname: String, vorname: String){
    init {
        println("Der Name der person lautet: $vorname $nachname")
    }
}

fun main () {
    // To create an instance of a class,
    // call the constructor as if it were a regular function:
    val instance1 = Instances("Mustermann","Max")
    val instance2 = Instances("Müller","Markus")
    instance1
    instance2
}
// Ausgabe:
// Der Name der person lautet: Max Mustermann
// Der Name der person lautet: Markus Müller
