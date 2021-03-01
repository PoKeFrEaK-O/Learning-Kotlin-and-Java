package de.check24.learningKotlinJava.java;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Relative_complement_of_A_and_B {
    public static void main(String args[]) {
        List A = new ArrayList(Arrays.asList("a","b","c","d","e"));
        List B = new ArrayList(Arrays.asList("f","e","h","b","e"));

        System.out.println("Liste A: " + A);
        System.out.println("Liste B: " + B);


        Set<Type> relativeComplement = new HashSet<Type>(A);
        relativeComplement.addAll(B);
        // relativeComplement now contains the union
        System.out.println("Union of A and B: " + relativeComplement);

        Set<Type> intersection = new HashSet<Type>(A);
        intersection.retainAll(B);
        // intersection now contains the intersection
        System.out.println("Intersection of a and b: " + intersection);

        relativeComplement.removeAll(intersection);
        // union minus intersection equals symmetric-difference
        System.out.println("Symmetric difference of A and B: " + relativeComplement);
        // ---------------

        relativeComplement.removeAll(B);
        // symmetric-difference minus B equals relativeComplement
        System.out.println("-----------------");
        System.out.println("Relative complement of A and B: " + relativeComplement);
    }
}
// Ausgabe:
// Liste A: [a, b, c, d, e]
// Liste B: [f, e, h, b, e]
// Union of A and B: [a, b, c, d, e, f, h]
// Intersection of a and b: [b, e]
// Symmetric difference of A and B: [a, c, d, f, h]
// -----------------
// Relative complement of A and B: [a, c, d]
