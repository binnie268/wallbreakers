package com.company;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
    }

    public static int titleToNumber(String s) {
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            number = number*26 + (s.charAt(i) - ('A' - 1));
        }

        return number;
    }
}
