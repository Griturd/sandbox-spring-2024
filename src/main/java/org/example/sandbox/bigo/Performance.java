package org.example.sandbox.bigo;

import java.util.ArrayList;
import java.util.List;

public class Performance {

    public static void main(String[] args) {

        //O="bigO"
        //O(1) - constant
        System.out.println("one");

        //O(1) + O(1) = O(1)

        //O(n) - linear

        List<String> myList = new ArrayList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");

        //O(n)
        myList.forEach(System.out::println);

        //O(n^2) - polynomial
        for(int x = 0; x <= 100; x++) { //O(n)
            for(int y = 0; y <= 10; y++) { //O(n)
                System.out.println(x + ":" + y); //O(1)
            }
        }

        //O(n) * O(n) *O (1) = 1 * O(n^2) = O(n^2)

    }
}
