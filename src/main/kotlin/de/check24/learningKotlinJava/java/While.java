package de.check24.learningKotlinJava.java;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class While {
    public static void main(String[] args) {
        int zahl = 1;
        while (zahl <= 3) {
            System.out.println(zahl);
            zahl++;
        }
        System.out.println();
        do {
            System.out.println("Ich werde vor der Bedingung mindestens einmal ausgeführt.");
            System.out.println(zahl);
            zahl++;
        } while (zahl <= 3);
    }
}
