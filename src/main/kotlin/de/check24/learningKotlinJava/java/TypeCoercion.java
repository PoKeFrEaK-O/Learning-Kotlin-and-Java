package de.check24.learningKotlinJava.java;

public class TypeCoercion {

    public static void main(String[] args) {
        String label = "The width is ";
        int width = 94;
        String widthLabel = label + width;
        System.out.println(widthLabel);
        // widthLabel is a String

        // TypeCoercion Error Example:
        System.out.println('A' + 0);
        // 65
        System.out.println('A' + 50 + "A");
        // 115A
        System.out.println("A" + 'A' + 50);
        // AA50
    }
}
