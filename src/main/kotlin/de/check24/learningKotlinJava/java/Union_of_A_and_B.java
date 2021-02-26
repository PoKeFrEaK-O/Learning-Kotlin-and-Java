// Zweite Folie
package de.check24.learningKotlinJava.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union_of_A_and_B {
    public static void main (String[] args) {
        List A = new ArrayList(Arrays.asList("a","b","c","d","e"));
        List B = new ArrayList(Arrays.asList("f","e","h","b","e"));

        System.out.println("Liste A: " + A);
        System.out.println("Liste B: " + B);

        Set<String> setAB = new HashSet<>();

        setAB.addAll(A);
        setAB.addAll(B);
        System.out.println(setAB);
    }
}
