package com.company;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
    }

    public static boolean isPowerOfTwo(int n) {

        if(n == 2 || n == 1) {
            return true;
        } else if (n < 2) {
            return false;
        }

        if(n % 2 == 0) {
            n = n/2;
            return isPowerOfTwo(n);
        } else {
            return false;
        }

    }


}
