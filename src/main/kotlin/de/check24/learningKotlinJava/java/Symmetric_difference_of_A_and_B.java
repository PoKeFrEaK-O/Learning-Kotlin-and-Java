package de.check24.learningKotlinJava.java;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Symmetric_difference_of_A_and_B {
    public static void main(String args[]) {
        List A = new ArrayList(Arrays.asList("a","b","c","d","e"));
        List B = new ArrayList(Arrays.asList("f","e","h","b","e"));

        System.out.println("Liste A: " + A);
        System.out.println("Liste B: " + B);


        Set<Type> symmetricDiff = new HashSet<Type>(A);
        symmetricDiff.addAll(B);
        // symmetricDiff now contains the union
        System.out.println(symmetricDiff);

        Set<Type> tmp = new HashSet<Type>(A);
        tmp.retainAll(B);
        // tmp now contains the intersection
        System.out.println(tmp);

        symmetricDiff.removeAll(tmp);
        // union minus intersection equals symmetric-difference
        System.out.println("------------------");
        System.out.println(symmetricDiff);
    }
}
