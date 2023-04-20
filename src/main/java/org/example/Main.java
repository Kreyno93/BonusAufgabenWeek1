package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printNumberFromArray(1);
        printOneToHundreds();
        printStringFromScanner();
    }

    public static void printNumberFromArray(int number) {
        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        System.out.println(numbers[number - 1]);
    }

    public static String printNumberFromArrayWithTest(int number){
    String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    return numbers[number - 1];
    }

    public static void printOneToHundreds() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("#$");
            } else if (i % 3 == 0) {
                System.out.println("#");
            } else if (i % 5 == 0) {
                System.out.println("$");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void printStringFromScanner() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string or type exit to exit");
        String[] inputArray = new String[0];

        while(true){
            System.out.println(Arrays.toString(inputArray));
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            String[] copyArray = Arrays.copyOf(inputArray, inputArray.length + 1);
            copyArray[copyArray.length - 1] = input;
            inputArray = copyArray;
        }
    }
}