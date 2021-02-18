package de.check24.learningKotlinJava.java;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 2) {
                break;
            }
        }
        System.out.println("nach Schleife");
    }
}
