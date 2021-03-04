package de.check24.learningKotlinJava.java.functions;

public class Parameters {
    public static void main(String[] args) {
        // Code that is executed
        int result = parameter(20,5);
        System.out.println("Das Ergebnis lautet: " + result);
        result = parameterWithLinebreaks(20,5);
        System.out.println("Das Ergebnis lautet: " + result);
    }

    // Definition of parameters: type name
    // Parameters are separated using commas.
    public static int parameter(int number, int subtracted) {
        return number - subtracted;
        // The return keyword is used to return
        // the difference of the val number and val subtracted.
    }

    // Function with line breaks between parameters:
    public static int parameterWithLinebreaks(
            int number,
            int subtracted
    )
    {
        return number - subtracted;
    }
}
// Ausgabe:
// Das Ergebnis lautet: 15
// Das Ergebnis lautet: 15
