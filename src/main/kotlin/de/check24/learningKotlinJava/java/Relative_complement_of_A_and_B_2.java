package de.check24.learningKotlinJava.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Relative_complement_of_A_and_B_2 {
    public static void main(String args[]) {
        List A = new ArrayList(Arrays.asList("a","b","c","d","e"));
        List B = new ArrayList(Arrays.asList("f","e","h","b","e"));

        System.out.println("Liste A: " + A);
        System.out.println("Liste B: " + B);

        A.removeAll(B); // Removes all elements of B that are also contained in A.
        System.out.println("------------------");
        System.out.println("Relative complement of A and B: " + A);
    }
}
// Ausgabe:
// Liste A: [a, b, c, d, e]
// Liste B: [f, e, h, b, e]
// ------------------
// Relative complement of A and B: [a, c, d]