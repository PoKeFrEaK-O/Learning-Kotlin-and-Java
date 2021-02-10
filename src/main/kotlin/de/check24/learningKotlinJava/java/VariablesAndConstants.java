package de.check24.learningKotlinJava.java;

public class VariablesAndConstants {

    public static void main(String[] args) {
        int myVariable = 42;
        myVariable = 50;
        final int myConstant = 42;

        // Primitive Data Types:
        byte myNumByte = 17;         // Size: 1 byte, Stores whole numbers from -128 to 127
        short myNumShort = 55;       // Size: 2 bytes, Stores whole numbers from -32,768 to 32,767
        int myNumInt = 5;            // Size: 4 bytes, Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long myNumLong = 12333;      // Size: 8 bytes, Stores whole numbers from -9,223,372,036,854,775,808
        // to 9,223,372,036,854,775,807
        float myNumFloat = 5.99f;    // Size: 4 bytes, Stores fractional numbers.
        // Sufficient for storing 6 to 7 decimal digits
        double myNumDouble = 76.24d; // Size: 8 bytes, Stores fractional numbers.
        // Sufficient for storing 15 decimal digits
        boolean myBool = true;       // Size: 1 bit, Stores true or false values
        char myLetter = 'D';         // Size: 2 bytes, Stores a single character/letter or ASCII

        // Non-Primitive Data Types:
        // Non-primitive data types are called reference types because they refer to objects.
        String myText = "Hello";     // String

    }
}
