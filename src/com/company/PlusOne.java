package com.company;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PlusOne {

    public static void main(String[] args) {
        int[] array = {2,9};
        plusOne2(array);
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder numberString = new StringBuilder();
        Arrays.stream(digits)
                            .forEach(num -> numberString.append(num));

        System.out.println(numberString.toString());
        BigInteger number = new BigInteger(numberString.toString());

        number = number.add(new BigInteger("1"));
        String[] newDigitsString = String.valueOf(number).split("");
        int[] newDigits = Arrays.stream(newDigitsString).mapToInt(Integer::valueOf).toArray();

        return newDigits;
    }


    public static int[] plusOne2(int[] digits) {
        int carry = 1;
        for (int i = digits.length-1; i>= 0; i--) {
            digits[i] += carry;
            if (digits[i] <= 9) // early return
                return digits;
            digits[i] = 0;
        }
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }
}
