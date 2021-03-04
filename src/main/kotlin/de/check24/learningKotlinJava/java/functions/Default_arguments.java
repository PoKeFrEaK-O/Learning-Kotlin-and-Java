package de.check24.learningKotlinJava.java.functions;

public class Default_arguments {
    public static void main(String[] args) {
        // Java does not support the following named inputs for methods.
        // int result = product(number = 5, multiplier = 3);
        int result = product(5,3);
        // Since there is no default value,
        // the method product uses 5 as the multiplier value instead of 3.

        System.out.println("Das Ergebnis lautet: " + result);
    }

    // Java does not have default parameters.
    public static int product(
            int number,
            int multiplier
    )
    {
        multiplier = 5;
        return number * multiplier;
    }
}
// Ausgabe:
// Das Ergebnis lautet: 25
