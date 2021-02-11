package de.check24.learningKotlinJava.java;

import java.util.stream.IntStream;

public class InclusiveRangeOperator {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5).forEach(
                i -> System.out.println(i + " times 5 is " + (i * 5)));
    }
}
