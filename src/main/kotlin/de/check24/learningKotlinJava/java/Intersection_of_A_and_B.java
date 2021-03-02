package de.check24.learningKotlinJava.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_of_A_and_B {
    public static void main(String[] args) {
        List<String> A = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        List<String> B = new ArrayList<>(Arrays.asList("f","e","h","b","e"));

        System.out.println("Liste A: " + A);
        System.out.println("Liste B: " + B);

        A.retainAll(B); // Retains only the elements in A that are contained in B.
        System.out.println("Intersection of A and B: " + A);
    }
}
// Ausgabe:
// Liste A: [a, b, c, d, e]
// Liste B: [f, e, h, b, e]
// Intersection of A and B: [b, e]
