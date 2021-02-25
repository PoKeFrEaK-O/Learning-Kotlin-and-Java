package de.check24.learningKotlinJava.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionExample1 {
    public static void main (String[] args) {

        List<String> list1 = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
        System.out.println("List 1 elements: " + list1);
        List<String> list2 = new ArrayList<String>(Arrays.asList("b","d","f","g"));
        System.out.println("List 2 elements: " + list2);

        System.out.println();
        System.out.println("Union.................");
        //Find union of two lists
        System.out.println("Union of List1 and List2 :" + getUnionOfLists(list1, list2));

        System.out.println();
        System.out.println("Intersection.................");
        //Find intersect of lists using Stream API (Java 8)
        System.out.println("Intersection of List1 & List2 Method 1: " + getIntersectOfLists1(list1, list2));

        //Find intersect of lists using retainAll() method
        System.out.println("Intersection of List1 & List2 Method 2: " + getIntersectOfLists2(list1, list2));
    }

    private static List<String> getUnionOfLists(List<String> list1, List<String> list2) {

        Set<String> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);

        return new ArrayList<>(set);
    }

    private static List<String> getIntersectOfLists1(List<String> list1, List<String> list2) {
        List<String> intersectElements = list1.stream()
                .filter(list2 :: contains)
                .collect(Collectors.toList());

        if(!intersectElements.isEmpty()) {
            return intersectElements;
        }else {
            return Collections.emptyList();
        }
    }

    private static List<String> getIntersectOfLists2(List<String> list1, List<String> list2) {
        list1.retainAll(list2);

        return list1;
    }
}
