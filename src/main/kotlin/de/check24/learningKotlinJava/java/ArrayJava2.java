package de.check24.learningKotlinJava.java;

public class ArrayJava2 {
    public static void main(String[] args) {
        // Declares an array of String and initialize the elements in one:
        String[] anArrayWithTheNameArray = {"catfish", "water", "tulips", "blue paint"};

        // Replacing the second element
        anArrayWithTheNameArray[1] = "bottle of water";

        for (String element : anArrayWithTheNameArray) {
            System.out.println(element);
        }
    }
}

