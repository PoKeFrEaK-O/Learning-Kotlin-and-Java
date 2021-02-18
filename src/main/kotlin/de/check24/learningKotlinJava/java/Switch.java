package de.check24.learningKotlinJava.java;

public class Switch {
    public static void main(String[] args) {
        int zahl = 1;
        switch (zahl) {
            case 1:
                System.out.println("Zahl ist gleich 1");
                break;
            case 2:
                System.out.println("Zahl ist gleich 2");
                break;
            default:
                System.out.println("Zahl ist weder 1 noch 2");
                break;
        }
    }
}
