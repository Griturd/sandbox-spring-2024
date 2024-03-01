package org.example.sandbox.maps;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Map<Integer, String> numbers = new TreeMap<>();

        numbers.put(5, "five");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(2, "two");
        numbers.put(1, "one");

        for (int x = 1; x <= 5; x++) {
            System.out.println(numbers.get(x));
        }

        System.out.println(numbers);

    }

}
