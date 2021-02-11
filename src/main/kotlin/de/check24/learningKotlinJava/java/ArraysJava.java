package de.check24.learningKotlinJava.java;

import java.util.Arrays;
import java.util.List;

public class ArraysJava {
    public static void main(String[] args) {
        List<String> shoppingList = java.util.Arrays.asList("catfish", "water", "tulips", "blue paint");
        shoppingList.set(1, "bottle of water");
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }
}
