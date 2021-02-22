package de.check24.learningKotlinJava.java;

public class Functions {
    public static void main(String[] args) {
        System.out.println(greet("Bob","Tuesday"));
        greet2("Max", "Monday");
    }

    public static String greet(String name, String day) {
        return "Hello " + name + ", today is " + day + ".";
    }

    public static void greet2(String name, String day) {
        System.out.println("Hello " + name + ", today is " + day + ".");
    }
}
// Ausgabe:
// Hello Bob, today is Tuesday.
// Hello Max, today is Monday.