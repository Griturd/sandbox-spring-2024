package org.example.sandbox.inheritance.aggregation;

public class Driver {

    public static void main(String[] args) {
        Salad salad = new Salad("a lot", "a lot", "a lot", "a few"); //aggregation
        System.out.println(salad);

        Salad anotherSalad = new Salad(); //composition
        System.out.println(anotherSalad);
    }
}
