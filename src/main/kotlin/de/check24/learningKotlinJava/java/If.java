package de.check24.learningKotlinJava.java;

public class If {
    public static void main(String[] args) {
        int zahl = 2;
        if (zahl <= 1){
            System.out.println(zahl + " kleiner oder gleich 1");
        } else if (zahl == 2) {
            System.out.println(zahl + " ist gleich 2");
        } else {
            System.out.println(zahl + " ist größer als 2");
        }
    }
}
