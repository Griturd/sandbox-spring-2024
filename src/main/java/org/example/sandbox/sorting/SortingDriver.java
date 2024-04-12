package org.example.sandbox.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingDriver {

    public static void main(String[] args) {

        // Generate array of random Integers
        Integer[] arr = IntStream.generate(() -> (int) (Math.random() * 5000))
                                 .boxed()
                                 .limit(100)
                                 .toArray(Integer[]::new);

        // List first 10 unsorted elements...
        printFirstTenOfArray(arr);

        Integer[] copy1 = copyArray(arr);
        Integer[] copy2 = copyArray(arr);
        Integer[] copy3 = copyArray(arr);
        Integer[] copy4 = copyArray(arr);
        Integer[] copy5 = copyArray(arr);

        System.out.println("\nSelection Sort...");
        long start1 = System.nanoTime(); //timer start
        SortingUtility.selectionSort(copy1);
        long stop1 = System.nanoTime(); //timer stop
        printFirstTenOfArray(copy1);
        System.out.println((stop1 - start1) + "ns"); //timer read

        System.out.println("\nInsertion Sort...");
        long start2 = System.nanoTime();
        SortingUtility.insertionSort(copy2);
        long stop2 = System.nanoTime();
        printFirstTenOfArray(copy2);
        System.out.println((stop2 - start2) + "ns");

        System.out.println("\nBubble Sort...");
        long start3 = System.nanoTime();
        SortingUtility.bubbleSort(copy3);
        long stop3 = System.nanoTime();
        printFirstTenOfArray(copy3);
        System.out.println((stop3 - start3) + "ns");

        System.out.println("\nQuick Sort...");
        long start4 = System.nanoTime();
        SortingUtility.quickSort(copy4);
        long stop4 = System.nanoTime();
        printFirstTenOfArray(copy4);
        System.out.println((stop4 - start4) + "ns");

        System.out.println("\nMerge Sort...");
        long start5 = System.nanoTime();
        SortingUtility.mergeSort(copy5);
        long stop5 = System.nanoTime();
        printFirstTenOfArray(copy5);
        System.out.println((stop5 - start5) + "ns");

    }

    private static <T> void printFirstTenOfArray(T[] obj) {

        if (obj != null) {

            int counter = 1;
            System.out.println("\nFirst 10 of Array...");

            for (T i : obj) {
                System.out.println(counter + ": " + i.toString());

                if (counter >= 10) {
                    break;
                }
                counter++;
            }

        } else {
            System.out.println("Array is null.");
        }
    }

    private static <T> T[] copyArray(T[] obj) {

        T[] copy = (T[]) Arrays.copyOf(obj, obj.length);

        return copy;
    }

}