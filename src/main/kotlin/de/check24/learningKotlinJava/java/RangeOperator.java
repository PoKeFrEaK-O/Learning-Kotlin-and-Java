package de.check24.learningKotlinJava.java;

public class RangeOperator {

    public static void main(String[] args) {
        String[] names = {"Anna", "Alex", "Brian", "Jack"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Person " + (i + 1) + " is called " + names[i]);
        }
        // Person 1 is called Anna
        // Person 2 is called Alex
        // Person 3 is called Brian
        // Person 4 is called Jack
    }
}
