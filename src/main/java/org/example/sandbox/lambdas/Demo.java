package org.example.sandbox.lambdas;

import java.util.*;
import java.util.function.*;

public class Demo {

    public static void main(String[] args) {

        //anonymous function //all lambdas are public
        //x -> x * 2

        //Predicate - takes one value and returns boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        //Function - takes one value and returns one value
        Function<Integer, Integer> function = x -> x * 2;

        //Supplier - takes nothing and returns a value(s)
        Supplier<String> supplier = () -> "Welcome, Lord Vader";

        //Consumer - takes a value and returns nothing
        Consumer<String> consumer = x -> System.out.println(x);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
