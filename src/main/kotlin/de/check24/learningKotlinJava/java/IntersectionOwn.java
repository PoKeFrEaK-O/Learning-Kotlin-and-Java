package de.check24.learningKotlinJava.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOwn {
    public static void main(String args[]) {
        // Erstellen der Listen:
        List A = new ArrayList(Arrays.asList("a","b","c","d","e"));
        List B = new ArrayList(Arrays.asList("f","e","h","b","e"));

        // Ausgeben der Listen:
        System.out.println("Liste A: " + A);
        System.out.println("Liste B: " + B);

        // Berechnung der Schnittmenge von A und B:
        A.retainAll(B);
        System.out.println("Schnittmenge von A und B: " + A);
    }
}
