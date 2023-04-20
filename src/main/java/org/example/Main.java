package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printName("Dominic");
        printLoopName("Dominic");
        biggerThan0(5);
        squared(5);
        printNameWithScanner();

    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printLoopName(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
    }

    public static boolean biggerThan0(int number) {
        return number > 0;
    }

    public static int squared(int number) {
        return number * number;
    }

    public static void printNameWithScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}