package de.check24.learningKotlinJava.java.functions;

public class Named_arguments {
    public static void main(String[] args) {
        // Calling the Parameters method from the Parameters.java class:
        int result = Parameters.parameter(10,5);
        System.out.println("Das Ergebnis lautet: " + result);
        // Java does not support named parameters
        // for constructors or method arguments.
    }
}
// Ausgabe:
// Das Ergebnis lautet: 5
