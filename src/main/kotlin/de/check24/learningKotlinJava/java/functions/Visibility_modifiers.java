package de.check24.learningKotlinJava.java.functions;

public class Visibility_modifiers {
    public static void main(String[] args) {
        int result = Default_arguments.product(5,5);
        // The product method is from the Default_arguments.java
        // Class can be used because it is puplic.
        // If the modifier is not specified, it is puplic.

        System.out.println(result);
        System.out.println(hello());
    }

    // The modifier private means that the method hello
    // can only be used in the class where it was declared.
    private static String hello() {
        return "Hello";
    }
}
// Ausgabe:
// 25
// Hello
