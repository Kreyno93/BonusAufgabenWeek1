package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printStringArrayReverse();
        printSortedArray();
        printSortedArrayEasyMode();
        separateStringComma();
        System.out.println(calculateChecksum(177));
        System.out.println(toRoman(13));

    }

    public static void printStringArrayReverse() {
        String[] stringArray = {"a", "b", "c", "d", "e"};
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }
    }

    public static void printSortedArray() {

        int[] intArray = {6, 2, 8, 3, 9, 6};

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                int tmp = 0;
                if (intArray[i] > intArray[j]) {
                    tmp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void printSortedArrayEasyMode() {

        int[] intArray = {6, 2, 8, 3, 9, 6};

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    public static void separateStringComma() {

        String string = "This,is,a,string,seperated,by,commas";

        String[] stringArray = string.split(",");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    public static int calculateChecksum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static String toRoman(int number) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[number / 1000] + hundreds[(number % 1000) / 100] + tens[(number % 100) / 10] + ones[number % 10];
    }
}