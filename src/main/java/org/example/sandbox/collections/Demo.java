package org.example.sandbox.collections;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>(); //used HashSet instead of TreeSet

        set.add("Hello");
        set.add("Ollo");
        set.add("Hey");
        set.add("Hi");
        set.add("Hola");
        //System.out.println(set.contains("Howdy")); //boolean

        //set.forEach(System.out::println);

        List<String> list = new Vector<>(); //used ArrayList instead of Vector - "don't use vectors"

        list.add("Hello");
        list.add("Ollo");
        list.add("Hey");
        list.add("Hi");
        list.add("Hola");

        //list.forEach(System.out::println);

        Queue<String> queue = new  LinkedList<>();

        queue.add("Hello");
        queue.add("Ollo");
        queue.add("Hey");
        queue.add("Hi");
        queue.add("Hola");

        /*System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);*/ //you can use ctrl+shift+/ to add block comment

        Deque<String> deque = new  LinkedList<>();

        deque.add("Hello");
        deque.add("Ollo");
        deque.add("Hey");
        deque.add("Hi");
        deque.add("Hola");

        /*System.out.println(deque.pollFirst()); //used getFirst instead of pollFirst
        System.out.println(deque.pollLast()); //used getLast instead of pollLast
        System.out.println(deque);*/

        Queue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("Hello");
        priorityQueue.add("Ollo");
        priorityQueue.add("Hey");
        priorityQueue.add("Hi");
        priorityQueue.add("Hola");

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);

        //unnecessary or alternate actions marked as comments - can remove // or /* */

    }
}
