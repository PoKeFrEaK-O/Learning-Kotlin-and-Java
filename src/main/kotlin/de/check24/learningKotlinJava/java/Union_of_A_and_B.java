package de.check24.learningKotlinJava.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union_of_A_and_B {
    public static void main (String[] args) {
        List<String> A = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        List<String> B = new ArrayList<>(Arrays.asList("f","e","h","b","e"));

        System.out.println("Liste A: " + A);
        System.out.println("Liste B: " + B);

        Set<String> setAB = new HashSet<>();

        // Adds the elements of lists A and B to the set setAB:
        setAB.addAll(A);
        setAB.addAll(B);

        System.out.println("Union of A and B: " + setAB);
    }
}
// Ausgabe:
// Liste A: [a, b, c, d, e]
// Liste B: [f, e, h, b, e]
// Union of A and B: [a, b, c, d, e, f, h]
