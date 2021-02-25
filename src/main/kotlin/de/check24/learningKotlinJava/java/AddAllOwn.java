package de.check24.learningKotlinJava.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAllOwn {
    public static void main(String args[]) {
        // Erstellen der Listen:
        List A = new ArrayList(Arrays.asList("a","b","c","d","e"));
        List B = new ArrayList(Arrays.asList("f","e","h","b","e"));

        // Ausgeben der Listen:
        System.out.println(A);
        System.out.println(B);

        // Alle Inhalte von B werden zu A hinzugefügt.
        A.addAll(B);
        System.out.println(A);
        // Duplizierte Inhalte sind auch vorhanden.
    }
}
