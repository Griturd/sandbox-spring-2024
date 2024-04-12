package org.example.sandbox.recursion;

public class GreatestCommonDivisor {

    //O(mn)
    public static int gcd1(int a, int b) {

        while(b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println(GreatestCommonDivisor.gcd1(12, 56));
        System.out.println(GreatestCommonDivisor.gcd2(12, 56));
        System.out.println(GreatestCommonDivisor.gcd3(12, 56));
    }

    public static int gcd2(int a, int b) {

        while(a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int gcd3(int a, int b) {

        if(b == 0) {
            return a;
        } else {
            return gcd3(b, a % b);
        }
    }
}
